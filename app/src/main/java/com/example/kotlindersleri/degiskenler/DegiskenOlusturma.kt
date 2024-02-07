package com.example.kotlindersleri.degiskenler

fun main() {

    // değişken var ile tanımlanırsa içerik değiştirilebilir.


    var studentName = "Ebru"
    var studentAge: Int = 26 // : ile değişken türünü belirtebiliriz
    var studentHeight = 170
    var studentFirstLetter = 'E'
    var studentIsHere = true

    println("Student Name:                       $studentName") // Swift : \() = $ dolar işaretşyle aynı işlevde
    println("Student Age:                        $studentAge")
    println("Student Height:                     $studentHeight cm")
    println("Student First Letter:               $studentFirstLetter")
    println("Is Student Here?                    $studentIsHere")


    var a = 10
    var b = 20

    println("$a x $b: ${a * b}")


    //Sabitler
    // swift: let,java,dart dilinde final

    // val ile tanımlarsak içerisindeki değeri değiştiremeyiz
    val number = 30
    println(number)

    // Tür Dönüşümü:
    // 1-> Sayısaldan sayısala dönüşüm

    val i = 42
    val d = 87.93  // yuvarlama yok otomatik olarak noktadan sonrasını siliyor

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    // 2-> sayısaldan metne dönüşüm

    val sonuc3 = i.toString()
    val sonuc4 = d.toString()

    println(sonuc3)
    println(sonuc4)

    //3-> metinden sayısala dönüştürme

    val yazi = "48t"
    val sonuc5 = yazi.toIntOrNull()
    //Dönüşümde sorun yoksa çalışır, sorun varsa mesela t harfi gibi o zaman null üretir

    if (sonuc5 != null) {
        println(sonuc5)

    } else {
        println("Dönüşüm hatası")
    }

    // alternatif yöntem
    sonuc5?.let {             // if (sonuc5 != null)
        println(it)                    //it =sonuc5
    }


}