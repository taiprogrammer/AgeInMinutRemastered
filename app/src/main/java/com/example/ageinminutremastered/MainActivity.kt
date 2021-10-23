package com.example.ageinminutremastered

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext : AppCompatImageView = findViewById(R.id.btn_next_explain)

        btnNext.setOnClickListener { v -> goToExplain(v)}
    }

    fun goToExplain(v:View) {
        startActivity(Intent(this, ExplainActivity::class.java))
    }
}