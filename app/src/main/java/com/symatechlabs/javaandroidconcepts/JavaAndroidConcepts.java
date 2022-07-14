package com.symatechlabs.javaandroidconcepts;

import android.app.Application;

import com.symatechlabs.javaandroidconcepts.data.AppDatabase;

public class JavaAndroidConcepts extends Application {

    public static AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase = AppDatabase.getInstance(getApplicationContext());

    }
}
