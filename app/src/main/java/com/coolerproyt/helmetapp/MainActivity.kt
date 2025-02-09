package com.coolerproyt.helmetapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TableRow
import androidx.activity.ComponentActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId", "SourceLockedOrientationActivity", "ObsoleteSdkInt")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            window.statusBarColor = resources.getColor(R.color.background)
        }

        val helmetImageView: ImageView = findViewById(R.id.helmetImageView)
        helmetImageView.setImageResource(R.drawable.helmet)

        val statusBarImageView: ImageView = findViewById(R.id.statusBarImageView)
        statusBarImageView.setImageResource(R.drawable.status_bar)

        val menuIconImageView: ImageView = findViewById(R.id.menuIconImageView)
        menuIconImageView.setImageResource(R.drawable.menu_icon)

        val securityImageView: ImageView = findViewById(R.id.securityImageView)
        securityImageView.setImageResource(R.drawable.security)

        val brightnessImageView: ImageView = findViewById(R.id.brightnessImageView)
        brightnessImageView.setImageResource(R.drawable.brightness)

        val equalizerImageView: ImageView = findViewById(R.id.equalizerImageView)
        equalizerImageView.setImageResource(R.drawable.equalizer)

        val dashcamImageView: ImageView = findViewById(R.id.dashcamImageView)
        dashcamImageView.setImageResource(R.drawable.dashcam)

        val findMyHelmetImageView: ImageView = findViewById(R.id.findMyHelmetImageView)
        findMyHelmetImageView.setImageResource(R.drawable.find_my_helmet)

        val emergencySosImageView: ImageView = findViewById(R.id.emergencySosImageView)
        emergencySosImageView.setImageResource(R.drawable.emergency_sos)

        val powerOptionImageView: ImageView = findViewById(R.id.powerOptionImageView)
        powerOptionImageView.setImageResource(R.drawable.power_option)

        val sidebarImageView: ImageView = findViewById(R.id.sidebarImageView)
        sidebarImageView.setImageResource(R.drawable.menu_icon)

        val manageAccountImageView: ImageView = findViewById(R.id.manageAccountImageView)
        manageAccountImageView.setImageResource(R.drawable.manage_account)

        val settingsImageView: ImageView = findViewById(R.id.settingsImageView)
        settingsImageView.setImageResource(R.drawable.settings)

        val circularImageView: ImageView = findViewById(R.id.circularImageView)
        circularImageView.setImageResource(R.drawable.manage_account)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        val sidebarSettingsNav: LinearLayout = findViewById(R.id.sidebar_settings)
        val sidebarManageAccount: LinearLayout = findViewById(R.id.sidebar_manage_account)

        val equalizerButton: TableRow = findViewById(R.id.equalizer)
        val dashcamButton: TableRow = findViewById(R.id.dashcam)
        val findMyHelmetButton: TableRow = findViewById(R.id.findMyHelmet)
        val emergencySosButton: TableRow = findViewById(R.id.emergencySos)
        val powerOptionButton: TableRow = findViewById(R.id.powerOption)

        menuIconImageView.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        sidebarImageView.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.START)
        }

        sidebarSettingsNav.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        sidebarManageAccount.setOnClickListener{
            val intent = Intent(this, ManageAccountActivity::class.java)
            startActivity(intent)
        }

        equalizerButton.setOnClickListener{
            val intent = Intent(this, EqualizerActivity::class.java)
            startActivity(intent)
        }

        dashcamButton.setOnClickListener{
            val intent = Intent(this, DashcamActivity::class.java)
            startActivity(intent)
        }

        findMyHelmetButton.setOnClickListener{
            val intent = Intent(this, FindMyHelmetActivity::class.java)
            startActivity(intent)
        }

        emergencySosButton.setOnClickListener{
            val intent = Intent(this, EmergencySosActivity::class.java)
            startActivity(intent)
        }

        powerOptionButton.setOnClickListener{
            val intent = Intent(this, PowerOptionActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit")
        builder.setMessage("Are you sure you want to exit?")

        builder.setPositiveButton("Yes") { _, _ ->
            super.onBackPressed()
        }

        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()
        }

        builder.setCancelable(true)

        val dialog = builder.create()
        dialog.show()
    }
}