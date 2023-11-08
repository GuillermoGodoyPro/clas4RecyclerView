package com.matesdev.clas4recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.recyclerView)
        recycleView.layoutManager = LinearLayoutManager( this )

        val adapter = PokemonAdapter()
        recycleView.adapter = adapter

        adapter.submitList(getListaPokemon())

    }

    private fun getListaPokemon(): MutableList<Pokemon>{
        return mutableListOf(
            Pokemon( 1,"Bulbasaur", "49", "80", "67", TipoPokemon.PLANTA),
            Pokemon( 2,"Charizard", "120", "99", "122", TipoPokemon.FUEGO),
            Pokemon( 3,"Blastoir", "111", "69", "117", TipoPokemon.AGUA)


        )
    }

}