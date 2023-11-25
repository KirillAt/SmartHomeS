package com.example.smartlab.smarthome.Login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.smartlab.smarthome.Main.MainScreen
import com.example.smartlab.smarthome.R

class Adress : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor

    private lateinit var addressEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adress)

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        addressEditText = findViewById(R.id.adressEditText)

        val saveButton: Button = findViewById(R.id.btn_save)
        saveButton.setOnClickListener {
            saveAddress()
            openMainScreen()
        }
    }

    private fun saveAddress() {
        val address = addressEditText.text.toString()

        editor.putString("address", address)
        editor.apply()
    }

    private fun openMainScreen() {
        startActivity(Intent(this, MainScreen::class.java))
        finish()
    }
}