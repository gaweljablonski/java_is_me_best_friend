package com.mojitoproject.waterdelivertyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class MakeDrinkActivity extends AppCompatActivity {

    private TextView textMakeDrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_drink);

//        getSupportActionBar().show();
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        textMakeDrink = findViewById(R.id.textMakeDrinkScreen);
        textMakeDrink.animate().translationY(1000).setDuration(1000).setStartDelay(6500);


        Thread thread = new Thread(){
            public void run(){
                try{
                    Thread.sleep(7500);
//                    Thread.sleep(10);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(MakeDrinkActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        thread.start();
    }
}