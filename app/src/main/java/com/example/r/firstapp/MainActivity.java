package com.example.r.firstapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    ImageView p1,p2;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_shop:
                    Fragment frag1=new Shop();
                    FragmentManager fm1=getFragmentManager();
                    FragmentTransaction ft1=fm1.beginTransaction();
                    ft1.replace(R.id.contain,frag1);
                    ft1.commit();
                    return true;
                case R.id.navigation_notice:
                    Fragment frag2=new Notice();
                    FragmentManager fm2=getFragmentManager();
                    FragmentTransaction ft2=fm2.beginTransaction();
                    ft2.replace(R.id.contain,frag2);
                    ft2.commit();
                    return true;
                case R.id.navigation_game:
                    Fragment frag=new Play();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.contain,frag);
                    ft.commit();
                    return true;
                case R.id.navigation_career:
                    Fragment frag3=new Career();
                    FragmentManager fm3=getFragmentManager();
                    FragmentTransaction ft3=fm3.beginTransaction();
                    ft3.replace(R.id.contain,frag3);
                    ft3.commit();
                    return true;
                case R.id.navigation_profile:
                    Fragment frag4=new Profile();
                    FragmentManager fm4=getFragmentManager();
                    FragmentTransaction ft4=fm4.beginTransaction();
                    ft4.replace(R.id.contain,frag4);
                    ft4.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Fragment frag=new Play();
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.contain,frag);
                    ft.commit();


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        mTextMessage = (TextView) findViewById(R.id.message);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        p1=(ImageView)findViewById(R.id.plus1);
        p2=(ImageView)findViewById(R.id.plus2);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag1=new Shop();
                FragmentManager fm1=getFragmentManager();
                FragmentTransaction ft1=fm1.beginTransaction();
                ft1.replace(R.id.contain,frag1);
                ft1.commit();
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag1=new Shop();
                FragmentManager fm1=getFragmentManager();
                FragmentTransaction ft1=fm1.beginTransaction();
                ft1.replace(R.id.contain,frag1);
                ft1.commit();
            }
        });
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("PPPoker")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
    }
}


class BottomNavigationViewHelper {
    @SuppressLint("RestrictedApi")
    public static void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }
}


