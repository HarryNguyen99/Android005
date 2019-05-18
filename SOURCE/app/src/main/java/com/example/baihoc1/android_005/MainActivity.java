package com.example.baihoc1.android_005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Hố Hô
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_main);

//        Tạo đối tượng User

        User windUser = new User();

//        Cách 1
//        gán giá trị

//        windUser.id = 1;
//        windUser.username = "Nguyễn VĂn A";
//        windUser.phoneNumber = "0975795580";
//        windUser.profileUrl = "www.ato.vn";

//        Cách 2
//        gán giá trị

        windUser.setId(1);
        windUser.setPhoneNumber("0975795580");
        windUser.setUsername("Nguyễn VĂn A");
        windUser.setProfileUrl("www.ato.vn");


//        Toast.makeText(this, windUser.username, Toast.LENGTH_LONG).show();

//        Sử dụng đồi tượng mà được khai báo và khởi taojtrong XML
//        Bước 1: gán id cho dối tượng trong XML
//        Bước 2: tạo tên mới và gán lại cho đối tượng đó

//        EditText edtPhoneNumber = findViewById(R.id.edt_phone_number);
//
//        edtPhoneNumber.setText("Hello wind");
//
//        TextView tvUssername = findViewById(R.id.tv_username);
//
//        tvUssername. setText("Phú Quý");

//        Bài tập về nhà

        EditText edtTen = findViewById(R.id.edt_ten);
        EditText edtSoDienThoai = findViewById(R.id.edt_sodienthoai);
        TextView tvNgaySinh = findViewById(R.id.tv_ngaysinh);
        TextView tvGioiTinh = findViewById(R.id.tv_gioitinh);
        EditText edtEmail = findViewById(R.id.edt_email);
        TextView tvTinhThanh = findViewById(R.id.tv_tinhthanh);
        TextView tvQuanHuyen = findViewById(R.id.tv_quan_huyen);
        TextView tvPhuong = findViewById(R.id.tv_phuong);

        edtTen. setText("Nguyễn Phú Quí");
        edtSoDienThoai.setText("0961 08 0123");
        tvNgaySinh.setText("05/01/1994");
        tvGioiTinh.setText("Nam");
        edtEmail.setText("phuquyit@gmail.com");
        tvTinhThanh.setText("Bắc Ninh");
        tvQuanHuyen.setText("Thuận Thành");
        tvPhuong.setText("Gia Đông");


=======
        setContentView(R.layout.taikhoan_layout);
>>>>>>> 8252cfee3ac9a2a26188a1ddeb9ea6d289ef70da
    }
}
