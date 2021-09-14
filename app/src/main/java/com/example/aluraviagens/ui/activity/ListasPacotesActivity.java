package com.example.aluraviagens.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.aluraviagens.R;
import PacoteDAO.PacoteDAO;
import com.example.aluraviagens.ui.adapter.ListaPacotesAdapter;
import model.Pacote;

import java.util.List;

public class ListasPacotesActivity extends Activity {

    public static final String TITULO_APPBAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        setTitle(TITULO_APPBAR);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDePacotes = findViewById(R.id.list_view_pacotes);
        List<Pacote> pacotes = new PacoteDAO().lista();
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }

}
