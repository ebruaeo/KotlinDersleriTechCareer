package com.example.kotlindersleri.oop

class Fonksiyonlar {
    //void
    //direkt çalışıyo başka bi şey yapmıyo

    fun selamla1() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }


    //veri gönderir
    fun selamla2(): String {
        val sonuc = "Merhaba Mehmet"
        return sonuc
    }


    //Parametreli fonksiyon
    fun selamla3(isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }


    //Overloading
    fun carp(sayi1: Int, sayi2: Int){
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1: Double, sayi2: Int){
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1: Int, sayi2: Int, isim: String){
        println("Çarpma: ${sayi1*sayi2} - İşlem yapan: $isim")
    }
}