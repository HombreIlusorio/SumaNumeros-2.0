package com.example.carlos.sumanumeros;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatEditText n1 , n2;
    Button botonsumar;
    TextView resultado;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(AppCompatEditText)findViewById(R.id.et1);
        n2=(AppCompatEditText)findViewById(R.id.et2);
        resultado=(TextView)findViewById(R.id.resultado);
        botonsumar=(Button)findViewById(R.id.boton);
        botonsumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int suma = valor1 + valor2;
        resultado.setText(suma+"");

    }
}
