package com.example.r.firstapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class myadapter extends RecyclerView.Adapter<myadapter.myholder> {
    int[] data;

    public myadapter(int[] data){
        this.data=data;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recycledata,parent,false);
        return new myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
        int Data=data[position];
        holder.img.setImageResource(Data);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class myholder extends RecyclerView.ViewHolder{

        ImageView img;
        public myholder(View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.data);
        }
    }
}