package com.example.cultivate;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*

 */
public class MyApplication extends Application {
    public Map<String, String> holdData;

    public MyApplication() {
        super();
        holdData = new HashMap<String, String>();
    }

}
