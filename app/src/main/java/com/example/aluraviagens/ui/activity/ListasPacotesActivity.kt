
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.aluraviagens.R
import PacoteDAO.PacoteDAO
import com.example.aluraviagens.ui.adapter.ListaPacotesAdapter
import model.Pacote

class ListasPacotesActivity : AppCompatActivity() {

    private val mListaDAO: List<Pacote> = PacoteDAO().lista()
    private lateinit var mAdapter: ListaPacotesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pacotes)

        mAdapter = ListaPacotesAdapter(mListaDAO, this)

        var listaDePacotes: ListView = findViewById(R.id.list_view_pacotes)
        listaDePacotes.adapter = mAdapter

    }
}