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


public class Career extends Fragment implements View.OnClickListener {

    TextView txtVData,txtVReport;
    RelativeLayout rlDataTab,llReportTab;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_career, container, false);

        txtVData = v.findViewById(R.id.txtVData);
        txtVReport = v.findViewById(R.id.txtVReport);

        txtVData.setOnClickListener(this);
        txtVReport.setOnClickListener(this);

        rlDataTab = v.findViewById(R.id.rlDataTab);
        llReportTab = v.findViewById(R.id.llReportTab);

        return v;
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.txtVData:
                rlDataTab.setVisibility(View.VISIBLE);
                llReportTab.setVisibility(View.GONE);
                txtVReport.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorBlack));
                txtVData.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorYellowDark));
                break;

            case R.id.txtVReport:
                rlDataTab.setVisibility(View.GONE);
                llReportTab.setVisibility(View.VISIBLE);
                txtVData.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorBlack));
                txtVReport.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorYellowDark));
                break;
        }

    }

}
