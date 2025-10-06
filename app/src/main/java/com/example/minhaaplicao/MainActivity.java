package com.example.minhaaplicao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> nomes;
    ListView listView;
    Button adicionarBotao;

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.ListView);
        et = findViewById(R.id.et);
        adicionarBotao = findViewById(R.id.AdicionarBotao);
        nomes = new ArrayList<String>();
       ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,nomes);
       listView.setAdapter(adapter);

        adicionarBotao.setOnClickListener(v  -> {
                    nomes.add(et.getText().toString());
                    adapter.notifyDataSetChanged();
                });
listView.setOnItemLongClickListener( ( parent, view, position, id) -> {
    nomes.remove(position);
    adapter.notifyDataSetChanged();
    return true;

   });


        // Excluir elementos da Listagem

    }
}