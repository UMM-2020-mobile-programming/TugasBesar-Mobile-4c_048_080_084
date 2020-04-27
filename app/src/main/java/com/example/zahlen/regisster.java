package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class regisster extends AppCompatActivity {
    Button BtnContinue;
    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisster);
        BtnContinue= findViewById(R.id.button_continue);
        Back  = findViewById(R.id.back);
        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goregister2= new Intent(regisster.this,Register2.class);
                startActivity(goregister2);

            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback= new Intent(regisster.this,MainActivity.class);
                startActivity(goback);

            }
        });



    }
}
