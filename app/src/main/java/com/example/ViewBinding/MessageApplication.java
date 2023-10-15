package com.example.ViewBinding;

import android.app.Application;
import android.util.Log;

public class MessageApplication extends Application {
    public static final String TAG = "MessageApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "messageApplication -> onCreate()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "messageApplication -> onTerminate()");
    }

}

