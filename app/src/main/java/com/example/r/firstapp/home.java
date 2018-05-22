package com.example.r.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class home extends AppCompatActivity implements View.OnClickListener {

    ImageView IVBack;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        IVBack=(ImageView)findViewById(R.id.IVBack);

        IVBack.setOnClickListener(this);

        start=(Button)findViewById(R.id.startgame);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.IVBack:
                this.finish();
                break;

            case R.id.startgame:
                startActivity(new Intent(this, newtable.class));
                break;
        }
    }
}