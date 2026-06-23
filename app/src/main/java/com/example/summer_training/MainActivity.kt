package com.example.summer_training

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            Toast.makeText(this, "Main Activity Content", Toast.LENGTH_SHORT).show()
        }

        // Student Data
        val studentName = "Anshuman"
        val age = 20
        println("Student Name: $studentName")
        println("Student Age: $age")

        // Data types in Kotlin
        val name: String = "Anshuman"
        val ageVal: Int = 21
        val percentage: Double = 85.5
        val isPassed: Boolean = true
        
        Log.i(TAG, "Name: $name, Age: $ageVal, Percentage: $percentage, Passed: $isPassed")

        // Operators
        val a = 20
        val b = 30
        println("Addition is: ${a + b}")

        // Conditional Statements
        val marks = 35
        if (marks >= 40) {
            println("Pass")
        } else {
            println("Fail")
        }

        // When
        val grade = "B"
        when (grade) {
            "A" -> println("Excellent")
            "B" -> println("Good")
            else -> println("Average")
        }
    }
}
