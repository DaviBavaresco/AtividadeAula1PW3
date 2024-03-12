package com.example.atividadeaula1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enviarDados(View view) {

        EditText editIdade = findViewById(R.id.etIdade);
        int idade =2024 - Integer.parseInt(editIdade.getText().toString());

        String textIdade = String.valueOf(idade);

        Intent intent = new Intent(this, TelaActivity.class);

        intent.putExtra("txtIdade", textIdade);


        startActivity(intent);

    }
}