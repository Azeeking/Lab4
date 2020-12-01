package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4.MyApplication.Companion.instance

class MainActivity : AppCompatActivity() {

    lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = MyApplication.instance.getDatabase()!!

    }
}