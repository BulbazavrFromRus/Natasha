package com.example.natasha

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val secondText: TextView = findViewById(R.id.first_textView);
        val thirdText: TextView = findViewById(R.id.first_textView);
        val forthText: TextView = findViewById(R.id.first_textView);
        val rightButtonImage: ImageView = findViewById(R.id.image_danila_with_beard);


        rightButtonImage.setOnClickListener{
            //Обработчик щелчков
            val phrases = listOf(
                "Уже 6 часов утра, Наташ",
                "Вставай, мы там всё уронили",
                "Мы уронили вообще всё, Наташ, честно",
                "Наташ, ты чё опять лежишь?",
                "Часики-то тикают",
                "Мужика-то хоть нашла себе?",
                "Уже дитачек пора рожать вообще-то"
            )

            val shuffledList  = phrases.shuffled();

            //Выводим в текстовые метки
            secondText.text = shuffledList[0];
            thirdText.text = shuffledList[1];
            forthText.text= shuffledList[2];
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}