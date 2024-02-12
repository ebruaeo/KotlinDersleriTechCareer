package com.example.kotlindersleri.standart_programlama

fun main() {
    // 1,2,3
    //foreach döngüsü
    //swift dilinde 1...3 -> 3 nokta kullnarak

    for (i in 1..3) {                               //i =array indeksi (index)
        println("Döngü 1: $i")
    }

        //10 ile 20 arasında çalışalım 5'er artsın

    for (a in 10..20 step 5) {
        println("Döngü 2: $a")
    }

    // 20 ile 10 arasında 5 er azalsın

    for (b in 20 downTo 10) {
        println("Döngü 3: $b")
    }

    //1,2,3
    var sayac =1

    while (sayac< 4) {
        println("Döngü 4: $sayac")
      //  sayac =sayac+1 -> 1er 1er arttırma
        sayac++

    }

    for (i in 1..5) {
        if (i==3) {
            break
        }
        println("Döngü 5: $i")
    }

    for (i in 1..5) {
        if (i==3) {
            continue
        }
        println("Döngü 6: $i")
    }

}