package com.example.blood_donor_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Objects;

public class FindByBloodGroup extends AppCompatActivity implements View.OnClickListener {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_blood_group);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        ImageButton a_positive,a_negative;
        ImageButton b_positive,b_negative;
        ImageButton o_positive,o_negative;
        ImageButton ab_positive,ab_negative;

        ///showing message for turning on mobile Data
        Toast.makeText(getApplicationContext(),"Please Turn On Mobile Data",Toast.LENGTH_LONG).show();

        a_positive = findViewById(R.id.a_positive_ID);
        a_negative = findViewById(R.id.a_negative_ID);
        b_positive = findViewById(R.id.b_positive_ID);
        b_negative = findViewById(R.id.b_negative_ID);
        o_positive = findViewById(R.id.o_positive_ID);
        o_negative = findViewById(R.id.o_negative_ID);
        ab_positive = findViewById(R.id.ab_positive_ID);
        ab_negative = findViewById(R.id.ab_negative_ID);

        a_positive.setOnClickListener(this);
        a_negative.setOnClickListener(this);
        b_positive.setOnClickListener(this);
        b_negative.setOnClickListener(this);
        o_positive.setOnClickListener(this);
        o_negative.setOnClickListener(this);
        ab_positive.setOnClickListener(this);
        ab_negative.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.a_positive_ID){
            String area = "A+";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.a_negative_ID){
            String area = "A-";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.b_positive_ID){
            String area = "B+";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.b_negative_ID){
            String area = "B-";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.o_positive_ID){
            String area = "O+";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.o_negative_ID){
            String area = "O-";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.ab_positive_ID){
            String area = "AB+";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.ab_negative_ID){
            String area = "AB-";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelperBG.class);
            intent.putExtra("group",area);
            startActivity(intent);
        }
    }
}