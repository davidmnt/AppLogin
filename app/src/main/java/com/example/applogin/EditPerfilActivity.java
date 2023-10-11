package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditPerfilActivity extends AppCompatActivity {

    private String des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_perfil);
      /*  TextView cancelar = findViewById(R.id.cancelar);
        TextView listo = findViewById(R.id.listo);
        EditText rellenarEdit = findViewById(R.id.rellenarEdit);


        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retroceder(cancelar);
            }
        });

        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            listoEdit(listo);
            des = rellenarEdit.getText().toString();
            }
        });

    }

    private void retroceder(View view){
        Intent i = new Intent(this, LoginCorrectoActivity.class);
        startActivity(i);
    }

    private void listoEdit(View view){
        Intent in = new Intent(this, LoginCorrectoActivity.class);
        in.putExtra("descripcion",des);
        startActivity(in);


       */

    }


}