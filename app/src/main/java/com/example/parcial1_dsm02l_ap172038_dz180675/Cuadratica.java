package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class Cuadratica extends AppCompatActivity {

    //Declaración de Variables:
    Button Calcular,Regresar;
    EditText A, B, C;
    TextView x1, x2, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadratica);

        Calcular = (Button) findViewById(R.id.btnCalcular);
        Regresar = (Button) findViewById(R.id.btnRegresar);
        A = (EditText) findViewById(R.id.txtA);
        B = (EditText) findViewById(R.id.txtB);
        C = (EditText) findViewById(R.id.txtC);
        x1 = (TextView) findViewById(R.id.txtX);
        x2 = (TextView) findViewById(R.id.txtY);
        msg = (TextView) findViewById(R.id.txtmsg);
    }

    public void CalcularEc(View view){
        //Conversión de Datos:
        double a = Double.parseDouble(A.getText().toString());
        double b = Double.parseDouble(B.getText().toString());
        double c = Double.parseDouble(C.getText().toString());
        //Calculo del Discriminante:
        double D = ((b*b) - (4*a*c));
        //Raices imaginarias:
        if (D>0) {
            //Solución de la Ecuación:
            double X1 = (-b + (Math.sqrt(D)))/(2*a);
            double X2 = (-b - (Math.sqrt(D)))/(2*a);
            msg.setText("Tienes una solución con números reales");
            //Resultados:
            x1.setText("El valor de la primera raíz es: " + X1);
            x2.setText("El valor de la segunda raíz es: " + X2);
        }
        else{
            msg.setText("La solución es con números imaginarios. No existen soluciones reales.");
        }
    }

    public void Regresar(View view){
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }
}