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

public class productos extends AppCompatActivity {

    Button v,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("      BLUSAS");
        list.add("      VESTIDOS");
        list.add("      SUDADERAS");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //blusas
                    startActivity(new Intent(productos.this,blu.class));
                }else if (position==1){
                    //vestidos
                    startActivity(new Intent(productos.this,vestidos.class));

                }else if (position==2){
                    //sudaderas
                    startActivity(new Intent(productos.this,sudaderas.class));

                }
            }
        });

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        v=(Button) findViewById(R.id.btnV1);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(productos.this, MainActivity.class));
            }
        });
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        s=(Button) findViewById(R.id.btnS);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(productos.this, lectorqr.class));
            }
        });
    }
}