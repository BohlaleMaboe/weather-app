package com.example.examapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val weeklyTemperatures = arrayOf(
            intArrayOf(25,28,27),// Mondays temperatures
            intArrayOf(27,30,29),// Tuesday temperatures
            intArrayOf(29,31,28),//Wednesday temperatures
            intArrayOf(26,29,27),//Thursday temperatures
            intArrayOf(30,33,31),//Friday temperatures
            intArrayOf(31,27,20),//Saturday temperatures
            intArrayOf(24,26,23),//Sunday temperatures

        )
        println("Weekly Weather Forecast :")
        val daysOfWeek = listOf("Monday","tuesday","wednesday","friday","saturday","sunday")
        fun generateRandomWeather(): Any {
            return TODO("Provide the return value")
        }


        for((index,temperatures)in weeklyTemperatures.withIndex()){
            val dayOfWeek = daysOfWeek[index]
            println("$dayOfWeek:")
            for((i,temperature)in temperatures.withIndex()) {
                println("\thour ${i + 1}: ${temperature}*c")

       val maxTemperatures = weeklyTemperatures.maxOfOrNull()
       println("Highest Temperature: ${maxTemperatures}*C")

       val minTemperature = weeklyTemperatures.minOfOrNull()
      println("Lowest Temperatures : $:{minTemperature}*C")



      }



            }
        }




    }


private fun <T> Array<T>.minOfOrNull(): Any {
    TODO("Not yet implemented")
}

private fun <T> Array<T>.maxOfOrNull(): Any {
    TODO("Not yet implemented")
}
