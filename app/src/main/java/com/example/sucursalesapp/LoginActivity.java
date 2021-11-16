package com.example.sucursalesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sucursalesapp.clases.Mensajes;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnAcceder = (Button) findViewById(R.id.button);
        EditText txtUsuario = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText txtClave = (EditText) findViewById(R.id.editTextTextPassword);

        Button btnRegistrar = (Button)  findViewById(R.id.button2);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View view) {
               Intent in = new Intent(view.getContext(), RegistrarActivity.class);
                //in.putExtra("usuario", txtUsuario.getText().toString());
                 startActivity(in);
               }
        });

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioDigitado = txtUsuario.getText().toString();
                String claveDigitada = txtClave.getText().toString();

                if (usuarioDigitado.equals("email@gmail.com") && claveDigitada.equals("123"))
                {



                            Intent in = new Intent(view.getContext(),MainActivity.class);
                            //in.putExtra("usuario", txtUsuario.getText().toString());
                            startActivity(in);
                }
                else new Mensajes(view.getContext()).alert("Error","Campos Incorrectos");
            }
        });
    }
}