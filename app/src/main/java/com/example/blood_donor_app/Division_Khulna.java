package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Khulna extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__khulna);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button bagerhat_district,chuadanga_district,jessore_district,jhenaida_district;
        Button khulna_district,kushtia_district,magura_district,meherpur_district;
        Button narail_district,satkhira_district;

        bagerhat_district = findViewById(R.id.bagerhat_district_ID);
        chuadanga_district = findViewById(R.id.chuadanga_district_ID);
        jessore_district = findViewById(R.id.jessore_district_ID);
        jhenaida_district = findViewById(R.id.jhenaida_district_ID);
        khulna_district = findViewById(R.id.khulna_district_ID);
        kushtia_district = findViewById(R.id.kushtia_district_ID);
        magura_district = findViewById(R.id.magura_district_ID);
        meherpur_district = findViewById(R.id.meherpur_district_ID);
        narail_district = findViewById(R.id.narail_district_ID);
        satkhira_district = findViewById(R.id.satkhira_district_ID);

        bagerhat_district.setOnClickListener(this);
        chuadanga_district.setOnClickListener(this);
        jessore_district.setOnClickListener(this);
        jhenaida_district.setOnClickListener(this);
        khulna_district.setOnClickListener(this);
        kushtia_district.setOnClickListener(this);
        magura_district.setOnClickListener(this);
        meherpur_district.setOnClickListener(this);
        narail_district.setOnClickListener(this);
        satkhira_district.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bagerhat_district_ID){
            String area = "BAGERHAT";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.chuadanga_district_ID){
            String area = "CHUADANGA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.jessore_district_ID){
            String area = "JESSORE";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.jhenaida_district_ID){
            String area = "JHENAIDA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.khulna_district_ID){
            String area = "KHULNA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.kushtia_district_ID){
            String area = "KUSHTIA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.magura_district_ID){
            String area = "MAGURA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.meherpur_district_ID){
            String area = "MEHERPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.narail_district_ID){
            String area = "NARAIL";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.satkhira_district_ID){
            String area = "SATKHIRA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
    }
}

