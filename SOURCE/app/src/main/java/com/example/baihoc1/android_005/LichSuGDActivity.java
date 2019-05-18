package com.example.baihoc1.android_005;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LichSuGDActivity extends AppCompatActivity {

    ImageView imgBLSGD;
    LinearLayout ll_TK_LSGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lichsugiaodich_layout);

        imgBLSGD = findViewById(R.id.img_back_lsgd);

        imgBLSGD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tk = new Intent(LichSuGDActivity.this, TaikhoanActivity.class);
                startActivity(tk);

            }

        });

        ll_TK_LSGD = findViewById(R.id.ll_tk_lsgd);

        ll_TK_LSGD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tk = new Intent(LichSuGDActivity.this, TaikhoanActivity.class);
                startActivity(tk);

            }

        });

    }
}