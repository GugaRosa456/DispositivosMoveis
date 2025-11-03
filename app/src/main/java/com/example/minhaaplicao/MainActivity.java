package com.example.minhaaplicao;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
SQLiteDatabase db;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    db = openOrCreateDatabase("app_database", MODE_PRIVATE, null);
    db.execSQL("CREATE TABLE notas(id INTEGER PRIMARY KEY AUTOINCREMENT," + " titulo VARCHAR, texto TEXT)");


        b = findViewById(R.id.button);
        b.setOnClickListener( v -> {
            EditText editText = findViewById(R.id.editTextText);
            String texto = editText.getText().toString();
            ContentValues cv = new ContentValues();
       cv.put("titulo", "Nota de Exemplo");
        cv.put("texto", texto);
    db.insert("notas",null, cv);
            Toast.makeText(this,"Nota salva com sucesso!", Toast.LENGTH_SHORT).show();
     });
    }
  }