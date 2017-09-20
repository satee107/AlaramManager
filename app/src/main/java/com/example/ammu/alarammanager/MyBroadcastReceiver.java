package com.example.ammu.alarammanager;

/**
 * Created by ammu on 12/24/2015.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.alrm   );
        mp.start();
        mp.setLooping(true);
        mp.stop();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }
}