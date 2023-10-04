package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String comprobacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user = findViewById(R.id.user);
        EditText pass = findViewById(R.id.pass);
        Button login = findViewById(R.id.enviar);
        TextView texto = findViewById(R.id.error);

        String usuario = "david_mnt";
        String contraseña = "1234";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
                    comprobacion = "Usuario o contraseña vacio";
                    texto.setText(comprobacion);

                } else {

                    if (user.getText().toString().equals(usuario) && pass.getText().toString().equals(contraseña)) {
                        texto.setText("");
                        comprobacion = user.getText().toString();
                        comporbacion(login);

                    } else {
                        comprobacion = "Usuario o contraseña incorrecta";
                        texto.setText(comprobacion);
                    }
                }
            }
        });
    }

    public void comporbacion(View view){
        Intent i = new Intent(this, LoginCorrectoActivity.class);
        i.putExtra("USER",comprobacion);
        startActivity(i);
    }
}