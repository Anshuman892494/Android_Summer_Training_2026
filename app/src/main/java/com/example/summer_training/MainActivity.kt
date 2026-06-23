package com.example.summer_training

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        var studentName = "Anshuman"
        var age = 20
        println("Student Name:$studentName")
        println("Student Age:$age")

//Data types in kotlin
        val name: String = "Anshuman With String"
        val age1: Int = 21
        val percentage: Double = 85.5
        val isPassed: Boolean = true
        println(name)
        println(age1)
        println(percentage)
        println(isPassed)

//Operators in kotlin

        val a = 20
        val b = 30
        println("Addition is:${a + b}")
        println("Subtraction is:${a - b}")
        println("Multiplication is:${a * b}")
        println("Division is:${a / b}")
        println("Modulus is:${a % b}")

//Conditional Statements (if-else)

        val marks = 35
        if (marks >= 40) {
            println("Pass")
        } else {
            println("Fail")
        }

//when in kotlin

        val grade = "B"
        when (grade) {
            "A" -> println("Excellent")
            "B" -> println("Good")
            "C" -> println("Average")
            "D" -> println("Fail")
            else -> println("Wrong grade entered")
        }

//for loop to print 1 to 5
        for (i in 1..5) {
            println(i)
        }

// While Loop
        var count = 1
        while (count <= 5) {
            println(count)
            count++
        }

//Null Safety (?)
        var name1: String? = null
        println(name1)

//Safe Call Operator(?.)
        var name2: String? = null
        println(name2?.length)

// Elvis Operator (?:)
        var name3: String? = null
        var result = name3 ?: "Guest User"
        println(result)

        // Functions
        fun add(num1: Int, num2: Int): Int {
            return num1 + num2
        }

        fun sub(x: Int, y: Int): Int {
            return x - y
        }
        println("Addition using function: ${add(10, 20)}")
        println("Subtraction using function: ${sub(30, 10)}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }
}
