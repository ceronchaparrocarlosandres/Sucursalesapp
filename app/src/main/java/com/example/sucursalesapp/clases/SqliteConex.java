package com.example.sucursalesapp.clases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteConex extends SQLiteOpenHelper {
    private static final String nombre_bd="sucursalesapp.db";

    public SqliteConex(@Nullable Context c)
    {
        super(c,nombre_bd,null,2);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nombres VARCHAR (150) NOT NULL, apellidos VARCHAR (150) NOT NULL, email VARCHAR (150) NOT NULL, clave VARCHAR (10) NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE usuarios");
    }
}
