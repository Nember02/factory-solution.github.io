package com.example.factoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RemoteCrane extends AppCompatActivity {
    private ImageView imgBase;
    private ImageView imgCrane;
    private Button btnS;
    private Button btnW;
    private Button btnE;
    private Button btnN;
    private int curposX, curposY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_crane);


        imgBase = findViewById(R.id.imageBase);
        imgCrane = findViewById(R.id.imageCrane);
        btnS = findViewById(R.id.SButton);
        btnN = findViewById(R.id.NButton);
        btnE = findViewById(R.id.EButton);
        btnW = findViewById(R.id.WButton);
        int[] location = new int[2];
        imgCrane.getLocationOnScreen(location);
        curposX = location[0]; curposY = location[1];
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImageX(-50);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImageX(50);
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { moveImageY(50); }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { moveImageY(-50); }
        });
    }
    private void moveImageY(int deltaY){
        curposY += deltaY;
        imgCrane.setY(curposY);
        imgBase.setY(curposY);
    }
    private void moveImageX(int deltaX){
        curposX += deltaX;
        imgCrane.setX(curposX);
    }
}