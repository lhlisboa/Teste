package com.luizlisboa.teste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.luizlisboa.teste.R.id.lista3;

/**
 * Created by root on 13/12/16.
 */

public class ListaActivity extends Activity {
    private ArrayList<String> nomes = new ArrayList<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        //Inserindo pelo array
        ListView lista = (ListView)findViewById(lista3);
        String[] strings = new String[]{"Nome1", "Nom2", "Nome3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);

        lista.setAdapter(adapter);
    }

    public void voltarOnClick(View v) {
        Intent it = new Intent(ListaActivity.this, MainActivity.class);
        startActivity(it);
    }


}
