package com.example.teddykrankenhaus

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class EKGActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ekg)
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent)
    }

    fun openEKGVideo(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.ecg_monitor_2)
        startActivity(intent)
    }
    fun backToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent)
    }
}