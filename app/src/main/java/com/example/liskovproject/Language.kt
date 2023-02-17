package com.example.liskovproject

import android.util.Log

open class Language(){
    open fun speak(msg:String){
        Log.d("ololo", "Speak : $msg")
    }
}

class EnglishLanguage: Language(){
    override fun speak(msg: String) {
        Log.d("ololo", "Speak english Language: $msg")
    }


}

class JapanLanguage: Language(){
    override fun speak(msg: String) {
        Log.d("ololo", "Speak japan Language: $msg")
    }
}