package com.example.alatmusikriau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "About me"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
