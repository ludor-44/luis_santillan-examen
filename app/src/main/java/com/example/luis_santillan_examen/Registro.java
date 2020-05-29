package com.example.luis_santillan_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText nombre, mensual,total;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre=findViewById(R.id.etNombre);
        mensual=findViewById(R.id.etMontoInicial);
        total=findViewById(R.id.etMensual);
        enviar=findViewById(R.id.btnEnviar);
    }
    public void Enviar(View view){
        String nombreEnvio;
        nombreEnvio = nombre.getText().toString();
        Toast.makeText(getApplicationContext(),"Elementos guardados con exito",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Registro.this, Encuesta.class);
        intent.putExtra("LUIS SANTILLAN",nombreEnvio); //luis
        startActivity(intent);
    }
}
