package com.example.sucursalesapp.ado;

import com.example.sucursalesapp.modelos.Usuario;

public class UsuarioADO {

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
