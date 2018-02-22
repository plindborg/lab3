package com.example.lindborg.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class IntroSplashActivity extends Activity {
    //
    private static final int SPLASH_TIME = 2000;
    private boolean isBackBtnClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_splash);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();

                if(isBackBtnClicked == false) {
                    Intent i = new Intent(IntroSplashActivity.this, MenuActivity.class);
                    IntroSplashActivity.this.startActivity(i);
                }
            }
        },SPLASH_TIME);
    }
    @Override
    public void onBackPressed() {

        isBackBtnClicked = true;
        super.onBackPressed();

    }
}
