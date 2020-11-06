package com.enem.trilegal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Recomendacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendacao)
        val actionbar = supportActionBar
        actionbar!!.title = "Recomendações de estudo"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}