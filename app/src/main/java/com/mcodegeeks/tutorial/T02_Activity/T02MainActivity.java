package com.mcodegeeks.tutorial.T02_Activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.mcodegeeks.tutorial.R;

public class T02MainActivity extends Activity {

    String tag = "Tutorial";

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t02_main);
        Log.d(tag, "onCreate() called");
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart() called");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume() called");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause() called");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop() called");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy() called");
    }
}
