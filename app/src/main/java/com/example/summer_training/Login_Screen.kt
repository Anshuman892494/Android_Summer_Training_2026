package com.example.summer_training

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val emailInput = findViewById<EditText>(R.id.email)
        val passwordInput = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val signUpLink = findViewById<TextView>(R.id.signUp)
        val forgotPasswordLink = findViewById<TextView>(R.id.forgotPassword)

        loginButton.setOnClickListener {
            val emailText = emailInput.text.toString().trim()
            val passwordText = passwordInput.text.toString().trim()

            var isValid = true

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
            }

            if (isValid) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Dashboard_Activity::class.java)
                intent.putExtra("USER_EMAIL", emailText)
                startActivity(intent)
                finish()
            }
        }

        signUpLink.setOnClickListener {
            startActivity(Intent(this, SignUp_Screen::class.java))
        }

        forgotPasswordLink.setOnClickListener {
            startActivity(Intent(this, Forgot_Password_Screen::class.java))
        }
    }
}
