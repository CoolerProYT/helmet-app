package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.ComponentActivity

class DashcamActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashcam)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val dashcamContentImageView: ImageView = findViewById(R.id.dashcam_content)
        dashcamContentImageView.setImageResource(R.drawable.dashcam_content)

        val dropdown: Spinner = findViewById(R.id.dropdown_2)
        val dropdown2: Spinner = findViewById(R.id.dropdown_3)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        val options = arrayOf("Front", "Back", "All")
        val options2 = arrayOf("Today", "Yesterday", "2 Days Ago")

        val adapter = ArrayAdapter(this, R.layout.spinner_item, options)
        val adapter2 = ArrayAdapter(this, R.layout.spinner_item, options2)

        dropdown.adapter = adapter
        dropdown2.adapter = adapter2
    }
}