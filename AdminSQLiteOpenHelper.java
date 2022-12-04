package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }//

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("create table usuario(nControl integer primary key ,nombre text,semestre integer,carrera text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int i, int i1) {
        bd.execSQL("drop table if exists usuario");//si la tabla existe que la destruya
        bd.execSQL("create table usuario(nControl integer primary key, nombre text, semestre integer, carrera text)");//crear tabla por cada tabla hago un upgrade
    }
}