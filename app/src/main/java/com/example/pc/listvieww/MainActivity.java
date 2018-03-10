package com.example.pc.listvieww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"Kem Cam", "Kem Dâu", "Kem Khoai Môn", "kem Bơ", "Kem Nho"," Sinh tố bơ","Sinh tố cà chua"};
    String  SubItem[] = {
            "Giá: 30.000đ.",
            "Giá: 35.000đ.",
            "Giá: 30.000đ.",
            "Giá: 45.000đ.",
            "Giá: 45.000đ."};
    int flags[] = {R.drawable.cam_, R.drawable.dau_, R.drawable.mon, R.drawable.bo_, R.drawable.nho,R.drawable.sinhtobo,R.drawable.cachua};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}
