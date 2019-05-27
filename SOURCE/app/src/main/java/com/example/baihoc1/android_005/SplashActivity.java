package com.example.baihoc1.android_005;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                screenRouter();
            }
        }, 1000);

    }

    void screenRouter() {
        //*lấy  SharedPreferences ra*
        //B1: mở hoặc tạo0
        //B2: lấy dữ liệu ra

        String phonenumber = AppConfig.getphonenumber(this);
        if (phonenumber == null){
            Intent login = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(login);
        }else {
            Intent home = new Intent(SplashActivity.this, HomeActivity.class);
            startActivity(home);
        }
    }

}
