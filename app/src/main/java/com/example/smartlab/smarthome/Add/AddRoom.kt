package com.example.smartlab.smarthome.Add

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.smartlab.smarthome.R

class AddRoom : AppCompatActivity() {

    // Метод onCreate вызывается, когда активность создается.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Устанавливаем содержимое активности из XML-файла разметки.
        setContentView(R.layout.activity_add_room)
    }

    // Метод для перехода в комнату 1.
    fun goToRoom1(view: View) {
        // Создаем интент для перехода к Activity AddDevice.
        val intent = Intent(this, AddDevice::class.java)
        // Добавляем дополнительные данные для интента: ключ "room_1" со значением "room_1".
        intent.putExtra("room_1", "room_1")
        // Запускаем activity, указанное в интенте.
        startActivity(intent)
    }
    // Метод для room_2
    fun goToRoom2(view: View) {
        val intent = Intent(this, AddDevice::class.java)
        intent.putExtra("room_2", "room_2")
        startActivity(intent)
    }
    // Метод для room_2
    fun goToRoom3(view: View) {
        val intent = Intent(this, AddDevice::class.java)
        intent.putExtra("room_3", "room_3")
        startActivity(intent)
    }
    // Метод для room_2
    fun goToRoom4(view: View) {
        val intent = Intent(this, AddDevice::class.java)
        intent.putExtra("room_4", "room_4")
        startActivity(intent)
    }
    // Метод для room_2
    fun goToRoom5(view: View) {
        val intent = Intent(this, AddDevice::class.java)
        intent.putExtra("room_5", "room_5")
        startActivity(intent)
    }
    // Метод для room_2
    fun goToRoom6(view: View) {
        val intent = Intent(this, AddDevice::class.java)
        intent.putExtra("room_6", "room_6")
        startActivity(intent)
    }
    // Метод для возвращения на предыдущую активность
    fun back(view: View) {
        // Закрываем текущую активность.
        finish()
    }
}