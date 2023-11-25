package com.example.smartlab.smarthome.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.smartlab.smarthome.R

class Login : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            if (validateInputs()) {
                val intent = Intent(this, PIN_2::class.java)
                startActivity(intent)
            }
        }

        val registrationButton: Button = findViewById(R.id.registration_button)
        registrationButton.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }
    }

    private fun validateInputs(): Boolean {
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (email.isEmpty()) {
            emailEditText.error = "Email is required"
            return false
        }

        if (password.isEmpty()) {
            passwordEditText.error = "Password is required"
            return false
        }

        return true
    }
}