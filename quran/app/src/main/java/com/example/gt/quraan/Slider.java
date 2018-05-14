package com.example.gt.quraan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Slider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        ArrayList<Page> pages = new ArrayList<>();
        for (int i = 0; i < 605; i++) {
            pages.add(new Page(String.valueOf(i)));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.pager);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        PageAdapter pagerAdapter = new PageAdapter(getApplicationContext(), pages);
        recyclerView.setAdapter(pagerAdapter);
        recyclerView.setLayoutManager(manager);

        int position = getIntent().getIntExtra("position", 0);
        int index1 = getIntent().getIntExtra("index", 0);
        recyclerView.scrollToPosition(index1 - 1);
        recyclerView.setRotationY(180);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
