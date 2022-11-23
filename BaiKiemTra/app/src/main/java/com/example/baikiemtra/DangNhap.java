package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DangNhap extends AppCompatActivity {
    EditText usertxt, passtxt;
    Button signinbtn;
    TextView signuptv;
    CheckBox ckb_login;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        usertxt = (EditText) findViewById(R.id.usertxt);
        passtxt = (EditText) findViewById(R.id.passtxt);
        signinbtn = (Button) findViewById(R.id.signinbtn);
        signuptv = (TextView) findViewById(R.id.signuptv);
        ckb_login = (CheckBox) findViewById(R.id.ckb_login);

        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);

        usertxt.setText(sharedPreferences.getString("taikhoan", ""));
        passtxt.setText(sharedPreferences.getString("matkhau", ""));
        ckb_login.setChecked(sharedPreferences.getBoolean("checked", false));

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usertxt.getText().toString().trim();
                String password = passtxt.getText().toString().trim();
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(DangNhap.this, "Nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.equals("abc") && password.equals("123")) {
                        Toast.makeText(DangNhap.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                        if (ckb_login.isChecked()) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString("taikhoan", username);
                            editor.putString("matkhau", password);
                            editor.putBoolean("checked", true);
                            editor.commit();
                        } else {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.remove("taikhoan");
                            editor.remove("matkhau");
                            editor.remove("checked");
                            editor.commit();
                        }
                        Intent intent = new Intent(DangNhap.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(DangNhap.this, "Loi dang nhap", Toast.LENGTH_SHORT).show();
                        usertxt.setText("");
                        passtxt.setText("");
                    }
                }
            }
        });
    }
}