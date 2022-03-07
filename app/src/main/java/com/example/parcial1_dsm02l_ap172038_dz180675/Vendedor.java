package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class Vendedor extends AppCompatActivity {
    ImageView foto;
    private EditText txtNombre;
    private EditText txtCodigo;
    private EditText txtVentas;
    private EditText txtMes;
    private TextView txtComisiones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor);

        foto=(ImageView) findViewById(R.id.foto);
        txtNombre=findViewById(R.id.txtNombre);
        txtCodigo=findViewById(R.id.txtCodigo);
        txtVentas=findViewById(R.id.txtVentas);
        txtMes=findViewById(R.id.txtMes);
    }
    public void  calcularComision(View view){
        String comision=txtVentas.getText().toString();
        int comi=Integer.parseInt(comision);
        if(comi < 500){
            int comitot = comi;
            comitot = 0;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi == 500 || comi < 1000){
            double comitot = comi * 0.05;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi == 1000 || comi < 2000){
            double comitot = comi * 0.10;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi == 2000 || comi < 3000){
            double comitot = comi * 0.15;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi == 3000 || comi < 4000){
            double comitot = comi * 0.20;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi > 4000){
            double comitot = comi * 0.30;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }
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