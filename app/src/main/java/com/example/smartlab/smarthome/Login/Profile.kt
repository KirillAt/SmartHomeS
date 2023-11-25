package com.example.smartlab.smarthome.Login

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.smartlab.smarthome.R

class Profile : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var addressEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var exitButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        sharedPreferences = getSharedPreferences("profile", Context.MODE_PRIVATE)
        usernameEditText = findViewById(R.id.EditTextUsername)
        emailEditText = findViewById(R.id.EditTextEmail)
        addressEditText = findViewById(R.id.EditTextAdress)
        saveButton = findViewById(R.id.ButtonSave)
        exitButton = findViewById(R.id.ButtonExit)
        backButton = findViewById(R.id.back_btn)

        loadProfileData()

        saveButton.setOnClickListener {
            saveProfileData()
        }

        exitButton.setOnClickListener {
            finish()
        }

        backButton.setOnClickListener {
            onBackPressed()
        }
    }

    private fun loadProfileData() {
        val username = sharedPreferences.getString("username", "")
        val email = sharedPreferences.getString("email", "")
        val address = sharedPreferences.getString("address", "")

        usernameEditText.setText(username)
        emailEditText.setText(email)
        addressEditText.setText(address)
    }

    private fun saveProfileData() {
        val editor = sharedPreferences.edit()
        editor.putString("username", usernameEditText.text.toString())
        editor.putString("email", emailEditText.text.toString())
        editor.putString("address", addressEditText.text.toString())
        editor.apply()
    }
}
