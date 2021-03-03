package com.example.test

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()

    }

    fun setup(){
        var test :Button = findViewById(R.id.btnTest)
        test.setOnClickListener(){
            var test = otraconection().conection()
        }

    }
}