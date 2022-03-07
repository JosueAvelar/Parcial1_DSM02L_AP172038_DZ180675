package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
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

    public boolean Update(View view){
        Boolean x=true ;

        String c1= txtNombre.getText().toString();
        String c2= txtCodigo.getText().toString();
        String c3= txtVentas.getText().toString();
        String c4= txtMes.getText().toString();

        if (c1.isEmpty()){
            txtNombre.setError("Este campo no puede quedar vacio");
            x=false;
        }else if(c2.isEmpty()){
            txtCodigo.setError("Este campo no puede quedar vacio");
            x=false;
        }else if(c3.isEmpty()){
            txtVentas.setError("Este campo no puede quedar vacio");
            x=false;
        }else if(c4.isEmpty()){
            txtMes.setError("Este campo no puede quedar vacio");
            x=false;
        }else{
            Imagen();
            x=false;
        }
        return x;
    }

    public void  calcularComisiones(View view){

        String comision=txtVentas.getText().toString();
        int comi=Integer.parseInt(comision);

        if(comi < 500){
            int comitot = comi;
            comitot = 0;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi >= 500 && comi < 1000){
            double comitot = comi * 0.05;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi >= 1000 && comi < 2000){
            double comitot = comi * 0.10;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi >= 2000 && comi < 3000){
            double comitot = comi * 0.15;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi >= 3000 && comi < 4000){
            double comitot = comi * 0.20;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }else if(comi >= 4000){
            double comitot = comi * 0.30;
            String tot=String.valueOf(comitot);
            txtComisiones.setText(tot);
        }

        Intent i = new Intent(this, Comisiones.class);
        i.putExtra("txtNombre",txtNombre.getText().toString());
        i.putExtra("txtCodigo",txtCodigo.getText().toString());
        i.putExtra("txtVentas",txtVentas.getText().toString());
        i.putExtra("TotalComisiones",txtComisiones.getText().toString());
        startActivity(i);
    }
    public void onClickFoto(View view){
        Imagen();
    }
    public void Imagen(){
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"seleccione la aplicacion"),10);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path=data.getData();
            foto.setImageURI(path);
        }
    }
    public void Regresar(View view){
        Intent intent2 = new Intent(this, MenuPrincipal.class);
        startActivity(intent2);
    }
}