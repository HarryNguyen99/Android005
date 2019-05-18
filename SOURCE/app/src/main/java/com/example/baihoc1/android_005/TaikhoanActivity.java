package com.example.baihoc1.android_005;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TaikhoanActivity extends AppCompatActivity {

    TextView tvUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taikhoan_layout);

        tvUS = findViewById(R.id.tv_username);
        tvUS.setText("Nguyễn Phú Quý");

    }




}