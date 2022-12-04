package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ubicacion extends AppCompatActivity {

    Button l,ver,volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        l=(Button) findViewById(R.id.loginbtn);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ubicacion.this, baselocal.class));
            }
        });
        //---------------------------------------------------------------------------
        ver=(Button) findViewById(R.id.btnu);

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ubicacion.this, productos.class));
            }
        });
        //---------------------------------------------------------------------------
        volver=(Button) findViewById(R.id.btnV8);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ubicacion.this, MainActivity.class));
            }
        });
    }
}