package com.example.blood_donor_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int[] gridimages ={R.drawable.a_blood_group,R.drawable.a_location,R.drawable.a_be_a_donor,R.drawable.a_tips,
    R.drawable.a_about_this_app,R.drawable.a_feedback
    };
    String[] gridlist;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        gridlist = getResources().getStringArray(R.array.gridlist);
        GridView gridView = findViewById(R.id.gridviewID);

        CustomAdapter customAdapter = new CustomAdapter(this,gridlist,gridimages);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = gridlist[position];
                goNextPage(value);
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialogBuilder.setCancelable(false);
        //for setting title
        alertdialogBuilder.setTitle(R.string.alert_title);
        //for setting message
        alertdialogBuilder.setMessage(R.string.alert_message);
        ///for setting icon
        alertdialogBuilder.setIcon(R.drawable.question_icon);
        ///for setting positive button
        alertdialogBuilder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             //exit
                finish();
            }
        });
        ///for setting negative button
        alertdialogBuilder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ///for setting neutral button
        alertdialogBuilder.setNeutralButton(R.string.neutral, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You have clicked on Cancel button",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });


        AlertDialog alertDialog = alertdialogBuilder.create();
        alertDialog.show();

       // super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_for_share,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.share_app_ID){
            Intent intent =new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Blood donation app";
            String body = "This app will help you to find blood donor with fast and easy way"+"\ndownload_link";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.developers_detail_ID){
            Intent intent = new Intent(MainActivity.this,Contact_With_Developer.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


    public void goNextPage(String val){
        switch (val) {
            case "Find by blood group": {
                Intent intent = new Intent(MainActivity.this, FindByBloodGroup.class);
                startActivity(intent);
                break;
            }
            case "Find by area": {
                Intent intent = new Intent(MainActivity.this, FindByArea.class);
                startActivity(intent);
                break;
            }
            case "Be a donor": {
                Intent intent = new Intent(MainActivity.this, Be_A_Donor.class);
                startActivity(intent);
                break;
            }
            case "Tips for donor": {
                Intent intent = new Intent(MainActivity.this, TipsForDonor.class);
                startActivity(intent);
                break;
            }
            case "About this app": {
                Intent intent = new Intent(MainActivity.this, AboutThisApp.class);
                startActivity(intent);
                break;
            }
            case "Send us Feedback": {
                Intent intent = new Intent(MainActivity.this, SendUsFeedback.class);
                startActivity(intent);
                break;
            }
        }

    }



}