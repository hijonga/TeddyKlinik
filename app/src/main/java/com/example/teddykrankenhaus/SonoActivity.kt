package com.example.teddykrankenhaus

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SonoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sono)
    }
    fun openSonoVideo1(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.sono_niere)
        startActivity(intent)
    }
    fun openSonoVideo2(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.lebervenen)
        startActivity(intent)
    }
    fun openSonoVideo3(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.shunt)
        startActivity(intent)
    }
    fun openSonoVideo4(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.finger)
        startActivity(intent)
    }
    fun backToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent)
    }
}