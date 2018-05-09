package com.example.r.firstapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.r.firstapp.R.drawable.window_1;
import static com.example.r.firstapp.R.id.left;
import static com.example.r.firstapp.R.id.tv_promo3_custom;

public class Profile extends Fragment implements View.OnClickListener {
    ImageView img1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_profile,container,false);
        // Inflate the layout for this fragment
        img1=(ImageView)rootview.findViewById(R.id.ivpromos);
        img1.setOnClickListener(this);
        return rootview;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.ivpromos: {
                Toast.makeText(getActivity(), "Image Clicked", Toast.LENGTH_LONG).show();
                View view = getActivity().getLayoutInflater().inflate(R.layout.promos_custom, null);
                TextView textView1 = view.findViewById(R.id.tv_promo1_custom);
                TextView textView2 = view.findViewById(R.id.tv_promo2_custom);
                TextView textView3 = view.findViewById(R.id.tv_promo3_custom);
                AlertDialog.Builder alert = new AlertDialog.Builder(view.getContext());
                TextView title = new TextView(view.getContext());
                //title.setText("Promos");
                //title.setTextColor(getResources().getColor(R.color.whiteicon));
                //title.setPadding(10,10,10,10);
                //alert.setCustomTitle(title);
                // title.setGravity(Gravity.CENTER);
                alert.setView(view);
                // alert.setIcon(window_1);
                final AlertDialog alert1 = alert.create();
                alert1.show();
                ImageView img2 = (ImageView) alert1.findViewById(R.id.close);
                ImageView img1 = (ImageView) alert1.findViewById(R.id.buttonclick);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert1.dismiss();
                    }
                });
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert1.dismiss();
                    }
                });
                break;
            }
                //Dialog dialog=new Dialog(getActivity());
                //View view=getActivity().getLayoutInflater().inflate(R.layout.promos_custom,null);
                //dialog.setContentView(view);
                //dialog.show();
                //dialog.setTitle("Promos");


            case R.id.ivcontact: {
                Toast.makeText(getActivity(), "Image Clicked", Toast.LENGTH_LONG).show();
                View view1 = getActivity().getLayoutInflater().inflate(R.layout.promos_custom, null);
                AlertDialog.Builder alert2 = new AlertDialog.Builder(view1.getContext());
                TextView title2 = new TextView(view1.getContext());
                //title.setText("Promos");
                //title.setTextColor(getResources().getColor(R.color.whiteicon));
                //title.setPadding(10,10,10,10);
                //alert.setCustomTitle(title);
                // title.setGravity(Gravity.CENTER);
                alert2.setView(view1);
                // alert.setIcon(window_1);
                final AlertDialog alert12 = alert2.create();
                alert12.show();
                ImageView img3 = (ImageView) alert12.findViewById(R.id.close);
                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert12.dismiss();
                    }
                });
                break;
            }
                //Dialog dialog=new Dialog(getActivity());
                //View view=getActivity().getLayoutInflater().inflate(R.layout.promos_custom,null);
                //dialog.setContentView(view);
                //dialog.show();
                //dialog.setTitle("Promos");




        }
    }
}
