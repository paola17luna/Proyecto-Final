package com.example.proyecto;


import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class ticket extends AppCompatActivity {
    Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        v=(Button) findViewById(R.id.botonv);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ticket.this, productos.class));
            }
        });

        //-------------------------------------------------------------------
        EditText txtDatos=findViewById(R.id.txtDatos);
        Button botontex=findViewById(R.id.botontex);
        ImageView codeqr=findViewById(R.id.codeqr);

        botontex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap=barcodeEncoder.encodeBitmap(txtDatos.getText().toString(), BarcodeFormat.QR_CODE,  750, 750 );
                    codeqr.setImageBitmap(bitmap);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}