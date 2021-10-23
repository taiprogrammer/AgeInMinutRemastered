package com.example.ageinminutremastered

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val backToExplainBtn : AppCompatImageView = findViewById(R.id.ic_back_name)
        val goToDateBtn : AppCompatImageView = findViewById(R.id.ic_next_name)

        backToExplainBtn.setOnClickListener { c -> backToExplainPage(c) }

        goToDateBtn.setOnClickListener { d -> goToDatePage(d) }
    }

    fun backToExplainPage(c:View) {
        finish()
    }

    fun goToDatePage(d:View) {
        val name : AppCompatEditText = findViewById(R.id.input_name)
        val dateScreen = Intent(this, DateActivity::class.java)

        dateScreen.putExtra("name", name.text.toString())

        startActivity(dateScreen)
    }
}