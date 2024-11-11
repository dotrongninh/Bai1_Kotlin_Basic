package service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import com.example.bai1_basicandroid.R

class BackgroundService :Service() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate() {
        super.onCreate()
        Log.d("MusicBackgroundService", "Service Created")


        mediaPlayer = MediaPlayer.create(this, R.raw.aaa)

        Log.d("MusicBackgroundService", "Music Started")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("MusicBackgroundService", "onStartCommand() - Music Playing")
        mediaPlayer?.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.stop()
        mediaPlayer?.release()
        Log.d("MusicBackgroundService", "Service Destroyed - Music Stopped")
    }


    override fun onBind(p0: Intent?): IBinder? {
       return null
    }



}