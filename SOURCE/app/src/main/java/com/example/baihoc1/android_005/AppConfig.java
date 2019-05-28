package com.example.baihoc1.android_005;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.jar.Attributes;

public class AppConfig {

    public static final String PERF_NAME = "Android005";

    public static void setphonenumber (String phonenumber, Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PERF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("phone_number", phonenumber);
        editor.apply();
    }
    public static String getphonenumber (Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PERF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("phone_number", null);
    }

}
