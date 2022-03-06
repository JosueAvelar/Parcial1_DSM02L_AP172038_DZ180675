package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Vendedor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcular:
                Intent intent = new Intent(this, Comisiones.class);
                startActivity(intent);
                break;
            case R.id.btnRegresar:
                Intent intent2 = new Intent(this, MenuPrincipal.class);
                startActivity(intent2);
                break;
        }
    }
}