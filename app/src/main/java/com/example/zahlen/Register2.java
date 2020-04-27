package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Register2 extends AppCompatActivity {
    Button BtnContinue;
    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        BtnContinue = findViewById(R.id.button_continu2);
        Back = findViewById(R.id.back2);

        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosucces = new Intent (Register2.this,registersucces.class);
                startActivity(gosucces);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback= new Intent(Register2.this,regisster.class);
                startActivity(goback);
            }
        });


    }
}
