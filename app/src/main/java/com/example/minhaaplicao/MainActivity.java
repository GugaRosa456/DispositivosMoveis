package com.example.minhaaplicao;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ciclo de vida", "Oncreate ");


        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo_vida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo_vida", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo_vida", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop(); Log.d("ciclo_vida", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo_vida", "onDestroy");

    }


}
