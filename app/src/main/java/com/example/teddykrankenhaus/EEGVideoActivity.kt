package com.example.teddykrankenhaus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import android.net.Uri
import android.view.View

class EEGVideoActivity : AppCompatActivity() {
    // declaring a null variable for VideoView
    var simpleVideoView: VideoView? = null

    // declaring a null variable for MediaController
    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eegvideo)

        // assigning id of VideoView from
        // activity_main.xml layout file
        simpleVideoView = findViewById<View>(R.id.EEGVideoView) as VideoView

        if (mediaControls == null) {
            // creating an object of media controller class
            mediaControls = MediaController(this)

            // set the anchor view for the video view
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }

        // set the media controller for video view
        //simpleVideoView!!.setMediaController(mediaControls)

        // set the absolute path of the video file which is going to be played
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
                + packageName + "/" + R.raw.eeg_video))

        simpleVideoView!!.requestFocus()

        simpleVideoView!!.setOnPreparedListener { it.isLooping = true }

        // starting the video
        simpleVideoView!!.start()

        // display a toast message if any
        // error occurs while playing the video
        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(applicationContext, "An Error Occured " +
                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
            false
        }

        getIntent().getIntExtra("")

        // Video player
        //var mediaPlayer = MediaPlayer.create(this, R.raw.dancing_bear)
        //mediaPlayer.start()
    }

    fun backToOverview(view: View) {
        val intent = Intent(this, EEGActivity::class.java).apply{}
        startActivity(intent)
    }
}