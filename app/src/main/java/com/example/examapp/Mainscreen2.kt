package com.example.examapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mainscreen2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen2)

        val  weeklyTemperatures = arrayOf(25 ,27,29,26,28,30,22)

        println("weekly weather forecast")
        for ((index,temperature) in weeklyTemperatures.withIndex()) {
            println("Day ${index + 1}: ${temperature}*c")
        }
        // calculating average temperature
        val averageTemperature = weeklyTemperatures.average()
        println("Average Temperature for the week: ${averageTemperature}*c")

        val existButton = findViewById<Button>(R.id.button3)
        existButton.setOnClickListener{

        }
    }
}