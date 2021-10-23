package com.example.ageinminutremastered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val user = intent.getStringExtra("name")
        val date = intent.getStringExtra("date")
        val minutes = intent.getStringExtra("minutes")
        val tv_result = findViewById<AppCompatTextView>(R.id.text_result)

        val result = getString(R.string.text_result, user, date, minutes)

        tv_result.text = result
    }
}