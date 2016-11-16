package com.mcodegeeks.tutorial.T03_Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    String tag = "Tutorial";

    /** indicates how to behave if the service is killed */
    //int _startMode;

    /** interface for clients that bind */
    IBinder _binder;

    /** indicates whether onRebind should be used */
    boolean _allowRebind;

    /** Called when the service is being created. */
    @Override
    public  void onCreate() {
        Log.d(tag, "onCreate() called");
    }

    /** The service is starting, due to a call to startService() */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(tag, "onStartCommand() called");

        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service started.", Toast.LENGTH_LONG).show();
        return START_STICKY; //_startMode
    }

    /** A client is binding to the service with bindService() */
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(tag, "onBind() called");
        return _binder;
    }

    /** Called when all clients have unbound with unbindService() */
    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(tag, "onUnbind() called");
        return _allowRebind;
    }

    /** Called when a client is binding to the service with bindService()*/
    @Override
    public void onRebind(Intent intent) {
        Log.d(tag, "onRebind() called");
    }

    /** Called when The service is no longer used and is being destroyed */
    @Override
    public void onDestroy() {
        Log.d(tag, "onDestroy() called");

        Toast.makeText(this, "Service destroyed.", Toast.LENGTH_LONG).show();
    }

}
