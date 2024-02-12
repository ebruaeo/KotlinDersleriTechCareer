package com.example.kotlindersleri.oop

fun main() {
    val hw2 = Homework2()

    //1. Soru:
    println("1. Soru:")
    val km = 100.0
    val mil = hw2.kmToMile(km)
    println("$km km = $mil mil")

    //Soru 2:
    println("2. Soru:")
    hw2.dikdortgenAlanHesapla(3.0, 5.0)


    // Soru 3
    println("3. Soru:")
    val fac = hw2.faktorial(5)
    println("Girilen sayının faktöriyeli = $fac")


    //Soru 4
    println("4. Soru:")
    hw2.countLetter("Ebru")
    hw2.countLetter("Mia")
    hw2.countLetter("Defter")

    //Soru 5
    println("5. Soru:")
    val toplam = hw2.icAciToplamı(3)
    println("İç Açıların Toplamı: $toplam")

    //Soru 6
    println("6. Soru:")
    val maas = hw2.maasHesabi(10)
    println("Maaşınız: $maas")

    //Soru 7
    println("7. Soru:")
    val ucret = hw2.otoparkUcret(5)
    println("Otopark ücreti: $ucret")

}