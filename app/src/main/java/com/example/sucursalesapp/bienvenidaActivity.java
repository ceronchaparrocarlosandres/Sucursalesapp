package com.example.sucursalesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class bienvenidaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_bienvenida);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent intent=new Intent(bienvenidaActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
}