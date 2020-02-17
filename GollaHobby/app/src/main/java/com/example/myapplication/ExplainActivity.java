package com.example.myapplication;

// 명연
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplainActivity extends AppCompatActivity {

    Button nextBtn;
    VideoView vv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);

        vv=findViewById(R.id.videoView);

        String uriPath="android.resource://"+getPackageName()+"/"+R.raw.videosample;
        Uri uri= Uri.parse(uriPath);
        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();

        vv.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            @Override
            public boolean onInfo(MediaPlayer mp, int what, int extra) {
                switch (what) {
                    case MediaPlayer.MEDIA_ERROR_TIMED_OUT:
                        Toast.makeText(getApplicationContext(), "MEDIA_ERROR_TIMED_OUT", Toast.LENGTH_LONG).show();
                        break;
                    case MediaPlayer.MEDIA_INFO_BUFFERING_START:
                        Toast.makeText(getApplicationContext(), "MEDIA_INFO_BUFFERING_START", Toast.LENGTH_LONG).show();
                        break;
                    case MediaPlayer.MEDIA_INFO_BUFFERING_END:
                        Toast.makeText(getApplicationContext(), "MEDIA_INFO_BUFFERING_END", Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });

        nextBtn = findViewById(R.id.btnStart);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}
