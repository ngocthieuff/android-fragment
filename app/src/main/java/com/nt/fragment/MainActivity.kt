package com.nt.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsBtn = findViewById<Button>(R.id.btnNews)
        val scienceBtn = findViewById<Button>(R.id.btnScience)
        val sportsBtn = findViewById<Button>(R.id.btnSports)

        newsBtn.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, NewsFragment())
            transaction.commit()
        }
        scienceBtn.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, ScienceFragment())
            transaction.commit()
        }
        sportsBtn.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, SportsFragment())
            transaction.commit()
        }
    }
}