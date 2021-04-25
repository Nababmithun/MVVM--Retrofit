package com.example.mvvm__retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm__retrofit.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val username = intent.getStringExtra("user")
        val password = intent.getStringExtra("password")

        tvWelcome.setText("Welcome ${username}, you entered ${password}")
    }
}