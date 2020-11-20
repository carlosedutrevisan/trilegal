package com.enem.trilegal

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_algoritmo.*

class Algoritmo : AppCompatActivity() {

    //Config da activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algoritmo)
        //Titulo da activity
        val actionbar = supportActionBar
        this.title = "Questão"
        actionbar.run {
            this!!.title = "Questão"
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        //Titlo da questão (variavel da activity passada)
        val materiasselecionadaExtra = intent.getStringExtra("Materiasselecionada")
        val materiasselecionada = findViewById<TextView>(R.id.materiasselecionada)
        materiasselecionada.text = materiasselecionadaExtra

        //Selecionar a resposta
        var respostaselecionada = 0
        val bntRespostaA = findViewById<CardView>(R.id.respostaa)
        bntRespostaA.setOnClickListener {
            if (checkrespostaA.isChecked) {
                checkrespostaA.isChecked = false
            } else {
                checkrespostaA.isChecked = true
                respostaselecionada = 1
                checkrespostaE.isChecked = false
                checkrespostaB.isChecked = false
                checkrespostaC.isChecked = false
                checkrespostaD.isChecked = false
            }
        }
        val bntRespostaB = findViewById<CardView>(R.id.respostab)
        bntRespostaB.setOnClickListener {
            if (checkrespostaB.isChecked) {
                checkrespostaB.isChecked = false

            } else {
                checkrespostaB.isChecked = true
                respostaselecionada = 2
                checkrespostaA.isChecked = false
                checkrespostaE.isChecked = false
                checkrespostaC.isChecked = false
                checkrespostaD.isChecked = false
            }
        }
        val bntRespostaC = findViewById<CardView>(R.id.respostac)
        bntRespostaC.setOnClickListener {
            if (checkrespostaC.isChecked) {
                checkrespostaC.isChecked = false
            } else {
                checkrespostaC.isChecked = true
                respostaselecionada = 3
                checkrespostaA.isChecked = false
                checkrespostaB.isChecked = false
                checkrespostaE.isChecked = false
                checkrespostaD.isChecked = false
            }
        }
        val bntRespostaD = findViewById<CardView>(R.id.respostad)
        bntRespostaD.setOnClickListener {
            if (checkrespostaD.isChecked) {
                checkrespostaD.isChecked = false
            } else {
                checkrespostaD.isChecked = true
                respostaselecionada = 4
                checkrespostaA.isChecked = false
                checkrespostaB.isChecked = false
                checkrespostaC.isChecked = false
                checkrespostaE.isChecked = false
            }
        }
        val bntRespostaE = findViewById<CardView>(R.id.respostae)
        bntRespostaE.setOnClickListener {
            if (checkrespostaE.isChecked) {
                checkrespostaE.isChecked = false
            } else {
                checkrespostaE.isChecked = true
                respostaselecionada = 5
                checkrespostaA.isChecked = false
                checkrespostaB.isChecked = false
                checkrespostaC.isChecked = false
                checkrespostaD.isChecked = false
            }
        }

        //Teste que fala qual alternativa foi selecionada
        var respostaselecionadastring = ""
        val bntResponder = findViewById<CardView>(R.id.responder)
        bntResponder.setOnClickListener {
            if (checkrespostaA.isChecked || checkrespostaB.isChecked || checkrespostaC.isChecked || checkrespostaD.isChecked || checkrespostaE.isChecked) {
                when (respostaselecionada) {
                    1 -> respostaselecionadastring = "A"
                    2 -> respostaselecionadastring = "B"
                    3 -> respostaselecionadastring = "C"
                    4 -> respostaselecionadastring = "D"
                    5 -> respostaselecionadastring = "E"
                }
                Toast.makeText(
                    this,
                    "Você selecionou a alternativa $respostaselecionadastring",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this, "Selecione uma alternativa", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}