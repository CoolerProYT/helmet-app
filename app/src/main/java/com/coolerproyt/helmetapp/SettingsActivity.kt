package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableRow
import androidx.activity.ComponentActivity

class SettingsActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val backIconImageView: ImageView = findViewById(R.id.backIconImageView)
        backIconImageView.setImageResource(R.drawable.back)

        val rightArrowIcon: ImageView = findViewById(R.id.right_arrow_icon)
        rightArrowIcon.setImageResource(R.drawable.right_arrow)

        val rightArrowIcon2: ImageView = findViewById(R.id.right_arrow_icon2)
        rightArrowIcon2.setImageResource(R.drawable.right_arrow)

        val rightArrowIcon3: ImageView = findViewById(R.id.right_arrow_icon3)
        rightArrowIcon3.setImageResource(R.drawable.right_arrow)

        val rightArrowIcon4: ImageView = findViewById(R.id.right_arrow_icon4)
        rightArrowIcon4.setImageResource(R.drawable.right_arrow)

        val rightArrowIcon5: ImageView = findViewById(R.id.right_arrow_icon5)
        rightArrowIcon5.setImageResource(R.drawable.right_arrow)

        val changePasscodeRow: TableRow = findViewById(R.id.change_passcode)
        val appIntegrationRow: TableRow = findViewById(R.id.app_integration)

        backIconImageView.setOnClickListener{
            super.onBackPressed()
        }

        changePasscodeRow.setOnClickListener{
            val intent = Intent(this, ChangePasscodeActivity::class.java)
            startActivity(intent)
        }

        appIntegrationRow.setOnClickListener{
            val intent = Intent(this, AppIntegrationActivity::class.java)
            startActivity(intent)
        }
    }
}