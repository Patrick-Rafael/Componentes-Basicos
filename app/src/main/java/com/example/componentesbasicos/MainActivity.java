package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoNome;
    private TextInputEditText campoEmail;
    private TextView resultadoNome;
    private TextView resultadoEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void enviar(View view){

        campoNome = findViewById(R.id.textNome);
        resultadoNome = findViewById(R.id.textResultado);
        campoEmail = findViewById(R.id.textEmail);
        resultadoEmail = findViewById(R.id.email);

        String nome = campoNome.getText().toString();
        String emailCaixa = campoEmail.getText().toString();

        resultadoNome.setText("nome: "  + nome);
        resultadoEmail.setText("Email: " + emailCaixa);



    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
        resultadoNome.setText("");
        resultadoEmail.setText("");


    }

}