package com.example.kotlindersleri.oop

data class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {

    init {
        //Sınıftan nesne oluşturulduğunda çalışır
        println("**********Nesne oluştu*************")
    }

    fun calistir() {
        calisiyorMu = true
        hiz = 5
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm: Int) {
        hiz += kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz -= kacKm
    }


    fun bilgiAl() {
        println("--------------------------")
        println("Renk: ${renk}")
        println("hız: ${hiz}")
        println("çalışma: ${calisiyorMu}")
    }
}