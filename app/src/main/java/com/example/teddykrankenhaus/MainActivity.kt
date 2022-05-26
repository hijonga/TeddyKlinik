package com.example.teddykrankenhaus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openEKG(view: View) {
        val intent = Intent(this, EKGActivity::class.java).apply{}
        startActivity(intent)
    }
    fun openEEG(view: View) {
        val intent = Intent(this, EEGActivity::class.java).apply{}
        startActivity(intent)
    }
    fun openSono(view: View) {
        val intent = Intent(this, SonoActivity::class.java).apply{}
        startActivity(intent)
    }
    fun openMicroscope(view: View) {
        val intent = Intent(this, MicroscopeActivity::class.java).apply{}
        startActivity(intent)
    }

}