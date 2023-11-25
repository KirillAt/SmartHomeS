package com.example.smartlab.smarthome.Add

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.smartlab.smarthome.R

class AddDevice : AppCompatActivity() {

    private lateinit var deviceNameEditText: EditText
    private lateinit var deviceIdEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var backButton: ImageView
    private lateinit var roomSelectionTextView: TextView
    // Дополнительные свойства, если вам нужно взаимодействовать со всеми ImageView или другими компонентами...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_device)

        // Инициализация компонентов интерфейса
        deviceNameEditText = findViewById(R.id.editText_device_name) // Используйте реальные идентификаторы.
        deviceIdEditText = findViewById(R.id.editText_device_id) // Используйте реальные идентификаторы.
        saveButton = findViewById(R.id.button_save) // Используйте реальные идентификаторы.
        backButton = findViewById(R.id.imageView_back) // Используйте реальные идентификаторы.

        val roomId = intent.getStringExtra("room_id")
        // Используйте значение roomId, чтобы понимать, для какой комнаты добавляется устройство.

        // Установка слушателей кликов и других элементов взаимодействия
        saveButton.setOnClickListener {
            saveDevice()
        }

        backButton.setOnClickListener {
            finish() // Закрывает текущую активность и возвращает к предыдущей, если таковая имеется.
        }

        // Предположим, что при клике на TextView roomSelectionTextView может открываться диалоговое окно или новое активити
        roomSelectionTextView.setOnClickListener {
            // Вызовите здесь функцию для обработки выбора комнаты.
        }
    }

    private fun saveDevice() {
        // Обычно здесь взаимодействуют с ViewModel или другим компонентом для обработки данных
        val deviceName = deviceNameEditText.text.toString()
        val deviceId = deviceIdEditText.text.toString()

        if (deviceName.isNotBlank() && deviceId.isNotBlank()) {
            // Процесс сохранения устройства (в базу данных, настройки или передача данных обратно в предыдущую активность и т.д.)
            // Пока что просто выведем значения
            println("Название устройства: $deviceName, ID устройства: $deviceId")
            // Обновите интерфейс пользователя или закройте активность по мере необходимости
        } else {
            // Обработка ошибки: покажите сообщение Toast или обновите текст ошибки
            // Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }
}