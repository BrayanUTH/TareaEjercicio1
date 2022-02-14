package com.application.tareaejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    Operaciones operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.txtNumero1);
        numero2 = (EditText) findViewById(R.id.txtNumero2);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicacion);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumar();
            }
        });
        
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restar();
            }
        });
        
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dividir();
            }
        });
        
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multipliar();
            }
        });
    }

    private void multipliar() {
        operaciones = new Operaciones();
        double resultado = 0.00;

        operaciones.setNumero1(Double.parseDouble(numero1.getText().toString()));
        operaciones.setNumero2(Double.parseDouble(numero2.getText().toString()));
        resultado = operaciones.multiplicacion();
        Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void dividir() {
        operaciones = new Operaciones();
        double resultado = 0.00;

        operaciones.setNumero1(Double.parseDouble(numero1.getText().toString()));
        operaciones.setNumero2(Double.parseDouble(numero2.getText().toString()));
        resultado = operaciones.dividir();
        Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void restar() {
        operaciones = new Operaciones();
        double resultado = 0.00;

        operaciones.setNumero1(Double.parseDouble(numero1.getText().toString()));
        operaciones.setNumero2(Double.parseDouble(numero2.getText().toString()));
        resultado = operaciones.resta();
        Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }

    private void sumar() {
        operaciones = new Operaciones();
        double resultado = 0.00;

        operaciones.setNumero1(Double.parseDouble(numero1.getText().toString()));
        operaciones.setNumero2(Double.parseDouble(numero2.getText().toString()));
        resultado = operaciones.suma();
        Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }
}