
package com.example.teddykrankenhaus

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class PictureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)
    }

    fun openVideo(view: View) {
        val intent = Intent(this, VideoActivity::class.java).apply{}
        intent.putExtra("VideoFile", R.raw.bacteria)
        startActivity(intent)
        overridePendingTransition(0,0)
    }
    fun backToMain(view: View) {
        val intent = Intent(this, MicroscopeActivity::class.java).apply{}
        startActivity(intent)
    }
}