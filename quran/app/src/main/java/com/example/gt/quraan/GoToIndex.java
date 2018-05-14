package com.example.gt.quraan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GoToIndex extends AppCompatActivity {
    private EditText page;
    private Button cancel;
    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_index);


        page = (EditText) findViewById(R.id.page);
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = page.getText().toString().trim();
                if (no.isEmpty()) {
                    Toast.makeText(GoToIndex.this, "ادخل رقم الصفحة اولا", Toast.LENGTH_LONG).show();
                } else {
                    if (Integer.parseInt(no) > 604) {
                        Toast.makeText(GoToIndex.this, "اختر رقم اصغر من 604", Toast.LENGTH_LONG).show();
                    } else {
                        Intent intent = new Intent(GoToIndex.this, ReadByNumber.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("number", no);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                    }

                }
            }

            );


        }

        @Override
        protected void onResume () {
            super.onResume();
            getSupportActionBar().hide();
        }
    }
