package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginCorrectoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_correcto);
        TextView texto = findViewById(R.id.textLogin);

        String user = getIntent().getStringExtra("USER");

        texto.setText("Bienvenido: " + user);

    }
}