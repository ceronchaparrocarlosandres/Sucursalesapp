package com.example.sucursalesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sucursalesapp_barra);

        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater propiedadesMenu=getMenuInflater();
        propiedadesMenu.inflate(R.menu.mainmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.main_settings:
                Intent k=new Intent(this, AgregarBancoActivity.class);
                startActivity(k);
                break;
            case R.id.main_map:
                break;
            case R.id.main_about:
                Intent i=new Intent(this, AcercaDe.class);
                startActivity(i);
                break;
            case R.id.main_logout:
                Intent j=new Intent(this, LoginActivity.class);
                startActivity(j);
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}