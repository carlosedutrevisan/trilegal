package com.enem.trilegal

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.beust.klaxon.Parser
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_algoritmo.*
import org.json.JSONObject
import java.io.IOException

class EscolherMateria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolher_materia)
    }

    val materias = arrayOf(
        "Todas",
        "Biologia",
        "Física",
        "Geografia",
        "História",
        "Língua Portuguesa",
        "Química",
        "Matemática"
    )

    spinnerMaterias.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, materias)
    spinnerMaterias.onItemSelectedListener =
    object : AdapterView.OnItemSelectedListener {


        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
    }
}