package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Comisiones extends AppCompatActivity {

    private ImageView foto;
    private TextView txtNombre;
    private TextView txtCodigo;
    private TextView txtComisiones;
    private TextView txtVentas;
    private TextView txtMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comisiones);

        txtNombre=(TextView) findViewById(R.id.txtNombre);
        txtCodigo=(TextView) findViewById(R.id.txtCodigo);
        txtVentas=(TextView) findViewById(R.id.txtVentas);
        txtMes=(TextView) findViewById(R.id.txtMes);
       foto=(ImageView) findViewById(R.id.foto);

        Bundle bundle = getIntent().getExtras();
        String nombre=bundle.getString("txtNombre");
        String codigo=bundle.getString("txtCodigo");
        String ventas=bundle.getString("txtVentas");
        String mes=bundle.getString("txtMes");
        String comision=bundle.getString("txtComisiones");


        txtNombre.setText(nombre);
        txtCodigo.setText(codigo);
        txtVentas.setText(ventas);
        txtMes.setText(mes);
        txtComisiones.setText(comision);

    }
    public void Regresar(View view){
        Intent intent = new Intent(this, Vendedor.class);
        startActivity(intent);
    }
}