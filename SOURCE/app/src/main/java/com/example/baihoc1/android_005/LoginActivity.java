package com.example.baihoc1.android_005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtPhoneNumber;
    RelativeLayout rlLogin;
    ImageView imgFB;
    ImageView imagGG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        init();
    }

    void init() {

        edtPhoneNumber = findViewById(R.id.edt_phone_number);
        rlLogin = findViewById(R.id.rl_login_buton);
        imgFB = findViewById(R.id.img_login_facebook);
        imagGG = findViewById(R.id.img_login_google);

        rlLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(LoginActivity.this, edtPhoneNumber.getText().toString(), Toast.LENGTH_SHORT).show();
                if (checkValid()) {
//                   Chuyển màn hình
//                    Tạo đối tượng intent
                    Intent tk = new Intent(LoginActivity.this, TaikhoanActivity.class);
                    User user;
                    user = new User();
                    user.setUsername("Harry Nguyen");
                    user.setPhoneNumber("+84961080123");
                    user.setProfileUrl("https://images.hellogiggles.com/uploads/2018/04/11101451/national-pet-day-puns.jpg");
                    startActivity(tk);
                    fileList();
                } else {
//                    Hiển thị thông báo lỗi
                    Toast.makeText(LoginActivity.this,
                            "Vui lòng kiểm tra lại số điện thoại",
                            Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    boolean checkValid() {
        int phoneLeng = edtPhoneNumber.getText().toString().length();
       return (phoneLeng == 10);

 //       if (phoneLeng == 10)
//            return true;
//       return false;
    }


}
