package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Barisal extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__barisal);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button barisal_district,barguna_district,bhola_district;
        Button jhalokati_district,patuakhali_district,pirojpur_district;

        barisal_district = findViewById(R.id.barisal_district_ID);
        barguna_district = findViewById(R.id.barguna_district_ID);
        bhola_district = findViewById(R.id.bhola_district_ID);
        jhalokati_district = findViewById(R.id.jhalokati_district_ID);
        patuakhali_district = findViewById(R.id.patuakhali_district_ID);
        pirojpur_district = findViewById(R.id.pirojpur_district_ID);

        barisal_district.setOnClickListener(this);
        barguna_district.setOnClickListener(this);
        bhola_district.setOnClickListener(this);
        jhalokati_district.setOnClickListener(this);
        patuakhali_district.setOnClickListener(this);
        pirojpur_district.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.barisal_district_ID){
            String area = "BARISAL";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.barguna_district_ID){
            String area = "BARGUNA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.bhola_district_ID){
            String area = "BHOLA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.jhalokati_district_ID){
            String area = "JHALOKATI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.patuakhali_district_ID){
            String area = "PATUAKHALI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.pirojpur_district_ID){
            String area = "PIROJPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

    }
}