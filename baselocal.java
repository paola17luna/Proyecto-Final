package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class baselocal extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baselocal);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        ed4=findViewById(R.id.ed4);
    }
    public void altas(View view )
    {
        AdminSQLiteOpenHelper admin= new AdminSQLiteOpenHelper(this,"administracion",null,1);//crear tabla ,informacion para base de datos
        SQLiteDatabase bd = admin.getWritableDatabase();
        String dni= ed1.getText().toString();//nControl
        String nombre=ed2.getText().toString();
        String semestre=ed3.getText().toString();
        String carrera=ed4.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("nControl",dni);
        registro.put("nombre",nombre);
        registro.put("Semestre",semestre);
        registro.put("carrera",carrera);
        bd.insert("usuario",null,registro);
        bd.close();
        Toast.makeText(this,"Datos del usuario cargados",Toast.LENGTH_SHORT).show();
        this.limpiar();
    }
    public void limpiar()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
    }
    public void limpiar(View view)
    {
        this.limpiar();
    }
    // Hacemos búsqueda de usuario por DNI
    public void consulta(View view)
    {
        AdminSQLiteOpenHelper admin= new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd =admin.getWritableDatabase();
        String nControl=ed1.getText().toString();
        Cursor fila = bd.rawQuery("select nombre,semestre,carrera from usuario where nControl="+ nControl,null);
        //Cursor fila = bd.rawQuery("select nombre,semestre,carrera from usuario" ,null);
        if(fila.moveToFirst())
        {

            //Toast.makeText(this, "Estoy dentro del registro ", Toast.LENGTH_SHORT).show();
            ed2.setText(fila.getString(0));
            ed3.setText(fila.getString(1));
            ed4.setText(fila.getString(2));
        }
        else
        {
            Toast.makeText(this, "No existe ningún usuario con ese dni", Toast.LENGTH_SHORT).show();
            bd.close();
        }
    }
    // Método para dar de baja al usuario insertado
    public void baja(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String dni = ed1.getText().toString();
        int cant = bd.delete("usuario", "nControl=" + dni, null);//
        bd.close();
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        if (cant == 1)
            Toast.makeText(this, "Usuario eliminado", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No existe usuario", Toast.LENGTH_SHORT).show();
    }
    // Método para modificar la información del usuario
    public void modificacion(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String dni = ed1.getText().toString();
        String nombre = ed2.getText().toString();
        String semestre = ed3.getText().toString();
        String carrera = ed4.getText().toString();
        ContentValues registro = new ContentValues();
        // actualizamos con los nuevos datos, la información cambiada
        registro.put("nombre", nombre);
        registro.put("semestre", semestre);
        registro.put("carrera", carrera);
        int cant = bd.update("Usuario", registro, "nControl=" + dni, null);
        bd.close();
        if (cant == 1)
            Toast.makeText(this, "Datos modificados con éxito", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No existe usuario", Toast.LENGTH_SHORT).show();
    }

    public void salir (View view){

        s=(Button) findViewById(R.id.button8);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View s) {
                startActivity(new Intent(baselocal.this, ubicacion.class));
            }
        });
    }



}