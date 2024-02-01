package com.mojitoproject.rentcarapphindus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    private TextInputEditText signupFullName, signupUsername, signupEmail, signupPhoneNumber, signupPassword;
    private Button goRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupFullName = findViewById(R.id.signupFullName);
        signupUsername = findViewById(R.id.signupUsername);
        signupEmail = findViewById(R.id.signupEmail);
        signupPhoneNumber = findViewById(R.id.signupPhoneNumber);
        signupPassword = findViewById(R.id.signupPassword);
        goRegister = findViewById(R.id.signupGoButton);
    }


    private Boolean validateName(){
        String val = signupFullName.getText().toString().trim();

        if(val.isEmpty()){
            signupFullName.setError("Field cannot be empty");
            return false;
        }
        else{
            signupFullName.setError(null);
            return true;
        }
    }

    private Boolean validateUsername(){
        String val = signupUsername.getText().toString().trim();
        String noWhiteSpace = "(?=\\s+$)";
        final int maxLength = 15;

        if(val.isEmpty()){
            signupUsername.setError("Field cannot be empty");
            return false;
        }
        else if (val.length() >= maxLength){
            signupUsername.setError("Username too long");
            return false;
        }
        else if (!val.matches(noWhiteSpace) && false){
            signupUsername.setError("White Spaces are not allowed");
            return false;
        }
        else{
            signupUsername.setError(null);
            return true;
        }
    }

    private Boolean validateEmail(){
        String val = signupEmail.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        final int maxLength = 15;

        if(val.isEmpty()){
            signupEmail.setError("Field cannot be empty");
            return false;
        }
        else if (!val.matches(emailPattern)){
            signupEmail.setError("Invalid email address");
            return false;
        }
        else{
            signupEmail.setError(null);
            return true;
        }
    }

    private Boolean validatePhoneNumber(){
        String val = signupPhoneNumber.getText().toString().trim();

        if(val.isEmpty()){
            signupPhoneNumber.setError("Field cannot be empty");
            return false;
        }
        else{
            signupPhoneNumber.setError(null);
            return true;
        }
    }

    private Boolean validatePassword(){
        String val = signupPassword.getText().toString().trim();
        String passwordVal = "^" +
//                "(?=.[0-9])"+           // at least 1 digit
//                "(?=.[a-z])"+           // at least 1 lower case letter
//                "(?=.[A-Z])"+           // at least 1 upper case letter
                "(?=.[a-zA-Z0-9])"+     // any letter or digit
//                "(?=.*[@#$%^&+=])"+     // at least 1 special character
//                "(?=\\s+$)"+            // no white spaces        //aktualnie nie do końca działa jak powinno TODO: password validation - tak żeby hasełka były SILNE
//                "\\A\\w{4,20}\\z"+      // no white spaces        //aktualnie nie do końca działa jak powinno
                ".{4,}"+                // at least 4 characters
                "$";
        if(val.isEmpty()){
            signupPassword.setError("Field cannot be empty");
            return false;
        }
        else if (!val.matches(passwordVal)){
            signupPassword.setError("Password is too weak");
            return false;
        }
        else{
            signupPassword.setError(null);
            return true;
        }
    }

    public void signupGoButtonFunc(View view){

        if(!validateName() || !validateUsername() || !validateEmail() || !validatePhoneNumber() || !validatePassword()){
            return;
        }

        String name = signupFullName.getText().toString().trim();
        String username = signupUsername.getText().toString().trim();
        String email = signupEmail.getText().toString().trim();
        String phoneNumber = signupPhoneNumber.getText().toString().trim();
        String password = signupPassword.getText().toString().trim();
        Log.e("[SIGNUP_GO_BUTTON]", "CLICKED");
//        UserHelperClass helperClass = new UserHelperClass(name, username, email, phoneNumber, password);
//        reference.child.setValue(helperClass);
    }
}