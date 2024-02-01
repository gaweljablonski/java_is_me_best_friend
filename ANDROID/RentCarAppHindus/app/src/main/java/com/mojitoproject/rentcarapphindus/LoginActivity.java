package com.mojitoproject.rentcarapphindus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button signupButton, goButton;
    private LinearLayout linearLayout;
    private TextView mainText, text;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);       //hides bars on top of screen
        setContentView(R.layout.activity_login);

        linearLayout = findViewById(R.id.loginLinearLayout);
        goButton = findViewById(R.id.loginGoButton);
        signupButton = findViewById(R.id.loginNewUserButton);
        mainText = findViewById(R.id.loginWelcomeText);
        text = findViewById(R.id.loginSignInToContinueText);
        logo = findViewById(R.id.loginLogoImage);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);

                Pair[] pairs = new Pair[6];
                pairs[0] = new Pair<View, String>(linearLayout, "loginSignupLinearLayoutTran");
                pairs[1] = new Pair<View, String>(goButton, "goTran");
                pairs[2] = new Pair<View, String>(signupButton, "newUserTran");
                pairs[3] = new Pair<View, String>(logo, "logoImage");
                pairs[4] = new Pair<View, String>(mainText, "logoText");
                pairs[5] = new Pair<View, String>(text, "logoSubText");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, pairs);


                startActivity(intent, options.toBundle());
            }
        });


    }
}