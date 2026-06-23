package com.example.summer_training

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class Forgot_Password_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailInput = findViewById<TextInputEditText>(R.id.email)
        val resetButton = findViewById<MaterialButton>(R.id.resetButton)
        val backToLoginLink = findViewById<TextView>(R.id.backToLogin)

        resetButton.setOnClickListener {
            val email = emailInput.text.toString()

            if (email.isNotEmpty()) {
                // Perform password reset logic here
                Toast.makeText(this, "Reset link sent to $email", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }

        backToLoginLink.setOnClickListener {
            finish()
        }
    }
}
