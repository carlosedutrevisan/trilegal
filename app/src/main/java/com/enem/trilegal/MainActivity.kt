package com.enem.trilegal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bntConfig = findViewById<ImageButton>(R.id.config)
        bntConfig.setOnClickListener{
            val abrirConfig = Intent(this, Configuracoes::class.java)
            startActivity(abrirConfig)
        }

        val bntAlgoritmo = findViewById<CardView>(R.id.algaritmo)
        bntAlgoritmo.setOnClickListener{
            val abrirAlgoritmo = Intent(this, Algoritmo::class.java)
            startActivity(abrirAlgoritmo)
        }

        val bntRecomendacao = findViewById<CardView>(R.id.recomendacao)
        bntRecomendacao.setOnClickListener{
            val abrirRecomendacao = Intent(this, Recomendacao::class.java)
            startActivity(abrirRecomendacao)
        }

        val bntEstatisticas = findViewById<CardView>(R.id.estatisticas)
        bntEstatisticas.setOnClickListener{
            val abrirEstatisticas = Intent(this, Estatisticas::class.java)
            startActivity(abrirEstatisticas)
        }

        val bntBancoDeQuestoes = findViewById<CardView>(R.id.banco)
        bntBancoDeQuestoes.setOnClickListener{
            val abrirBancoDeQuestoes = Intent(this, BancoDeQuestoes::class.java)
            startActivity(abrirBancoDeQuestoes)
        }

    }
}