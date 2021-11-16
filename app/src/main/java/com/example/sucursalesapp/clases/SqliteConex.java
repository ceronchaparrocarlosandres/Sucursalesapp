package com.example.sucursalesapp.clases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteConex extends SQLiteOpenHelper {
    private static final String nombre_bd="sucursalesapp";

    public SqliteConex(@Nullable Context c)
    {
        super(c,nombre_bd,null,2);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE usuarios (id INTEGER PRIMARY KEY NOT NULL UNIQUE, nombres VARCHAR (50) NOT NULL, apellidos VARCHAR (50) NOT NULL, email VARCHAR (50) NOT NULL, contraseña VARCHAR (50) NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE usuarios");
    }
}
