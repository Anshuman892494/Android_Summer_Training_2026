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

        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val btnReset = findViewById<MaterialButton>(R.id.btnReset)
        val tvBackToLogin = findViewById<TextView>(R.id.tvBackToLogin)

        btnReset.setOnClickListener {
            val email = etEmail.text.toString()

            if (email.isNotEmpty()) {
                // Perform password reset logic here
                Toast.makeText(this, "Reset link sent to $email", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            }
        }

        tvBackToLogin.setOnClickListener {
            finish()
        }
    }
}
