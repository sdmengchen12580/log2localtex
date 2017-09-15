package com.example.yunwen.textkeyboard;

import android.app.Application;

/**
 * Created by yunwen on 2017/9/15.
 */

public class Mapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
