package com.example.r.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.saeid.fabloading.LoadingView;

public class loading extends AppCompatActivity {

    LoadingView mLoadingView;
    int a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        a=R.drawable.mtt_th;
        b=R.drawable.c1;
        c=R.drawable.c2;

        mLoadingView = (LoadingView) findViewById(R.id.loading_view);

        mLoadingView.addAnimation(Color.parseColor("#23B177"), a,LoadingView.FROM_LEFT);
        mLoadingView.addAnimation(Color.parseColor("#2ac787"), b,LoadingView.FROM_TOP);
        mLoadingView.addAnimation(Color.parseColor("#23B177"), c,LoadingView.FROM_RIGHT);
        //mLoadingView.addAnimation(Color.parseColor("#2ac787"), d,LoadingView.FROM_BOTTOM);
        mLoadingView.startAnimation();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(loading.this,MainActivity.class));
            }
        },4000);



    }
}