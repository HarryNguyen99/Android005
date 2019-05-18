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
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
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
        return (phoneLeng > 9);

//        if (phoneLeng > 9)
//            return true;
//        return false;
    }

}
