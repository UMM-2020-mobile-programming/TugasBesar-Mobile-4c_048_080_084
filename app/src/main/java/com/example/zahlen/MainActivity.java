package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Btn_sign_in;
    Button Btn_new_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_sign_in=  findViewById(R.id.button_sign_in);
        Btn_new_account= findViewById(R.id.button_new_account);
        Btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosign= new Intent(MainActivity.this,Sign_in.class);
                startActivity(gosign);
            }
        });

        Btn_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gonew_account= new Intent(MainActivity.this,regisster.class);
                startActivity(gonew_account);
            }
        });
    }
}

