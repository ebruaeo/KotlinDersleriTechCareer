package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19
    val isim = "Mehmet"


    if (yas >= 18) {
        println("Reşitsiniz")

    } else {
        println("Reşit değilsiniz")

    }
    if (isim == "Ahmet") {
        println("Merhaba Ahmet")

    } else if (isim == "Mehmet") {
        println("Merhaba mehmet")

    } else {
        println("tanınmayan kişi")

    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456) { // && and işareti
        println("Hoşgeldiniz")
    } else {
        println("Hatalı giriş")
    }

    val sayi = 10

    if (sayi == 10 || sayi == 20) {      // || işareti or anlamına gelir
        println("Sayı 10 veya 20dir.")
    } else {
        println("Sayı 10 veya 20 değildir.")

    }

    // When = Switch

    val sonuc =10

    when (sonuc) {
        10-> println("Sonuç: 10")
        20-> println("Sonuç: 20")
        30-> println("Sonuç: 30")
        else -> println("Böyle bir sonuç yok.")  // else = default


    }






























}