package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class datos extends AppCompatActivity {

    TextView tvnombre, tvap, tvam, tvedad, tvcorreo, tvcontraseña;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        /////////////////////////////////////////////////////////////////////////////////
        TextView tvN =(TextView) findViewById(R.id.tvN);

        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 = tvN.getText().toString();
                Toast.makeText(datos.this,"Nombre de Usuario es "+username1,Toast.LENGTH_SHORT).show();
                startActivity(new Intent(datos.this,productos.class));
            }
        });


        ////////////////////////////////////////////////////////////////////////7

        tvnombre = (TextView) findViewById(R.id.tvN);
        tvap = (TextView) findViewById(R.id.tvAP);
        tvam = (TextView) findViewById(R.id.tvAM);
        tvedad = (TextView) findViewById(R.id.tvE);
        tvcorreo = (TextView) findViewById(R.id.tvC);
        tvcontraseña = (TextView) findViewById(R.id.tvCA);
        btnOK = (Button) findViewById(R.id.bt2);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(datos.this, registro.class);
                startActivity(intent);
            }
        });

        mostrarDato();

    }
    private void mostrarDato(){
        Bundle datos = this.getIntent().getExtras();
        String et1 = datos.getString("n");
        String et2 = datos.getString("app");
        String et3 = datos.getString("apm");
        String et4 = datos.getString("e");
        String et5 = datos.getString("email");
        String et6 = datos.getString("c");


        tvnombre.setText(et1);
        tvap.setText(et2);
        tvam.setText(et3);
        tvedad.setText(et4);
        tvcorreo.setText(et5);
        tvcontraseña.setText(et6);
    }
}