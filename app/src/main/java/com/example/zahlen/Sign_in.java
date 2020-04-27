package com.example.zahlen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_in extends AppCompatActivity {
    Button btnSignIn;
    TextView CreateNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btnSignIn=findViewById(R.id.button_sign_in);
        CreateNewAccount= findViewById(R.id.crete_new_account);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gohome = new Intent (Sign_in.this,Home.class);
                startActivity(gohome);
            }
        });
        CreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goregister= new Intent(Sign_in.this,regisster.class);
                startActivity(goregister);
            }
        });
    }
}
