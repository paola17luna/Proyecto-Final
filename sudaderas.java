package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class sudaderas extends AppCompatActivity {

    Button v,t;
    private CheckBox ch1,ch2,ch3,ch4;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudaderas);

        v=(Button) findViewById(R.id.btnV);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sudaderas.this, productos.class));
            }
        });
        //------------------------------------------------------------------------------------------------------
        t=(Button) findViewById(R.id.btnS);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sudaderas.this, ticket.class));
            }
        });

        //------------------------------------------------------------------------------------------------------
        ch1 = (CheckBox) findViewById(R.id.ch1);
        ch2 = (CheckBox) findViewById(R.id.ch2);
        ch3 = (CheckBox) findViewById(R.id.ch3);
        ch4 = (CheckBox) findViewById(R.id.ch4);

        tv3 = (TextView) findViewById(R.id.tv3);
    }
    public void operaciones (View view){
        int suma;
        int b1=300,b2=440,b3=580,b4=600;

        String valor="";
        if(ch1.isChecked()==true){
            valor=" $"+b1;
                    Toast.makeText(sudaderas.this,"a12 ",Toast.LENGTH_SHORT).show();
        }

        if(ch2.isChecked()==true){
            valor=" $"+b2;
                    Toast.makeText(sudaderas.this,"b12 ",Toast.LENGTH_SHORT).show();

        }if(ch3.isChecked()==true){
            valor=" $"+b3;
            Toast.makeText(sudaderas.this,"c12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch4.isChecked()==true){
            valor=" $"+b4;
            Toast.makeText(sudaderas.this,"d12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch2.isChecked()==true){
            suma=b1+b2;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"e12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch3.isChecked()==true){
            suma=b1+b3;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"f12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch4.isChecked()==true){
            suma=b1+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"g12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch2.isChecked()&ch3.isChecked()==true){
            suma=b2+b3;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"h12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch2.isChecked()&ch4.isChecked()==true){
            suma=b2+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"i12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch3.isChecked()&ch4.isChecked()==true){
            suma=b3+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"j12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch2.isChecked()==true&ch3.isChecked()==true){
            suma=b1+b2+b3;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"k12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch3.isChecked()==true&ch4.isChecked()==true){
            suma=b1+b3+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"l12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch2.isChecked()==true&ch4.isChecked()==true){
            suma=b1+b2+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"m12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch2.isChecked()&ch3.isChecked()==true&ch4.isChecked()==true){
            suma=b2+b3+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"n12 ",Toast.LENGTH_SHORT).show();
        }
        if(ch1.isChecked()&ch2.isChecked()&ch3.isChecked()==true&ch4.isChecked()==true){
            suma=b1+b2+b3+b4;
            valor=" $"+suma;
            Toast.makeText(sudaderas.this,"o12 ",Toast.LENGTH_SHORT).show();
        }
        tv3.setText(valor);
    }

}