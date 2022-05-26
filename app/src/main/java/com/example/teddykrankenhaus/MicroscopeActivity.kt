package com.example.teddykrankenhaus

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class MicroscopeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_microscope)
    }
    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent)
    }

    fun openPicture(view: View){
        val intent = Intent(this, PictureActivity::class.java).apply{}
        //intent.putExtra("VideoFile", R.raw.bakterien)
        startActivity(intent)
    }

    fun openVideo(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.bakterien)
        intent.putExtra("ActivityToGoBackTo", "MicroscopeActivity")
        startActivity(intent)
    }
    fun backToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply{}
        startActivity(intent)
    }
}