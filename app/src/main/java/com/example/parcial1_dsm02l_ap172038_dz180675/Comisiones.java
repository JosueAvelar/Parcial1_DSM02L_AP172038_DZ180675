package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Comisiones extends AppCompatActivity {

    private ImageView campoImagen1;
    private TextView campoNombre;
    private TextView campoCodigo;
    private TextView campoComisiones;
    private TextView campoVentas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comisiones);

        campoNombre=(TextView) findViewById(R.id.txtNombre);
        campoCodigo=(TextView) findViewById(R.id.txtCodigo);
        campoVentas=(TextView) findViewById(R.id.txtVentas);
       // campoImagen1=(ImageView) findViewById(R.id.imgPagina2); //no le he puesto el boton este de la imagen :c

        Bundle bundle = getIntent().getExtras();
        String nombre=bundle.getString("txtNombre");
        String codigo=bundle.getString("txtCodigo");
        String ventas=bundle.getString("txtVentas");
        String comision=bundle.getString("textTotalComision");


        campoNombre.setText(nombre);
        campoCodigo.setText(codigo);
        campoVentas.setText(ventas);
        campoComisiones.setText(comision);

    }
    public void onClick(View view){
        Intent intent = new Intent(this, Vendedor.class);
        startActivity(intent);
    }
}