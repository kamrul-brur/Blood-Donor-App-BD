package com.example.blood_donor_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        progressBar = findViewById(R.id.progressbarID);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
               doWork();
               goMainPage();
            }
        });
        thread.start();
    }
    //this is for progressbar
    public void doWork(){
        for(progress=0;progress<=100;progress+=20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //this is for going main page after finishing progress
    public void goMainPage(){
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}