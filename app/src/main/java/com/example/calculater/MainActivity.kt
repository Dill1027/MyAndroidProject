package com.example.calculater

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1: EditText = findViewById(R.id.input1)
        val input2: EditText = findViewById(R.id.input2)
        val result: TextView = findViewById(R.id.result)
        val addButton: Button = findViewById(R.id.addButton)
        val subtractButton: Button = findViewById(R.id.subtractButton)
        val multiplyButton: Button = findViewById(R.id.multiplyButton)
        val divideButton: Button = findViewById(R.id.divideButton)

        addButton.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 + num2}"
            } else {
                result.text = "Invalid input"
            }
        }

        subtractButton.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 - num2}"
            } else {
                result.text = "Invalid input"
            }
        }

        multiplyButton.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                result.text = "Result: ${num1 * num2}"
            } else {
                result.text = "Invalid input"
            }
        }

        divideButton.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    result.text = "Result: ${num1 / num2}"
                } else {
                    result.text = "Error: Division by zero"
                }
            } else {
                result.text = "Invalid input"
            }
        }
    }
}
