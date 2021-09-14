package com.example.aluraviagens.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.aluraviagens.R
import model.Pacote

class ListaPacotesAdapter(val pacotes: List<Pacote>, val context: Context): BaseAdapter() {

    override fun getCount(): Int {
        return pacotes.count()
    }

    override fun getItem(posicao: Int): Any {
        return pacotes[posicao]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder", "UseCompatLoadingForDrawables")
    override fun getView(posicao: Int, view: View?, parent: ViewGroup?): View? {
        val viewCriada: View = LayoutInflater.from(context)
            .inflate(R.layout.item_pacote, parent, false)

        val (local1, imagem1, dias1, preco1) = pacotes.get(posicao)

        mostraLocal(viewCriada, local1)
        mostraImagem(viewCriada, imagem1)
        mostaDias(viewCriada, dias1)
        mostraPreco(viewCriada, preco1)

        return viewCriada
    }

    private fun mostraPreco(viewCriada: View, preco1: Double) {
        val preco: TextView = viewCriada.findViewById(R.id.text_view_preco)
        preco.text = preco1.toString()
    }

    private fun mostaDias(viewCriada: View, dias1: Int) {
        val dias: TextView = viewCriada.findViewById(R.id.text_view_tempo)
        formataDiaEmTexto(dias1, dias)
    }

    private fun formataDiaEmTexto(dias1: Int, dias: TextView) {
        if (dias1 > 1) {
            dias.text = dias1.toString() + " dias"
        } else {
            dias.text = dias1.toString() + " dia"
        }
    }

    private fun mostraImagem(viewCriada: View, imagem1: String) {
        val imagem: ImageView = viewCriada.findViewById(R.id.image_view_pacote)
        val drawableImagemPacote: Drawable = devolveDrawable(imagem1)
        imagem.setImageDrawable(drawableImagemPacote)
    }

    private fun devolveDrawable(imagem1: String): Drawable {
        val resources: Resources = context.getResources()
        val idDoDrawable: Int = resources.getIdentifier(
            imagem1, "drawable", context.getPackageName()
        )
        val drawableImagemPacote: Drawable = resources.getDrawable(idDoDrawable)
        return drawableImagemPacote
    }

    private fun mostraLocal(viewCriada: View, local1: String) {
        val local: TextView = viewCriada.findViewById(R.id.text_view_cidade)
        local.text = local1
    }
}