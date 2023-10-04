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

        String usuarioDavid = "david_mnt";
        String contraseñaDavid = "1234";

        String usuarioRonnie = "ronnie";
        String contraseñaRonnie = "1234";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) {
                    comprobacion = "Usuario o contraseña vacio";
                    texto.setText(comprobacion);

                } else if (!user.getText().toString().equals(usuarioDavid) && !pass.getText().toString().equals(contraseñaDavid)) {
                    comprobacion = "Usuario o contraseña incorrsecto";
                    texto.setText(comprobacion);

                } else {

                    if (user.getText().toString().equals(usuarioDavid) && pass.getText().toString().equals(contraseñaDavid)) {
                        texto.setText("");
                        comprobacion = user.getText().toString();
                        mandarOtraPantallaDavid(login);

                    } else if (user.getText().toString().equals(usuarioRonnie) && pass.getText().toString().equals(contraseñaRonnie)) {
                        texto.setText("");
                        comprobacion = user.getText().toString();
                        mandarOtraPantallaRonnie(login);
                    }
                }
            }
        });
    }

    public void mandarOtraPantallaDavid(View view) {
        Intent i = new Intent(this, LoginCorrectoActivity.class);
        i.putExtra("USER", comprobacion);
        startActivity(i);
    }
    public void mandarOtraPantallaRonnie(View view) {
        Intent in = new Intent(this, LoginRonnieActivity.class);
        in.putExtra("USER", comprobacion);
        startActivity(in);
    }
}