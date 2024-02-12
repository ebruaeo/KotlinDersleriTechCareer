package com.example.kotlindersleri.oop

class Homework2 {
    // Soru 1:

    fun kmToMile(km: Double): Double {
        return km * 0.621
    }

    //Soru 2:
    fun dikdortgenAlanHesapla(k1: Double, k2: Double) {
        val alan = k1 * k2
        println("Dikdörtgenin alanı: $alan")
    }


    //Soru 3
    fun faktorial(sayi: Int): Int {
        if (sayi < 0) {
            println("Sayı negatif olamaz")
            return -1
        } else {
            var f = 1
            for (i in sayi downTo 1) {
                f *= i
            }
            return f
        }

    }


    //Soru 4:

    fun countLetter(word: String) {
        var count = 0
        for (c in word) {
            if (c == 'e' || c == 'E') {
                count++
            }

        }
        println("Toplam e sayısı: $count")
    }


    //Soru 5:

    fun icAciToplamı(kenarSayi: Int): Int {
        return ((kenarSayi - 2) * 180)

    }

    //Soru 6:

    fun maasHesabi(gunSayisi: Int): Int {
        val calisilanSaat = gunSayisi * 8

        if (calisilanSaat > 150) {
            val mesaiSaati = calisilanSaat - 150
            val maas = (mesaiSaati * 80) + (150 * 40)
            return maas
        } else {
            val maas = calisilanSaat * 40
            return maas
        }
    }


    //Soru 7

    fun otoparkUcret(saat: Int): Int {
        return if (saat > 1) {
            (saat - 1) * 10 + 50
        } else if (saat < 0) {
            println("Saat değeri 0 olamaz.")
            -1
        } else {
            saat * 50
        }

    }
}