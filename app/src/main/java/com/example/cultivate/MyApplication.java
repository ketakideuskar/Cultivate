package com.example.cultivate;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;

/*

 */
public class MyApplication extends Application {
    public Map<String, String> holdData;

    public MyApplication() {
        super();
        holdData = new HashMap<String, String>();
    }

}
