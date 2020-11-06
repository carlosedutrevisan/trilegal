package com.enem.trilegal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_algoritmo.*

class Algoritmo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algoritmo)
        val actionbar = supportActionBar
        actionbar!!.title = "Questão"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val bntRespostaA = findViewById<CardView>(R.id.respostaa)
        bntRespostaA.setOnClickListener{
            if (checkrespostaA.isChecked){
                checkrespostaA.isChecked = false;
            } else {
                checkrespostaA.isChecked = true;

                checkrespostaE.isChecked = false;
                checkrespostaB.isChecked = false;
                checkrespostaC.isChecked = false;
                checkrespostaD.isChecked = false;
            }
        }

        val bntRespostaB = findViewById<CardView>(R.id.respostab)
        bntRespostaB.setOnClickListener{
            if (checkrespostaB.isChecked){
                checkrespostaB.isChecked = false;
            } else {
                checkrespostaB.isChecked = true;

                checkrespostaA.isChecked = false;
                checkrespostaE.isChecked = false;
                checkrespostaC.isChecked = false;
                checkrespostaD.isChecked = false;
            }
        }

        val bntRespostaC = findViewById<CardView>(R.id.respostac)
        bntRespostaC.setOnClickListener{
            if (checkrespostaC.isChecked){
                checkrespostaC.isChecked = false;
            } else {
                checkrespostaC.isChecked = true;

                checkrespostaA.isChecked = false;
                checkrespostaB.isChecked = false;
                checkrespostaE.isChecked = false;
                checkrespostaD.isChecked = false;
            }
        }

        val bntRespostaD = findViewById<CardView>(R.id.respostad)
        bntRespostaD.setOnClickListener{
            if (checkrespostaD.isChecked){
                checkrespostaD.isChecked = false;
            } else {
                checkrespostaD.isChecked = true;

                checkrespostaA.isChecked = false;
                checkrespostaB.isChecked = false;
                checkrespostaC.isChecked = false;
                checkrespostaE.isChecked = false;
            }
        }

        val bntRespostaE = findViewById<CardView>(R.id.respostae)
        bntRespostaE.setOnClickListener{
            if (checkrespostaE.isChecked){
                checkrespostaE.isChecked = false;
            } else {
                checkrespostaE.isChecked = true;

                checkrespostaA.isChecked = false;
                checkrespostaB.isChecked = false;
                checkrespostaC.isChecked = false;
                checkrespostaD.isChecked = false;
            }
        }

        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.materiasselecao,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}

