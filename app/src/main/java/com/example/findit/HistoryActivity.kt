package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.findit.HomeActivity
import com.example.findit.R
import com.example.findit.SearchActivity
import com.example.findit.ProfileActivity






class HistoryActivity : AppCompatActivity() {

    private lateinit var historyTextViews: List<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history) // Ensure this is called first

        // Initialize TextViews for history items by matching their IDs from the XML
        historyTextViews = listOf(
            findViewById(R.id.history1),
            findViewById(R.id.history2),
            findViewById(R.id.history3),
            findViewById(R.id.history4),
            findViewById(R.id.history5)
        )

        // Sample history data to display
        val historyData = listOf("History 1", "History 2", "History 3", "History 4", "History 5")

        // Dynamically set the text for each TextView
        for (i in historyTextViews.indices) {
            if (i < historyData.size) {
                historyTextViews[i].text = historyData[i]
            } else {
                historyTextViews[i].visibility = TextView.GONE
            }
        }

        // Bottom Navigation Bar Setup
        findViewById<ImageView>(R.id.homeIcon).setOnClickListener {
            navigateToActivity(HomeActivity::class.java)
        }

        findViewById<ImageView>(R.id.searchIcon).setOnClickListener {
            navigateToActivity(SearchActivity::class.java)
        }

        findViewById<ImageView>(R.id.profileIcon).setOnClickListener {
            navigateToActivity(ProfileActivity::class.java)
        }
    }

    // Helper function to navigate to a new activity
    private fun navigateToActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
        finish()  // Optional: If you want to prevent users from navigating back to this activity
    }
}
