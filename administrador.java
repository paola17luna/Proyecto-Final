package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class administrador extends AppCompatActivity {

    Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        v=(Button) findViewById(R.id.btnV8);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(administrador.this, sesion.class));
            }
        });



        //-------------------------------------------------------------------------------

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correcto
                    //-------------------------------------------------------------------------------


                    Toast.makeText(administrador.this, "SESION INICIADA", Toast.LENGTH_SHORT).show();
                    //startActivity(new Intent(administrador.this, baselocal.class));
                    startActivity(new Intent(administrador.this, ubicacion.class));

                } else
                    //incorrecto
                    Toast.makeText(administrador.this, "ERROR SESION NO INICIADA", Toast.LENGTH_SHORT).show();

            }

        });
    }
}