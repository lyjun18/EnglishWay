package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化資料
        initData();
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListensers();
    }

    private Button button_work;
    private Button button_pet;

    //取得控制項物件
    private void initViews()
    {
        button_work = (Button)findViewById(R.id.button_work);
        button_pet = (Button)findViewById(R.id.button_pet);
    }

    private void initData()
    {
    }

    //設定監聽事件
    private void setListensers()
    {
        button_work.setOnClickListener(clicWork);
        button_pet.setOnClickListener(clicPet);
    }

    private View.OnClickListener clicWork = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO
        }
    };
    private View.OnClickListener clicPet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO
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
}