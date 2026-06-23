package com.example.summer_training

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class Dashboard_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val userEmailView = findViewById<TextView>(R.id.userEmail)
        val logoutButton = findViewById<MaterialButton>(R.id.logoutButton)

        // Get the email from Intent
        val email = intent.getStringExtra("USER_EMAIL")
        userEmailView.text = email ?: "No Email Found"

        logoutButton.setOnClickListener {
            val intent = Intent(this, Login_Screen::class.java)
            // Clear backstack so user can't go back to dashboard after logout
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}
