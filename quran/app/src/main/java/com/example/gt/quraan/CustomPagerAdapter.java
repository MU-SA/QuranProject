package com.example.gt.quraan;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daasuu.bl.BubbleLayout;
import com.daasuu.bl.BubblePopupHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by g.t on 14/01/2018.
 */

public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private boolean check;
    private TextView sora;
    private String Selected;
    private int X, Y;
    String soraName;
    int layoutPosition;
    ProgressBar pb;

    CustomPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return 604;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    String getAyah(int position) {
        String json;

        StringBuilder ayahData = new StringBuilder();
        try {
            InputStream is = mContext.getAssets().open("Quran.json");
            int size = is.available();
            byte[] file = new byte[size];
            is.read(file);
            is.close();
            json = new String(file, "UTF-8");
            JSONObject main = new JSONObject(json);
            JSONObject data = main.getJSONObject("data");
            JSONArray surahs = data.getJSONArray("surahs");

            for (int i = 0; i < surahs.length(); i++) {
                JSONArray ayahs = surahs.getJSONObject(i).getJSONArray("ayahs");
                for (int j = 0; j < ayahs.length(); j++) {
                    if (ayahs.getJSONObject(j).getInt("page") == position) {
                        ayahData.append(ayahs.getJSONObject(j).getString("text"));
                        ayahData.append(" ").append("\uFD3F")
                                .append(ayahs.getJSONObject(j).getInt("numberInSurah")).append("\uFD3E")
                                .append(" ");
                        soraName = surahs.getJSONObject(i).getString("englishName");
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ayahData.toString();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        final View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        final Button button = itemView.findViewById(R.id.button);
        final Button hafs = itemView.findViewById(R.id.hafs);
        Button last_read = itemView.findViewById(R.id.bookmark);
        Button name = itemView.findViewById(R.id.name);
        Button number = itemView.findViewById(R.id.number);
        number.setText(String.valueOf(position + 1));
        sora = itemView.findViewById(R.id.soraa);
        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/UthmanicHafs.otf");
        sora.setTypeface(typeface);
        pb = itemView.findViewById(R.id.pb);
        layoutPosition = position;

        sora.setText(getAyah(position + 1));
        sora.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                X = (int) event.getX();
                Y = (int) event.getY();
                return false;
            }
        });

        sora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Selected = findWordForRightHanded(sora.getText().toString(), sora.getOffsetForPosition(X, Y));
                Toast.makeText(mContext, Selected, Toast.LENGTH_LONG).show();
            }
        });

        switch (position) {
            case 0:
                name.setText("الفاتحة");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                name.setText("البقرة");
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:

                name.setText("آل عمران");
                break;

            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                name.setText("النساء");
                break;
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
                name.setText("المائدة");
                break;
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
                name.setText("الأنعام");
                break;
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
                name.setText("الأعراف");
                break;
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:

                name.setText("الأنفال");
                break;
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
                name.setText("التوبة");
                break;
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
                name.setText("يونس");
                break;
            case 220:
                name.setText("يونس/هود");
                break;

            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
                name.setText("هود");
                break;
            case 234:
                name.setText("هود/يوسف");
                break;

            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
                name.setText("يوسف");
                break;
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
                name.setText("الرعد");
                break;
            case 254:
                name.setText("الرعد/إبراهيم");
                break;
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
                name.setText("إبراهيم");
                break;
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
                name.setText("الحجر");
                break;
            case 266:
                name.setText("الحجر/النحل");
                break;
            case 267:
            case 268:
            case 269:
            case 270:
            case 271:
            case 272:
            case 273:
            case 274:
            case 275:
            case 276:
            case 277:
            case 278:
            case 279:
            case 280:
                name.setText("النحل");
                break;
            case 281:
            case 282:
            case 283:
            case 284:
            case 285:
            case 286:
            case 287:
            case 288:
            case 289:
            case 290:
            case 291:
                name.setText("الإسراء");
                break;
            case 292:
                name.setText("الإسراء/الكهف");
                break;
            case 293:
            case 294:
            case 295:
            case 296:
            case 297:
            case 298:
            case 299:
            case 300:
            case 301:
            case 302:
            case 303:
                name.setText("الكهف");
                break;
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
                name.setText("مريم");
                break;
            case 311:
                name.setText("مريم/طه");
                break;
            case 312:
            case 313:
            case 314:
            case 315:
            case 316:
            case 317:
            case 318:
            case 319:
            case 320:
                name.setText("طه");
                break;
            case 321:
            case 322:
            case 323:
            case 324:
            case 325:
            case 326:
            case 327:
            case 328:
            case 329:
                name.setText("الأنبياء");
                break;
            case 330:
                name.setText("الأنبياء/الحج");
                break;
            case 331:
            case 332:
            case 333:
            case 334:
            case 335:
            case 336:
            case 337:
            case 338:
            case 339:
                name.setText("الحج");
                break;
            case 340:
                name.setText("الحج/المؤمنون");
                break;
            case 341:
            case 342:
            case 343:
            case 344:
            case 345:
            case 346:
            case 347:
                name.setText("المؤمنون");
                break;
            case 348:
                name.setText("المؤمنون/النور");
                break;

            case 349:
            case 350:
            case 351:
            case 352:
            case 353:
            case 354:
            case 355:
            case 356:
            case 357:
                name.setText("النور");
                break;
            case 358:
                name.setText("النور/الفرقان");
                break;
            case 359:
            case 360:
            case 361:
            case 362:
            case 363:
            case 364:
                name.setText("الفرقان");
                break;
            case 365:
                name.setText("الفرقان/الشعراء");
                break;
            case 366:
            case 367:
            case 368:
            case 369:
            case 370:
            case 371:
            case 372:
            case 373:
            case 374:
                name.setText("الشعراء");
                break;
            case 375:
                name.setText("الشعراء/النمل");
                break;
            case 376:
            case 377:
            case 378:
            case 379:
            case 380:
            case 381:
            case 382:
            case 383:
                name.setText("النمل");
                break;
            case 384:
                name.setText("النمل/القصص");
                break;
            case 385:
            case 386:
            case 387:
            case 388:
            case 389:
            case 390:
            case 391:
            case 392:
            case 393:
            case 394:
                name.setText("القصص");
                break;
            case 395:
                name.setText("القصص/العنكبوت");
                break;
            case 396:
            case 397:
            case 398:
            case 399:
            case 400:
            case 401:
            case 402:
                name.setText("العنكبوت");
                break;
            case 403:
                name.setText("العنكبوت/الروم");
                break;
            case 404:
            case 405:
            case 406:
            case 407:
            case 408:
            case 409:
                name.setText("الروم");
                break;
            case 410:
            case 411:
            case 412:
                name.setText("لقمان");
                break;
            case 413:
                name.setText("لقمان/السجدة");
                break;
            case 414:
            case 415:
                name.setText("السجدة");
                break;
            case 416:
                name.setText("السجدة/الأحزاب");
                break;
            case 417:
            case 418:
            case 419:
            case 420:
            case 421:
            case 423:
            case 424:
            case 425:
            case 426:
                name.setText("الأحزاب");
                break;
            case 427:
            case 428:
            case 429:
            case 430:
            case 431:
            case 432:
                name.setText("سبأ");
                break;
            case 433:
                name.setText("سبأ/فاطر");
                break;
            case 434:
            case 435:
            case 436:
            case 437:
            case 438:
                name.setText("فاطر");
                break;
            case 439:
                name.setText("فاطر/يس");
                break;
            case 440:
            case 441:
            case 442:
            case 443:
                name.setText("يس");
                break;
            case 444:
                name.setText("يس/الصافات");
                break;
            case 445:
            case 446:
            case 447:
            case 448:
            case 449:
            case 450:
                name.setText("الصافات");
                break;
            case 451:
                name.setText("الصافات/ص");
                break;
            case 452:
            case 453:
            case 454:
            case 455:
            case 456:
                name.setText("ص");
                break;
            case 457:
                name.setText("ص/الزمر");
                break;
            case 458:
            case 459:
            case 460:
            case 461:
            case 462:
            case 463:
            case 464:
            case 465:
                name.setText("الزمر");
                break;
            case 466:
                name.setText("الزمر/غافر");
                break;
            case 467:
            case 468:
            case 469:
            case 470:
            case 471:
            case 472:
            case 473:
            case 474:
            case 475:
                name.setText("غافر");
                break;
            case 476:
            case 477:
            case 478:
            case 479:
            case 480:
            case 481:
                name.setText("فصلت");
                break;
            case 482:
            case 483:
            case 484:
            case 485:
            case 486:
            case 487:
                name.setText("الشورى");
                break;
            case 488:
                name.setText("الشورى/الزخرف");
                break;
            case 489:
            case 490:
            case 491:
            case 492:
            case 493:
            case 494:
                name.setText("الزخرف");
                break;
            case 495:
            case 496:
                name.setText("الدخان");
                break;
            case 497:
                name.setText("الدخان/الجاثية");
                break;
            case 498:
            case 499:
            case 500:
                name.setText("الجاثية");
                break;
            case 501:
                name.setText("الجاثية/الأحقاف");
                break;
            case 502:
            case 503:
            case 504:
                name.setText("الأحقاف");
                break;
            case 505:
                name.setText("الأحقاف/محمد");
                break;
            case 506:
            case 507:
            case 508:
            case 509:
                name.setText("محـمد");
                break;
            case 510:
            case 511:
            case 512:
            case 513:
                name.setText("الفتح");
                break;
            case 514:
                name.setText("الفتح/الحجرات");
                break;
            case 515:
            case 516:
                name.setText("الحجرات");
                break;
            case 517:
            case 518:
                name.setText("ق");
                break;
            case 519:
                name.setText("ق/الذاريات");
                break;
            case 520:
            case 521:
                name.setText("الذاريات");
                break;
            case 522:
                name.setText("الذاريات/الطور");
                break;
            case 523:
                name.setText("الطور");
                break;
            case 524:
                name.setText("الطور/النجم");
                break;
            case 525:
            case 526:
                name.setText("النجم");
                break;
            case 527:
                name.setText("النجم/القمر");
                break;
            case 528:
            case 529:
                name.setText("القمر");
                break;
            case 530:
                name.setText("القمر/الرحمن");
                break;
            case 531:
            case 532:
                name.setText("الرحمن");
                break;
            case 533:
                name.setText("الرحمن/الواقعة");
                break;
            case 534:
            case 535:
                name.setText("الواقعة");
                break;
            case 536:
                name.setText("الواقعة/الحديد");
                break;
            case 537:
            case 538:
            case 539:
            case 540:
                name.setText("الحديد");
                break;
            case 541:
            case 542:
            case 543:
                name.setText("المجادلة");
                break;
            case 544:
                name.setText("المجادلة/الحشر");
                break;
            case 545:
            case 546:
                name.setText("الحشر");
                break;
            case 547:
                name.setText("الحشر/الممتحنة");
                break;
            case 548:
            case 549:
                name.setText("الممتحنة");
                break;
            case 550:
                name.setText("الممتحنة/الصف");
                break;
            case 551:
                name.setText("الصف");
                break;
            case 552:
                name.setText("الجمعة");
                break;
            case 553:
                name.setText("المعة/المنافقون");
                break;
            case 554:
                name.setText("المنافقون/التغابن");
                break;
            case 555:
                name.setText("التغابن");
                break;
            case 556:
                name.setText("التغابن/الطلاق");
                break;
            case 557:
            case 558:
                name.setText("الطلاق");
                break;
            case 559:
            case 560:
                name.setText("التحريم");
                break;
            case 561:
            case 562:
                name.setText("الملك");
                break;
            case 563:
                name.setText("الملك/القلم");
                break;
            case 564:
                name.setText("القلم");
                break;
            case 565:
                name.setText("القلم/الحاقة");
                break;
            case 566:
                name.setText("الحاقة");
                break;
            case 567:
                name.setText("الحاقة/المعارج");
                break;
            case 568:
                name.setText("المعارج");
                break;
            case 569:
                name.setText("المعارج/نوح");
                break;
            case 570:
                name.setText("نوح");
                break;
            case 571:
            case 572:
                name.setText("الجن");
                break;
            case 573:
                name.setText("المزمل");
                break;
            case 574:
                name.setText("المزمل/المدثر");
                break;
            case 575:
                name.setText("المدثر");
                break;
            case 576:
                name.setText("المدثر/القيامة");
                break;
            case 577:
                name.setText("القيامة/الإنسان");
                break;
            case 578:
                name.setText("الإنسان");
                break;

            case 579:
                name.setText("الإنسان/المرسلات");
                break;

            case 580:
                name.setText("المرسلات");
                break;
            case 581:
                name.setText("النبأ");
                break;
            case 582:
                name.setText("النبأ/النازعات");
                break;
            case 583:
                name.setText("النازعات/عبس");
                break;

            case 584:
                name.setText("عبس");
                break;
            case 585:
                name.setText("التكوير/الانفطار");
                break;
            case 586:
                name.setText("الانفطار/المطففين");
                break;
            case 587:
                name.setText("المطففين");
                break;
            case 588:
                name.setText("المطففين/الانشقاق");
                break;
            case 589:
                name.setText("البروج/الطارق");
                break;
            case 590:
                name.setText("الطارق/الأعلى");
                break;
            case 591:
                name.setText("الأعلى/الغاشية");
                break;
            case 592:
                name.setText("الفجر");
                break;
            case 593:
                name.setText("الفجر/البلد/الشمس");
                break;
            case 594:
                name.setText("الشمس/الليل");
                break;
            case 595:
                name.setText("الليل/الضحى/الشرح");
                break;
            case 596:
                name.setText("التين/العلق");
                break;
            case 597:
                name.setText("القدر/البينة");
                break;
            case 598:
                name.setText("البينة/الزلزلة/العاديات");
                break;
            case 599:
                name.setText("العاديات/القارعة/التكاثر");
                break;
            case 600:
                name.setText("العصر/الهمزة/الفيل");
                break;
            case 601:
                name.setText("قريش/الماعون/الكوثر");
                break;
            case 602:
                name.setText("الكافرون/النصر/المسد");
                break;
            case 603:
                name.setText("الإخلاص/الفلق/الناس");
                break;
        }
        sora.setRotationY(180);
        button.setRotationY(180);
        hafs.setRotationY(180);
        last_read.setRotationY(180);
        name.setRotationY(180);
        number.setRotationY(180);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GoToIndex.class);
                Bundle bundle = new Bundle();
                bundle.putInt("position", position);
                intent.putExtras(bundle);
                mContext.startActivity(intent);
            }
        });


        SharedPreferences shared2 = mContext.getSharedPreferences("Mypref", Context.MODE_PRIVATE);
        boolean reading = shared2.getBoolean("check", true);
        if (reading) {
            button.setBackgroundResource(R.drawable.buttonn);
            hafs.setBackgroundResource(R.drawable.button_selected);


        } else {
            hafs.setBackgroundResource(R.drawable.buttonn);
            button.setBackgroundResource(R.drawable.button_selected);

        }


        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Index.class);
                mContext.startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = false;
                SharedPreferences shared2 = mContext.getSharedPreferences("Mypref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared2.edit();
                editor.putBoolean("check", check);
                editor.apply();

                notifyDataSetChanged();


            }
        });
        hafs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hafs.setBackgroundResource(R.drawable.button_selected);
                button.setBackgroundResource(R.drawable.buttonn);
                check = true;
                SharedPreferences shared2 = mContext.getSharedPreferences("Mypref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared2.edit();
                editor.putBoolean("check", check);
                editor.apply();


                notifyDataSetChanged();
            }
        });

        last_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences shared = mContext.getSharedPreferences("Mypref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = shared.edit();
                editor.putInt("position", position);
                editor.putString("key", "key");
                editor.apply();

                Toast.makeText(mContext, "تم اضافة علامة توقف", Toast.LENGTH_LONG).show();
            }
        });

        container.addView(itemView);

        return itemView;
    }

    private void show(View v) {
        @SuppressLint("InflateParams") BubbleLayout bubbleLayout = (BubbleLayout) LayoutInflater.from(mContext).inflate(R.layout.pop_menu, null);
        PopupWindow popupWindow = BubblePopupHelper.create(mContext, bubbleLayout);

        popupWindow.showAtLocation(v, Gravity.NO_GRAVITY, X, (Y + (int) v.getY()) - 200);

        bubbleLayout.findViewById(R.id.tafser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bubbleLayout.findViewById(R.id.copy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) mContext.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(sora.getText(), Selected);
                assert clipboard != null;
                clipboard.setPrimaryClip(clip);
                Toast.makeText(mContext, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
            }
        });
        bubbleLayout.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, Selected
                        + "\n" + soraName);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Quran");
                mContext.startActivity(Intent.createChooser(intent, "Share ..."));

            }
        });

        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                sora.setText(sora.getText().toString());
            }
        });
    }

    private String findWordForRightHanded(String str, int offset) { // when you touch ' ', this method returns left word.
        if (str.length() == offset) {
            offset--; // without this code, you will get exception when touching end of the text
        }
        if (offset == -1) {
            return "-1";
        }
        if (str.charAt(offset) == ' ') {
            offset--;
        }
        int startIndex = offset;
        int endIndex = offset;

        try {
            while (str.charAt(startIndex) != '﴾') {
                startIndex--;
            }
        } catch (StringIndexOutOfBoundsException e) {
            startIndex = 0;
        }

        try {
            while (str.charAt(endIndex) != '﴿') {
                endIndex++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            endIndex = str.length();
        }

        // without this code, you will get 'here!' instead of 'here'
        // if you use only english, just check whether this is alphabet,
        // but 'I' use korean, so i use below algorithm to get clean word.
        char last = str.charAt(endIndex - 1);
        if (last == ',' || last == '.' ||
                last == '!' || last == '?' ||
                last == ':' || last == ';') {
            endIndex--;
        }
        if (startIndex != 0) startIndex++;

        Spannable spanText = Spannable.Factory.getInstance().newSpannable(sora.getText().toString());

        spanText.setSpan(new BackgroundColorSpan(mContext.getResources().getColor(R.color.pop_back)),
                startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        sora.setText(spanText);
        show(sora);
        return str.substring(startIndex, endIndex);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((FrameLayout) object);
    }

    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}

