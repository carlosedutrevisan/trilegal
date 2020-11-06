package com.enem.trilegal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BancoDeQuestoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banco_de_questoes)
        val actionbar = supportActionBar
        actionbar!!.title = "Banco de Questões"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}