package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Chittagong extends AppCompatActivity implements View.OnClickListener {



    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         Button brahmanbaria_district,comilla_district,chandpur_district,lakshmipur_district;
         Button noakhali_district,feni_district,khagrachhari_district,rangamati_district;
         Button bandarban_district,chittagonj_district,coxsbazar_district;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__chittagong);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        brahmanbaria_district =findViewById(R.id.brahmanbaria_district_ID);
        comilla_district = findViewById(R.id.comilla_district_ID);
        chandpur_district = findViewById(R.id.chandpur_district_ID);
        lakshmipur_district = findViewById(R.id.lakshmipur_district_ID);
        noakhali_district = findViewById(R.id.noakhali_district_ID);
        feni_district = findViewById(R.id.feni_district_ID);
        khagrachhari_district = findViewById(R.id.khagrachhari_district_ID);
        rangamati_district = findViewById(R.id.rangamati_district_ID);
        bandarban_district = findViewById(R.id.bandarban_district_ID);
        chittagonj_district = findViewById(R.id.chittagonj_district_ID);
        coxsbazar_district = findViewById(R.id.coxsbazar_district_ID);

        brahmanbaria_district.setOnClickListener(this);
        comilla_district.setOnClickListener(this);
        chandpur_district.setOnClickListener(this);
        lakshmipur_district.setOnClickListener(this);
        noakhali_district.setOnClickListener(this);
        feni_district.setOnClickListener(this);
        khagrachhari_district.setOnClickListener(this);
        rangamati_district.setOnClickListener(this);
        bandarban_district.setOnClickListener(this);
        chittagonj_district.setOnClickListener(this);
        coxsbazar_district.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.brahmanbaria_district_ID){
            String area = "BRAHMANBARIA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.comilla_district_ID){
            String area = "COMILLA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.chandpur_district_ID){
            String area = "CHANDPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.lakshmipur_district_ID){
            String area = "LAKSHMIPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.noakhali_district_ID){
            String area = "NOAKHALI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.feni_district_ID){
            String area = "FENI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.khagrachhari_district_ID){
            String area = "KHAGRACHHARI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.rangamati_district_ID){
            String area = "RANGAMATI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.bandarban_district_ID){
            String area = "BANDARBAN";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.chittagonj_district_ID){
            String area = "CHITTAGONG";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.coxsbazar_district_ID){
            ///String area = "Cox\\'s Bazar";
             String area = "COXSBAZAR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
    }
}