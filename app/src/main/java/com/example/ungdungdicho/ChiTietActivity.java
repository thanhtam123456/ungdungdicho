package com.example.ungdungdicho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class ChiTietActivity extends AppCompatActivity {
    TextView textViewTen ;
    TextView textViewMSSV;
    TextView textViewtenhang2;
    TextView textViewkhoiluong;
    TextView textViewgia;
    TextView textViewdate ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiet);
        onInit();
        onGetIntent();
        Calendar calendar = Calendar.getInstance();
        String currentdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        textViewdate.setText(currentdate);
        

    }

    private void onGetIntent() {
        Intent intent = getIntent();
        model item = (model) intent.getSerializableExtra("CTDS");
        textViewTen.setText(String.valueOf(item.getTen()));
        textViewMSSV.setText(String.valueOf(item.getMssv()));
        textViewtenhang2.setText(String.valueOf(item.getTenHang()));
        textViewkhoiluong.setText(String.valueOf(item.getKhoiluong()));
        textViewgia.setText(String.valueOf(item.getGia()));
    }

    private void onInit() {
        textViewdate = findViewById(R.id.text_date);
        textViewTen = findViewById(R.id.chitiet_tv_ten);
        textViewMSSV = findViewById(R.id.chitiet_tv_mssv );
        textViewtenhang2 = findViewById(R.id.chitiet_tv_tenhang );
        textViewkhoiluong =findViewById(R.id.chitiet_tv_kl );
        textViewgia = findViewById(R.id.chitiet_gia);
    }
}
