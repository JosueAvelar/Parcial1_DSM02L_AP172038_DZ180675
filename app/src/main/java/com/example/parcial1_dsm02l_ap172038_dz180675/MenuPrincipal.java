package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnEjercicio1:
                Intent E1 = new Intent(this, Vendedor.class);
                startActivity(E1);
                break;
            case R.id.btnEjercicio2:
                Intent E2 = new Intent(this, Cuadratica.class);
                startActivity(E2);
                break;
            case R.id.btnRegresar:
                Intent Regresar = new Intent(this, MainActivity.class);
                startActivity(Regresar);
                break;
        }
    }
}