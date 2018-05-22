package com.example.r.firstapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class league extends AppCompatActivity implements View.OnClickListener {

    TextView tvRank,tvReward;
    LinearLayout linlayrank,linlayreward;
    ImageView IVBack,quest,mission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);

        tvRank=(TextView) findViewById(R.id.tvRank);
        tvReward=(TextView) findViewById(R.id.tvReward);

        linlayrank=(LinearLayout)findViewById(R.id.linlayrank);
        linlayreward=(LinearLayout)findViewById(R.id.linlayreward);

        tvRank.setOnClickListener(this);
        tvReward.setOnClickListener(this);


        IVBack=(ImageView)findViewById(R.id.IVBack);
        quest=(ImageView)findViewById(R.id.quest);
        mission=(ImageView)findViewById(R.id.mission);

        IVBack.setOnClickListener(this);
        quest.setOnClickListener(this);
        mission.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.tvRank:
                linlayrank.setVisibility(View.VISIBLE);
                linlayreward.setVisibility(View.GONE);
                tvRank.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.icon));
                tvReward.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                break;

            case R.id.tvReward:
                linlayrank.setVisibility(View.GONE);
                linlayreward.setVisibility(View.VISIBLE);
                tvRank.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                tvReward.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.icon));
                break;

            case R.id.IVBack:
                this.finish();
                break;

            case R.id.quest:
                Toast.makeText(this,"Image Clicked",Toast.LENGTH_LONG).show();
                final Dialog dialog = new Dialog(this);
                View view  = getLayoutInflater().inflate(R.layout.battle, null);
                dialog.setContentView(view);
                dialog.show();
                Button BtnConfrim;
                BtnConfrim=(Button)dialog.findViewById(R.id.BtnConfirm);
                BtnConfrim.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                break;

            case R.id.mission:
                final Dialog dialog1 = new Dialog(this);
                View view1  = getLayoutInflater().inflate(R.layout.mission, null);
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