package com.enem.trilegal

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_algoritmo.*
import java.io.IOException
import java.io.InputStream

class Algoritmo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algoritmo)
        val actionbar = supportActionBar
        this.title = "Questão"
        actionbar.run {
            this!!.title = "Questão"
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        List<Question> questionItems

        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.materiasselecao,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        fun loadJSONFromAsset(): String? {
            var json : String? = null

            try {
                val inputStream: InputStream = assets.open("questions.json")
            } catch (e : IOException){
                e.printStackTrace()
            }
            return json
        }

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
        //Selecionar questao fim

        val bntResponder = findViewById<CardView>(R.id.responder)
        bntResponder.setOnClickListener{
                if (checkrespostaA.isChecked || checkrespostaB.isChecked || checkrespostaC.isChecked || checkrespostaD.isChecked || checkrespostaE.isChecked){
                    Toast.makeText(this, "boa, vc selecionou a $respostaselecionada", Toast.LENGTH_SHORT).show()
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