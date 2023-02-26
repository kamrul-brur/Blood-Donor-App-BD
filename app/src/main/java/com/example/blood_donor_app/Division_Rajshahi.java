package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Rajshahi extends AppCompatActivity implements View.OnClickListener {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__rajshahi);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button bogura_district,chapainawabganj_district,joypurhat_district,naogaon_district;
        Button natore_district,pabna_district,rajshahi_district,sirajgonj_district;


        bogura_district = findViewById(R.id.bogura_district_ID);
        chapainawabganj_district = findViewById(R.id.chapainawabganj_district_ID);
        joypurhat_district = findViewById(R.id.joypurhat_district_ID);
        naogaon_district = findViewById(R.id.naogaon_district_ID);
        natore_district = findViewById(R.id.natore_district_ID);
        pabna_district = findViewById(R.id.pabna_district_ID);
        rajshahi_district = findViewById(R.id.rajshahi_district_ID);
        sirajgonj_district = findViewById(R.id.sirajgonj_district_ID);

        bogura_district.setOnClickListener(this);
        chapainawabganj_district.setOnClickListener(this);
        joypurhat_district.setOnClickListener(this);
        naogaon_district.setOnClickListener(this);
        natore_district.setOnClickListener(this);
        pabna_district.setOnClickListener(this);
        rajshahi_district.setOnClickListener(this);
        sirajgonj_district.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bogura_district_ID){
            String area = "BOGURA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.chapainawabganj_district_ID){
            String area = "CHAPAINAWABGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.joypurhat_district_ID){
            String area = "JOYPURHAT";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.naogaon_district_ID){
            String area = "NAOGAON";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.natore_district_ID){
            String area = "NATORE";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.pabna_district_ID){
            String area = "PABNA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.rajshahi_district_ID){
            String area = "RAJSHAHI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.sirajgonj_district_ID){
            String area = "SIRAJGONJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }


    }
}