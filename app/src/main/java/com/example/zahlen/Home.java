package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    LinearLayout menuBorubudur;
    LinearLayout menuTuguPahlawan;
    LinearLayout menuMonas;
    LinearLayout menuMall;
    LinearLayout menuMasjid;
    LinearLayout menuGunung;
    Button BtnToProfile;
    TextView TextviewToprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menuBorubudur=findViewById(R.id.borobudur);
        menuTuguPahlawan=findViewById(R.id.TuguPahlawan);
        menuMonas=findViewById(R.id.Monas);
        menuMall=findViewById(R.id.Mall);
        menuMasjid=findViewById(R.id.masjid);
        menuGunung=findViewById(R.id.Gunung);
        TextviewToprofile=findViewById(R.id.texttoprofile);
        BtnToProfile=findViewById(R.id.btntoprofile);

        menuBorubudur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBorbudur= new Intent(Home.this,detail_ticket1.class);
                startActivity(goBorbudur);
            }
        });
        menuTuguPahlawan.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTuguPahlawan = new Intent(Home.this,detail_ticket2.class);
                startActivity(goTuguPahlawan);
            }
        }));
        menuMonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMonas= new Intent(Home.this,detail_ticket3.class);
                startActivity(goMonas);
            }
        });
        menuMall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMall = new Intent(Home.this,detail_ticket4.class);
                startActivity(goMall);
            }
        });
        menuMasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMasjid = new Intent(Home.this,detail_ticket5.class);
                startActivity(goMasjid);
            }
        });
        menuGunung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goGunung = new Intent(Home.this,detail_ticket6.class);
                startActivity(goGunung);
            }
        });
        BtnToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToprofilebyButton = new Intent(Home.this,MyProfile.class);
                startActivity(goToprofilebyButton);
            }
        });
        TextviewToprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToProfileByText= new Intent(Home.this,MyProfile.class);
            }
        });

    }
}
