package com.example.smartlab.smarthome.Device

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.smartlab.smarthome.R
import com.google.android.material.slider.Slider

class Light : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fan)
        val editTextValue = findViewById<EditText>(R.id.EditTextValue)
        val slider = findViewById<Slider>(R.id.slider2)
        slider.addOnChangeListener { slider, value, fromUser ->
            editTextValue.setText(value.toInt().toString())
        }
    }

}