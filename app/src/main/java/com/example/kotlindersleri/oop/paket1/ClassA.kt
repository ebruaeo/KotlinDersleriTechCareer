package com.example.kotlindersleri.oop.paket1

open class ClassA {

    var varsayilanDegisken = 1 //hiçbir şey yazmıyosak publictir
    public var publicDegisken = 2 // her yerden erişebilirsin
    private var privateDegisken = 3 // sadece kendi classında
    protected var protectedDegisken = 4 // kalıtım olması lazım
}