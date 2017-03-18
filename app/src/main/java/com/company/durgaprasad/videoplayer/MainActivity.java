package com.company.durgaprasad.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating a  Video View in activity_main.xml  and then playing the video
        VideoView videoView = (VideoView) findViewById (R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.yogeshwaraya);

        //Importing the control to the media
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
