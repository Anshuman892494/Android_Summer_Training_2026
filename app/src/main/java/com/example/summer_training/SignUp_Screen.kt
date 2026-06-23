package com.example.summer_training

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUp_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        val nameLayout = findViewById<TextInputLayout>(R.id.nameLayout)
        val nameInput = findViewById<TextInputEditText>(R.id.name)
        val emailLayout = findViewById<TextInputLayout>(R.id.emailLayout)
        val emailInput = findViewById<TextInputEditText>(R.id.email)
        val passwordLayout = findViewById<TextInputLayout>(R.id.passwordLayout)
        val passwordInput = findViewById<TextInputEditText>(R.id.password)
        val signUpButton = findViewById<MaterialButton>(R.id.signUpButton)
        val loginLink = findViewById<TextView>(R.id.login)

        signUpButton.setOnClickListener {
            val nameText = nameInput.text.toString().trim()
            val emailText = emailInput.text.toString().trim()
            val passwordText = passwordInput.text.toString().trim()

            var isValid = true

            if (nameText.isEmpty()) {
                nameLayout.error = "Name required"
                isValid = false
            } else {
                nameLayout.error = null
            }

            if (emailText.isEmpty()) {
                emailLayout.error = "Email required"
                isValid = false
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                emailLayout.error = "Invalid email"
                isValid = false
            } else {
                emailLayout.error = null
            }

            if (passwordText.isEmpty()) {
                passwordLayout.error = "Password required"
                isValid = false
            } else if (passwordText.length < 6) {
                passwordLayout.error = "Min 6 characters"
                isValid = false
            } else {
                passwordLayout.error = null
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
