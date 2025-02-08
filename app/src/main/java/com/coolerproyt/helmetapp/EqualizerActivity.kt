package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.ComponentActivity

class EqualizerActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.equalizer)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val dolbyIconImageView: ImageView = findViewById(R.id.dolby_icon)
        dolbyIconImageView.setImageResource(R.drawable.dolby_atmos)

        val controllerIconImageView: ImageView = findViewById(R.id.controller)
        controllerIconImageView.setImageResource(R.drawable.equalizer_control)

        val dropdown: Spinner = findViewById(R.id.dropdown)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        val options = arrayOf("Flat", "Hip Hop", "Dance")

        val adapter = ArrayAdapter(this, R.layout.spinner_item, options)

        dropdown.adapter = adapter
    }
}