package com.example.myprova;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            numero.setOnClickListener(v -> {
                t1 = numero * 1;
            t2 = numero * 2;
            t3 = numero * 3;
            t4 = numero * 4;
            t5 = numero * 5;
            t6 = numero * 6;
            t7 = numero * 7;
            t8 = numero * 8;
            t9 = numero * 9;
            t10 = numero * 10;

            });
        });
    }
}