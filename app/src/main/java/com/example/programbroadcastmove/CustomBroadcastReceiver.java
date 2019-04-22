package com.example.programbroadcastmove;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //on receiving broadcast it shows the message

        Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();

    }
}
