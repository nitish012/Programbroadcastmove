package com.example.programbroadcastmove;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CustomBroadCast extends AppCompatActivity {

    private LocalBroadcastManager localBroadcastManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_broad_cast);
        getLocalBroadcast();
        registerBroadcast();
        sendingBroadcast();

    }

    private void getLocalBroadcast() {
        //getting instance of localbroadcastmanager
       localBroadcastManager=LocalBroadcastManager.getInstance(getApplicationContext());
    }
    private void registerBroadcast() {
        //register the receiver for whom it call broadcastreceiver with entry in manifest
        localBroadcastManager.registerReceiver(new CustomBroadcastReceiver(), new IntentFilter("com.Broadcast")) ;

    }
    private void sendingBroadcast() {
        //sending broadcast
        localBroadcastManager.sendBroadcast(new Intent("com.Broadcast"));

    }

}
