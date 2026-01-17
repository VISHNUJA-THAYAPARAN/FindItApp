package com.example.findit


import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.OnInitListener
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.findit.HomeActivity
import com.example.findit.R
import com.example.findit.SearchActivity
import java.util.Locale

class SuccessActivity : AppCompatActivity(), OnInitListener {

    private var textToSpeech: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        // Initialize Text-to-Speech
        textToSpeech = TextToSpeech(this, this)

        // Setup click listeners for the bottom navigation icons
        findViewById<ImageView>(R.id.homeIcon).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        findViewById<ImageView>(R.id.searchIcon).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        findViewById<ImageView>(R.id.historyIcon).setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
            finish()
        }

        findViewById<ImageView>(R.id.profileIcon).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }

    // TTS initialization callback
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val langResult = textToSpeech?.setLanguage(Locale.US)
            if (langResult == TextToSpeech.LANG_MISSING_DATA
                || langResult == TextToSpeech.LANG_NOT_SUPPORTED) {
                // Handle language not supported or missing data
            } else {
                // Start speaking when TTS is initialized successfully
                textToSpeech?.speak("Your item is found!", TextToSpeech.QUEUE_FLUSH, null, null)
            }
        } else {
            // Handle TTS initialization failure
        }
    }

    override fun onDestroy() {
        // Release the TTS resources when the activity is destroyed
        textToSpeech?.stop()
        textToSpeech?.shutdown()
        super.onDestroy()
    }
}
