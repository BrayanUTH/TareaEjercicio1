package com.application.tareaejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultados extends AppCompatActivity {

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        double total = getIntent().getDoubleExtra("resultado", 0.00);

        txtResultado.setText("Resultado: ".concat(String.valueOf(total)));
    }
}