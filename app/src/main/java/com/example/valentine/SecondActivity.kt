package com.example.valentine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.hide()

        tV1.setOnClickListener{
            intent = Intent(this,History::class.java)
            startActivity(intent)
        }

        tV2.setOnClickListener{
            intent = Intent(this,Message::class.java)
            startActivity(intent)
        }

    }
}