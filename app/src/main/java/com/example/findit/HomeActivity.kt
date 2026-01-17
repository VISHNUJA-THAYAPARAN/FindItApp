package com.example.findit


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize UI elements
        val searchButton: Button = findViewById(R.id.searchButton)
        val homeIcon: ImageView = findViewById(R.id.homeIcon)
        val searchIcon: ImageView = findViewById(R.id.searchIcon)
        val historyIcon: ImageView = findViewById(R.id.historyIcon)
        val profileIcon: ImageView = findViewById(R.id.profileIcon)

        // Set click listeners
        searchButton.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        historyIcon.setOnClickListener {
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finishing to avoid multiple instances
        }
    }
}