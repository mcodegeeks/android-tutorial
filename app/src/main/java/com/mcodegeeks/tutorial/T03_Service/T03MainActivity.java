package com.mcodegeeks.tutorial.T03_Service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mcodegeeks.tutorial.R;

public class T03MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t03_main);
    }

    public void startService(View view) {
        Intent intent = new Intent(getBaseContext(), MyService.class);
        startService(intent);
    }

    // Method to stop the service
    public void stopService(View view) {
        Intent intent = new Intent(getBaseContext(), MyService.class);
        stopService(intent);
    }
}
