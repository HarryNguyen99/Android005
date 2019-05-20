package com.example.baihoc1.android_005;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.security.AccessController;

import de.hdodenhof.circleimageview.CircleImageView;

public class TaikhoanActivity extends AppCompatActivity {

    TextView tvUS, tvSTT, tvUserPhonenumber;
    LinearLayout llLichSuGD;
    LinearLayout llDangXuat;
    CircleImageView imgAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taikhoan_layout);

        init();
        getData();
    }

    void init(){

            imgAvatar = findViewById(R.id.img_avatar);

//            Glide.with(TaikhoanActivity.this).load("https://www.upsieutoc.com/images/2019/05/20/img_avatar.png")
//                    .into(imgAvatar);

            tvUS = findViewById(R.id.tv_username);

            tvUserPhonenumber = findViewById(R.id.tv_user_phonenumber);

            tvSTT = findViewById(R.id.tv_sua_thongtin);

            tvSTT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stt = new Intent(TaikhoanActivity.this, ThongTinCoBanActivity.class);
                    startActivity(stt);
                }
            });

            llLichSuGD = findViewById(R.id.ll_lich_su_gd);
            llLichSuGD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent lichsgd = new Intent(TaikhoanActivity.this, LichSuGDActivity.class);
                    startActivity(lichsgd);
                }
            });

            llDangXuat = findViewById(R.id.ll_dang_xuat);
            llDangXuat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent lichsgd = new Intent(TaikhoanActivity.this, LoginActivity.class);
                    startActivity(lichsgd);
                }
            });
        }

    void getData (){

        User user = (User) getIntent().getSerializableExtra("user");
        tvUserPhonenumber.setText(user.getPhoneNumber());
        tvUS.setText(user.getUsername());
        Glide.with(TaikhoanActivity.this).load(user.getProfileUrl())
                .into(imgAvatar);


//        String phonenumber = getIntent().getStringExtra("phone_number");
//        tvUserPhonenumber.setText(phonenumber);

    }





}