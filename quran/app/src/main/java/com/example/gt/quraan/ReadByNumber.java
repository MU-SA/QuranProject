package com.example.gt.quraan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ReadByNumber extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ReadByNumber.this, Index.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_by_number);

        RecyclerView pager = (RecyclerView) findViewById(R.id.pager);
        pager.setRotationY(180);
        ArrayList<Page> pages = new ArrayList<>();
        for (int i = 0; i < 604; i++) {
            pages.add(new Page(String.valueOf(i)));
        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        PageAdapter pageAdapter = new PageAdapter(getApplicationContext(), pages);
        String no = getIntent().getStringExtra("number");
        pager.setLayoutManager(manager);
        pager.setAdapter(pageAdapter);
        pager.scrollToPosition(Integer.parseInt(no) - 1);
        pageAdapter.notifyDataSetChanged();

    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
