package com.example.kotlindersleri.collections

fun main() {
    val iller = HashMap<Int, String>()
    iller.put(16, "Bursa")
    iller.put(34, "İstanbul")
    iller[6] = "Ankara"
    println(iller)

    //Okuma
    println(iller.get(16))

    //Güncelleme

    iller.put(16, "Yeni Bursa")
    println(iller)

    //Boyutlandırma

    println(iller.size)
    println(iller.isEmpty())

    for((anahtar, deger) in iller) {
        println("$anahtar -> $deger")

    }

    iller.clear()
    println(iller)
}