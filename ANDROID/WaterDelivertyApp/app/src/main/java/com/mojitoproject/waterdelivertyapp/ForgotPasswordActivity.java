package com.mojitoproject.waterdelivertyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.util.zip.Inflater;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        editTextEmail = (EditText) findViewById(R.id.editTextForgotPasswordEmail);
        progressBar = (ProgressBar) findViewById(R.id.forgotPasswordProgressBar);
        mAuth = FirebaseAuth.getInstance();
    }

    public void forgotPasswordResetButtonPressed(View view){
        resetPassword();
    }
    private void resetPassword(){
        String txtEmail = editTextEmail.getText().toString().trim();

        if(!Patterns.EMAIL_ADDRESS.matcher(txtEmail).matches()){
            editTextEmail.setError("Please Enter Valid E-mail");
            editTextEmail.requestFocus();
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.sendPasswordResetEmail(txtEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(ForgotPasswordActivity.this, "Please Check You Email to Reset Password", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(ForgotPasswordActivity.this, SignInActivity.class);
                    startActivity(intent);
                    progressBar.setVisibility(View.GONE);
                }
                else{
                    Toast.makeText(ForgotPasswordActivity.this, "Fail to Reset Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}