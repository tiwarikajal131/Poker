package com.example.r.firstapp;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class nhl extends Activity implements View.OnClickListener {

    ImageView IVBack,imgVTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhl);


        IVBack=(ImageView)findViewById(R.id.IVBack);
        imgVTips=(ImageView)findViewById(R.id.imgVTips);

        IVBack.setOnClickListener(this);
        imgVTips.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.IVBack:
                this.finish();
                break;

            case R.id.imgVTips:
                final Dialog dialog1 = new Dialog(this);
                View view1  = getLayoutInflater().inflate(R.layout.tips, null);
                dialog1.setContentView(view1);
                dialog1.show();
                ImageView close;
                close=(ImageView) dialog1.findViewById(R.id.close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });
                break;
        }
    }
}
