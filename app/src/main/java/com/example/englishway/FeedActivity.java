package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        //取得控制項物件
        initViews();
        //顯示寵物
        showResults();
        //設定監聽事件
        setListeners();
    }
    private TextView pet_name;

    private void initViews() {
        pet_name = findViewById(R.id.textView);
    }

    private void setListeners() {}

    private void showResults() {
        try {
            Bundle bundle = this.getIntent().getExtras();
            String petID = bundle.getString("PET_NAME");
            pet_name.setText(petID);
        } catch (Exception obj) {
            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
        }
    }
}