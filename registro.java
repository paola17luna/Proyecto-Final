package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class registro extends AppCompatActivity {
    Button v;
    EditText nombre, ap, am, edad, correo, contraseña;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        v = (Button) findViewById(R.id.btnV2);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(registro.this, MainActivity.class));
            }
        });


        /////////////////////////////////////////////////////////////////////
        nombre =(EditText) findViewById(R.id.et1);
        ap =(EditText) findViewById(R.id.et2);
        am =(EditText) findViewById(R.id.et3);
        edad =(EditText) findViewById(R.id.et4);
        correo =(EditText) findViewById(R.id.et5);
        contraseña =(EditText) findViewById(R.id.et6);
        aceptar = (Button) findViewById(R.id.bt1);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = nombre.getText().toString();
                String app = ap.getText().toString();
                String apm = am.getText().toString();
                String e = edad.getText().toString();
                String email = correo.getText().toString();
                String c = contraseña.getText().toString();

                Intent i = new Intent(registro.this, datos.class);

                i.putExtra("n", n);
                i.putExtra("app", app);
                i.putExtra("apm", apm);
                i.putExtra("e", e);
                i.putExtra("email", email);
                i.putExtra("c", c);

                startActivity(i);

            }
        });

    }
}