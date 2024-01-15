package com.mojitoproject.waterdelivertyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void txtSignInForgotPasswordClicked(View view){
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
    public void txtSignInRegisterClicked(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}