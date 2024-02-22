package com.example.factoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity {

    private Button buttonRemote;
    private Button buttonWWZ;
    private Button btnHSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        buttonRemote = findViewById(R.id.btnCrane);
        buttonWWZ = findViewById(R.id.btnMap);
        btnHSE = findViewById(R.id.buttonHSE);

        buttonRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, RemoteControl.class);
                startActivity(intent);
            }
        });
        buttonWWZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, WorkerZone.class);
                startActivity(intent);
            }
        });
        btnHSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminActivity.this, HSE.class);
                startActivity(intent);
            }
        });
    }

}