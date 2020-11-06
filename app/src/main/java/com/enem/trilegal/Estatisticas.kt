package com.enem.trilegal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Estatisticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estatisticas)
        val actionbar = supportActionBar
        actionbar!!.title = "Estatísticas"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}