package com.fitz.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var btnRandom: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRandom = findViewById(R.id.btn_random_numbers)
        btnRandom.setOnClickListener {
            generateRandomNumbers(it)
        }
    }

    private fun generateRandomNumbers(view: View) {
        val randomValues = List(6) { Random.nextInt(1, 61) }
        val s =
            "Seus numeros da sorte sao: ${randomValues[0]} ${randomValues[1]} ${randomValues[2]} ${randomValues[3]} ${randomValues[4]} ${randomValues[5]}"
        Log.d("RANDOMNUMBERS", s)
    }

}