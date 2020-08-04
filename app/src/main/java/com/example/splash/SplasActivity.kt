package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
    }

    private fun handlesplash() {
        val handler = Handler()
        val postDelayed = handler.postDelayed({
            navigateToLoginActivity()
        }, 3000)
    }

    private fun navigateToLoginActivity() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
}