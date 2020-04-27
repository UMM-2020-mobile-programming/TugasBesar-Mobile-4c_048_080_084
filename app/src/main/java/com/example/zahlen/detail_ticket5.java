package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class detail_ticket5 extends AppCompatActivity {
    Button BtnContinue;
    LinearLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ticket5);

        BtnContinue= findViewById(R.id.buttonContinue7);
        Back = findViewById(R.id.back7);
        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCheckout = new Intent(detail_ticket5.this,Ticket_checkout.class);
                startActivity(goCheckout);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(detail_ticket5.this,Home.class);
                startActivity(goBack);
            }
        });
    }
}
