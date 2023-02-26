package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShowDataHelper extends AppCompatActivity {

    private ListView listView;
    DatabaseReference databaseReference;
    private List<SaveDataHelper> donorList;
    private ShowDataCustomAdapter showDataCustomAdapter;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data_helper);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Intent intent = getIntent();
        String area = intent.getStringExtra("district");

        assert area != null;
        databaseReference = FirebaseDatabase.getInstance().getReference(area);
        donorList = new ArrayList<>();
        showDataCustomAdapter = new ShowDataCustomAdapter(donorList,this);

       listView =  findViewById(R.id.listviewID);
    }

    @Override
    protected void onStart() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                     donorList.clear();
                     for(DataSnapshot dataSnapshot1 : snapshot.getChildren()){
                        SaveDataHelper saveDataHelper = dataSnapshot1.getValue(SaveDataHelper.class);
                        donorList.add(saveDataHelper);
                     }
                     listView.setAdapter(showDataCustomAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_for_search,menu);
        MenuItem menuItem = menu.findItem(R.id.search_menu_ID);

        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search by Blood Group");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                showDataCustomAdapter.getFilter().filter(newText);
                return true;
            }
        });


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.search_menu_ID){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}