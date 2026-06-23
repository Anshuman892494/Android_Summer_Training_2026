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

class Login_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val emailLayout = findViewById<TextInputLayout>(R.id.emailLayout)
        val emailInput = findViewById<TextInputEditText>(R.id.email)
        val passwordLayout = findViewById<TextInputLayout>(R.id.passwordLayout)
        val passwordInput = findViewById<TextInputEditText>(R.id.password)
        val loginButton = findViewById<MaterialButton>(R.id.loginButton)
        val signUpLink = findViewById<TextView>(R.id.signUp)
        val forgotPasswordLink = findViewById<TextView>(R.id.forgotPassword)

        loginButton.setOnClickListener {
            val emailText = emailInput.text.toString().trim()
            val passwordText = passwordInput.text.toString().trim()

            var isValid = true

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
            } else {
                passwordLayout.error = null
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
