package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Matematiksel İşlemler
        println("---------------Matematiksel İşlemler---------------")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10
        println(digerSayi > sayi)

        //&& -> ve
        //|| -> veya

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        println(8 + 7)
        println(3 * 4)
        println(10 / 2)
        println(21 - 6)

        //Remainder(kalan)

        println(11 % 3)
        println(10 % 2)
        println(100 % 6)

    }
}