package com.example.parcial1_dsm02l_ap172038_dz180675;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText campoUsuario, campoPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoUsuario = (EditText) findViewById(R.id.campoUsuario);
        campoPassword = (EditText) findViewById(R.id.campoPassword);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnGuardar:
                guardarPreferencias();
                break;
            case R.id.btnAvanzar:
                Intent intent = new Intent(this, MenuPrincipal.class);
                startActivity(intent);
                break;

            case R.id.btnSalir:
                finish();
                break;
        }
    }

    private void guardarPreferencias(){
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String usuario = campoUsuario.getText().toString();
        String password = campoPassword.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user", usuario);
        editor.putString("pass", password);
        editor.commit();
    }
}