package com.project.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by acer on 10/26/2017.
 */

public class MyService extends Service
{
    String tag="MyService";
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate(){
        super.onCreate();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.song);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mp.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mp.release();
        super.onDestroy();
    }

}

