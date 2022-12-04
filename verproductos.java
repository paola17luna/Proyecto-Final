package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class verproductos extends AppCompatActivity {

    Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verproductos);

        v = (Button) findViewById(R.id.bt2);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(verproductos.this, MainActivity.class));
            }
        });


        /////////////////////////////////////////////////////////////////////////////

        MaterialButton regbtn = (MaterialButton) findViewById(R.id.bbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  String username1 = tvN.getText().toString();
                Toast.makeText(verproductos.this,"HAY UN TOTAL DE 4 TIPOS DE BLUSAS ",Toast.LENGTH_SHORT).show();

            }
        });
        /////////////////////////////////////////////////////////////////////////////
        MaterialButton reg2btn = (MaterialButton) findViewById(R.id.sbtn);

        reg2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  String username1 = tvN.getText().toString();
                Toast.makeText(verproductos.this,"HAY UN TOTAL DE 4 TIPOS DE SUDADERAS ",Toast.LENGTH_SHORT).show();

            }
        });
        /////////////////////////////////////////////////////////////////////////////
        MaterialButton reg3btn = (MaterialButton) findViewById(R.id.vbtn);

        reg3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  String username1 = tvN.getText().toString();
                Toast.makeText(verproductos.this,"HAY UN TOTAL DE 4 TIPOS DE VESTIDOS ",Toast.LENGTH_SHORT).show();

            }
        });
        /////////////////////////////////////////////////////////////////////////////
    }
}