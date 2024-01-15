package com.mojitoproject.waterdelivertyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World! YOYOOO it's work");


    }

    public void onButtonSignUpClicked(View view){
        Intent intent = new Intent(WelcomeActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
    public void onButtonSignInClicked(View view){
        Intent intent = new Intent(WelcomeActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}