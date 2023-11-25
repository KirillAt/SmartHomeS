package com.example.smartlab.smarthome.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.smartlab.smarthome.Add.AddRoom
import com.example.smartlab.smarthome.R

class MainScreen : AppCompatActivity() {
    private lateinit var mainAddressText: TextView
    private lateinit var addressEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        mainAddressText = findViewById(R.id.TextViewmain_adress)
        addressEditText = findViewById(R.id.adressEditText)

        val address = intent.getStringExtra("address")
        mainAddressText.text = address
    }

    fun onAddClick(view: View) {
        val intent = Intent(this, AddRoom::class.java)
        startActivity(intent)
    }

    fun onSettingClick(view: View) {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}