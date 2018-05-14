package com.example.gt.quraan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Index extends AppCompatActivity {
    RecyclerView recyclerView;
    public IndeAdapter adapter;
    java.util.List<Soraa> List;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(Index.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List = new ArrayList<>();
        adapter = new IndeAdapter(Index.this, List);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(Index.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        getData();

    }

    public void getData() {
        Soraa soraa = new Soraa("الفاتحة", 1);
        List.add(soraa);

        soraa = new Soraa("البقرة", 2);
        List.add(soraa);

        soraa = new Soraa(" آل عمران", 50);
        List.add(soraa);

        soraa = new Soraa("النساء", 77);
        List.add(soraa);

        soraa = new Soraa("المائدة", 106);
        List.add(soraa);

        soraa = new Soraa("الأنعام", 128);
        List.add(soraa);

        soraa = new Soraa("الأعراف", 151);
        List.add(soraa);

        soraa = new Soraa("الأنفال", 177);
        List.add(soraa);

        soraa = new Soraa("التوبة", 187);
        List.add(soraa);

        soraa = new Soraa("يونس", 208);
        List.add(soraa);

        soraa = new Soraa("هود", 221);
        List.add(soraa);

        soraa = new Soraa("يوسف", 235);
        List.add(soraa);

        soraa = new Soraa("الرعد", 249);
        List.add(soraa);

        soraa = new Soraa("إبراهيم", 255);
        List.add(soraa);

        soraa = new Soraa("الحجر", 262);
        List.add(soraa);

        soraa = new Soraa("النحل", 267);
        List.add(soraa);

        soraa = new Soraa("الإسراء", 282);
        List.add(soraa);

        soraa = new Soraa("الكهف", 293);
        List.add(soraa);

        soraa = new Soraa("مريم", 305);
        List.add(soraa);

        soraa = new Soraa("طه", 312);
        List.add(soraa);

        soraa = new Soraa("الأنبياء", 322);
        List.add(soraa);

        soraa = new Soraa("الحج", 331);
        List.add(soraa);

        soraa = new Soraa("المؤمنون", 341);
        List.add(soraa);

        soraa = new Soraa("النور", 349);
        List.add(soraa);

        soraa = new Soraa("الفرقان", 359);
        List.add(soraa);

        soraa = new Soraa("الشعراء", 366);
        List.add(soraa);

        soraa = new Soraa("النمل", 376);
        List.add(soraa);

        soraa = new Soraa("القصص", 385);
        List.add(soraa);

        soraa = new Soraa("العنكبوت", 396);
        List.add(soraa);

        soraa = new Soraa("الروم", 404);
        List.add(soraa);

        soraa = new Soraa("لقمان", 411);
        List.add(soraa);

        soraa = new Soraa("السجدة", 414);
        List.add(soraa);

        soraa = new Soraa("الأحزاب", 417);
        List.add(soraa);

        soraa = new Soraa("سبأ", 428);
        List.add(soraa);

        soraa = new Soraa("فاطر", 434);
        List.add(soraa);

        soraa = new Soraa("يس", 440);
        List.add(soraa);

        soraa = new Soraa("الصافات", 445);
        List.add(soraa);

        soraa = new Soraa("ص", 452);
        List.add(soraa);

        soraa = new Soraa("الزمر", 458);
        List.add(soraa);

        soraa = new Soraa("غافر", 467);
        List.add(soraa);

        soraa = new Soraa("فصلت", 477);
        List.add(soraa);

        soraa = new Soraa("الشورى", 483);
        List.add(soraa);

        soraa = new Soraa("الزخرف", 489);
        List.add(soraa);

        soraa = new Soraa("الدخان", 496);
        List.add(soraa);

        soraa = new Soraa("الجاثية", 498);
        List.add(soraa);

        soraa = new Soraa("الأحقاف", 502);
        List.add(soraa);

        soraa = new Soraa("محـمد", 506);
        List.add(soraa);

        soraa = new Soraa("الفتح", 511);
        List.add(soraa);

        soraa = new Soraa("الحجرات", 515);
        List.add(soraa);

        soraa = new Soraa("ق", 518);
        List.add(soraa);


        soraa = new Soraa("الذاريات", 520);
        List.add(soraa);

        soraa = new Soraa("الطور", 523);
        List.add(soraa);

        soraa = new Soraa("النجم", 525);
        List.add(soraa);

        soraa = new Soraa("القمر", 528);
        List.add(soraa);

        soraa = new Soraa("الرحمن", 531);
        List.add(soraa);

        soraa = new Soraa("الواقعة", 534);
        List.add(soraa);

        soraa = new Soraa("الحديد", 537);
        List.add(soraa);

        soraa = new Soraa("المجادلة", 542);
        List.add(soraa);

        soraa = new Soraa("الحشر", 545);
        List.add(soraa);

        soraa = new Soraa("الممتحنة", 548);
        List.add(soraa);

        soraa = new Soraa("الصف", 551);
        List.add(soraa);

        soraa = new Soraa("الجمعة", 553);
        List.add(soraa);

        soraa = new Soraa("المنافقون", 554);
        List.add(soraa);

        soraa = new Soraa("التغابن", 555);
        List.add(soraa);

        soraa = new Soraa("الطلاق", 557);
        List.add(soraa);

        soraa = new Soraa("التحريم", 560);
        List.add(soraa);

        soraa = new Soraa("الملك", 562);
        List.add(soraa);

        soraa = new Soraa("القلم", 564);
        List.add(soraa);

        soraa = new Soraa("الحاقة", 566);
        List.add(soraa);

        soraa = new Soraa("المعارج", 568);
        List.add(soraa);

        soraa = new Soraa("نوح", 570);
        List.add(soraa);

        soraa = new Soraa("الجن", 572);
        List.add(soraa);

        soraa = new Soraa("المزمل", 574);
        List.add(soraa);

        soraa = new Soraa("المدثر", 575);
        List.add(soraa);

        soraa = new Soraa("القيامة",577);
        List.add(soraa);

        soraa = new Soraa("الإنسان",578);
        List.add(soraa);

        soraa = new Soraa("المرسلات",580);
        List.add(soraa);

        soraa = new Soraa("النبأ",582);
        List.add(soraa);

        soraa = new Soraa("النازعات",583);
        List.add(soraa);

        soraa = new Soraa("عبس",584);
        List.add(soraa);

        soraa = new Soraa("التكوير",586);
        List.add(soraa);

        soraa = new Soraa("الانفطار",586);
        List.add(soraa);

        soraa = new Soraa("المطففين",587);
        List.add(soraa);

        soraa = new Soraa("الانشقاق",589);
        List.add(soraa);

        soraa = new Soraa("البروج",590);
        List.add(soraa);

        soraa = new Soraa("الطارق",590);
        List.add(soraa);

        soraa = new Soraa("الأعلى",591);
        List.add(soraa);

        soraa = new Soraa("الغاشية",592);
        List.add(soraa);

        soraa = new Soraa("الفجر",593);
        List.add(soraa);

        soraa = new Soraa("البلد",594);
        List.add(soraa);

        soraa = new Soraa("الشمس",594);
        List.add(soraa);

        soraa = new Soraa("الليل",595);
        List.add(soraa);

        soraa = new Soraa("الضحى",596);
        List.add(soraa);

        soraa = new Soraa("الشرح",596);
        List.add(soraa);

        soraa = new Soraa("التين",597);
        List.add(soraa);

        soraa = new Soraa("العلق",597);
        List.add(soraa);

        soraa = new Soraa("القدر",598);
        List.add(soraa);

        soraa = new Soraa("البينة",598);
        List.add(soraa);

        soraa = new Soraa("الزلزلة",599);
        List.add(soraa);

        soraa = new Soraa("العاديات",599);
        List.add(soraa);

        soraa = new Soraa("القارعة",600);
        List.add(soraa);

        soraa = new Soraa("التكاثر",600);
        List.add(soraa);

        soraa = new Soraa("العصر",601);
        List.add(soraa);


        soraa = new Soraa("الهمزة",601);
        List.add(soraa);

        soraa = new Soraa("قريش",602);
        List.add(soraa);

        soraa = new Soraa("الماعون",602);
        List.add(soraa);


        soraa = new Soraa("الكوثر",602);
        List.add(soraa);

        soraa = new Soraa("الكافرون",603);
        List.add(soraa);

        soraa = new Soraa("النصر",603);
        List.add(soraa);

        soraa = new Soraa("المسد",603);
        List.add(soraa);

        soraa = new Soraa("الإخلاص",604);
        List.add(soraa);

        soraa = new Soraa("الفلق",604);
        List.add(soraa);

        soraa = new Soraa("الناس",604);
        List.add(soraa);





        adapter.notifyDataSetChanged();


    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().hide();
    }
}
