package com.example.kotlindersleri.oop.interface_kullanimi

class MClass: MyInterface {
    override val degisken: Int =10

    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
       return "metod 2 çalıştı"
    }
}