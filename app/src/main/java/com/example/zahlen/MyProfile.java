package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MyProfile extends AppCompatActivity {
    LinearLayout TicketDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        TicketDetail= findViewById(R.id.detailTicket);
        TicketDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoDetailTicket = new Intent(MyProfile.this,detail_ticket.class);
                startActivity(gotoDetailTicket);
            }
        });

    }
}
