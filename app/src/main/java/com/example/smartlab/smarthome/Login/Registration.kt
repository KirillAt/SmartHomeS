package com.example.smartlab.smarthome.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.util.Patterns
import com.example.smartlab.smarthome.R

class Registration : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registrationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        usernameEditText = findViewById(R.id.usernameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        registrationButton = findViewById(R.id.registration_button)

        registrationButton.setOnClickListener {
            register()
        }
    }

    private fun register() {
        val username = usernameEditText.text.toString()
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (isUsernameValid(username) && isEmailValid(email) && isPasswordValid(password)) {
            saveUserData(username, email, password)
            // переход на LoginActivity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Некорректные данные", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isUsernameValid(username: String): Boolean {
        // проверка корректности username
        return username.isNotEmpty()
    }

    private fun isEmailValid(email: String): Boolean {
        // проверка корректности email
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isPasswordValid(password: String): Boolean {
        // проверка корректности password
        return password.length >= 6
    }

    private fun saveUserData(username: String, email: String, password: String) {
        // сохранение данных в SharedPreferences
    }
}
