package com.mcodegeeks.tutorial.T04_BroadcastReceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mcodegeeks.tutorial.R;

public class T04MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t04_main);
    }

    // broadcast a custom intent.
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.mcodegeeks.tutorial.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
