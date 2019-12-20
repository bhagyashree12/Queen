package com.example.queen;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Music extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer player;
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);

        btn1 = (ImageButton) findViewById(R.id.playbtn1);
        btn2 = (ImageButton) findViewById(R.id.playbtn2);
        btn3 = (ImageButton) findViewById(R.id.playbtn3);
        btn4 = (ImageButton) findViewById(R.id.playbtn4);
        btn5 = (ImageButton) findViewById(R.id.playbtn5);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.playbtn1:
                if (player == null||player != null) {
                    stopPlayer();
                    player = MediaPlayer.create(this, R.raw.fat_bottom_girl);
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                }
                player.start();

                break;

            case R.id.playbtn2:
                if (player == null||player != null) {
                    stopPlayer();
                    player = MediaPlayer.create(this, R.raw.i_want_break_free);
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                }

                player.start();

                break;


            case R.id.playbtn3:
                if (player == null||player != null) {
                    stopPlayer();
                    player = MediaPlayer.create(this, R.raw.keep_yourself_alive);
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                }
                player.start();

                break;


            case R.id.playbtn4:
                if (player == null||player != null) {
                    stopPlayer();
                    player = MediaPlayer.create(this, R.raw.killer_queen);
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                }
                player.start();

                break;

            case R.id.playbtn5:
                if (player == null||player != null) {
                    stopPlayer();
                    player = MediaPlayer.create(this, R.raw.we_will_rock_you);
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            stopPlayer();
                        }
                    });
                }
                player.start();

                break;







        }


    }





    public void pause(View v) {
        if (player != null) {
            player.pause();
        }
    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }


}


