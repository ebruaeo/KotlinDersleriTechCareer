package com.example.kotlindersleri.collections

fun main() {
    //1. Compile Error

    val a = 5
    //a=4

    //2. Exception (Runtime Error)

    val x = 10
    val y = 0

    try {
        println("Sonuç ${x/y}")
        println("İşlem tamam")
    } catch (e:Exception) {
        println("Sayı sıfıra bölünemez")
    }


}