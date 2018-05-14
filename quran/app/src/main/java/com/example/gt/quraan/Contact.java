package com.example.gt.quraan;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Contact extends AppCompatActivity {
    TextView top_contact, mail, web, tabianar, tabianen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        top_contact = (TextView) findViewById(R.id.contact_top);
        mail = (TextView) findViewById(R.id.mail);
        web = (TextView) findViewById(R.id.web);
        tabianar = (TextView) findViewById(R.id.tabian_ar);

        // Font path
        String fontPath = "fonts/hafs.otf";
        String fontPath2 = "fonts/gothhicc.TTF";
        String fontPath3 = "fonts/tabian.TTF";
        String fontPath4 = "fonts/tabianar.ttf";




        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        Typeface tf2 = Typeface.createFromAsset(getAssets(), fontPath2);
        Typeface tf3 = Typeface.createFromAsset(getAssets(), fontPath3);
        Typeface tf4 = Typeface.createFromAsset(getAssets(), fontPath4);


        // Applying font
        top_contact.setTypeface(tf);
        mail.setTypeface(tf2);
        web.setTypeface(tf2);
        tabianar.setTypeface(tf4);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "yousefsubhi@yahoo.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "write your inquiry here...");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
