package com.example.cultivate;

import android.app.Application;

import java.util.TreeMap;

/*

 */
public class MyApplication extends Application {
    public Map<String, Person> holdData;

    public MyApplication() {
        super();
        holdData = new Map<String, Person>();
    }

}
