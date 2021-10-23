package com.example.ageinminutremastered

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageView

class ExplainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)

        val backToMainBtn : AppCompatImageView = findViewById(R.id.ic_back_explain)
        val goToNameBtn : AppCompatImageView = findViewById(R.id.ic_next_explain)

        backToMainBtn.setOnClickListener { a -> backToMainPage(a) }
        goToNameBtn.setOnClickListener { b -> goToNamePage(b) }
    }

    fun backToMainPage(a:View) {
        finish()
    }

    fun goToNamePage(b:View) {
        startActivity(Intent(this, NameActivity::class.java))
    }
}