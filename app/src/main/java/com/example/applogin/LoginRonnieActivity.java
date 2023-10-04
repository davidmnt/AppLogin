package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginRonnieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ronnie);
        TextView texto = findViewById(R.id.textLogin);
        String user = getIntent().getStringExtra("USER");

        texto.setText(user);

    }
}