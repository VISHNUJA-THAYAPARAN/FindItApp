package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.findit.HomeActivity
import com.example.findit.R
import com.example.findit.SearchActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Set up click listeners for the bottom navigation bar icons
        val homeIcon: ImageView = findViewById(R.id.homeIcon)
        val searchIcon: ImageView = findViewById(R.id.searchIcon)
        val historyIcon: ImageView = findViewById(R.id.historyIcon)
        val profileIcon: ImageView = findViewById(R.id.profileIcon)

        homeIcon.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        searchIcon.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        historyIcon.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
            finish()
        }

    }
}
