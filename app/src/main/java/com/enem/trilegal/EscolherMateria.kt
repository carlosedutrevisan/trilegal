package com.enem.trilegal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class EscolherMateria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolher_materia)
        val actionbar = supportActionBar
        this.title = "Seleção de Matéria"
        actionbar.run {
            this!!.title = "Seleção de Matéria"
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        var materiasselecionada: String = ""
        var selecionado = false
        val selecionar: Spinner = findViewById(R.id.spinnerMaterias)
        val materias = arrayOf("Selecionar",
            "Biologia",
            "Física",
            "Geografia",
            "História",
            "Língua Portuguesa",
            "Química",
            "Matemática")
        var materiadavez: String
        selecionar.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, materias)
        selecionar.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@EscolherMateria, "Por favor, selecione uma matéria", Toast.LENGTH_SHORT).show()
            }
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                materiasselecionada = selecionar.getItemAtPosition(position).toString()
                println(materiasselecionada)
                val intent = Intent(this@EscolherMateria, Algoritmo::class.java)
                intent.putExtra("Materiasselecionada", materiasselecionada)
                startActivity(intent)
                when (materiasselecionada) {
                    "Selecionar" -> {
                        selecionado = false
                    }
                    "Biologia" -> {
                        materiadavez = "/biologia.json"
                        selecionado = true
                    }
                    "Física" -> {
                        materiadavez = "/fisica.json"
                        selecionado = true
                    }
                    "Geografia" -> {
                        materiadavez = "/geografia.json"
                        selecionado = true
                    }
                    "História" -> {
                        materiadavez = "/historia.json"
                        selecionado = true
                    }
                    "Língua Portuguesa" -> {
                        materiadavez = "/lp.json"
                        selecionado = true
                    }
                    "Química" -> {
                        materiadavez = "/quimica.json"
                        selecionado = true
                    }
                    "Matemática" -> {
                        materiadavez = "/matematica.json"
                        selecionado = true
                    }
                }
            }
        }

        val bntAlgoritmo = findViewById<CardView>(R.id.responder)
        bntAlgoritmo.setOnClickListener {
            if (selecionado){
                val abrirAlgoritmo = Intent(this, Algoritmo::class.java)
                startActivity(abrirAlgoritmo)
            } else {
                Toast.makeText(this@EscolherMateria, "Por favor, selecione uma matéria", Toast.LENGTH_SHORT).show()
            }
        }

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}