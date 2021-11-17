package com.example.sucursalesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sucursalesapp.ado.UsuarioADO;
import com.example.sucursalesapp.clases.Mensajes;
import com.example.sucursalesapp.modelos.Usuario;

public class RegistrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Button btncancelar=(Button) findViewById(R.id.button6);
        Button btnguardar =(Button) findViewById(R.id.button7);
        EditText txtNombres=(EditText) findViewById(R.id.editTextTextPersonName);
        EditText txtApellidos=(EditText) findViewById(R.id.editTextTextPersonName2);
        EditText txtEmail=(EditText) findViewById(R.id.editTextTextEmailAddress2);
        EditText txtContraseña=(EditText) findViewById(R.id.editTextTextPassword2);

        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombres=txtNombres.getText().toString();
                String apellidos=txtApellidos.getText().toString();
                String email=txtEmail.getText().toString();
                String clave=txtContraseña.getText().toString();

                if(validarCampos(nombres,apellidos,email,clave))
                {
                    UsuarioADO registro=new UsuarioADO(v.getContext());
                    Usuario us=new Usuario();
                    us.setNombres(nombres);
                    us.setApellidos(apellidos);
                    us.setEmail(email);
                    us.setClave(clave);
                    long id=registro.insertar(us);
                    if (id>0)
                        new Mensajes(v.getContext()).alert("Registro insertado","Se ha insertado el registro correctamente con el codigo"+ String.valueOf(id));
                    else
                        new Mensajes(v.getContext()).alert("Error","Se ha producido un error al intentar insertar el registro");

                    registro.listar();

                }
                else
                {
                    new Mensajes(v.getContext()).alert("Advertencia","Digite los campos en blanco");
                }
            }
        });
    }

    public static boolean validarCampos(String nombres,String apellidos,String email,String clave)
    {
        boolean camposAceptados=false;
        if ((!nombres.isEmpty()&& !apellidos.isEmpty()&& !email.isEmpty()&& !clave.isEmpty()))
            camposAceptados=true;
            return camposAceptados;

    }
}