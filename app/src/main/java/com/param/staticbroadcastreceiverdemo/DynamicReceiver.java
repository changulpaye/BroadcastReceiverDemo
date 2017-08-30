package com.param.staticbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by PARAM on 8/30/2017.
 */

public class DynamicReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Dynamic Broadcast Receiver start" , Toast.LENGTH_SHORT).show();
    }
}
