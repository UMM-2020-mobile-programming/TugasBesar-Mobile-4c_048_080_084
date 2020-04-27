package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class detail_ticket1 extends AppCompatActivity {
    Button BtnContinue;
    LinearLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ticket1);

        BtnContinue=findViewById(R.id.buttonContinue3);
        Back=findViewById(R.id.back3);
        BtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTicketCheckout = new Intent(detail_ticket1.this,Ticket_checkout.class);
                startActivity(goTicketCheckout);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goback = new Intent(detail_ticket1.this,Home.class);
                startActivity(goback);
            }
        });
    }
}
