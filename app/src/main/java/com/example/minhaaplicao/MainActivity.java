package com.example.minhaaplicao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextMin, editTextMax;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        editTextMin =findViewById(R.id.editMin);
        editTextMax =findViewById(R.id.editMax);
        tv = findViewById(R.id.tvResultado);

        button.setOnClickListener(v -> {
            Random random= new Random();
            int min, max;
            min=Integer.parseInt(editTextMin.getText().toString());
            max=Integer.parseInt(editTextMax.getText().toString());

            int sortiado = random.nextInt();
            tv.setText(Integer.toString(sortiado));
        });
    }
}
