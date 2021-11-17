package com.example.sucursalesapp;

import junit.framework.TestCase;

public class RegistrarActivityTest extends TestCase {

    public void testValidarCampos() {

        boolean resultado= RegistrarActivity.validarCampos("","","","");
         assertEquals(false,resultado);
    }
}