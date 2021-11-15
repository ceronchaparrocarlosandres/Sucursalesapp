package com.example.sucursalesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater propertiesMenu = getMenuInflater();
        propertiesMenu.inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}