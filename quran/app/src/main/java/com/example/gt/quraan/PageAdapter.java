package com.example.gt.quraan;

/*
* Created by Muhammad Saleh (MUSA)
* 29/3/2018
* */
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.daasuu.bl.BubbleLayout;
import com.daasuu.bl.BubblePopupHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class PageAdapter extends RecyclerView.Adapter<PageAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Page> pages;
    private int position;
    private static String Selected;
    MyViewHolder holder;
    public Response delegate;

    public PageAdapter(Context context, ArrayList<Page> pages) {
        this.context = context;
        this.pages = pages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.pager_item, parent, false);
        return new MyViewHolder(v, context);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        this.position = holder.getAdapterPosition();
        final getAyah getAyah = new getAyah(context, new Response() {
            @Override
            public void output(String output) {
                holder.text.setText(output);
            }
        });
        this.holder = holder;

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/UthmanicHafs.otf");
        holder.text.setTypeface(typeface);
        holder.button.setRotationY(180);
        holder.text.setRotationY(180);
        holder.hafs.setRotationY(180);
        holder.last_read.setRotationY(180);
        holder.name.setRotationY(180);
        holder.number.setRotationY(180);
        getAyah.execute(position + 1);
        holder.number.setText("" + (position + 1));
        switch (position) {
            case 0:
                holder.name.setText("الفاتحة");
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
                holder.name.setText("البقرة");
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

                holder.name.setText("آل عمران");
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
                holder.name.setText("النساء");
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
                holder.name.setText("المائدة");
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
                holder.name.setText("الأنعام");
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
                holder.name.setText("الأعراف");
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

                holder.name.setText("الأنفال");
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
                holder.name.setText("التوبة");
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
                holder.name.setText("يونس");
                break;
            case 220:
                holder.name.setText("يونس/هود");
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
                holder.name.setText("هود");
                break;
            case 234:
                holder.name.setText("هود/يوسف");
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
                holder.name.setText("يوسف");
                break;
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
                holder.name.setText("الرعد");
                break;
            case 254:
                holder.name.setText("الرعد/إبراهيم");
                break;
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
                holder.name.setText("إبراهيم");
                break;
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
                holder.name.setText("الحجر");
                break;
            case 266:
                holder.name.setText("الحجر/النحل");
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
                holder.name.setText("النحل");
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
                holder.name.setText("الإسراء");
                break;
            case 292:
                holder.name.setText("الإسراء/الكهف");
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
                holder.name.setText("الكهف");
                break;
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
                holder.name.setText("مريم");
                break;
            case 311:
                holder.name.setText("مريم/طه");
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
                holder.name.setText("طه");
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
                holder.name.setText("الأنبياء");
                break;
            case 330:
                holder.name.setText("الأنبياء/الحج");
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
                holder.name.setText("الحج");
                break;
            case 340:
                holder.name.setText("الحج/المؤمنون");
                break;
            case 341:
            case 342:
            case 343:
            case 344:
            case 345:
            case 346:
            case 347:
                holder.name.setText("المؤمنون");
                break;
            case 348:
                holder.name.setText("المؤمنون/النور");
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
                holder.name.setText("النور");
                break;
            case 358:
                holder.name.setText("النور/الفرقان");
                break;
            case 359:
            case 360:
            case 361:
            case 362:
            case 363:
            case 364:
                holder.name.setText("الفرقان");
                break;
            case 365:
                holder.name.setText("الفرقان/الشعراء");
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
                holder.name.setText("الشعراء");
                break;
            case 375:
                holder.name.setText("الشعراء/النمل");
                break;
            case 376:
            case 377:
            case 378:
            case 379:
            case 380:
            case 381:
            case 382:
            case 383:
                holder.name.setText("النمل");
                break;
            case 384:
                holder.name.setText("النمل/القصص");
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
                holder.name.setText("القصص");
                break;
            case 395:
                holder.name.setText("القصص/العنكبوت");
                break;
            case 396:
            case 397:
            case 398:
            case 399:
            case 400:
            case 401:
            case 402:
                holder.name.setText("العنكبوت");
                break;
            case 403:
                holder.name.setText("العنكبوت/الروم");
                break;
            case 404:
            case 405:
            case 406:
            case 407:
            case 408:
            case 409:
                holder.name.setText("الروم");
                break;
            case 410:
            case 411:
            case 412:
                holder.name.setText("لقمان");
                break;
            case 413:
                holder.name.setText("لقمان/السجدة");
                break;
            case 414:
            case 415:
                holder.name.setText("السجدة");
                break;
            case 416:
                holder.name.setText("السجدة/الأحزاب");
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
                holder.name.setText("الأحزاب");
                break;
            case 427:
            case 428:
            case 429:
            case 430:
            case 431:
            case 432:
                holder.name.setText("سبأ");
                break;
            case 433:
                holder.name.setText("سبأ/فاطر");
                break;
            case 434:
            case 435:
            case 436:
            case 437:
            case 438:
                holder.name.setText("فاطر");
                break;
            case 439:
                holder.name.setText("فاطر/يس");
                break;
            case 440:
            case 441:
            case 442:
            case 443:
                holder.name.setText("يس");
                break;
            case 444:
                holder.name.setText("يس/الصافات");
                break;
            case 445:
            case 446:
            case 447:
            case 448:
            case 449:
            case 450:
                holder.name.setText("الصافات");
                break;
            case 451:
                holder.name.setText("الصافات/ص");
                break;
            case 452:
            case 453:
            case 454:
            case 455:
            case 456:
                holder.name.setText("ص");
                break;
            case 457:
                holder.name.setText("ص/الزمر");
                break;
            case 458:
            case 459:
            case 460:
            case 461:
            case 462:
            case 463:
            case 464:
            case 465:
                holder.name.setText("الزمر");
                break;
            case 466:
                holder.name.setText("الزمر/غافر");
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
                holder.name.setText("غافر");
                break;
            case 476:
            case 477:
            case 478:
            case 479:
            case 480:
            case 481:
                holder.name.setText("فصلت");
                break;
            case 482:
            case 483:
            case 484:
            case 485:
            case 486:
            case 487:
                holder.name.setText("الشورى");
                break;
            case 488:
                holder.name.setText("الشورى/الزخرف");
                break;
            case 489:
            case 490:
            case 491:
            case 492:
            case 493:
            case 494:
                holder.name.setText("الزخرف");
                break;
            case 495:
            case 496:
                holder.name.setText("الدخان");
                break;
            case 497:
                holder.name.setText("الدخان/الجاثية");
                break;
            case 498:
            case 499:
            case 500:
                holder.name.setText("الجاثية");
                break;
            case 501:
                holder.name.setText("الجاثية/الأحقاف");
                break;
            case 502:
            case 503:
            case 504:
                holder.name.setText("الأحقاف");
                break;
            case 505:
                holder.name.setText("الأحقاف/محمد");
                break;
            case 506:
            case 507:
            case 508:
            case 509:
                holder.name.setText("محـمد");
                break;
            case 510:
            case 511:
            case 512:
            case 513:
                holder.name.setText("الفتح");
                break;
            case 514:
                holder.name.setText("الفتح/الحجرات");
                break;
            case 515:
            case 516:
                holder.name.setText("الحجرات");
                break;
            case 517:
            case 518:
                holder.name.setText("ق");
                break;
            case 519:
                holder.name.setText("ق/الذاريات");
                break;
            case 520:
            case 521:
                holder.name.setText("الذاريات");
                break;
            case 522:
                holder.name.setText("الذاريات/الطور");
                break;
            case 523:
                holder.name.setText("الطور");
                break;
            case 524:
                holder.name.setText("الطور/النجم");
                break;
            case 525:
            case 526:
                holder.name.setText("النجم");
                break;
            case 527:
                holder.name.setText("النجم/القمر");
                break;
            case 528:
            case 529:
                holder.name.setText("القمر");
                break;
            case 530:
                holder.name.setText("القمر/الرحمن");
                break;
            case 531:
            case 532:
                holder.name.setText("الرحمن");
                break;
            case 533:
                holder.name.setText("الرحمن/الواقعة");
                break;
            case 534:
            case 535:
                holder.name.setText("الواقعة");
                break;
            case 536:
                holder.name.setText("الواقعة/الحديد");
                break;
            case 537:
            case 538:
            case 539:
            case 540:
                holder.name.setText("الحديد");
                break;
            case 541:
            case 542:
            case 543:
                holder.name.setText("المجادلة");
                break;
            case 544:
                holder.name.setText("المجادلة/الحشر");
                break;
            case 545:
            case 546:
                holder.name.setText("الحشر");
                break;
            case 547:
                holder.name.setText("الحشر/الممتحنة");
                break;
            case 548:
            case 549:
                holder.name.setText("الممتحنة");
                break;
            case 550:
                holder.name.setText("الممتحنة/الصف");
                break;
            case 551:
                holder.name.setText("الصف");
                break;
            case 552:
                holder.name.setText("الجمعة");
                break;
            case 553:
                holder.name.setText("المعة/المنافقون");
                break;
            case 554:
                holder.name.setText("المنافقون/التغابن");
                break;
            case 555:
                holder.name.setText("التغابن");
                break;
            case 556:
                holder.name.setText("التغابن/الطلاق");
                break;
            case 557:
            case 558:
                holder.name.setText("الطلاق");
                break;
            case 559:
            case 560:
                holder.name.setText("التحريم");
                break;
            case 561:
            case 562:
                holder.name.setText("الملك");
                break;
            case 563:
                holder.name.setText("الملك/القلم");
                break;
            case 564:
                holder.name.setText("القلم");
                break;
            case 565:
                holder.name.setText("القلم/الحاقة");
                break;
            case 566:
                holder.name.setText("الحاقة");
                break;
            case 567:
                holder.name.setText("الحاقة/المعارج");
                break;
            case 568:
                holder.name.setText("المعارج");
                break;
            case 569:
                holder.name.setText("المعارج/نوح");
                break;
            case 570:
                holder.name.setText("نوح");
                break;
            case 571:
            case 572:
                holder.name.setText("الجن");
                break;
            case 573:
                holder.name.setText("المزمل");
                break;
            case 574:
                holder.name.setText("المزمل/المدثر");
                break;
            case 575:
                holder.name.setText("المدثر");
                break;
            case 576:
                holder.name.setText("المدثر/القيامة");
                break;
            case 577:
                holder.name.setText("القيامة/الإنسان");
                break;
            case 578:
                holder.name.setText("الإنسان");
                break;

            case 579:
                holder.name.setText("الإنسان/المرسلات");
                break;

            case 580:
                holder.name.setText("المرسلات");
                break;
            case 581:
                holder.name.setText("النبأ");
                break;
            case 582:
                holder.name.setText("النبأ/النازعات");
                break;
            case 583:
                holder.name.setText("النازعات/عبس");
                break;

            case 584:
                holder.name.setText("عبس");
                break;
            case 585:
                holder.name.setText("التكوير/الانفطار");
                break;
            case 586:
                holder.name.setText("الانفطار/المطففين");
                break;
            case 587:
                holder.name.setText("المطففين");
                break;
            case 588:
                holder.name.setText("المطففين/الانشقاق");
                break;
            case 589:
                holder.name.setText("البروج/الطارق");
                break;
            case 590:
                holder.name.setText("الطارق/الأعلى");
                break;
            case 591:
                holder.name.setText("الأعلى/الغاشية");
                break;
            case 592:
                holder.name.setText("الفجر");
                break;
            case 593:
                holder.name.setText("الفجر/البلد/الشمس");
                break;
            case 594:
                holder.name.setText("الشمس/الليل");
                break;
            case 595:
                holder.name.setText("الليل/الضحى/الشرح");
                break;
            case 596:
                holder.name.setText("التين/العلق");
                break;
            case 597:
                holder.name.setText("القدر/البينة");
                break;
            case 598:
                holder.name.setText("البينة/الزلزلة/العاديات");
                break;
            case 599:
                holder.name.setText("العاديات/القارعة/التكاثر");
                break;
            case 600:
                holder.name.setText("العصر/الهمزة/الفيل");
                break;
            case 601:
                holder.name.setText("قريش/الماعون/الكوثر");
                break;
            case 602:
                holder.name.setText("الكافرون/النصر/المسد");
                break;
            case 603:
                holder.name.setText("الإخلاص/الفلق/الناس");
                break;
        }

    }

    private String getAyah(int position) {
        String json;
        StringBuilder ayahData = new StringBuilder();
        try {
            InputStream is = context.getAssets().open("Quran.json");
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
                        String ayahNumber = getAyahNumber(ayahs.getJSONObject(j).getInt("numberInSurah"));
                        ayahData.append(" ").append("\uFD3F")
                                .append(ayahNumber).append("\uFD3E")
                                .append(" ");
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

    private String getAyahNumber(int numberInSurah) {
        String number = String.valueOf(numberInSurah);
        ArrayList<Character> arabic = new ArrayList<>();
        arabic.add('\u0660');
        arabic.add('\u0661');
        arabic.add('\u0662');
        arabic.add('\u0663');
        arabic.add('\u0664');
        arabic.add('\u0665');
        arabic.add('\u0666');
        arabic.add('\u0667');
        arabic.add('\u0668');
        arabic.add('\u0669');
        StringBuilder arabicNumber = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            arabicNumber.append(arabic.get(Integer.parseInt(String.valueOf(number.charAt(i)))));
        }
        return arabicNumber.toString();
    }


    public class getAyah extends AsyncTask<Integer, String, String> {
        String ayah = "";
        int position;
        Context context;


        Response delegate = null;


        public getAyah(Context context, Response delegate) {
            this.context = context;
            this.delegate = delegate;

        }

        @Override
        protected String doInBackground(Integer... integers) {
            position = integers[0];
            ayah = getAyah(position);
            return ayah;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

        }

        @Override
        protected void onPostExecute(String aVoid) {
            super.onPostExecute(aVoid);
            delegate.output(ayah);

        }
    }


    @Override
    public int getItemCount() {
        return 605;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        Button button, hafs, last_read, name, number;
        public Context mContext;
        int X;
        int Y;
        private boolean check;

        @SuppressLint("ClickableViewAccessibility")
        MyViewHolder(View itemView, final Context context) {
            super(itemView);
            this.mContext = context;
            text = itemView.findViewById(R.id.soraa);
            button = itemView.findViewById(R.id.button);
            hafs = itemView.findViewById(R.id.hafs);
            last_read = itemView.findViewById(R.id.bookmark);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);

            text.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    X = (int) event.getX();
                    Y = (int) event.getY();
                    return false;
                }
            });

            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Selected = findWordForRightHanded(X, Y, context, text, text.getText().toString(), text.getOffsetForPosition(X, Y));
                    Toast.makeText(context, Selected, Toast.LENGTH_SHORT).show();
                }
            });

            number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, GoToIndex.class);
                    intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    Bundle bundle = new Bundle();
                    bundle.putInt("position", getAdapterPosition());
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
                    intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
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
                }
            });

            last_read.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SharedPreferences shared = mContext.getSharedPreferences("Mypref", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = shared.edit();
                    editor.putInt("position", getAdapterPosition());
                    editor.putString("key", "key");
                    editor.apply();

                    Toast.makeText(mContext, "تم اضافة علامة توقف", Toast.LENGTH_LONG).show();
                }
            });
        }

        private static String findWordForRightHanded(int X, int Y, Context context, TextView text, String str, int offset) {
            if (str.length() == offset) {
                offset--; // without this code, you will get exception when touching end of the text
            }
            if (offset < 0) {
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

            if (startIndex != 0)
                startIndex++;
            Spannable spanText = Spannable.Factory.getInstance().newSpannable(text.getText().toString());
            spanText.setSpan(new BackgroundColorSpan(context.getResources().getColor(R.color.pop_back)),
                    startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            text.setText(spanText);
            show(X, Y, text, context);
            return str.substring(startIndex, endIndex);
        }

        private static void show(int X, int Y, final TextView view, final Context context) {

            @SuppressLint("InflateParams") final BubbleLayout bubbleLayout = (BubbleLayout) LayoutInflater.from(context)
                    .inflate(R.layout.pop_menu, null);
            PopupWindow popupWindow = BubblePopupHelper.create(context, bubbleLayout);
            try {
                popupWindow.showAtLocation(view, Gravity.NO_GRAVITY, X, (Y + (int) view.getY()) - 200);
            } catch (WindowManager.BadTokenException ignored) {

            }

            bubbleLayout.findViewById(R.id.tafser).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            bubbleLayout.findViewById(R.id.copy).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText(view.getText(), Selected);
                    assert clipboard != null;
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(context, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
                }
            });
            bubbleLayout.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_TEXT, Selected
                            + "\n");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Quran");
                    context.startActivity(Intent.createChooser(intent.addFlags(FLAG_ACTIVITY_NEW_TASK), "Share ...").setFlags(FLAG_ACTIVITY_NEW_TASK));

                }
            });

            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    view.setText(view.getText().toString());
                }
            });
        }

    }
}
