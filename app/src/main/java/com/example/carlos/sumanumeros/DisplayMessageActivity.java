package com.example.carlos.sumanumeros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);

        Integer Número1 = Integer.parseInt(message);
        Integer Número2 = Integer.parseInt(message2);
        Integer Resultado2 = Número1 + Número2;

        TextView text = findViewById(R.id.Resultado);
        text.setText(message);

        TextView text2 = findViewById(R.id.Resultado2);
        text2.setText(Integer.toString(Resultado2));

        }
    }
