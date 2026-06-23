package com.example.summer_training
package com.example.summertrainingapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login_Example : AppCompatActivity() {
    var username: EditText? = null
    var password: EditText? = null
    var login: Button? = null
    var signup: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        username = findViewById<EditText>(R.id.edittext1)
        password = findViewById<EditText>(R.id.edittext2)
        login = findViewById<Button>(R.id.button1)
        signup = findViewById<Button>(R.id.button2)
        login?.setOnClickListener {

        }
        signup?.setOnClickListener {
            val In = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(In)
        }
    }
}