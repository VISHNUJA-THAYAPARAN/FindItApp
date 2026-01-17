package com.example.findit


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val backButton = findViewById<ImageView>(R.id.backButton)
        val homeIcon = findViewById<ImageView>(R.id.homeIcon)
        val searchIcon = findViewById<ImageView>(R.id.searchIcon)
        val historyIcon = findViewById<ImageView>(R.id.historyIcon)
        val profileIcon = findViewById<ImageView>(R.id.profileIcon)
        val scanButton = findViewById<Button>(R.id.scanButton)

        backButton.setOnClickListener {
            finish() // Closes current activity and returns to the previous one
        }

        scanButton.setOnClickListener {
            startActivity(Intent(this, ScanActivity::class.java))
        }


        homeIcon.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        historyIcon.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
            finish()
        }

        profileIcon.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
