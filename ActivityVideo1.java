package com.example.beyourbestselfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class AnxietyVideo1 extends YouTubeBaseActivity {
    private static String ATAG = "AnxietyVideo1";

    YouTubePlayerView newYouTubeVideo_anxiety;
    Button btnAnxiety1;
    YouTubePlayer.OnInitializedListener aInitializedListener1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_video1);

        btnAnxiety1 = (Button) findViewById(R.id.btnAnxiety1);
        newYouTubeVideo_anxiety = (YouTubePlayerView) findViewById(R.id.youTubeAnxiety_play1);

        aInitializedListener1 = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider aprovider1, YouTubePlayer ayouTubePlayer1, boolean ab1) {
                Log.d(ATAG, "onClick: Done initializing.");
                ayouTubePlayer1.loadVideo("crUusAyzPxo");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider aprovider1, YouTubeInitializationResult ayouTubeInitializationResult1) {
                Log.d(ATAG, "onClick: Failed to initialize");
            }
        };

        btnAnxiety1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(ATAG, "onClick: Initializing YouTube Player.");
                newYouTubeVideo_anxiety.initialize(YTubeConfig.getApiKey(), aInitializedListener1);
            }
        });
    }
}
