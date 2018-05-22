package com.example.r.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class global extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper slider;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);

        back=(ImageView)findViewById(R.id.IVBack);

        back.setOnClickListener(this);

        int[] image={R.drawable.offer1,R.drawable.offer2,R.drawable.offer3};

        slider=(ViewFlipper)findViewById(R.id.slider);

        for (int i=0;i<image.length;i++)
        {
            flip(image[i]);
        }
    }

    public void flip(int img){

        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);
        slider.addView(imageView);
        slider.setFlipInterval(4000);
        slider.setAutoStart(true);
        slider.setInAnimation(this, android.R.anim.slide_in_left);
        slider.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.IVBack:
                this.finish();
                break;
        }
    }
}
