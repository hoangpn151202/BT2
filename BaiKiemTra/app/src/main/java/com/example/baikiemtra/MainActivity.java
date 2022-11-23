package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RelativeLayout logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rcv_list);
        logout = (RelativeLayout) findViewById(R.id.logout);

        ArrayList<CongAn> congAnArrayList = new ArrayList<>();
        congAnArrayList.add(new CongAn(R.drawable.ca1,"Nguyễn Thị Mai", "Thiếu úy", "Đà Nẵng", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca2,"Nguyễn Văn Long", "Thiếu úy", "Quảng Nam", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca3,"Trần Văn Thời", "Trung úy", "Quảng Ngãi", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca4,"Lý Thị Lan", "Thiếu úy", "Quảng Ngãi", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca5,"Lê Công Trung", "Thiếu úy", "Đà Nẵng", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca2,"Lý Văn Nam", "Trung úy", "Huế", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca1,"Lê Thị Ánh Tuyết", "Thiếu úy", "Đà Nẵng", "Việt Nam","5 sao"));
        congAnArrayList.add(new CongAn(R.drawable.ca3,"Nguyễn Văn Quyết", "Thượng  úy", "Đà Nẵng", "Việt Nam","5 sao"));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CongAnAdapter(congAnArrayList, this));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DangNhap.class));
            }
        });
    }
}