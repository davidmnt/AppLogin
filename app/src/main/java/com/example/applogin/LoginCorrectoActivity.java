package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginCorrectoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_correcto);
        TextView texto = findViewById(R.id.textLogin);
        Button botonEditPerfil = findViewById(R.id.botonEditar);


        String user = getIntent().getStringExtra("USER");

        texto.setText(user);

        botonEditPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mandarEditPerfil(botonEditPerfil);
            }
        });

    }

    private void mandarEditPerfil(View view){
        Intent i = new Intent(this, EditPerfilActivity.class);
        startActivity(i);
    }
}