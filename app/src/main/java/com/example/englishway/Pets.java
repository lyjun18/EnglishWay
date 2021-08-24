package com.example.englishway;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DateFormat;
import java.util.Date;

import static android.content.Context.MODE_PRIVATE;

public class Pets extends Drawable{
    String name; //寵物名
    int hunger; //飽足感
    int evolve; //進化次數


    public Pets(String n) {
        name = n;
        hunger = 100;
        evolve = 0;
    }

    public void updateHunger() {

    }

    public void updateEvolve() {
        evolve += 1;
    }

    public int earnMoney() {
        int earned = 0;
        SharedPreferences record = Context.getSharedPreferences("record", 0);
        if (hunger <= 70) {
            return earned;
        }
        Date today = new Date(System.currentTimeMillis());
        String last = record.getString("Date", "錯誤：無法讀取上次日期");
        Date lastDate = DateFormat.parse(last);
        int x = lastDate.compareTo(today);
        earned+= (1+x)*10*x;
        return earned;

    }

    @Override
    public void draw(@NonNull Canvas canvas) {

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
