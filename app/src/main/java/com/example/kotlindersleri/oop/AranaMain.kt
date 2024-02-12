package com.example.kotlindersleri.oop

fun main() {
    // nesne tanımlama
    val bmw = Araba("kırmızı", 0, false)
    //okuma işlemi
    bmw.bilgiAl()

    //veri atama

    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(30)
    bmw.bilgiAl()
    bmw.yavasla(10)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz", 100, true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.hizlan(50)
    sahin.bilgiAl()
}