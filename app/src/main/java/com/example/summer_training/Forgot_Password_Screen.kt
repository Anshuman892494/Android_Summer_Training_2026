package com.example.summer_training

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Forgot_Password_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailInput = findViewById<EditText>(R.id.email)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val backToLoginLink = findViewById<TextView>(R.id.backToLogin)

        resetButton.setOnClickListener {
            val email = emailInput.text.toString()

            if (email.isNotEmpty()) {
                // Perform password reset logic here
                Toast.makeText(this, "Reset link sent to $email", Toast.LENGTH_LONG).show()
                finish()
            } else {
                emailInput.error = "Please enter your email"
            }
        }

        backToLoginLink.setOnClickListener {
            finish()
        }
    }
}
