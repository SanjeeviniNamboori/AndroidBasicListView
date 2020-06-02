package com.example.logindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        println("%%%%%%%%%%%%%%%%%%" +  "this is third" )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }
}