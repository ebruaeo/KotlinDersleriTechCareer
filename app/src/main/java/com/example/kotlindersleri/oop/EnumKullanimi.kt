package com.example.kotlindersleri.oop

fun main() {
    ucretHesapla(75,KonserveBoyut.ORTA)

}

fun ucretHesapla(adet: Int, boyut: KonserveBoyut) {

    when(boyut) {
        KonserveBoyut.KUCUK -> println("Toplam maaliyet: ${adet*5.6} $")
        KonserveBoyut.ORTA -> println("Toplam maaliyet: ${adet*7.6} $")
        KonserveBoyut.BUYUK -> println("Toplam maaliyet: ${adet*9.4} $")
    }

}