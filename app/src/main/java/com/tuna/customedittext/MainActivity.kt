package com.tuna.customedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increase.setOnClickListener { increaseInteger() }
        decrease.setOnClickListener { decreaseInteger() }
    }

    fun increaseInteger() {
        display(integer_number.text.toString().toInt() + 1)
    }

    fun decreaseInteger() {
        display(integer_number.text.toString().toInt() - 1)
    }

    private fun display(number: Int) {
        integer_number.setText("$number")
    }
}
