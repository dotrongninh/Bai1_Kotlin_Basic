package com.example.bai1_basicandroid.Activity_Intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bai1_basicandroid.R
import service.BackgroundService

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("MainActivity", "onCreate()")
        var txt : TextView =findViewById(R.id.textView2)
        txt.text = intent.getStringExtra("text2")

        var btbg : Button = findViewById(R.id.button3)

        btbg.setOnClickListener {
            Log.d("MainActivity", "Loi")
            var i2 = Intent(this, BackgroundService::class.java)
            startService(i2)}

        var bt : Button = findViewById(R.id.button)
        bt.setOnClickListener {     var i = Intent(this,Activity2::class.java)
            i.putExtra("text1","Thông điệp từ trang 1")
            startActivity(i) }


    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy()")
    }
}