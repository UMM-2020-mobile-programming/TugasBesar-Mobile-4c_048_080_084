package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registersucces extends AppCompatActivity {
    Button btnExplore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registersucces);
        btnExplore= findViewById(R.id.btn_exploreNow);

        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gohome= new Intent(registersucces.this,Home.class);
                startActivity(gohome);
            }
        });
    }
}
