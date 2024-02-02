package com.bootan.welcomeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFragment = StartFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, welcomeFragment)
            .commit()
    }


}