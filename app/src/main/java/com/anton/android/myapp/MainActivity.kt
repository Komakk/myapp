package com.anton.android.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<Char>()
        //добовляем буквы в коллекцию
        var c: Char = 'a'
        while (c <= 'z') {
            //Log.i("MyApp", "$c")
            list.add(c)
            ++c
        }
        //выводим четные буквы в консоль
        for (i in list.indices)
            if (i % 2 != 0) Log.i("MyApp", list[i].toString())
    }
}