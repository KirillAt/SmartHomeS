package com.example.smartlab.smarthome.Main


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.smartlab.smarthome.Login.Login
import com.example.smartlab.smarthome.Login.Profile
import com.example.smartlab.smarthome.Login.Registration
import com.example.smartlab.smarthome.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.boot_screen)

        object : CountDownTimer(5 * 1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                val intent = Intent(this@MainActivity, Registration::class.java)
                startActivity(intent)
            }
        }.start()
    }
}