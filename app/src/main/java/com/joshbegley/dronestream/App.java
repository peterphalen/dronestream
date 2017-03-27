package com.joshbegley.dronestream;

import android.app.Application;
import com.onesignal.OneSignal;



//we call the overarching application class to initialize the push notification system
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this).init();

    }


}
