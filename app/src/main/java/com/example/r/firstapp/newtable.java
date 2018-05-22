package com.example.r.firstapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class newtable extends AppCompatActivity implements View.OnClickListener {

    TextView Blinds,BuyIn,time,Blindsplo,BuyInplo,timeplo,Blindssng,BuyInsng,startsng;
    SeekBar seek,seek1,seek2,seekplo,seekplo1,seekplo2,seeksng,seeksng1,seeksng2;
    int progress,progress1,progress2,ploprogress,ploprogress1,ploprogress2,sngprogress,sngprogress1,sngprogress2;
    Spinner spin,spin1,plospin,plospin1;

    TextView tvnlh,tvplo,tvsng;

    ImageView close;

    LinearLayout llnlh,llplo,llsng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtable);

        close=(ImageView)findViewById(R.id.close);

        close.setOnClickListener(this);

        tvnlh=(TextView)findViewById(R.id.TVNLH);
        tvplo=(TextView)findViewById(R.id.TVPLO);
        tvsng=(TextView)findViewById(R.id.TVSNG);

        llnlh=(LinearLayout)findViewById(R.id.LLNLH);
        llplo=(LinearLayout)findViewById(R.id.LLPLO);
        llsng=(LinearLayout)findViewById(R.id.LLSNG);


        tvnlh.setOnClickListener(this);
        tvplo.setOnClickListener(this);
        tvsng.setOnClickListener(this);



        spin=(Spinner)findViewById(R.id.spinner);
        spin1=(Spinner)findViewById(R.id.spinner1);

        List<String> list1=new ArrayList<String>();
        list1.add("3 BBs");
        list1.add("2 BBs");
        list1.add("1 BBs");
        list1.add("0.5 BBs");

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list1);
        spin1.setAdapter(adapter1);

        List<String> list=new ArrayList<String>();
        list.add("5%");
        list.add("3%");
        list.add("2%");
        list.add("Pot Free");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        spin.setAdapter(adapter);


        time=(TextView)findViewById(R.id.TVTime);
        Blinds=(TextView)findViewById(R.id.TVBlinds);
        BuyIn=(TextView)findViewById(R.id.TVBuyin);

        seek=(SeekBar)findViewById(R.id.seek);
        seek1=(SeekBar)findViewById(R.id.seek1);
        seek2=(SeekBar)findViewById(R.id.seek2);

        progress=seek.getProgress();
        progress1=seek1.getProgress();
        progress2=seek2.getProgress();

        Blinds.setText("Blinds :"+progress);

        BuyIn.setText("Buy-In :"+progress1);

        time.setText("Time :"+progress2);

        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                time.setText("Time :"+progress+" Hrs");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //BuyIn.setText("Buy-In"+progress1);
                BuyIn.setText("Buy-In :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Blinds.setText("Blinds :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        plospin=(Spinner)findViewById(R.id.PLOspinner);
        plospin1=(Spinner)findViewById(R.id.PLOspinner1);

        List<String> plolist1=new ArrayList<String>();
        plolist1.add("3 BBs");
        plolist1.add("2 BBs");
        plolist1.add("1 BBs");
        plolist1.add("0.5 BBs");

        ArrayAdapter<String> ploadapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,plolist1);
        plospin1.setAdapter(ploadapter1);

        List<String> plolist=new ArrayList<String>();
        plolist.add("5%");
        plolist.add("3%");
        plolist.add("2%");
        plolist.add("Pot Free");

        ArrayAdapter<String> ploadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,plolist);
        plospin.setAdapter(ploadapter);


        timeplo=(TextView)findViewById(R.id.TVPLOTime);
        Blindsplo=(TextView)findViewById(R.id.TVPLOBlinds);
        BuyInplo=(TextView)findViewById(R.id.TVPLOBuyin);

        seekplo=(SeekBar)findViewById(R.id.PLOseek);
        seekplo1=(SeekBar)findViewById(R.id.PLOseek1);
        seekplo2=(SeekBar)findViewById(R.id.PLOseek2);

        ploprogress=seekplo.getProgress();
        ploprogress1=seekplo1.getProgress();
        ploprogress2=seekplo2.getProgress();

        Blindsplo.setText("Blinds :"+ploprogress);

        BuyInplo.setText("Buy-In :"+ploprogress1);

        timeplo.setText("Time :"+ploprogress2);


        seekplo2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                timeplo.setText("Time :"+progress+" Hrs");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekplo1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //BuyIn.setText("Buy-In"+progress1);
                BuyInplo.setText("Buy-In :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekplo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Blindsplo.setText("Blinds :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        startsng=(TextView)findViewById(R.id.TVSNGStart);
        Blindssng=(TextView)findViewById(R.id.TVSNGBlinds);
        BuyInsng=(TextView)findViewById(R.id.TVSNGBuyin);

        seeksng=(SeekBar)findViewById(R.id.SNGseek);
        seeksng1=(SeekBar)findViewById(R.id.SNGseek1);
        seeksng2=(SeekBar)findViewById(R.id.SNGseek3);

        sngprogress=seeksng.getProgress();
        sngprogress1=seeksng1.getProgress();
        sngprogress2=seeksng2.getProgress();

        Blindssng.setText("Blinds :"+sngprogress);

        BuyInsng.setText("Buy-In :"+sngprogress1);

        startsng.setText("Time :"+sngprogress2);


        seeksng2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                startsng.setText("Starting Chips :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seeksng1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //BuyIn.setText("Buy-In"+progress1);
                BuyInsng.setText("Buy-In :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seeksng.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Blindssng.setText("Blinds :"+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });






    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.TVNLH:
                llnlh.setVisibility(View.VISIBLE);
                llplo.setVisibility(View.GONE);
                llsng.setVisibility(View.GONE);
                tvnlh.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.icon));
                tvplo.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                tvsng.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                break;
            case R.id.TVPLO:
                llplo.setVisibility(View.VISIBLE);
                llnlh.setVisibility(View.GONE);
                llsng.setVisibility(View.GONE);
                tvplo.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.icon));
                tvnlh.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                tvsng.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                break;
            case R.id.TVSNG:
                llplo.setVisibility(View.GONE);
                llnlh.setVisibility(View.GONE);
                llsng.setVisibility(View.VISIBLE);
                tvplo.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                tvnlh.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.black));
                tvsng.setBackgroundColor(ContextCompat.getColor(v.getContext(),R.color.icon));
                break;
            case R.id.close:
                this.finish();
                break;
        }

    }
}
