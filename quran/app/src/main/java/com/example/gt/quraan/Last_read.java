package com.example.gt.quraan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Last_read extends AppCompatActivity {
    TextView empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_read);
        CustomPagerAdapter mCustomPagerAdapter = new CustomPagerAdapter(this);

        empty = (TextView) findViewById(R.id.empty_txt);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setRotationY(180);

        SharedPreferences shared = getSharedPreferences("Mypref", Context.MODE_PRIVATE);
        int position = shared.getInt("position", 0);
        String key = shared.getString("key","");


        if (key.isEmpty()) {
            empty.setVisibility(View.VISIBLE);
            mViewPager.setVisibility(View.GONE);
        } else {
            mViewPager.setAdapter(mCustomPagerAdapter);
            mViewPager.setCurrentItem(position);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
