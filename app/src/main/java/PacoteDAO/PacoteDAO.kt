package PacoteDAO

import model.Pacote
import java.util.*
import kotlin.collections.ArrayList


class PacoteDAO {

    fun lista(): List<Pacote> {
        return ArrayList(
            Arrays.asList(
                Pacote("São Paulo", "sao_paulo_sp", 2, (243.99)),
                Pacote("Belo Horizonte", "belo_horizonte_mg", 3, (421.50)),
                Pacote("Recife", "recife_pe", 4, (754.20)),
                Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 6, (532.55)),
                Pacote("Salvador", "salvador_ba", 5, (899.99)),
                Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 1, (289.90))
            )
        )
    }
}