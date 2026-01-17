package com.example.findit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    // Declare UI components
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        // Initialize Submit Button
        submitButton = findViewById(R.id.submitButton)

        // Set onClickListener for Submit Button
        submitButton.setOnClickListener {
            // Navigate to HomeActivity when Submit button is clicked
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finish current activity to prevent going back to ForgotPasswordActivity
        }
    }
}
