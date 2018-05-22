package com.example.r.firstapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Play extends Fragment implements View.OnClickListener {

    ImageView i1,i2,i3,i4,i5,i6;
    ImageView img1,img2,img3,img4,img5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview=inflater.inflate(R.layout.fragment_play,container,false);
        // Inflate the layout for this fragment

        i1=(ImageView)rootview.findViewById(R.id.bag);
        i2=(ImageView)rootview.findViewById(R.id.tut);
        i3=(ImageView)rootview.findViewById(R.id.gift);
        i4=(ImageView)rootview.findViewById(R.id.email);
        i5=(ImageView)rootview.findViewById(R.id.add);
        i6=(ImageView)rootview.findViewById(R.id.search);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);

        img1=(ImageView)rootview.findViewById(R.id.lobby);
        img2=(ImageView)rootview.findViewById(R.id.global);
        img3=(ImageView)rootview.findViewById(R.id.home);
        img4=(ImageView)rootview.findViewById(R.id.league);
        img5=(ImageView)rootview.findViewById(R.id.play);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);

        return rootview;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.lobby:
                Toast.makeText(v.getContext(),"Lobby Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),lobby.class));

                break;
            case R.id.global:
                Toast.makeText(v.getContext(),"Global Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),global.class));
                break;
            case R.id.home:
                Toast.makeText(v.getContext(),"Home Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),home.class));
                break;
            case R.id.league:
                Toast.makeText(v.getContext(),"League Clicked",Toast.LENGTH_LONG).show();
                startActivity(new Intent(v.getContext(),league.class));
                break;
            case R.id.play:
                Toast.makeText(v.getContext(),"Play Clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.bag:
                ImageView img;
                View view  = getActivity().getLayoutInflater().inflate(R.layout.backpack, null);
                AlertDialog.Builder alert=new AlertDialog.Builder(view.getContext());
                alert.setView(view);
                final AlertDialog alert0=alert.create();
                alert0.setCanceledOnTouchOutside(true);
                alert0.show();
                img=(ImageView)alert0.findViewById(R.id.close);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert0.dismiss();
                    }
                });
                break;
            case R.id.tut:
                ImageView img1;
                View view1  = getActivity().getLayoutInflater().inflate(R.layout.tutorial, null);
                AlertDialog.Builder alert1=new AlertDialog.Builder(view1.getContext());
                alert1.setView(view1);
                final AlertDialog alert11=alert1.create();
                alert11.setCanceledOnTouchOutside(true);
                alert11.show();
                img=(ImageView)alert11.findViewById(R.id.close);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert11.dismiss();
                    }
                });
                break;
            case R.id.gift:
                ImageView img2;
                View view2  = getActivity().getLayoutInflater().inflate(R.layout.dailymission, null);
                AlertDialog.Builder alert2=new AlertDialog.Builder(view2.getContext());
                alert2.setView(view2);
                final AlertDialog alert22=alert2.create();
                alert22.setCanceledOnTouchOutside(true);
                alert22.show();
                img=(ImageView)alert22.findViewById(R.id.close);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert22.dismiss();
                    }
                });
                break;
            case R.id.email:
                ImageView img3;
                View view3  = getActivity().getLayoutInflater().inflate(R.layout.email, null);
                AlertDialog.Builder alert3=new AlertDialog.Builder(view3.getContext());
                alert3.setView(view3);
                final AlertDialog alert33=alert3.create();
                alert33.setCanceledOnTouchOutside(true);
                alert33.show();
                img=(ImageView)alert33.findViewById(R.id.close);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert33.dismiss();
                    }
                });
                break;
            case R.id.add:
                break;
            case R.id.search:
                ImageView img5;
                View view5  = getActivity().getLayoutInflater().inflate(R.layout.joinclub, null);
                AlertDialog.Builder alert5=new AlertDialog.Builder(view5.getContext());
                alert5.setView(view5);
                final AlertDialog alert55=alert5.create();
                alert55.setCanceledOnTouchOutside(true);
                alert55.show();
                img=(ImageView)alert55.findViewById(R.id.close);
                img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert55.dismiss();
                    }
                });
                break;
        }
    }
}
