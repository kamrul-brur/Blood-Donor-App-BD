package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Sylhet extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__sylhet);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button sylhet_district,sunamganj_district,moulvibazar_district,habiganj_district;
        sylhet_district = findViewById(R.id.sylhet_district_ID);
        sunamganj_district = findViewById(R.id.sunamganj_district_ID);
        moulvibazar_district = findViewById(R.id.moulvibazar_district_ID);
        habiganj_district = findViewById(R.id.habiganj_district_ID);

        sylhet_district.setOnClickListener(this);
        sunamganj_district.setOnClickListener(this);
        moulvibazar_district.setOnClickListener(this);
        habiganj_district.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sylhet_district_ID){
            String area = "SYLHET";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.sunamganj_district_ID){
            String area = "SUNAMGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.moulvibazar_district_ID){
            String area = "MOULVIBAZAR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.habiganj_district_ID){
            String area = "HABIGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
    }
}