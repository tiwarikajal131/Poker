package com.example.r.firstapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Shop extends Fragment implements View.OnClickListener {

    TextView txtVDiamond,txtVItem;
    RelativeLayout rlItemLayout,rlDiamondLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_shop, container, false);

        txtVDiamond = v.findViewById(R.id.txtVDiamond);
        txtVItem = v.findViewById(R.id.txtVItem);

        txtVDiamond.setOnClickListener(this);
        txtVItem.setOnClickListener(this);

        rlItemLayout = v.findViewById(R.id.rlItemLayout);
        rlDiamondLayout = v.findViewById(R.id.rlDiamondLayout);
        return v;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txtVDiamond:
                rlDiamondLayout.setVisibility(View.VISIBLE);
                rlItemLayout.setVisibility(View.GONE);
                txtVItem.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorBlack));
                txtVDiamond.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorYellowDark));
                break;

            case R.id.txtVItem:
                rlDiamondLayout.setVisibility(View.GONE);
                rlItemLayout.setVisibility(View.VISIBLE);
                txtVDiamond.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorBlack));
                txtVItem.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorYellowDark));
                break;
        }
    }
}
