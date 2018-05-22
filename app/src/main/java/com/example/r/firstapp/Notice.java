package com.example.r.firstapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Movie;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Notice extends Fragment implements myadapter.OnItemClicked {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_notice, container, false);
        RecyclerView rv=(RecyclerView)rootView.findViewById(R.id.recycleview);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        int[] data={R.drawable.offer1,R.drawable.offer2,R.drawable.offer3,
                R.drawable.offer4,R.drawable.offer5,R.drawable.offer6,R.drawable.offer7,
                R.drawable.offer8,R.drawable.offer9,R.drawable.offer10,R.drawable.offer11,
                R.drawable.offer12,R.drawable.offer13,R.drawable.offer14,R.drawable.offer15,
                R.drawable.offer16};
        myadapter adapter=new myadapter(data,this);
        rv.setAdapter(adapter);
        adapter.setOnClick(this);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onItemClick(int position) {
        //Toast.makeText(getActivity(),"View Clicked"+position,Toast.LENGTH_LONG).show();
        ImageView img;
        View view  = getActivity().getLayoutInflater().inflate(R.layout.offer1, null);
        AlertDialog.Builder alert=new AlertDialog.Builder(view.getContext());
        TextView title = new TextView(view.getContext());
        alert.setView(view);
        final AlertDialog alert1=alert.create();
        alert1.setCanceledOnTouchOutside(true);
        alert1.show();
        img=(ImageView)alert1.findViewById(R.id.close);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert1.dismiss();
            }
        });

        //Dialog dialog = new Dialog(getActivity());
        //View view  = getActivity().getLayoutInflater().inflate(R.layout.noticedialog, null);
        //dialog.setContentView(view);
        //dialog.show();
    }
}