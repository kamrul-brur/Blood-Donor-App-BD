package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Rangpur extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__rangpur);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button rangpur_district,dinajpur_district,kurigram_district,nilphamari_district;
        Button gaibandha_district,thakurgaon_district,panchagarh_district,lalmonirhat_district;

        rangpur_district = findViewById(R.id.rangpur_district_ID);
        dinajpur_district = findViewById(R.id.dinajpur_district_ID);
        kurigram_district = findViewById(R.id.kurigram_district_ID);
        nilphamari_district = findViewById(R.id.nilphamari_district_ID);
        gaibandha_district = findViewById(R.id.gaibandha_district_ID);
        thakurgaon_district = findViewById(R.id.thakurgaon_district_ID);
        panchagarh_district = findViewById(R.id.panchagarh_district_ID);
        lalmonirhat_district = findViewById(R.id.lalmonirhat_district_ID);

        rangpur_district.setOnClickListener(this);
        dinajpur_district.setOnClickListener(this);
        kurigram_district.setOnClickListener(this);
        nilphamari_district.setOnClickListener(this);
        gaibandha_district.setOnClickListener(this);
        thakurgaon_district.setOnClickListener(this);
        panchagarh_district.setOnClickListener(this);
        lalmonirhat_district.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.rangpur_district_ID){
            String area = "RANGPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.dinajpur_district_ID){
            String area = "DINAJPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.kurigram_district_ID){
            String area = "KURIGRAM";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.nilphamari_district_ID){
            String area = "NILPHAMARI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.gaibandha_district_ID){
            String area = "GAIBANDHA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.thakurgaon_district_ID){
            String area = "THAKURGAON";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.panchagarh_district_ID){
            String area = "PANCHAGARH";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.lalmonirhat_district_ID){
            String area = "LALMONIRHAT";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
    }
}