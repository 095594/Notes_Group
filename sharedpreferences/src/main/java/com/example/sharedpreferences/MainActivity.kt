package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("background_color", "#FFFFFF")
        editor.putString("font_size", "16")
        editor.apply()

        val backgroundColor = sharedPreferences.getString("background_color", "#FFFFFF")
        val fontSize = sharedPreferences.getString("font_size", "16")

    }
}