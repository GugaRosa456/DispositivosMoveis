package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText Peso, Altura;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        Peso = findViewById(R.id.Peso);
        Altura = findViewById(R.id.Altura);
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, imcResultado.class);
            Bundle bundle = new Bundle();
            Double peso = Double.parseDouble(Peso.getText().toString());
            Double altura = Double.parseDouble(Altura.getText().toString());
            bundle.putDouble("peso", peso);
            bundle.putDouble("altura", altura);
            intent.putExtras(bundle);
            startActivity(intent);
        });
        imageView.setImageResource(R.drawable.perfil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}