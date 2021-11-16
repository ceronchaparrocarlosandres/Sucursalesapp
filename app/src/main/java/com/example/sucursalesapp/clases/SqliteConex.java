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
        db.execSQL("CREATE TABLE \"usuarios\" ( \"id\" INTEGER NOT NULL, \"nombres\" TEXT NOT NULL, \"apellidos\" TEXT NOT NULL, \"email\" TEXT, \"clave\" TEXT, PRIMARY KEY(\"id\") )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE usuarios");
    }
}
