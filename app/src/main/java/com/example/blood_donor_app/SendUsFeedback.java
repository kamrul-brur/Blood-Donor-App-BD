package com.example.blood_donor_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class SendUsFeedback extends AppCompatActivity implements View.OnClickListener {

    private EditText nameFeedback,emailFeedback,feedbackFeedback;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_us_feedback);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon_drop_blood);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button sendFeedbackButton = findViewById(R.id.send_feedback_button_ID);
        Button clearFeedbackButton = findViewById(R.id.clear_feedback_button_ID);
        sendFeedbackButton.setOnClickListener(this);
        clearFeedbackButton.setOnClickListener(this);

        nameFeedback = findViewById(R.id.enterNameFeedbackID);
        emailFeedback = findViewById(R.id.enterEmailFeedbackID);
        feedbackFeedback = findViewById(R.id.enterFeedbackID);
    }

    @Override
    public void onClick(View v) {
        try{
            String nameF = nameFeedback.getText().toString();
            String emailF = emailFeedback.getText().toString();
            String feedbackF = feedbackFeedback.getText().toString();
            if(nameF.length()==0 || emailF.length()==0 || feedbackF.length()==0){
                Toast.makeText(getApplicationContext(),"Please Enter all Data Properly",Toast.LENGTH_SHORT).show();
            }
            else{
                if(v.getId()==R.id.send_feedback_button_ID){
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/email");
                    intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"kamrulhasanrony111@gmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback From App");
                    intent.putExtra(Intent.EXTRA_TEXT,"Name : "+nameF+"\n"+"Email : "+emailF+"\n"+"Message : "+feedbackF);
                    startActivity(Intent.createChooser(intent,"Feedback with "));
                }
                else if(v.getId()==R.id.clear_feedback_button_ID){
                    nameFeedback.setText("");
                    emailFeedback.setText("");
                    feedbackFeedback.setText("");
                }

            }

        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Exception"+e,Toast.LENGTH_LONG).show();
        }

    }
}