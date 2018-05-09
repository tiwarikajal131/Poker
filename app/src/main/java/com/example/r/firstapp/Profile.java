package com.example.r.firstapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class Profile extends Fragment implements View.OnClickListener {
    ImageView img1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview=inflater.inflate(R.layout.fragment_profile,container,false);
        img1=(ImageView)rootview.findViewById(R.id.ivpromos);
        img1.setOnClickListener(this);

        // Inflate the layout for this fragment
        return rootview;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ivpromos:
                Toast.makeText(getActivity(),"Image Clicked",Toast.LENGTH_LONG).show();
                Dialog dialog = new Dialog(getActivity());
                View view  = getActivity().getLayoutInflater().inflate(R.layout.promos_custom, null);
                dialog.setContentView(view);
                dialog.show();
                //LayoutInflater inflater=getLayoutInflater();
                //View alert=inflater.inflate(R.layout.promos_custom,null);
                //AlertDialog.Builder alert1=new AlertDialog.Builder(getActivity());
                //alert1.setView(alert);
        }
    }
}
