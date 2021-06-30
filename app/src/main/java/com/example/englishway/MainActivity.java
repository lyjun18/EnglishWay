package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化資料
        initData();
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListeners();
    }

    private Button button_work;
    private Button button_pet;

    //取得控制項物件
    private void initViews()
    {
        button_work = findViewById(R.id.button_work);
        button_pet = findViewById(R.id.button_pet);
    }

    private void initData()
    {
    }

    //設定監聽事件
    private void setListeners()
    {
        button_work.setOnClickListener(clicWork);
        button_pet.setOnClickListener(clicPet);
    }

    private View.OnClickListener clicWork = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, WorkActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener clicPet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, PetActivity.class);
            startActivity(intent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickWords(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, WordsActivity.class);
        startActivity(intent);
    }
}