package com.example.liskovproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val language = Language()
        val englishLanguage = EnglishLanguage()
        val japanLanguage = JapanLanguage()

        language.speak("Привет")
        englishLanguage.speak("Hello")
        japanLanguage.speak("こんにちは")
    }
}