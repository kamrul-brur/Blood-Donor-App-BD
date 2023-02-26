package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Division_Mymensingh extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division__mymensingh);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button mymensingh_district,netrokona_district,jamalpur_district,sherpur_district;

        mymensingh_district= findViewById(R.id.mymensingh_district_ID);
        netrokona_district= findViewById(R.id.netrokona_district_ID);
        jamalpur_district= findViewById(R.id.jamalpur_district_ID);
        sherpur_district= findViewById(R.id.sherpur_district_ID);

        mymensingh_district.setOnClickListener(this);
        netrokona_district.setOnClickListener(this);
        jamalpur_district.setOnClickListener(this);
        sherpur_district.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.mymensingh_district_ID){
            String area = "MYMENSINGH";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.netrokona_district_ID){
            String area = "NETROKONA";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.jamalpur_district_ID){
            String area = "JAMALPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
        if(v.getId()==R.id.sherpur_district_ID){
            String area = "SHERPUR";
            Intent intent = new Intent(getApplicationContext(),ShowDataHelper.class);
            intent.putExtra("district",area);
            startActivity(intent);
        }
    }
}