package com.example.admin.addingvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoview = (VideoView) findViewById(R.id.videoView2);
           videoview.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.sampleboysplayingfootball);

           MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoview);

               videoview.setMediaController(mediaController);
           videoview.start();
    }
}
