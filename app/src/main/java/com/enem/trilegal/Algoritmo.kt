package com.enem.trilegal

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_algoritmo.*
import java.io.IOException

class Algoritmo : AppCompatActivity() {

    //config da activity
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
    //.

    //ler o json da materia selecionada e colocar em uma string (jsonFileString)
    val gson = GsonBuilder().create()

    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }

        return jsonString
    }
    //.

    //selecionar materia da questão
    val materias = arrayOf("Todas","Biologia","Física", "Geografia", "História", "Língua Portuguesa", "Química", "Matemática")
        var materiasselecionada: String
        spinnerMaterias.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, materias)

    spinnerMaterias.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
        override fun onNothingSelected(p0: AdapterView<*>?) {
        }

        override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
            materiasselecionada = spinnerMaterias.getItemAtPosition(position).toString()
            println(materiasselecionada)
            var materiadavez = ""
            when (materiasselecionada) {
                "Biologia" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "biologia.json").toString()
                }
                "Física" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "fisica.json").toString()
                }
                "Geografia" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "geografia.json").toString()
                }
                "História" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "historia.json").toString()
                }
                "Língua Portuguesa" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "lp.json").toString()
                }
                "Química" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "quimica.json").toString()
                }
                "Matemática" -> {
                    materiadavez = getJsonDataFromAsset(applicationContext, "matematica.json").toString()
                }
            }
            println(materiadavez)
        }
    }
    //.

    //selecionar a resposta
    var respostaselecionada = 0 //para ver qual resposta foi selecionada

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
    //.

    // teste que fala qual alternativa foi selecionada
    var respostaselecionadastring = ""
    val bntResponder = findViewById<CardView>(R.id.responder)
    bntResponder.setOnClickListener{
            if (checkrespostaA.isChecked || checkrespostaB.isChecked || checkrespostaC.isChecked || checkrespostaD.isChecked || checkrespostaE.isChecked){
                when (respostaselecionada) {
                    1 -> respostaselecionadastring = "A"
                    2 -> respostaselecionadastring = "B"
                    3 -> respostaselecionadastring = "C"
                    4 -> respostaselecionadastring = "D"
                    5 -> respostaselecionadastring = "E"
                }
                Toast.makeText(this, "Você selecionou a alternativa $respostaselecionadastring", Toast.LENGTH_SHORT).show()
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
