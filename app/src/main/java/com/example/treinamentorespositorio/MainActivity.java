package com.example.treinamentorespositorio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button texte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        func();
    }

    public void func(){
        texte = findViewById(R.id.button21);
        texte.setOnClickListener(v -> Toast.makeText(MainActivity.this, "XABLAU", Toast.LENGTH_SHORT).show());
    }
}