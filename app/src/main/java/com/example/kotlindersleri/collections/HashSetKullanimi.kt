package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)


    meyveler.add("Elma") // elma eklenmedi
    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)

    println(meyveler.elementAt(1))

    println(meyveler.size)
    println(meyveler.isEmpty())

    for (meyve in meyveler) {
        println("Sonuç: $meyve")
    }
    for ((index, meyve) in meyveler.withIndex()) {
        println("$index. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}