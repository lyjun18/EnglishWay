package com.example.englishway;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Pets{
    String name; //寵物名
    int hunger; //飽足感
    int evolve; //進化次數

    public Pets(String n){
        name = n;
        hunger = 100;
        evolve = 0;
    }

    public void updateHunger(){

    }
    public void updateEvolve(){
        evolve+=1;
    }
}
