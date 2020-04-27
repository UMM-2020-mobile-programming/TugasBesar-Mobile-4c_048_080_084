package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //setting timer selama  1 detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // merubah splash adctivity ke mainactivity
                Intent gomain= new Intent(SplashActivity.this,MainActivity.class);
                startActivity(gomain);
                finish();

            }
        }, 2000);


    }
}
