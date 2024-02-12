package com.example.kotlindersleri.oop

fun main() {
    //Nullable- Null Safety - Optional (Swift)

    //Tanımlama aşaması
    var mesaj: String? = null

    mesaj = "Merhaba"

    //Kullanım Yöntem 1

    println("Yöntem 1: ${mesaj?.uppercase()}") // soru işareti(?)= Eğer burda hata olursa sonuç null olacak ama uygulama çökmeyecek

    //Kullanım Yöntem 2}

    //  println("Yöntem 2: ${mesaj!!.uppercase()}")

    //Kullanım Yöntem 3

    if (mesaj != null) {
        println("Yöntem 3: ${mesaj.uppercase()}")


    } else {
        println("Sonuç nulldur")
    }

    //Kullanım Yöntem 4

    mesaj?.let {
        // println("Yöntem 4: ${mesaj.uppercase()}")
        println("Yöntem 4: ${it.uppercase()}")

    }
}