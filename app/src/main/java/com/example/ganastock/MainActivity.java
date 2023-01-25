package com.example.ganastock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity {

    MediaPlayer playSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void soundPlay(View view) {

        ImageView screenImage = (ImageView) view;
        String tValue = screenImage.getTag().toString();
        int tvalueT = Integer.parseInt(tValue);
        soundPlay(tvalueT);

    }

    public void soundPlay(int tagValue) {
        if (tagValue == 0) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });


        } else if (tagValue == 1) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound2);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();

                }
            });

        } else if (tagValue == 2) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound3);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        } else if (tagValue == 3) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound4);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        } else if (tagValue == 4) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound5);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });

        } else if (tagValue == 5) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound6);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        } else if (tagValue == 6) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound7);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        } else if (tagValue == 7) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound8);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        } else if(tagValue==8) {
            stopExistingSong();
            playSound = MediaPlayer.create(getApplicationContext(), R.raw.sound9);
            playSound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    playSound.start();
                }
            });

            playSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    playSound.stop();
                }
            });
        }

    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }
    public void releaseAndStop() {


        if (playSound != null) {

            playSound.stop();
            playSound.release();

        }
    }

    public void stopExistingSong(){
        if(playSound !=null) {
            if (playSound.isPlaying()) {
                playSound.stop();
            }
        }
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopExistingSong();
    }
}