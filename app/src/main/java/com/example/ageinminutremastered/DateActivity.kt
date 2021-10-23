package com.example.ageinminutremastered

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import java.text.SimpleDateFormat
import java.util.*

class DateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)


        val backToNameBtn : AppCompatImageView = findViewById(R.id.ic_back_date)

        val calendarBtn : AppCompatButton = findViewById(R.id.button_date)

        backToNameBtn.setOnClickListener { e -> backToNamePage(e) }

        calendarBtn.setOnClickListener { f -> openCalendar(f) }
    }

    private fun backToNamePage(e:View) {
        finish()
    }

    private fun openCalendar(f:View) {
        val calendar = java.util.Calendar.getInstance()
        val year = calendar.get(java.util.Calendar.YEAR)
        val month = calendar.get(java.util.Calendar.MONTH)
        val dayOfMonth = calendar.get(java.util.Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, DatePickerDialog.OnDateSetListener
        { datePicker, i, i2, i3 ->
            val newMonth = i2 + 1
            val selectedDate = "$i3/$newMonth/$i"
            val simpleDateFormat= SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH)
            val date = simpleDateFormat.parse(selectedDate)
            val dateInMinutes = date!!.time / 60000
            val currentDate =
                simpleDateFormat.parse(simpleDateFormat.format(System.currentTimeMillis()))
            val currentDateToMinutes = currentDate!!.time / 60000
            val differenceInMinutes = currentDateToMinutes - dateInMinutes

            val screenResult = Intent(this, ResultActivity::class.java)
            screenResult.putExtra("date", selectedDate)
            screenResult.putExtra("minutes", differenceInMinutes.toString())
            val name = intent.getStringExtra("name")
            screenResult.putExtra("name", name)
            this.startActivity(screenResult)
        },
        year,
        month,
        dayOfMonth).show()

    }
}