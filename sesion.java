package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sesion extends AppCompatActivity {
    Button v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);

        v=(Button) findViewById(R.id.btnV);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sesion.this, MainActivity.class));
            }
        });
        //////////////////////////////////////////////////////////
        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("      USUARIO");
        list.add("      ADMINISTRADOR");
        list.add("      NO TENGO CUENTA");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //QR
                    startActivity(new Intent(sesion.this,usuario.class));
                }else if (position==1){
                    //login sesion
                    startActivity(new Intent(sesion.this,administrador.class));

                }else if (position==2){
                    //login registro
                    startActivity(new Intent(sesion.this,registro.class));

                }

            }
        });
    }
}