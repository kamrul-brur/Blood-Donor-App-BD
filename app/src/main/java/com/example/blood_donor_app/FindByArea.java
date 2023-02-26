package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class FindByArea extends AppCompatActivity implements View.OnClickListener {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_area);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button dhaka_division,chittagong_division;
        Button rajshahi_division,khulna_division;
        Button barisal_division,sylhet_division;
        Button rangpur_division,mymensingh_division;

        ///showing message for turning on mobile Data
        Toast.makeText(getApplicationContext(),"Please Turn On Mobile Data",Toast.LENGTH_LONG).show();

        dhaka_division = findViewById(R.id.dhaka_division_ID);
        chittagong_division = findViewById(R.id.chittagong_division_ID);
        rajshahi_division = findViewById(R.id.rajshahi_division_ID);
        khulna_division = findViewById(R.id.khulna_division_ID);
        barisal_division = findViewById(R.id.barisal_division_ID);
        sylhet_division = findViewById(R.id.sylhet_division_ID);
        rangpur_division = findViewById(R.id.rangpur_division_ID);
        mymensingh_division = findViewById(R.id.mymensingh_division_ID);


        dhaka_division.setOnClickListener(this);
        chittagong_division.setOnClickListener(this);
        rajshahi_division.setOnClickListener(this);
        khulna_division.setOnClickListener(this);
        barisal_division.setOnClickListener(this);
        sylhet_division.setOnClickListener(this);
        rangpur_division.setOnClickListener(this);
        mymensingh_division.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.dhaka_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Dhaka.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.chittagong_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Chittagong.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.rajshahi_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Rajshahi.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.khulna_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Khulna.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.barisal_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Barisal.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.sylhet_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Sylhet.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.rangpur_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Rangpur.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.mymensingh_division_ID){
            Intent intent = new Intent(getApplicationContext(),Division_Mymensingh.class);
            startActivity(intent);
        }
    }
}