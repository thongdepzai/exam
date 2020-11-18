package com.example.vd2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class example extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(MainActivity.ACTION_T)) {
            String title = intent.getStringExtra(MainActivity.ACTION_T);
            Toast.makeText(context, title, Toast.LENGTH_SHORT).show();
            //Toast.makeText(context,"âksdhaksdhkajsd",Toast.LENGTH_SHORT).show();
        }

    }}

