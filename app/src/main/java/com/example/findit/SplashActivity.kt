package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        // Handle edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Use a Handler to navigate to GetStartedActivity after 3 seconds
        Handler().postDelayed({
            // Create an Intent to navigate to GetStartedActivity
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
            finish() // Finish SplashActivity to prevent going back
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
