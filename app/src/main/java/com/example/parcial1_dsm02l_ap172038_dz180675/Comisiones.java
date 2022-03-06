package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Comisiones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comisiones);
    }
    public void onClick(View view){
        Intent intent = new Intent(this, Vendedor.class);
        startActivity(intent);
    }
}