package com.freitas.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Raphael Freitas", "Victoria Bortone", "Flavia Estrela", "Rodrigo Cabrito", "Raphael Freitas", "Victoria Bortone", "Raphael Freitas", "Victoria Bortone", "Flavia Estrela", "Rodrigo Cabrito", "Flavia Estrela", "Rodrigo Cabrito"};
        ListView listaAlunos = findViewById(R.id.lista_alunos);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(arrayAdapter);

        final Button addAluno = findViewById(R.id.add_aluno);
        addAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentFormulario);
            }
        });

    }

}
