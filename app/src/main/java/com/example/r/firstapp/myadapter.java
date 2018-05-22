package com.example.r.firstapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.support.v7.widget.RecyclerView.*;
import static java.security.AccessController.getContext;

public class myadapter extends RecyclerView.Adapter<myadapter.myholder> {
    int[] data;
    private Notice context;
    private OnItemClicked onClick;

    public interface OnItemClicked {
        void onItemClick(int position);
    }

    public myadapter(int[] data, Notice context){
        this.data=data;
        this.context=context;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recycledata,parent,false);
        return new myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, final int position) {
        int Data=data[position];
        holder.img.setImageResource(Data);
        holder.img.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onItemClick(position);
            }
        });
    }

    public void setOnClick(OnItemClicked onClick)
    {
        this.onClick=onClick;
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class myholder extends ViewHolder {

        ImageView img;
        public myholder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.data);
        }
    }
}