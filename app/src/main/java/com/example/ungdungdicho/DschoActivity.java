package com.example.ungdungdicho;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DschoActivity extends AppCompatActivity {
    ListView listView;
    CheckBox checkBox_tv;
    static  List<model> modelList;
    static DschoAdapter adapter;
    TextView textViewContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dscho);
        onInit();
        ontSetValue();
        adapter = new DschoAdapter(DschoActivity.this,R.layout.itemdscho,modelList);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                model item = (model) listView.getItemAtPosition(position);
//               Intent intent = new Intent(DschoActivity.this,ChiTietActivity.class);
//               intent.putExtra("CTDS",item);
//               startActivity(intent);
//            }
//        });
        textViewContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    private void ontSetValue() {
        modelList = new ArrayList<>();
        modelList.add(new model("Rau","kilogam","5kg","10000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Thịt","kilogam","10kg","100000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Cá","kilogam","2kg","40000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Tôm","kilogam","11kg","60000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Gạo","kilogam","60kg","30000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Hành lá","kilogam","2kg","2000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Hành phi","kilogam","2kg","1000đ","Rau củ cải","Nguyen thanh tam","1606020055"));
        modelList.add(new model("Củ","kilogam","10kg","10000đ","Rau củ cải","Nguyen thanh tam","1606020055"));

    }

    private void onInit() {
        listView = findViewById(R.id.lvdscho);
        textViewContent = findViewById(R.id.tv_content);
        checkBox_tv = findViewById(R.id.checkbox_tv);

    }



}
