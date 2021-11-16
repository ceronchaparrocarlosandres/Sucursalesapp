package com.example.sucursalesapp.ado;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.example.sucursalesapp.clases.SqliteConex;
import com.example.sucursalesapp.modelos.Usuario;

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
