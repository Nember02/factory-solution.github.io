package com.example.factoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class RemoteItemActivity extends AppCompatActivity {

    private Switch switch1;
    private Drawable background;
    private int originalColor;

    private ImageView imgmove;
    private Button btnLeft;
    private Button btnRight;
    private int curposX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_item);

        switch1 = findViewById(R.id.switch1);
        background = switch1.getBackground();
        originalColor = getResources().getColor(R.color.originalColor);

        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {

                background.setColorFilter(getResources().getColor(R.color.yellow), PorterDuff.Mode.SRC_ATOP);
                switch1.setBackground(background);

                getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.yellow));
            } else {

                background.setColorFilter(originalColor, PorterDuff.Mode.SRC_ATOP);
                switch1.setBackground(background);
                getWindow().getDecorView().setBackgroundColor(originalColor);
            }
        });

        imgmove = findViewById(R.id.imageView2);
        btnLeft = findViewById(R.id.buttonLeft);
        btnRight = findViewById(R.id.buttonRight);
        curposX = 0;

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImage(-50);
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveImage(50);
            }
        });
    }

    private void moveImage(int deltaX){
        curposX += deltaX;
        imgmove.setX(curposX);
    }

}