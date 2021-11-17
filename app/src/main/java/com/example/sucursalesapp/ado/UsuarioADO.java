package com.example.sucursalesapp.ado;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.sucursalesapp.clases.SqliteConex;
import com.example.sucursalesapp.modelos.Usuario;

import java.util.ArrayList;

public class UsuarioADO extends SqliteConex {

    private Context contexto;
    public UsuarioADO(@Nullable Context c)
    {
        super(c);
        this.contexto=c;
    }
    public long insertar(Usuario us)
    {
        long id=0;
        try
        {
            SqliteConex dbc=new SqliteConex(this.contexto);
            SQLiteDatabase db =dbc.getWritableDatabase();



            ContentValues valores=new ContentValues();
            valores.put("nombres",us.getNombres());
            valores.put("apellidos",us.getApellidos());
            valores.put("email",us.getEmail());
            valores.put("clave",us.getClave());

            id=db.insert("usuarios",null,valores);
        }
        catch(Exception ex)
        {

        }

        return id;
    }
    public ArrayList<Usuario> listar()
    {
        SqliteConex conexion = new SqliteConex(this.contexto);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ArrayList<Usuario> registros = new ArrayList<>();
        Cursor cregistros = db.rawQuery("select id, nombres, apellidos, email, clave from usuarios", null);

        if(cregistros.moveToFirst())
            do {
                Usuario us = new Usuario();
                us.setId(cregistros.getInt(0));
                us.setNombres(cregistros.getString(1));
                us.setApellidos(cregistros.getString(2));
                us.setEmail(cregistros.getString(3));
                us.setClave(cregistros.getString(4));

                registros.add(us);
            }while (cregistros.moveToNext());

        return registros;
    }

    public boolean validarUsuario(Usuario us)
    {
        boolean validado=false;
        String emailfijo="user@gmail.com";
        String clavefija="root";

        if(us.getEmail().equals(emailfijo)&& us.getClave().equals(clavefija))
            validado=true;
        return validado;


    }
}
