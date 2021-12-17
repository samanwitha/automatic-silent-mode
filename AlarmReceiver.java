package com.example.silentexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.provider.CalendarContract;
import android.util.Log;

import java.util.Calendar;
  
public class AlarmReceiver extends BroadcastReceiver {

 @Override
 public void onReceive(Context arg0, Intent arg1) {
	 AudioManager audio = (AudioManager)arg0.getSystemService(Context.AUDIO_SERVICE);

	  Toast.makeText(arg0, "silent mode activated", Toast.LENGTH_LONG).show();
  
	        switch(audio.getRingerMode()){
	        case AudioManager.RINGER_MODE_NORMAL :
	            audio.setRingerMode(AudioManager.RINGER_MODE_SILENT);
	            Log.d("MODE", "was normal");
	            Log.d("MODE", "is silent");
	            break;
	        }

	        
	            audio.setRingerMode(AudioManager.RINGER_MODE_SILENT);
	            Log.d("MODE", "was vibrate");
	            Log.d("MODE", "is silent");
	          
	        }	   
// Toast.makeText(arg0, "Alarm received!", Toast.LENGTH_LONG).show();


 }
