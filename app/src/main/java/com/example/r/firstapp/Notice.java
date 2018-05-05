package com.example.r.firstapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Notice extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_notice, container, false);
        RecyclerView rv=(RecyclerView)rootView.findViewById(R.id.recycleview);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        int[] data={R.drawable.offer1,R.drawable.offer2,R.drawable.offer3,
                R.drawable.offer4,R.drawable.offer5,R.drawable.offer6,R.drawable.offer7,
                R.drawable.offer8,R.drawable.offer9,R.drawable.offer10,R.drawable.offer11,
                R.drawable.offer12,R.drawable.offer13,R.drawable.offer14,R.drawable.offer15,R.drawable.offer16};
        myadapter adapter=new myadapter(data);
        rv.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }
}