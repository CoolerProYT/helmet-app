package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class FindMyHelmetActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_my_helmet)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val findMyHelmetContentImageView: ImageView = findViewById(R.id.findMyHelmetContent)
        findMyHelmetContentImageView.setImageResource(R.drawable.find_my_helmet_content)

        val helmetWithYouHelmetImageView: ImageView = findViewById(R.id.helmetWithYou)
        helmetWithYouHelmetImageView.setImageResource(R.drawable.helmet_with_you)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }
    }
}