package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();

        list.add("      INICIAR SESION");
        list.add("      REGISTRARTE");
        list.add("      PRODUCTOS");
        list.add("      ¿EN DONDE ESTAMOS?");
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //sesion
                    startActivity(new Intent(MainActivity.this,sesion.class));
                }else if (position==1){
                    //login registro
                    startActivity(new Intent(MainActivity.this,registro.class));

                }else if (position==2){
                    //login productos
                    startActivity(new Intent(MainActivity.this,verproductos.class));

                }else if (position==3){
                    //ubicacion
                    startActivity(new Intent(MainActivity.this,MapsActivity.class));
                }


            }
        });
    }

    public void limpiar(View view) {
    }

    public void modificacion(View view) {
    }

    public void baja(View view) {
    }

    public void altas(View view) {
    }

    public void consulta(View view) {
    }

    public void inicio(View view) {
    }

    public void salir(View view) {
    }
}