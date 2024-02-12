package com.example.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var mesaj:String?=null

    lateinit var info:String    // lateinit -> infoya ben daha sonra değer atayacağım demek oluyor.
                                // lateinit sadece var ile tanımlayabiliriz.
                                // lateinit ınt, double, boolean gibi primitivlerle kullanılmaz
















    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}