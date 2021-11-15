package com.example.sucursalesapp.ado;

import com.example.sucursalesapp.modelos.Usuario;

import junit.framework.TestCase;

public class UsuarioADOTest extends TestCase {

    public void testValidarUsuario() {

        UsuarioADO us=new UsuarioADO();

        Usuario modelo=new Usuario();
        modelo.setEmail("user@gmail.com");
        modelo.setClave("root");

        boolean resultado= us.validarUsuario(modelo);

        assertEquals(true,resultado);
    }
}