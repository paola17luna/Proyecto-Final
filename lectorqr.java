package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class lectorqr extends AppCompatActivity {

    private Button btnscanner;
    private EditText resultado;
    Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectorqr);

        v=(Button) findViewById(R.id.btv);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lectorqr.this, productos.class));
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        btnscanner=findViewById(R.id.btnscanner);
        resultado =findViewById(R.id.resultado);

        btnscanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(lectorqr.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                integrator.setPrompt("LECTOR-CDP");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(true);
                integrator.initiateScan();
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if (result!=null){
            if (result.getContents() == null){
                Toast.makeText(this, "LECTURA CANCELADA",Toast.LENGTH_LONG).show();
            } else {
                //Toast.makeText(this,result.getContents(),Toast.LENGTH_LONG).show();
                Toast.makeText(this,"FELICIDADES4" +
                        " TIENES 25% DE DESCUENTO",Toast.LENGTH_LONG).show();
                resultado.setText(result.getContents());

            }
        } else {
            super.onActivityResult(requestCode,resultCode,data);
        }



    }
}