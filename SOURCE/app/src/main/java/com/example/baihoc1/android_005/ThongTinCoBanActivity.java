package com.example.baihoc1.android_005;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ThongTinCoBanActivity extends AppCompatActivity {

    ImageView imgBTTCB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtincoban_layout);

        imgBTTCB = findViewById(R.id.img_back_ttcb);

        imgBTTCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tk = new Intent(ThongTinCoBanActivity.this, TaikhoanActivity.class);
                startActivity(tk);


            }
        });

    }

}