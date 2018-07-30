package com.example.praty.soundpoolproject;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int REDID;
    private int PURPLEID;
    private int GREENID;
    private int SKYID;
    private int YELLOWID;
    private int BLUEID;
    private int ORANGEID;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool= new SoundPool(7, AudioManager.STREAM_MUSIC,0);
        REDID=mSoundPool.load(getApplicationContext(),R.raw.note1,1);
        PURPLEID=mSoundPool.load(getApplicationContext(),R.raw.note2,1);
        GREENID=mSoundPool.load(getApplicationContext(),R.raw.note3,1);
        SKYID=mSoundPool.load(getApplicationContext(),R.raw.note4,1);
        YELLOWID=mSoundPool.load(getApplicationContext(),R.raw.note5,1);
        BLUEID=mSoundPool.load(getApplicationContext(),R.raw.note6,1);
        ORANGEID=mSoundPool.load(getApplicationContext(),R.raw.note7,1);


    }

    public void redButton(View V){
        mSoundPool.play(REDID,1.0f,1.0f,0,0,1.0f);

    }
    public void purpleButton(View V){
        mSoundPool.play(PURPLEID,1.0f,1.0f,0,0,1.0f);
    }
    public void greenButton(View V){
        mSoundPool.play(GREENID,1.0f,1.0f,0,0,1.0f);

    }
    public void skyButton(View V){
        mSoundPool.play(SKYID,1.0f,1.0f,0,0,1.0f);

    }
    public void yellowButton(View V){
        mSoundPool.play(YELLOWID,1.0f,1.0f,0,0,1.0f);

    }
    public void blueButton(View V){
        mSoundPool.play(BLUEID,1.0f,1.0f,0,0,1.0f);


    }
    public void orangeButton(View V){
        mSoundPool.play(ORANGEID,1.0f,1.0f,0,0,1.0f);

    }
}

