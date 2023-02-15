package com.example.valentine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        supportActionBar?.hide()

    }
}