package com.example.bai1_basicandroid.Activity_Intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bai1_basicandroid.R

class Activity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        Log.d("Activity2", "onCreate()")
        var txt : TextView =findViewById(R.id.textView)
        txt.text = intent.getStringExtra("text1")

        var bt : Button = findViewById(R.id.button2)
        bt.setOnClickListener {     var i = Intent(this,MainActivity::class.java)
            i.putExtra("text2","Thông điệp từ trang 2")
            startActivity(i) }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Activity2", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity2", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity2", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity2", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity2", "onDestroy()")
    }

}