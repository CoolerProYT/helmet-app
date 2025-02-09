package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.ComponentActivity

class PowerOptionActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.power_option)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val batteryUsageImageView: ImageView = findViewById(R.id.batteryUsage)
        batteryUsageImageView.setImageResource(R.drawable.battery_usage)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        val dropdown: Spinner = findViewById(R.id.dropdown)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        val options = arrayOf("Auto", "Battery", "Kinetic Power")

        val adapter = ArrayAdapter(this, R.layout.spinner_item, options)

        dropdown.adapter = adapter
    }
}