package com.example.medinin.Util;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=DaggerAppComponent.builder()
                .apiModule(new ApiModule())
                .build();
    }

    public  static AppComponent getAppComponent(Context context) {
        return ((MyApplication) context.getApplicationContext()).appComponent;
        // return myAppComponent;
    }
}
