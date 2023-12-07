package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

        //Definimos todos los objetos que usaremos dentro del xml (parte visual de la aplicacion), para darle funcionamiento
        setContentView(R.layout.activity_main);
        EditText user = findViewById(R.id.user);
        EditText pass = findViewById(R.id.pass);
        Button login = findViewById(R.id.enviar);
        TextView texto = findViewById(R.id.error);

        //Usuario de CBUM (persona 1)
        String usuarioDavid = "cbum";
        String contraseñaDavid = "1234";

        //Usuario de RONNIE (persona 2)
        String usuarioRonnie = "ronnie";
        String contraseñaRonnie = "1234";

        //Cuando pulsamos el boton Login el codigo comprobara todas las combinaciones posibles buscando errores de inicio, tanto de password como de user
        //En caso de encontrar algun error lanza un error al usuario si no accede de forma adecuada a la apliacion

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Condiciones de autentificacion fallida

                if (user.getText().toString().toLowerCase().isEmpty() || pass.getText().toString().isEmpty()) {
                    comprobacion = "Usuario o contraseña vacio";
                    texto.setText(comprobacion);

                } else if (!user.getText().toString().toLowerCase().equals(usuarioDavid) || !pass.getText().toString().equals(contraseñaDavid)) {
                    comprobacion = "Usuario o contraseña incorrecto";
                    texto.setText(comprobacion);

                }else if (!user.getText().toString().equals(usuarioRonnie) && !pass.getText().toString().equals(contraseñaRonnie)) {
                    comprobacion = "Usuario o contraseña incorrecto";
                    texto.setText(comprobacion);

                } else {

                    //Condiciones de autentificacion correcta
                    if (user.getText().toString().toLowerCase().equals(usuarioDavid) && pass.getText().toString().equals(contraseñaDavid)) {
                        texto.setText("");
                        comprobacion = user.getText().toString();
                        mandarOtraPantallaDavid(login);

                    } else if (user.getText().toString().toLowerCase().equals(usuarioRonnie) && pass.getText().toString().equals(contraseñaRonnie)) {
                        texto.setText("");
                        comprobacion = user.getText().toString();
                        mandarOtraPantallaRonnie(login);
                    }
                }
            }
        });
    }


    //Metodos para mandar a la pantalla adecuada de cada user
    //Estos metodos no se pedian de base en la tarea, pero para ampliar mis conocimientos le añadi intent
    // y programe una pantalla parecida a la del usuario de instagram
    //Estos metodos se llaman en cada condicion si esta bien el user y password

    private void mandarOtraPantallaDavid(View view) {
        Intent i = new Intent(this, LoginCorrectoActivity.class);
        i.putExtra("USER", comprobacion);
        startActivity(i);
    }
    private void mandarOtraPantallaRonnie(View view) {
        Intent in = new Intent(this, LoginRonnieActivity.class);
        in.putExtra("USER", comprobacion);
        startActivity(in);
    }
}