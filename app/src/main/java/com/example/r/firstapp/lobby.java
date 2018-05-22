package com.example.r.firstapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class lobby extends Activity implements View.OnClickListener {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        ImageView imgVNLH = (ImageView) findViewById(R.id.imgVNLH);
        ImageView imgVPLO = (ImageView) findViewById(R.id.imgVPLO);


        imgVNLH.setOnClickListener(this);
        imgVPLO.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.imgVNLH:
                Toast.makeText(v.getContext(),"NLH Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),nhl.class));
                break;

            case R.id.imgVPLO:
                Toast.makeText(v.getContext(),"PLO Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),plo.class));
                break;
        }

    }
}