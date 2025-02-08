package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class AppIntegrationActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_integration)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        val googleMapIcon: ImageView = findViewById(R.id.google_map_icon)
        googleMapIcon.setImageResource(R.drawable.google_map)

        val wazeIcon: ImageView = findViewById(R.id.waze_icon)
        wazeIcon.setImageResource(R.drawable.waze)

        val appleMusicIcon: ImageView = findViewById(R.id.apple_music_icon)
        appleMusicIcon.setImageResource(R.drawable.apple_music)

        val spotifyIcon: ImageView = findViewById(R.id.spotify_icon)
        spotifyIcon.setImageResource(R.drawable.spotify)
    }
}