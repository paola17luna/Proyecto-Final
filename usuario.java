package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class usuario extends AppCompatActivity {

    Button v;
    Button r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        ////////////////////////////////////////////////////////////////////////////////////

        v=(Button) findViewById(R.id.btnV9);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(usuario.this, sesion.class));
            }
        });
        //////////////////////////////////////////////////////////////////////////////////////

        r=(Button) findViewById(R.id.btnRG);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(usuario.this, registro.class));
            }
        });


        //---------------------------------------------------------------------------------------------------------

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("usuario") && password.getText().toString().equals("123")) {
                    //correcto
                    Toast.makeText(usuario.this, "SESION INICIADA", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(usuario.this, productos.class));
                } else
                    //incorrecto
                    Toast.makeText(usuario.this, "ERROR SESION NO INICIADA", Toast.LENGTH_SHORT).show();

            }

        });
    }
}