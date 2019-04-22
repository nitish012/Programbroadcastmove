package com.example.programbroadcastmove;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        moveToCustomBroadcast();
    }


    private void findId() {
        btn=findViewById(R.id.btn);
    }

    private void moveToCustomBroadcast() {

        btn.setOnClickListener(new View.OnClickListener() {       //setting listener for button
            @Override
            public void onClick(View v) {
                // move to second activty
                Intent intent=new Intent(MainActivity.this,CustomBroadCast.class);
                startActivity(intent);
            }
        });
    }

}
