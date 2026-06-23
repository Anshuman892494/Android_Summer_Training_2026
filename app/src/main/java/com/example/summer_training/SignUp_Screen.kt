package com.example.summer_training

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUp_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        val nameInput = findViewById<EditText>(R.id.name)
        val emailInput = findViewById<EditText>(R.id.email)
        val passwordInput = findViewById<EditText>(R.id.password)
        val signUpButton = findViewById<Button>(R.id.signUpButton)
        val loginLink = findViewById<TextView>(R.id.login)

        signUpButton.setOnClickListener {
            val nameText = nameInput.text.toString().trim()
            val emailText = emailInput.text.toString().trim()
            val passwordText = passwordInput.text.toString().trim()

            var isValid = true

            if (nameText.isEmpty()) {
                nameInput.error = "Name required"
                isValid = false
            }

            if (emailText.isEmpty()) {
                emailInput.error = "Email required"
                isValid = false
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                emailInput.error = "Invalid email"
                isValid = false
            }

            if (passwordText.isEmpty()) {
                passwordInput.error = "Password required"
                isValid = false
            } else if (passwordText.length < 6) {
                passwordInput.error = "Min 6 characters"
                isValid = false
            }

            if (isValid) {
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login_Screen::class.java)
                startActivity(intent)
                finish()
            }
        }

        loginLink.setOnClickListener {
            val intent = Intent(this, Login_Screen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
