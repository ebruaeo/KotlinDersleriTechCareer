package com.example.kotlindersleri.oop

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç: $gelenSonuc")

    //parametre

    f.selamla3("Zeynep")

    f.carp(30, 40, "Ebru")

    val sonuc = 5 carpi 2 carpi 4 carpi 5 // 1 parametre aldığı için bu şekilde çoğaltabiliriz
    println("Çarpma sonucu : $sonuc")
}

// infix fonksiyon 1 parametre alabilir
infix fun Int.carpi(sayi: Int): Int {
    return this * sayi
    //this bulunduğu sınıfı temsil eder
}
