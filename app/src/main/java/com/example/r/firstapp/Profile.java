package com.example.r.firstapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Profile extends Fragment implements View.OnClickListener {
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img7;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_profile,container,false);
        img2=(ImageView)rootview.findViewById(R.id.ivpie);
        img2.setOnClickListener(this);
        img3=(ImageView)rootview.findViewById(R.id.ivsetting);
        img3.setOnClickListener(this);
        img4=(ImageView)rootview.findViewById(R.id.ivcontact);
        img4.setOnClickListener(this);
        img7=(ImageView)rootview.findViewById(R.id.head1);
        img7.setOnClickListener(this);

        return rootview;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.ivpie:
            {
                View view2=getActivity().getLayoutInflater().inflate(R.layout.homegame_custom, null);
                AlertDialog.Builder alert2=new AlertDialog.Builder(view2.getContext());
                TextView title2= new TextView(view2.getContext());
                alert2.setView(view2);
                final AlertDialog alert_2= alert2.create();
                alert_2.show();
                ImageView img2=(ImageView) alert_2.findViewById(R.id.close1);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert_2.dismiss();
                    }
                });
                break;
            }

            case R.id.ivsetting: {
                View view3 = getActivity().getLayoutInflater().inflate(R.layout.settings_custom, null);
                AlertDialog.Builder alert3 = new AlertDialog.Builder(view3.getContext());
                TextView title3 = new TextView(view3.getContext());
                alert3.setView(view3);
                final AlertDialog alert_3 = alert3.create();
                alert_3.show();
                final ImageView img1=(ImageView)alert_3.findViewById(R.id.IVtoggle);
                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        img1.setActivated(!img1.isActivated());
                    }
                });
                ImageView img2 = (ImageView) alert_3.findViewById(R.id.close);
                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert_3.dismiss();
                    }
                });
                break;
            }

            case R.id.ivcontact: {
                View view4 = getActivity().getLayoutInflater().inflate(R.layout.contact_custom, null);
                AlertDialog.Builder alert4 = new AlertDialog.Builder(view4.getContext());
                TextView title4 = new TextView(view4.getContext());
                alert4.setView(view4);
                // alert.setIcon(window_1);
                final AlertDialog alert_4 = alert4.create();
                alert_4.show();
                ImageView img4 = (ImageView) alert_4.findViewById(R.id.close);
                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert_4.dismiss();
                    }
                });
                break;
            }

            case R.id.head1: {
                View view7 = getActivity().getLayoutInflater().inflate(R.layout.profile_modification, null);
                AlertDialog.Builder alert7 = new AlertDialog.Builder(view7.getContext());
                TextView title = new TextView(view7.getContext());
                alert7.setView(view7);
                final AlertDialog alert_7 = alert7.create();
                alert_7.show();
                ImageView img7 = (ImageView) alert_7.findViewById(R.id.close);
                img7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alert_7.dismiss();
                    }
                });

                break;
            }

        }
    }
}
