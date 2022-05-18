package com.example.teddykrankenhaus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import android.net.Uri
import android.view.View

class VideoActivity : AppCompatActivity() {
    // declaring a null variable for VideoView
    var simpleVideoView: VideoView? = null

    // declaring a null variable for MediaController
    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        // assigning id of VideoView from
        // activity_main.xml layout file
        simpleVideoView = findViewById<View>(R.id.VideoView) as VideoView

        if (mediaControls == null) {
            // creating an object of media controller class
            mediaControls = MediaController(this)

            // set the anchor view for the video view
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }

        // set the media controller for video view
        //simpleVideoView!!.setMediaController(mediaControls)
        var intent: Intent
        intent = getIntent()

        val videoFile = intent.getIntExtra("VideoFile",0)
        // set the absolute path of the video file which is going to be played
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
                + packageName + "/" + videoFile))
        //simpleVideoView!!.setVideoPath("android.resource://"
          //     + packageName + "/" + videoFile)


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

        // Video player
        //var mediaPlayer = MediaPlayer.create(this, R.raw.dancing_bear)
        //mediaPlayer.start()
    }
    fun backToMain(view: View) {
        val intent = Intent(this, SonoActivity::class.java).apply{}
        startActivity(intent)
    }
}

