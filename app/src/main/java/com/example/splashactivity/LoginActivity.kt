package com.example.splashactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val btOk = findViewById<Button>(R.id.bt_login)
        val btRegister = findViewById<Button>(R.id.bt_register)
        val etLogin = findViewById<EditText>(R.id.et_login)
        val msg: String = etLogin.text.toString()

        btOk.setOnClickListener {
            val intent = Intent(this, LoggedInActivity::class.java)
            startActivity(intent)
            finish()
        }

        btRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}