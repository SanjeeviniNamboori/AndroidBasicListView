package com.example.logindemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnlogin.setOnClickListener{
           println("^^^^^^^^^^^^^^^^^^^" + etUsername.getText().toString())
           println("&&&&&&&&&&&&&&&&&&&&"+etpassword.getText().toString())
           var username = etUsername.getText().toString()
           var password = etpassword.getText().toString()
           println((username == password))
           if(username == password){
          //  println("^^^^^^^^^^^^^^^^^^^" + etUsername.toString())
          //     println("&&&&&&&&&&&&&&&&&&&&"+etpassword.toString())
              Toast.makeText(
                   applicationContext, "Redirecting...",
                   Toast.LENGTH_SHORT
               ).show()
               val intent = Intent(this@MainActivity, SecondActivity::class.java).putExtra("userName", username);
               startActivity(intent)
           }else{
               println("************************************************************")
               Log.d("myTag", "This is my message");
               Toast.makeText(
                       applicationContext, "Login has failed",
                   Toast.LENGTH_SHORT
                       ).show()
           }
       }
    }
}
