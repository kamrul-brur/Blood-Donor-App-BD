package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Dhaka extends AppCompatActivity implements View.OnClickListener {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__dhaka);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


         Button dhaka_district,gazipur_district,kishoreganj_district;
         Button manikganj_district,munshiganj_district,narayanganj_district;
         Button narsingdi_district,tangail_district,faridpur_district;
         Button gopalganj_district,madaripur_district,rajbari_district,shariatpur_district;

        dhaka_district = findViewById(R.id.dhaka_district_ID);
        gazipur_district = findViewById(R.id.gazipur_district_ID);
        kishoreganj_district = findViewById(R.id.kishoreganj_district_ID);
        manikganj_district = findViewById(R.id.manikganj_district_ID);
        munshiganj_district = findViewById(R.id.munshiganj_district_ID);
        narayanganj_district = findViewById(R.id.narayanganj_district_ID);
        narsingdi_district = findViewById(R.id.narsingdi_district_ID);
        tangail_district = findViewById(R.id.tangail_district_ID);
        faridpur_district = findViewById(R.id.faridpur_district_ID);
        gopalganj_district = findViewById(R.id.gopalganj_district_ID);
        madaripur_district = findViewById(R.id.madaripur_district_ID);
        rajbari_district = findViewById(R.id.rajbari_district_ID);
        shariatpur_district = findViewById(R.id.shariatpur_district_ID);

        dhaka_district.setOnClickListener(this);
        gazipur_district.setOnClickListener(this);
        kishoreganj_district.setOnClickListener(this);
        manikganj_district.setOnClickListener(this);
        munshiganj_district.setOnClickListener(this);
        narayanganj_district.setOnClickListener(this);
        narsingdi_district.setOnClickListener(this);
        tangail_district.setOnClickListener(this);
        faridpur_district.setOnClickListener(this);
        gopalganj_district.setOnClickListener(this);
        madaripur_district.setOnClickListener(this);
        rajbari_district.setOnClickListener(this);
        shariatpur_district.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.dhaka_district_ID){
            String area = "DHAKA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.gazipur_district_ID){
            String area = "GAZIPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.kishoreganj_district_ID){
            String area = "KISHOREGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.manikganj_district_ID){
            String area = "MANIKGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.munshiganj_district_ID){
            String area = "MUNSHIGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.narayanganj_district_ID){
            String area = "NARAYANGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.narsingdi_district_ID){
            String area = "NARSINGDI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.tangail_district_ID){
            String area = "TANGAIL";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.faridpur_district_ID){
            String area = "FARIDPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.gopalganj_district_ID){
            String area = "FOPALGANJ";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.madaripur_district_ID){
            String area = "MADARIPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.rajbari_district_ID){
            String area = "RAJBARI";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

        if(v.getId()==R.id.shariatpur_district_ID){
            String area = "SHARIATPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }

    }
}