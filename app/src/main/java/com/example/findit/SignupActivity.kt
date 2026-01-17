package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Find the Sign Up Button
        val signUpButton = findViewById<Button>(R.id.signUpButton)

        // Set an OnClickListener to navigate to HomeActivity on button click
        signUpButton.setOnClickListener {
            // Create an Intent to navigate to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)  // Start HomeActivity
            finish()  // Finish the SignupActivity to prevent going back to it
        }
    }
}
