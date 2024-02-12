package com.example.kotlindersleri.oop.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()       //kalıtım yok(kendi metoduna erişti)
    memeli.sesCikar()       //Kalıtım var(bir üst sınıfın metoduna erişti yani hayvan sınıfına)
    kedi.sesCikar()         //Kalıtım var ama kendi fonksiyonlarını kullandılar
    kopek.sesCikar()        //Kalıtım var ama kendi fonksiyonlarını kullandılar
}