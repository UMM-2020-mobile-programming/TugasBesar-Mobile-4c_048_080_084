package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class detail_ticket3 extends AppCompatActivity {
    Button BtnContinue;
    LinearLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ticket3);
        BtnContinue = findViewById(R.id.buttonContinue5);
        Back= findViewById(R.id.back5);
        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gocheckout= new Intent(detail_ticket3.this,Ticket_checkout.class);
                startActivity(gocheckout);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack= new Intent(detail_ticket3.this,Home.class);
                startActivity(goBack);
            }
        });
    }
}
