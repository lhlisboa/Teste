package com.luizlisboa.teste;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ArrayList<String> nomes = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FUNCIONANDO - Inserindo Dinamicamente
/*
        ListView listaNomes = (ListView) findViewById(R.id.lista);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);
        listaNomes.setAdapter(adapter);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtNome = (EditText) findViewById(R.id.textNome);
                String nome = txtNome.getText().toString();

                if(nome.length() > 0){
                    txtNome.setText("");
                    txtNome.findFocus();
                    nomes.add(nome);
                    adapter.notifyDataSetChanged();
                } else{
                    //Toast.makeText(.this, "Digite", Toast.LENGTH_SHORT).show();
                }
            }
        });
*/

        //FUNCIONANDO - Inserindo por array
/*
        ListView lista = (ListView)findViewById(R.id.lista);
        String[] strings = new String[]{"Nome1", "Nom2", "Nome3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);

        lista.setAdapter(adapter);
*/
    }

    public void listarOnClick(View view) {
        Intent it = new Intent(MainActivity.this, ListaActivity.class);
        startActivity(it);
    }

    public void sair(View view){
        finish();
    }
}
