package com.mojitoproject.rentcarapphindus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    // Czas trwania animacji
//    private static int SPLASH_SCREEN = 7300;
    private static int SPLASH_SCREEN = 500;
    Animation topAnim, bottomAnim;
    TextView mainText, text;

    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);       //hides bars on top of screen
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        mainText = findViewById(R.id.splash_main_text_id);
        text = findViewById(R.id.splash_text_id);
        lottieAnimationView = findViewById(R.id.lottieAnimationView);

        mainText.setAnimation(bottomAnim);
        text.setAnimation(bottomAnim);
//        lottieAnimationView.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);


                // animuje przejscie elementów | inne potrzebne elementy to: np. android:transitionName="logoImage"  w obu activity w elemencie który edytujemy

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(lottieAnimationView, "logoImage");
                pairs[1] = new Pair<View, String>(text, "logoText");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);


                startActivity(intent, options.toBundle());
                finish();
            }
        }, SPLASH_SCREEN);
    }
}