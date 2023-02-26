package com.example.blood_donor_app;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class Be_A_Donor extends AppCompatActivity implements View.OnClickListener {

    private EditText enterName,enterBloodGroup,enterDistrict,enterPhone;


    DatabaseReference databaseReference;
    DatabaseReference databaseReference_blood_group;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be__a__donor);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        ///showing message for turning on mobile Data
        Toast.makeText(getApplicationContext(),"Please Turn On Mobile Data",Toast.LENGTH_LONG).show();



        enterName = findViewById(R.id.enterNameID);
        enterBloodGroup = findViewById(R.id.enterBloodGroupID);
        enterDistrict = findViewById(R.id.enterDistrictID);
        enterPhone = findViewById(R.id.enterPhoneNumberID);

        Button saveDataButton = findViewById(R.id.saveDataButtonID);


        saveDataButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
             ///inserting data to FireBase Database according their District
             String name_for_list = enterName.getText().toString().trim().toUpperCase();
             String blood_group_for_list = enterBloodGroup.getText().toString().trim().toUpperCase();
             String district_for_list = enterDistrict.getText().toString().trim().toUpperCase();
             String phone_for_list = enterPhone.getText().toString().trim().toUpperCase();
             if(name_for_list.length()==0 || blood_group_for_list.length()==0 || district_for_list.length()==0 || phone_for_list.length()==0){
               Toast.makeText(getApplicationContext(),"Please enter all Field properly",Toast.LENGTH_SHORT).show();
             }
             else{

                 databaseReference = FirebaseDatabase.getInstance().getReference(district_for_list);
                 databaseReference_blood_group = FirebaseDatabase.getInstance().getReference(blood_group_for_list);
                 saveData();
             }

    }

    public void saveData(){
        String name = enterName.getText().toString().trim();
        String bloodGroup = enterBloodGroup.getText().toString().trim().toUpperCase();
        String district = enterDistrict.getText().toString().trim().toUpperCase();
        String phone = enterPhone.getText().toString().trim();

        String key = databaseReference.push().getKey();
        SaveDataHelper saveDataHelper = new SaveDataHelper(name,bloodGroup,district,phone);
        SaveDataHelper saveDataHelper_blood_group = new SaveDataHelper(name,bloodGroup,district,phone);


        assert key != null;
        databaseReference.child(key).setValue(saveDataHelper);
        databaseReference_blood_group.child(key).setValue(saveDataHelper_blood_group);
        Toast.makeText(getApplicationContext(),"Data successfully inserted!!!",Toast.LENGTH_LONG).show();


    }

}

