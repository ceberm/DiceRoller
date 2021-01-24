package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    fun setupUI() {
        val roll_btn = findViewById<Button>(R.id.roll_btn)
        diceImage = findViewById(R.id.dice_img)
        roll_btn.setText("Let's Roll")
        roll_btn.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val rand = Random(System.currentTimeMillis()).nextInt(6) + 1
        val drawableResource = when (rand){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}