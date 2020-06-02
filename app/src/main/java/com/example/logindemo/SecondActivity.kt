package com.example.logindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class SecondActivity : AppCompatActivity() {

    var arr = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        println("%%%%%%%%%%%%%%%%%%" +  "this is second" )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       readJSON()

    }

    public fun readJSON(){
        var json : String? = null;
        try{
            println("%%%%%%%%%%%%%%%%%%this is try")
            val inputStream: InputStream= assets.open("first.json")
            json = inputStream.bufferedReader().use{it.readText()}
            println(" JSON data" +  json)
            var jsonarr = JSONArray(json)
            println("*******" + jsonarr)
            for(i in 0..jsonarr.length()-1){
                var jsonobj = jsonarr.getJSONObject(i)
                arr.add(jsonobj.getString("country"))
            }
    var adpt = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
            json_list.adapter = adpt
        }
        catch (e: IOException){
            println("In catch block")
            println(e)
        }
    }
}

