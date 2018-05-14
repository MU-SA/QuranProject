package com.example.gt.quraan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class dory_infoo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dory_infoo);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
