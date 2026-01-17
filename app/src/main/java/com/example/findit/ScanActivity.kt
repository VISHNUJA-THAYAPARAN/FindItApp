package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.findit.HomeActivity
import com.example.findit.R

class ScanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)

        // Initialize views

        val homeIcon: ImageView = findViewById(R.id.homeIcon)
        val historyIcon: ImageView = findViewById(R.id.historyIcon)
        val profileIcon: ImageView = findViewById(R.id.profileIcon)

        // Set OnClickListener for Home Icon
        homeIcon.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Set OnClickListener for History Icon
        historyIcon.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
            finish()
        }

        // Set OnClickListener for Profile Icon
        profileIcon.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }

        // Auto navigate to SuccessActivity after 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
            finish() // Prevent returning to ScanActivity
        }, 3000) // 3000 ms = 3 seconds
    }
}
