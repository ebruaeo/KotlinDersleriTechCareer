package com.example.kotlindersleri.collections

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()


    // veri ekleme
    meyveler.add("Elma")
    meyveler.add("muz")
    meyveler.add("kiraz")

    println(meyveler)

    //update
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //insert (istediğimiz yere ekleme yapabiliyopruz)
    meyveler.add(1, "Portakal")
    println(meyveler)

    //okuma
    println(meyveler.get(2))
    println(meyveler[3])


    println("Boyut: ${meyveler.size}")
    println("Boş kontrol: ${meyveler.isEmpty()}")
    println("içeriyor mu: ${meyveler.contains("Elma")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler) {
        println("Sonuç: $meyve")
    }
    for ((index, meyve) in meyveler.withIndex()) {
        println("$index. -> $meyve")
    }

    meyveler.removeAt(2)

    meyveler.clear()
    println(meyveler)
}