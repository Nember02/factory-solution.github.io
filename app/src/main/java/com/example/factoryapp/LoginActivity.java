package com.example.factoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText textInputLogin;
    private TextInputEditText textInputTeam;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputLogin = findViewById(R.id.textInputLogin);
        textInputTeam = findViewById(R.id.textInputTeam);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = textInputLogin.getText().toString();
                String team = textInputTeam.getText().toString();

                if (login.equals("admin") && team.equals("admin")){
                    Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                    startActivity(intent);
                } else if ((login.equals("work") && team.equals("storage"))) {
                    Intent intent = new Intent(LoginActivity.this, CommonActivity.class);
                    startActivity(intent);
                } else if ((login.equals("work") && team.equals("isolation"))) {
                    Intent intent = new Intent(LoginActivity.this, CommonActivity.class);
                    startActivity(intent);
                } else if ((login.equals("leader") && team.equals("isolation"))) {
                    Intent intent = new Intent(LoginActivity.this, CommonActivity.class);
                    startActivity(intent);
                } else if ((login.equals("leader") && team.equals("storage"))) {
                    Intent intent = new Intent(LoginActivity.this, CommonActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Wrong Login & Team", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}