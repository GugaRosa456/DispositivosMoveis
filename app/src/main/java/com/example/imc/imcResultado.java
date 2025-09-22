package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class imcResultado extends AppCompatActivity {
    Button b;
    TextView Resultado;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imc_resultado);
        Resultado=findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView2);


        Intent i = getIntent();
        Bundle b = i.getExtras();
        Double peso = b.getDouble("peso");
        Double altura = b.getDouble("altura");


        Double imc = peso / (altura * altura);
        Resultado.setText(Double.toString(imc));
        imageView.setImageResource(R.drawable.perfil);

        if (imc<18.9) {imageView.setImageResource(R.drawable.abaixopeso);
        }
        else if (imc >= 18.9 && imc <25) {imageView.setImageResource(R.drawable.normal);
        }
        else if (imc >= 25 && imc < 30) {imageView.setImageResource(R.drawable.sobrepeso);
        }
        else if (imc >= 30 && imc < 35) {imageView.setImageResource(R.drawable.obesidade1);
        }
        else if (imc >= 35 && imc < 40) {imageView.setImageResource(R.drawable.obesidade2);
        }
        else {imageView.setImageResource(R.drawable.obesidade3);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

