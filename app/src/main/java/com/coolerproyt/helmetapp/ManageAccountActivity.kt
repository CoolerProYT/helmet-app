package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class ManageAccountActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manage_account)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val profileIcon: ImageView = findViewById(R.id.profile_icon)
        profileIcon.setImageResource(R.drawable.manage_account)

        val saveButton: Button = findViewById(R.id.save_button)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        saveButton.setOnClickListener{
            super.onBackPressed()
        }
    }
}