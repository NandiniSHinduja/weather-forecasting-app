package com.example.windy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.example.windy.preferences;
import com.example.windy.WindyPreferences.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener{
    TextView airQualityIndex;
    TextView textDate;
    TextView textMain;
    TextView textTemp;
    TextView textDate2;
    TextView textMain2;
    TextView textTemp2;
    TextView textDate3;
    TextView textMain3;
    TextView textTemp3;
    TextView textDate4;
    TextView textMain4;
    TextView textTemp4;
    TextView textDate5;
    TextView textMain5;
    TextView textTemp5;
    TextView textDate6;
    TextView textMain6;
    TextView textTemp6;
    TextView textDate7;
    TextView textMain7;
    TextView textTemp7;
    TextView textDate8;
    TextView textMain8;
    TextView textTemp8;
    TextView textDate9;
    TextView textMain9;
    TextView textTemp9;
    TextView textDate10;
    TextView textMain10;
    TextView textTemp10;
    TextView textDate11;
    TextView textMain11;
    TextView textTemp11;
    TextView textDate12;
    TextView textMain12;
    TextView textTemp12;
    TextView textDate13;
    TextView textMain13;
    TextView textTemp13;
    TextView textDate14;
    TextView textMain14;
    TextView textTemp14;
    TextView textDate15;
    TextView textMain15;
    TextView textTemp15;
    TextView textDate16;
    TextView textMain16;
    TextView textTemp16;
    TextView textDate17;
    TextView textMain17;
    TextView textTemp17;
    TextView textDate18;
    TextView textMain18;
    TextView textTemp18;
    TextView textDate19;
    TextView textMain19;
    TextView textTemp19;
    TextView textDate20;
    TextView textMain20;
    TextView textTemp20;
    TextView textDate21;
    TextView textMain21;
    TextView textTemp21;
    TextView textDate22;
    TextView textMain22;
    TextView textTemp22;
    TextView textDate23;
    TextView textMain23;
    TextView textTemp23;
    TextView textDate24;
    TextView textMain24;
    TextView textTemp24;
    TextView textDate25;
    TextView textMain25;
    TextView textTemp25;
    TextView textDate26;
    TextView textMain26;
    TextView textTemp26;
    TextView textDate27;
    TextView textMain27;
    TextView textTemp27;
    TextView textDate28;
    TextView textMain28;
    TextView textTemp28;
    TextView textDate29;
    TextView textMain29;
    TextView textTemp29;
    TextView textDate30;
    TextView textMain30;
    TextView textTemp30;
    TextView textDate31;
    TextView textMain31;
    TextView textTemp31;
    TextView textDate32;
    TextView textMain32;
    TextView textTemp32;
    TextView textDate33;
    TextView textMain33;
    TextView textTemp33;
    TextView textDate34;
    TextView textMain34;
    TextView textTemp34;
    TextView textDate35;
    TextView textMain35;
    TextView textTemp35;
    TextView textDate36;
    TextView textMain36;
    TextView textTemp36;
    TextView textDate37;
    TextView textMain37;
    TextView textTemp37;
    TextView textDate38;
    TextView textMain38;
    TextView textTemp38;
    TextView textDate39;
    TextView textMain39;
    TextView textTemp39;
    TextView textDate40;
    TextView textMain40;
    TextView textTemp40;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;
    ImageView image7;
    ImageView image8;
    ImageView image9;
    ImageView image10;
    ImageView image11;
    ImageView image12;
    ImageView image13;
    ImageView image14;
    ImageView image15;
    ImageView image16;
    ImageView image17;
    ImageView image18;
    ImageView image19;
    ImageView image20;
    ImageView image21;
    ImageView image22;
    ImageView image23;
    ImageView image24;
    ImageView image25;
    ImageView image26;
    ImageView image27;
    ImageView image28;
    ImageView image29;
    ImageView image30;
    ImageView image31;
    ImageView image32;
    ImageView image33;
    ImageView image34;
    ImageView image35;
    ImageView image36;
    ImageView image37;
    ImageView image38;
    ImageView image39;
    ImageView image40;
    ImageView image0;
    TextView textTemp0;
    TextView textMain0;
    TextView MainDay;
    MediaPlayer mMediaPlayer;
    String partOfDay;
    int mCurrentVideoPosition;
    VideoView videoview;
    TextView hour1;
    TextView tem1;
    ImageView hourImg1;
    TextView hour2;
    TextView tem2;
    ImageView hourImg2;
    TextView hour3;
    TextView tem3;
    ImageView hourImg3;
    TextView hour4;
    TextView tem4;
    ImageView hourImg4;
    TextView hour5;
    TextView tem5;
    ImageView hourImg5;
    TextView hour6;
    TextView tem6;
    ImageView hourImg6;
    TextView hour7;
    TextView tem7;
    ImageView hourImg7;
    TextView hour8;
    TextView tem8;
    ImageView hourImg8;
    TextView hour9;
    TextView tem9;
    ImageView hourImg9;
    TextView hour10;
    TextView tem10;
    ImageView hourImg10;
    TextView hour11;
    TextView tem11;
    ImageView hourImg11;
    TextView hour12;
    TextView tem12;
    ImageView hourImg12;
    TextView hour13;
    TextView tem13;
    ImageView hourImg13;
    TextView hour14;
    TextView tem14;
    ImageView hourImg14;
    TextView hour15;
    TextView tem15;
    ImageView hourImg15;
    TextView hour16;
    TextView tem16;
    ImageView hourImg16;
    TextView hour17;
    TextView tem17;
    ImageView hourImg17;
    TextView hour18;
    TextView tem18;
    ImageView hourImg18;
    TextView hour19;
    TextView tem19;
    ImageView hourImg19;
    TextView hour20;
    TextView tem20;
    ImageView hourImg20;
    TextView hour21;
    TextView tem21;
    ImageView hourImg21;
    TextView hour22;
    TextView tem22;
    ImageView hourImg22;
    TextView hour23;
    TextView tem23;
    ImageView hourImg23;
    TextView hour24;
    TextView tem24;
    ImageView hourImg24;
    TextView daily1;
    ImageView imagely1;
    TextView temperly1;
    TextView daily2;
    ImageView imagely2;
    TextView temperly2;
    TextView daily3;
    ImageView imagely3;
    TextView temperly3;
    TextView daily4;
    ImageView imagely4;
    TextView temperly4;
    TextView daily5;
    ImageView imagely5;
    TextView temperly5;
    TextView daily6;
    ImageView imagely6;
    TextView temperly6;
    TextView daily7;
    ImageView imagely7;
    TextView temperly7;
    TextView daily8;
    ImageView imagely8;
    TextView temperly8;
    TextView daily9;
    ImageView imagely9;
    TextView temperly9;
    TextView daily10;
    ImageView imagely10;
    TextView temperly10;
    TextView daily11;
    ImageView imagely11;
    TextView temperly11;
    TextView daily12;
    ImageView imagely12;
    TextView temperly12;
    TextView daily13;
    ImageView imagely13;
    TextView temperly13;
    TextView daily14;
    ImageView imagely14;
    TextView temperly14;
    TextView daily15;
    ImageView imagely15;
    TextView temperly15;
    TextView daily16;
    ImageView imagely16;
    TextView temperly16;
    TextView week1;
    ImageView weekImage1;
    TextView weekDay1;
    TextView weekTemp1;
    TextView week2;
    ImageView weekImage2;
    TextView weekDay2;
    TextView weekTemp2;
    TextView week3;
    ImageView weekImage3;
    TextView weekDay3;
    TextView weekTemp3;
    TextView week4;
    ImageView weekImage4;
    TextView weekDay4;
    TextView weekTemp4;
    TextView week5;
    ImageView weekImage5;
    TextView weekDay5;
    TextView weekTemp5;
    TextView week6;
    ImageView weekImage6;
    TextView weekDay6;
    TextView weekTemp6;
    TextView week7;
    ImageView weekImage7;
    TextView weekDay7;
    TextView weekTemp7;
    TextView sunny;
    TextView unSunny;
    TextView info;
    Switch SunMoon;
    CardView card;
    ImageView sunny_day;


    private static boolean PREFERENCES_HAVE_BEEN_UPDATED = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Live Weather");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        PreferenceManager.getDefaultSharedPreferences(this)
                .registerOnSharedPreferenceChangeListener(this);
        Date dt = new Date();

        int hours = dt.getHours();
       if(hours>=5 && hours<=18){
           VideoView videoview = (VideoView) findViewById(R.id.videoView);

           Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.theoneineed);
           videoview.setVideoURI(uri);
           videoview.start();



           videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
               @Override
               public void onPrepared(MediaPlayer mediaPlayer) {
                   mMediaPlayer = mediaPlayer;
                   // We want our video to play over and over so we set looping to true.
                   mMediaPlayer.setLooping(true);

                   // We then seek to the current posistion if it has been set and play the video.
                   if (mCurrentVideoPosition != 0) {
                       mMediaPlayer.seekTo(mCurrentVideoPosition);
                       mMediaPlayer.start();
                   }
               }
           });


       }
       else{
           VideoView videoview = (VideoView) findViewById(R.id.videoView);

           Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nightynight );
           videoview.setVideoURI(uri);
           videoview.start();



           videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
               @Override
               public void onPrepared(MediaPlayer mediaPlayer) {
                   mMediaPlayer = mediaPlayer;
                   // We want our video to play over and over so we set looping to true.
                   mMediaPlayer.setLooping(true);

                   // We then seek to the current posistion if it has been set and play the video.
                   if (mCurrentVideoPosition != 0) {
                       mMediaPlayer.seekTo(mCurrentVideoPosition);
                       mMediaPlayer.start();
                   }
               }
           });



       }













        textDate = (TextView) findViewById(R.id.textView);
        textMain = (TextView) findViewById(R.id.textView2);
        textTemp = (TextView) findViewById(R.id.textView3);
        textDate2 = (TextView) findViewById(R.id.textView4);
        textMain2 = (TextView) findViewById(R.id.textView5);
        textTemp2 = (TextView) findViewById(R.id.textView6);
        textDate3 = (TextView) findViewById(R.id.textView7);
        textMain3 = (TextView) findViewById(R.id.textView8);
        textTemp3 = (TextView) findViewById(R.id.textView9);
        textDate4 = (TextView) findViewById(R.id.textView10);
        textMain4 = (TextView) findViewById(R.id.textView11);
        textTemp4 = (TextView) findViewById(R.id.textView12);
        textDate5 = (TextView) findViewById(R.id.textView13);
        textMain5 = (TextView) findViewById(R.id.textView14);
        textTemp5 = (TextView) findViewById(R.id.textView15);
        textDate6 = (TextView) findViewById(R.id.textView16);
        textMain6 = (TextView) findViewById(R.id.textView17);
        textTemp6 = (TextView) findViewById(R.id.textView18);
        textDate7 = (TextView) findViewById(R.id.textView19);
        textMain7 = (TextView) findViewById(R.id.textView20);
        textTemp7 = (TextView) findViewById(R.id.textView21);
        textDate8 = (TextView) findViewById(R.id.textView22);
        textMain8 = (TextView) findViewById(R.id.textView23);
        textTemp8 = (TextView) findViewById(R.id.textView24);
        textDate9 = (TextView) findViewById(R.id.textView25);
        textMain9 = (TextView) findViewById(R.id.textView26);
        textTemp9 = (TextView) findViewById(R.id.textView27);
        textDate10 = (TextView) findViewById(R.id.textView28);
        textMain10 = (TextView) findViewById(R.id.textView29);
        textTemp10 = (TextView) findViewById(R.id.textView30);
        textDate11 = (TextView) findViewById(R.id.textView31);
        textMain11 = (TextView) findViewById(R.id.textView32);
        textTemp11 = (TextView) findViewById(R.id.textView33);
        textDate12 = (TextView) findViewById(R.id.textView34);
        textMain12 = (TextView) findViewById(R.id.textView35);
        textTemp12 = (TextView) findViewById(R.id.textView36);
        textDate13 = (TextView) findViewById(R.id.textView37);
        textMain13 = (TextView) findViewById(R.id.textView38);
        textTemp13 = (TextView) findViewById(R.id.textView39);
        textDate14 = (TextView) findViewById(R.id.textView40);
        textMain14 = (TextView) findViewById(R.id.textView41);
        textTemp14 = (TextView) findViewById(R.id.textView42);
        textDate15 = (TextView) findViewById(R.id.textView43);
        textMain15 = (TextView) findViewById(R.id.textView44);
        textTemp15 = (TextView) findViewById(R.id.textView45);
        textDate16 = (TextView) findViewById(R.id.textView46);
        textMain16 = (TextView) findViewById(R.id.textView47);
        textTemp16 = (TextView) findViewById(R.id.textView48);
        textDate17 = (TextView) findViewById(R.id.textView49);
        textMain17 = (TextView) findViewById(R.id.textView50);
        textTemp17 = (TextView) findViewById(R.id.textView51);
        textDate18 = (TextView) findViewById(R.id.textView52);
        textMain18 = (TextView) findViewById(R.id.textView53);
        textTemp18 = (TextView) findViewById(R.id.textView54);
        textDate19 = (TextView) findViewById(R.id.textView55);
        textMain19 = (TextView) findViewById(R.id.textView56);
        textTemp19 = (TextView) findViewById(R.id.textView57);
        textDate20 = (TextView) findViewById(R.id.textView58);
        textMain20 = (TextView) findViewById(R.id.textView59);
        textTemp20 = (TextView) findViewById(R.id.textView60);
        textDate21 = (TextView) findViewById(R.id.textView61);
        textMain21 = (TextView) findViewById(R.id.textView62);
        textTemp21 = (TextView) findViewById(R.id.textView63);
        textDate22 = (TextView) findViewById(R.id.textView64);
        textMain22 = (TextView) findViewById(R.id.textView65);
        textTemp22 = (TextView) findViewById(R.id.textView66);
        textDate23 = (TextView) findViewById(R.id.textView67);
        textMain23 = (TextView) findViewById(R.id.textView68);
        textTemp23 = (TextView) findViewById(R.id.textView69);
        textDate24 = (TextView) findViewById(R.id.textView70);
        textMain24 = (TextView) findViewById(R.id.textView71);
        textTemp24 = (TextView) findViewById(R.id.textView72);
        textDate25 = (TextView) findViewById(R.id.textView73);
        textMain25 = (TextView) findViewById(R.id.textView74);
        textTemp25 = (TextView) findViewById(R.id.textView75);
        textDate26 = (TextView) findViewById(R.id.textView76);
        textMain26 = (TextView) findViewById(R.id.textView77);
        textTemp26 = (TextView) findViewById(R.id.textView78);
        textDate27 = (TextView) findViewById(R.id.textView79);
        textMain27 = (TextView) findViewById(R.id.textView80);
        textTemp27 = (TextView) findViewById(R.id.textView81);
        textDate28 = (TextView) findViewById(R.id.textView82);
        textMain28 = (TextView) findViewById(R.id.textView83);
        textTemp28 = (TextView) findViewById(R.id.textView84);
        textDate29 = (TextView) findViewById(R.id.textView85);
        textMain29 = (TextView) findViewById(R.id.textView86);
        textTemp29 = (TextView) findViewById(R.id.textView87);
        textDate30 = (TextView) findViewById(R.id.textView88);
        textMain30 = (TextView) findViewById(R.id.textView89);
        textTemp30 = (TextView) findViewById(R.id.textView90);
        textDate31 = (TextView) findViewById(R.id.textView91);
        textMain31 = (TextView) findViewById(R.id.textView92);
        textTemp31 = (TextView) findViewById(R.id.textView93);
        textDate32 = (TextView) findViewById(R.id.textView94);
        textMain32 = (TextView) findViewById(R.id.textView95);
        textTemp32 = (TextView) findViewById(R.id.textView96);
        textDate33 = (TextView) findViewById(R.id.textView97);
        textMain33 = (TextView) findViewById(R.id.textView98);
        textTemp33 = (TextView) findViewById(R.id.textView99);
        textDate34 = (TextView) findViewById(R.id.textView100);
        textMain34 = (TextView) findViewById(R.id.textView101);
        textTemp34 = (TextView) findViewById(R.id.textView102);
        textDate35 = (TextView) findViewById(R.id.textView103);
        textMain35 = (TextView) findViewById(R.id.textView104);
        textTemp35 = (TextView) findViewById(R.id.textView105);
        textDate36 = (TextView) findViewById(R.id.textView106);
        textMain36 = (TextView) findViewById(R.id.textView107);
        textTemp36 = (TextView) findViewById(R.id.textView108);
        textDate37 = (TextView) findViewById(R.id.textView109);
        textMain37 = (TextView) findViewById(R.id.textView110);
        textTemp37 = (TextView) findViewById(R.id.textView111);
        textDate38 = (TextView) findViewById(R.id.textView112);
        textMain38 = (TextView) findViewById(R.id.textView113);
        textTemp38 = (TextView) findViewById(R.id.textView114);
        textDate39 = (TextView) findViewById(R.id.textView115);
        textMain39 = (TextView) findViewById(R.id.textView116);
        textTemp39 = (TextView) findViewById(R.id.textView117);
        textDate40 = (TextView) findViewById(R.id.textView118);
        textMain40 = (TextView) findViewById(R.id.textView119);
        textTemp40 = (TextView) findViewById(R.id.textView120);
        image1 = (ImageView) findViewById(R.id.imageView);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        image4 = (ImageView) findViewById(R.id.imageView4);
        image5 = (ImageView) findViewById(R.id.imageView5);
        image6 = (ImageView) findViewById(R.id.imageView6);
        image7 = (ImageView) findViewById(R.id.imageView7);
        image8 = (ImageView) findViewById(R.id.imageView8);
        image9 = (ImageView) findViewById(R.id.imageView9);
        image10 = (ImageView) findViewById(R.id.imageView10);
        image11 = (ImageView) findViewById(R.id.imageView11);
        image12 = (ImageView) findViewById(R.id.imageView12);
        image13 = (ImageView) findViewById(R.id.imageView13);
        image14 = (ImageView) findViewById(R.id.imageView14);
        image15 = (ImageView) findViewById(R.id.imageView15);
        image16 = (ImageView) findViewById(R.id.imageView16);
        image17 = (ImageView) findViewById(R.id.imageView17);
        image18 = (ImageView) findViewById(R.id.imageView18);
        image19 = (ImageView) findViewById(R.id.imageView19);
        image20 = (ImageView) findViewById(R.id.imageView20);
        image21 = (ImageView) findViewById(R.id.imageView21);
        image22 = (ImageView) findViewById(R.id.imageView22);
        image23 = (ImageView) findViewById(R.id.imageView23);
        image24 = (ImageView) findViewById(R.id.imageView24);
        image25 = (ImageView) findViewById(R.id.imageView25);
        image26 = (ImageView) findViewById(R.id.imageView26);
        image27 = (ImageView) findViewById(R.id.imageView27);
        image28 = (ImageView) findViewById(R.id.imageView28);
        image29 = (ImageView) findViewById(R.id.imageView29);
        image30 = (ImageView) findViewById(R.id.imageView30);
        image31 = (ImageView) findViewById(R.id.imageView31);
        image32 = (ImageView) findViewById(R.id.imageView32);
        image33 = (ImageView) findViewById(R.id.imageView33);
        image34 = (ImageView) findViewById(R.id.imageView34);
        image35 = (ImageView) findViewById(R.id.imageView35);
        image36 = (ImageView) findViewById(R.id.imageView36);
        image37 = (ImageView) findViewById(R.id.imageView37);
        image38 = (ImageView) findViewById(R.id.imageView38);
        image39 = (ImageView) findViewById(R.id.imageView39);
        image40 = (ImageView) findViewById(R.id.imageView40);
        image0 = (ImageView) findViewById(R.id.imageView0);
        textTemp0 = (TextView) findViewById(R.id.textView0);
        textMain0 = (TextView) findViewById(R.id.textView00);
        MainDay = (TextView) findViewById(R.id.Today);
        hour1=(TextView) findViewById(R.id.time1);
        hour2=(TextView) findViewById(R.id.time2);
        hour3=(TextView) findViewById(R.id.time3);
        hour4=(TextView) findViewById(R.id.time4);
        hour5=(TextView) findViewById(R.id.time5);
        hour6=(TextView) findViewById(R.id.time6);
        hour7=(TextView) findViewById(R.id.time7);
        hour8=(TextView) findViewById(R.id.time8);
        hour9=(TextView) findViewById(R.id.time9);
        hour10=(TextView) findViewById(R.id.time10);
        hour11=(TextView) findViewById(R.id.time11);
        hour12=(TextView) findViewById(R.id.time12);
        hour13=(TextView) findViewById(R.id.time13);
        hour14=(TextView) findViewById(R.id.time14);
        hour15=(TextView) findViewById(R.id.time15);
        hour16=(TextView) findViewById(R.id.time16);
        hour17=(TextView) findViewById(R.id.time17);
        hour18=(TextView) findViewById(R.id.time18);
        hour19=(TextView) findViewById(R.id.time19);
        hour20=(TextView) findViewById(R.id.time20);
        hour21=(TextView) findViewById(R.id.time21);
        hour22=(TextView) findViewById(R.id.time22);
        hour23=(TextView) findViewById(R.id.time23);
        hour24=(TextView) findViewById(R.id.time24);
        tem1=(TextView) findViewById(R.id.tem1);
        tem2=(TextView) findViewById(R.id.tem2);
        tem3=(TextView) findViewById(R.id.tem3);
        tem4=(TextView) findViewById(R.id.tem4);
        tem5=(TextView) findViewById(R.id.tem5);
        tem6=(TextView) findViewById(R.id.tem6);
        tem7=(TextView) findViewById(R.id.tem7);
        tem8=(TextView) findViewById(R.id.tem8);
        tem9=(TextView) findViewById(R.id.tem9);
        tem10=(TextView) findViewById(R.id.tem10);
        tem11=(TextView) findViewById(R.id.tem11);
        tem12=(TextView) findViewById(R.id.tem12);
        tem13=(TextView) findViewById(R.id.tem13);
        tem14=(TextView) findViewById(R.id.tem14);
        tem15=(TextView) findViewById(R.id.tem15);
        tem16=(TextView) findViewById(R.id.tem16);
        tem17=(TextView) findViewById(R.id.tem17);
        tem18=(TextView) findViewById(R.id.tem18);
        tem19=(TextView) findViewById(R.id.tem19);
        tem20=(TextView) findViewById(R.id.tem20);
        tem21=(TextView) findViewById(R.id.tem21);
        tem22=(TextView) findViewById(R.id.tem22);
        tem23=(TextView) findViewById(R.id.tem23);
        tem24=(TextView) findViewById(R.id.tem24);
        hourImg1=(ImageView) findViewById(R.id.hourly_img1);
        hourImg2=(ImageView) findViewById(R.id.hourly_img2);
        hourImg3=(ImageView) findViewById(R.id.hourly_img3);
        hourImg4=(ImageView) findViewById(R.id.hourly_img4);
        hourImg5=(ImageView) findViewById(R.id.hourly_img5);
        hourImg6=(ImageView) findViewById(R.id.hourly_img6);
        hourImg7=(ImageView) findViewById(R.id.hourly_img7);
        hourImg8=(ImageView) findViewById(R.id.hourly_img8);
        hourImg9=(ImageView) findViewById(R.id.hourly_img9);
        hourImg10=(ImageView) findViewById(R.id.hourly_img10);
        hourImg11=(ImageView) findViewById(R.id.hourly_img11);
        hourImg12=(ImageView) findViewById(R.id.hourly_img12);
        hourImg13=(ImageView) findViewById(R.id.hourly_img13);
        hourImg14=(ImageView) findViewById(R.id.hourly_img14);
        hourImg15=(ImageView) findViewById(R.id.hourly_img15);
        hourImg16=(ImageView) findViewById(R.id.hourly_img16);
        hourImg17=(ImageView) findViewById(R.id.hourly_img17);
        hourImg18=(ImageView) findViewById(R.id.hourly_img18);
        hourImg19=(ImageView) findViewById(R.id.hourly_img19);
        hourImg20=(ImageView) findViewById(R.id.hourly_img20);
        hourImg21=(ImageView) findViewById(R.id.hourly_img21);
        hourImg22=(ImageView) findViewById(R.id.hourly_img22);
        hourImg23=(ImageView) findViewById(R.id.hourly_img23);
        hourImg24=(ImageView) findViewById(R.id.hourly_img24);
        airQualityIndex=(TextView) findViewById(R.id.aqi_today);
        daily1=(TextView) findViewById(R.id.timer1);
        imagely1=(ImageView) findViewById(R.id.hour_img1);
        temperly1=(TextView) findViewById(R.id.temP1);
        daily2=(TextView) findViewById(R.id.timer2);
        imagely2=(ImageView) findViewById(R.id.hour_img2);
        temperly2=(TextView) findViewById(R.id.temP2);
        daily3=(TextView) findViewById(R.id.timer3);
        imagely3=(ImageView) findViewById(R.id.hour_img3);
        temperly3=(TextView) findViewById(R.id.temP3);
        daily4=(TextView) findViewById(R.id.timer4);
        imagely4=(ImageView) findViewById(R.id.hour_img4);
        temperly4=(TextView) findViewById(R.id.temP4);
        daily5=(TextView) findViewById(R.id.timer5);
        imagely5=(ImageView) findViewById(R.id.hour_img5);
        temperly5=(TextView) findViewById(R.id.temP5);
        daily6=(TextView) findViewById(R.id.timer6);
        imagely6=(ImageView) findViewById(R.id.hour_img6);
        temperly6=(TextView) findViewById(R.id.temP6);
        daily7=(TextView) findViewById(R.id.timer7);
        imagely7=(ImageView) findViewById(R.id.hour_img7);
        temperly7=(TextView) findViewById(R.id.temP7);
        daily8=(TextView) findViewById(R.id.timer8);
        imagely8=(ImageView) findViewById(R.id.hour_img8);
        temperly8=(TextView) findViewById(R.id.temP8);
        daily9=(TextView) findViewById(R.id.timer9);
        imagely9=(ImageView) findViewById(R.id.hour_img9);
        temperly9=(TextView) findViewById(R.id.temP9);
        daily10=(TextView) findViewById(R.id.timer10);
        imagely10=(ImageView) findViewById(R.id.hour_img10);
        temperly10=(TextView) findViewById(R.id.temP10);
        daily11=(TextView) findViewById(R.id.timer11);
        imagely11=(ImageView) findViewById(R.id.hour_img11);
        temperly11=(TextView) findViewById(R.id.temP11);
        daily12=(TextView) findViewById(R.id.timer12);
        imagely12=(ImageView) findViewById(R.id.hour_img12);
        temperly12=(TextView) findViewById(R.id.temP12);
        daily13=(TextView) findViewById(R.id.timer13);
        imagely13=(ImageView) findViewById(R.id.hour_img13);
        temperly13=(TextView) findViewById(R.id.temP13);
        daily14=(TextView) findViewById(R.id.timer14);
        imagely14=(ImageView) findViewById(R.id.hour_img14);
        temperly14=(TextView) findViewById(R.id.temP14);
        daily15=(TextView) findViewById(R.id.timer15);
        imagely15=(ImageView) findViewById(R.id.hour_img15);
        temperly15=(TextView) findViewById(R.id.temP15);
        daily16=(TextView) findViewById(R.id.timer16);
        imagely16=(ImageView) findViewById(R.id.hour_img16);
        temperly16=(TextView) findViewById(R.id.temP16);
        week1=(TextView) findViewById(R.id.weeklyDate1);
        weekDay1=(TextView) findViewById(R.id.weeklyDay1);
        weekImage1=(ImageView) findViewById(R.id.weeklyImage1);
        weekTemp1=(TextView) findViewById(R.id.weeklyTemp1);
        week2=(TextView) findViewById(R.id.weeklyDate2);
        weekDay2=(TextView) findViewById(R.id.weeklyDay2);
        weekImage2=(ImageView) findViewById(R.id.weeklyImage2);
        weekTemp2=(TextView) findViewById(R.id.weeklyTemp2);
        week3=(TextView) findViewById(R.id.weeklyDate3);
        weekDay3=(TextView) findViewById(R.id.weeklyDay3);
        weekImage3=(ImageView) findViewById(R.id.weeklyImage3);
        weekTemp3=(TextView) findViewById(R.id.weeklyTemp3);
        week4=(TextView) findViewById(R.id.weeklyDate4);
        weekDay4=(TextView) findViewById(R.id.weeklyDay4);
        weekImage4=(ImageView) findViewById(R.id.weeklyImage4);
        weekTemp4=(TextView) findViewById(R.id.weeklyTemp4);
        week5=(TextView) findViewById(R.id.weeklyDate5);
        weekDay5=(TextView) findViewById(R.id.weeklyDay5);
        weekImage5=(ImageView) findViewById(R.id.weeklyImage5);
        weekTemp5=(TextView) findViewById(R.id.weeklyTemp5);
        week6=(TextView) findViewById(R.id.weeklyDate6);
        weekDay6=(TextView) findViewById(R.id.weeklyDay6);
        weekImage6=(ImageView) findViewById(R.id.weeklyImage6);
        weekTemp6=(TextView) findViewById(R.id.weeklyTemp6);
        week7=(TextView) findViewById(R.id.weeklyDate7);
        weekDay7=(TextView) findViewById(R.id.weeklyDay7);
        weekImage7=(ImageView) findViewById(R.id.weeklyImage7);
        weekTemp7=(TextView) findViewById(R.id.weeklyTemp7);
        sunny=(TextView) findViewById(R.id.sunrise);
        unSunny=(TextView) findViewById(R.id.sunset);
        sunny_day=(ImageView) findViewById(R.id.sun);
        SunMoon=(Switch) findViewById(R.id.switcher);
        info=(TextView) findViewById(R.id.info_text5);
        SunMoon.setTextOn("Sun");
        SunMoon.setTextOff("Moon");
        card=(CardView) findViewById(R.id.card_view5);

        hourly();
        get_aqi();
        get();
        get_daily();
        SunMoon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(SunMoon.isChecked())
                {
                    info.setText("Today's Details");
                    sunny.setText("Sunrise: "+sun_rise);
                    unSunny.setText("Sunset: "+sun_set);
                    sunny_day.setImageResource(R.drawable.dukes);
                    card.setCardBackgroundColor(Color.rgb(130, 239, 253));
                    unSunny.setTextColor(Color.DKGRAY);
                    sunny.setTextColor(Color.DKGRAY);
                    info.setTextColor(Color.BLACK);


                }
                else if(!(SunMoon.isChecked())) {
                    info.setText("Today's Details");
                    sunny.setText("Moonrise: "+moon_rise);
                    unSunny.setText("Moonset: "+moon_set);
                    sunny_day.setImageResource(R.drawable.mooony);
                    card.setCardBackgroundColor(Color.rgb(12, 20, 69));
                    unSunny.setTextColor(Color.WHITE);
                    sunny.setTextColor(Color.WHITE);
                    info.setTextColor(Color.WHITE);


                }
                else{
                    info.setText("Today's Details");
                    sunny.setText("Sunrise: "+sun_rise);
                    unSunny.setText("Sunset: "+sun_set);
                    sunny_day.setImageResource(R.drawable.dukes);
                    card.setCardBackgroundColor(Color.rgb(130, 239, 253));
                    unSunny.setTextColor(Color.DKGRAY);
                    sunny.setTextColor(Color.DKGRAY);
                    info.setTextColor(Color.BLACK);

                }

            }
        });
    }




    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        PREFERENCES_HAVE_BEEN_UPDATED = true;
    }


// We can then use the data
@Override
protected void onStart() {
    super.onStart();
    if (PREFERENCES_HAVE_BEEN_UPDATED) {
        PREFERENCES_HAVE_BEEN_UPDATED = false;
    }
}
    @Override
    protected void onDestroy() {
        super.onDestroy();

        /* Unregister MainActivity as an OnPreferenceChangedListener to avoid any memory leaks. */
        PreferenceManager.getDefaultSharedPreferences(this)
                .unregisterOnSharedPreferenceChangeListener(this);
    }





    //@Override
    protected void onResume() {
        VideoView videoview = (VideoView) findViewById(R.id.videoView);
        super.onResume();
        get();
        hourly();
        get_aqi();
        get_daily();
        // to restart the video after coming from other activity like Sing up
        videoview.start();//


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.openUp:
                Intent menuIntent = new Intent(MainActivity.this, com.example.windy.settings.class);
                startActivity(menuIntent);
                return true;

            case R.id.openUpPls1:
                Intent share = new Intent(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_TEXT, "Today's weather forecast: " +temp1+"\u00B0");
                share.setType("text/plain");
                Intent shareIntent = Intent.createChooser(share, null);
                startActivity(shareIntent);
                return true;
            case R.id.openUpPls2:
                Toast.makeText(this,"Notifications enabled",Toast.LENGTH_LONG).show();
                Intent notification = new Intent(MainActivity.this, com.example.windy.Notifications.class);
                startActivity(notification);
                return true;
            case android.R.id.home:
            {onBackPressed();}




        }
        return super.onOptionsItemSelected(item);

    }
    String temp1 ;


    public static String getPreferredWeatherLocation(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        String keyForLocation = context.getString(R.string.Location);
        String defaultLocation = context.getString(R.string.Chennai);

        return sp.getString(keyForLocation, defaultLocation);
    }
    public static boolean isMetric(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String keyForUnits = context.getString(R.string.TemperatureUnits);
        String defaultUnits = context.getString(R.string.Celsius);
        String preferredUnits = sp.getString(keyForUnits, defaultUnits);
        String metric = context.getString(R.string.Celsius);
        String imperial=context.getString(R.string.Fahrenheit);
        Boolean userPrefersMetric=true;
        if(preferredUnits.equals(metric)){
            userPrefersMetric=true;
        }
        else if(preferredUnits.equals(imperial)){
            userPrefersMetric=false;
        }

        return userPrefersMetric;
    }










    public void myListener(View view) {
        Intent mainIntent = new Intent(MainActivity.this, main_weather.class);
        startActivity(mainIntent);
    }



    public void myListener1(View view){
        Intent firstIntent = new Intent(MainActivity.this,weather1.class);
        startActivity(firstIntent);
    }
    public void myListener2(View view){
        Intent firstIntent = new Intent(MainActivity.this,weather2.class);
        startActivity(firstIntent);
    }
    public void myListener3(View view){
        Intent firstIntent1 = new Intent(MainActivity.this,weather3.class);
        startActivity(firstIntent1);
    }
    public void myListener4(View view){
        Intent firstIntent2 = new Intent(MainActivity.this,weather4.class);
        startActivity(firstIntent2);
    }
    public void myListener5(View view){
        Intent firstIntent3 = new Intent(MainActivity.this,weather5.class);
        startActivity(firstIntent3);
    }
    public void myListener6(View view){
        Intent firstIntent6 = new Intent(MainActivity.this,weather6.class);
        startActivity(firstIntent6);
    }
    public void myListener7(View view){
        Intent firstIntent7 = new Intent(MainActivity.this,weather7.class);
        startActivity(firstIntent7);
    }
    public void myListener8(View view){
        Intent firstIntent8 = new Intent(MainActivity.this,weather8.class);
        startActivity(firstIntent8);
    }
    public void myListener9(View view){
        Intent firstIntent9 = new Intent(MainActivity.this,weather9.class);
        startActivity(firstIntent9);
    }
    public void myListener10(View view){
        Intent firstIntent10 = new Intent(MainActivity.this,weather10.class);
        startActivity(firstIntent10);
    }
    public void myListener11(View view){
        Intent firstIntent11 = new Intent(MainActivity.this,weather11.class);
        startActivity(firstIntent11);
    }
    public void myListener12(View view){
        Intent firstIntent12 = new Intent(MainActivity.this,weather12.class);
        startActivity(firstIntent12);
    }
    public void myListener13(View view){
        Intent firstIntent13 = new Intent(MainActivity.this,weather13.class);
        startActivity(firstIntent13);
    }
    public void myListener14(View view){
        Intent firstIntent14 = new Intent(MainActivity.this,weather14.class);
        startActivity(firstIntent14);
    }
    public void myListener15(View view){
        Intent firstIntent15 = new Intent(MainActivity.this,weather15.class);
        startActivity(firstIntent15);
    }
    public void myListener16(View view){
        Intent firstIntent16 = new Intent(MainActivity.this,weather16.class);
        startActivity(firstIntent16);
    }
    public void myListener17(View view){
        Intent firstIntent17 = new Intent(MainActivity.this,weather17.class);
        startActivity(firstIntent17);
    }
    public void myListener18(View view){
        Intent firstIntent18 = new Intent(MainActivity.this,weather18.class);
        startActivity(firstIntent18);
    }
    public void myListener19(View view){
        Intent firstIntent19 = new Intent(MainActivity.this,weather19.class);
        startActivity(firstIntent19);
    }
    public void myListener20(View view){
        Intent firstIntent20 = new Intent(MainActivity.this,weather20.class);
        startActivity(firstIntent20);
    }
    public void myListener21(View view){
        Intent firstIntent21 = new Intent(MainActivity.this,weather21.class);
        startActivity(firstIntent21);
    }
    public void myListener22(View view){
        Intent firstIntent22 = new Intent(MainActivity.this,weather22.class);
        startActivity(firstIntent22);
    }
    public void myListener23(View view){
        Intent firstIntent23 = new Intent(MainActivity.this,weather23.class);
        startActivity(firstIntent23);
    }
    public void myListener24(View view){
        Intent firstIntent24 = new Intent(MainActivity.this,weather24.class);
        startActivity(firstIntent24);
    }
    public void myListener25(View view){
        Intent firstIntent25 = new Intent(MainActivity.this,weather25.class);
        startActivity(firstIntent25);
    }
    public void myListener26(View view){
        Intent firstIntent26 = new Intent(MainActivity.this,weather26.class);
        startActivity(firstIntent26);
    }
    public void myListener27(View view){
        Intent firstIntent27 = new Intent(MainActivity.this,weather27.class);
        startActivity(firstIntent27);
    }
    public void myListener28(View view){
        Intent firstIntent28 = new Intent(MainActivity.this,weather28.class);
        startActivity(firstIntent28);
    }
    public void myListener29(View view){
        Intent firstIntent29 = new Intent(MainActivity.this,weather29.class);
        startActivity(firstIntent29);
    }
    public void myListener30(View view){
        Intent firstIntent30 = new Intent(MainActivity.this,weather30.class);
        startActivity(firstIntent30);
    }
    public void myListener31(View view){
        Intent firstIntent31 = new Intent(MainActivity.this,weather31.class);
        startActivity(firstIntent31);
    }
    public void myListener32(View view){
        Intent firstIntent32 = new Intent(MainActivity.this,weather32.class);
        startActivity(firstIntent32);
    }
    public void myListener33(View view){
        Intent firstIntent33 = new Intent(MainActivity.this,weather33.class);
        startActivity(firstIntent33);
    }
    public void myListener34(View view){
        Intent firstIntent34 = new Intent(MainActivity.this,weather34.class);
        startActivity(firstIntent34);
    }
    public void myListener35(View view){
        Intent firstIntent35 = new Intent(MainActivity.this,weather35.class);
        startActivity(firstIntent35);
    }
    public void myListener36(View view){
        Intent firstIntent36 = new Intent(MainActivity.this,weather36.class);
        startActivity(firstIntent36);
    }
    public void myListener37(View view){
        Intent firstIntent37 = new Intent(MainActivity.this,weather37.class);
        startActivity(firstIntent37);
    }
    public void myListener38(View view){
        Intent firstIntent38 = new Intent(MainActivity.this,weather38.class);
        startActivity(firstIntent38);
    }
    public void myListener39(View view){
        Intent firstIntent39 = new Intent(MainActivity.this,weather39.class);
        startActivity(firstIntent39);
    }
    public void myListener40(View view){
        Intent firstIntent40 = new Intent(MainActivity.this,weather40.class);
        startActivity(firstIntent40);
    }
    public void pollution(View view){
        Intent pollutionIntent = new Intent(MainActivity.this,Pollution.class);
        startActivity(pollutionIntent);
    }



    private void get() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        Boolean unitOfTemp=WindyPreferences.isMetric(this);
        String url = "https://api.openweathermap.org/data/2.5/forecast?q="+addressString+"&appid=2acda03f3cd040c49d571383da8815b4";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {

                            JSONArray array = response.getJSONArray("list");
                            JSONObject object = array.getJSONObject(0);
                            JSONObject article = object.getJSONObject("main");
                            String temperature = article.getString("temp");
                            String temperature_min = article.getString("temp_min");
                            Double temp = Double.parseDouble(temperature) - 273.15;
                            Double fah=(temp*1.8)+32;
                            if(unitOfTemp){
                                textTemp0.setText(temp.toString().substring(0, 2) + "\u2103");
                            }
                            else{
                                textTemp0.setText(fah.toString().substring(0, 2) + "\u2109");
                            }
                            if(unitOfTemp){
                                textTemp.setText(temp.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp.setText(fah.toString().substring(0, 2) + "\u00B0");
                            }




                            temp1=temp.toString().substring(0,2);
                            JSONArray ray = object.getJSONArray("weather");
                            JSONObject particle = ray.getJSONObject(0);
                            String main = particle.getString("main");
                            textMain.setText(main);
                            textMain0.setText(main);

                            try {
                                String date = object.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd");
                                String Main_day = format3.format(format1.parse(date));
                                MainDay.setText("Today, " + Main_day);


                            } catch (Exception e) {
                            }

                            try {
                                String date = object.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");

                                String final_day = format2.format(format1.parse(date));

                                textDate.setText(final_day);
                            } catch (Exception e) {
                            }
                            String icon = particle.getString("icon");
                            String iconUrl = "https://openweathermap.org/img/wn/" + icon + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl).into(image1);
                            Glide.with(MainActivity.this).load(iconUrl).into(image0);


                            JSONArray array2 = response.getJSONArray("list");
                            JSONObject object2 = array2.getJSONObject(1);
                            JSONObject article2 = object2.getJSONObject("main");
                            String temperature2 = article2.getString("temp");
                            Double temp2 = Double.parseDouble(temperature2) - 273.15;
                            Double fah2=(temp2*1.8)+32;
                            if(unitOfTemp){
                                textTemp2.setText(temp2.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp2.setText(fah2.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray2 = object.getJSONArray("weather");
                            JSONObject particle2 = ray2.getJSONObject(0);
                            String main2 = particle2.getString("main");
                            textMain2.setText(main2);
                            try {
                                String date2 = object2.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day2 = format2.format(format1.parse(date2));
                                textDate2.setText(final_day2);
                            } catch (Exception e) {
                            }
                            String icon2 = particle2.getString("icon");
                            String iconUrl2 = "https://openweathermap.org/img/wn/" + icon2 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl2).into(image2);


                            JSONArray array3 = response.getJSONArray("list");
                            JSONObject object3 = array3.getJSONObject(2);
                            JSONObject article3 = object3.getJSONObject("main");
                            String temperature3 = article3.getString("temp");
                            Double temp3 = Double.parseDouble(temperature3) - 273.15;
                            Double fah3=(temp3*1.8)+32;
                            if(unitOfTemp){
                                textTemp3.setText(temp3.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp3.setText(fah3.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray3 = object3.getJSONArray("weather");
                            JSONObject particle3 = ray3.getJSONObject(0);
                            String main3 = particle3.getString("main");
                            textMain3.setText(main3);
                            try {
                                String date3 = object3.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day3 = format2.format(format1.parse(date3));
                                textDate3.setText(final_day3);
                            } catch (Exception e) {
                            }

                            String icon3 = particle3.getString("icon");
                            String iconUrl3 = "https://openweathermap.org/img/wn/" + icon3 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl3).into(image3);


                            JSONArray array4 = response.getJSONArray("list");
                            JSONObject object4 = array4.getJSONObject(3);
                            JSONObject article4 = object4.getJSONObject("main");
                            String temperature4 = article4.getString("temp");
                            Double temp4 = Double.parseDouble(temperature4) - 273.15;
                            Double fah4=(temp4*1.8)+32;
                            if(unitOfTemp){
                                textTemp4.setText(temp4.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp4.setText(fah4.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray4 = object4.getJSONArray("weather");
                            JSONObject particle4 = ray4.getJSONObject(0);
                            String main4 = particle4.getString("main");
                            textMain4.setText(main4);
                            try {
                                String date4 = object4.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day4 = format2.format(format1.parse(date4));
                                textDate4.setText(final_day4);
                            } catch (Exception e) {
                            }

                            String icon4 = particle4.getString("icon");
                            String iconUrl4 = "https://openweathermap.org/img/wn/" + icon4 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl4).into(image4);


                            JSONArray array5 = response.getJSONArray("list");
                            JSONObject object5 = array5.getJSONObject(4);
                            JSONObject article5 = object5.getJSONObject("main");
                            String temperature5 = article5.getString("temp");

                            Double temp5 = Double.parseDouble(temperature5) - 273.15;
                            Double fah5=(temp5*1.8)+32;
                            if(unitOfTemp){
                                textTemp5.setText(temp5.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp5.setText(fah5.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray5 = object5.getJSONArray("weather");
                            JSONObject particle5 = ray5.getJSONObject(0);
                            String main5 = particle5.getString("main");
                            textMain5.setText(main5);
                            try {
                                String date5 = object5.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day5 = format2.format(format1.parse(date5));
                                textDate5.setText(final_day5);
                            } catch (Exception e) {
                            }

                            String icon5 = particle5.getString("icon");
                            String iconUrl5 = "https://openweathermap.org/img/wn/" + icon5 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl5).into(image5);


                            JSONArray array6 = response.getJSONArray("list");
                            JSONObject object6 = array6.getJSONObject(5);
                            JSONObject article6 = object6.getJSONObject("main");
                            String temperature6 = article6.getString("temp");
                            Double temp6 = Double.parseDouble(temperature6) - 273.15;
                            Double fah6=(temp6*1.8)+32;
                            if(unitOfTemp){
                                textTemp6.setText(temp6.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp6.setText(fah6.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray6 = object6.getJSONArray("weather");
                            JSONObject particle6 = ray6.getJSONObject(0);
                            String main6 = particle6.getString("main");
                            textMain6.setText(main6);
                            try {
                                String date6 = object6.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day6 = format2.format(format1.parse(date6));
                                textDate6.setText(final_day6);
                            } catch (Exception e) {
                            }

                            String icon6 = particle6.getString("icon");
                            String iconUrl6 = "https://openweathermap.org/img/wn/" + icon6 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl6).into(image6);


                            JSONArray array7 = response.getJSONArray("list");
                            JSONObject object7 = array7.getJSONObject(6);
                            JSONObject article7 = object7.getJSONObject("main");
                            String temperature7 = article7.getString("temp");
                            Double temp7 = Double.parseDouble(temperature7) - 273.15;
                            Double fah7=(temp7*1.8)+32;
                            if(unitOfTemp){
                                textTemp7.setText(temp7.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp7.setText(fah7.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray7 = object7.getJSONArray("weather");
                            JSONObject particle7 = ray7.getJSONObject(0);
                            String main7 = particle7.getString("main");
                            textMain7.setText(main7);
                            try {
                                String date7 = object7.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day7 = format2.format(format1.parse(date7));
                                textDate7.setText(final_day7);
                            } catch (Exception e) {
                            }

                            String icon7 = particle7.getString("icon");
                            String iconUrl7 = "https://openweathermap.org/img/wn/" + icon7 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl7).into(image7);


                            JSONArray array8 = response.getJSONArray("list");
                            JSONObject object8 = array8.getJSONObject(7);
                            JSONObject article8 = object8.getJSONObject("main");
                            String temperature8 = article8.getString("temp");
                            Double temp8 = Double.parseDouble(temperature8) - 273.15;
                            Double fah8=(temp8*1.8)+32;
                            if(unitOfTemp){
                                textTemp8.setText(temp8.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp8.setText(fah8.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray8 = object8.getJSONArray("weather");
                            JSONObject particle8 = ray8.getJSONObject(0);
                            String main8 = particle8.getString("main");
                            textMain8.setText(main8);
                            try {
                                String date8 = object8.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day8 = format2.format(format1.parse(date8));
                                textDate8.setText(final_day8);
                            } catch (Exception e) {
                            }
                            String icon8 = particle8.getString("icon");
                            String iconUrl8 = "https://openweathermap.org/img/wn/" + icon8 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl8).into(image8);


                            JSONArray array9 = response.getJSONArray("list");
                            JSONObject object9 = array9.getJSONObject(8);
                            JSONObject article9 = object9.getJSONObject("main");
                            String temperature9 = article9.getString("temp");
                            Double temp9 = Double.parseDouble(temperature9) - 273.15;
                            Double fah9=(temp9*1.8)+32;
                            if(unitOfTemp){
                                textTemp9.setText(temp9.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp9.setText(fah9.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray9 = object9.getJSONArray("weather");
                            JSONObject particle9 = ray9.getJSONObject(0);
                            String main9 = particle9.getString("main");
                            textMain9.setText(main9);
                            try {
                                String date9 = object9.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day9 = format2.format(format1.parse(date9));
                                textDate9.setText(final_day9);
                            } catch (Exception e) {
                            }

                            String icon9 = particle9.getString("icon");
                            String iconUrl9 = "https://openweathermap.org/img/wn/" + icon9 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl9).into(image9);


                            JSONArray array10 = response.getJSONArray("list");
                            JSONObject object10 = array10.getJSONObject(9);
                            JSONObject article10 = object10.getJSONObject("main");
                            String temperature10 = article10.getString("temp");
                            Double temp10 = Double.parseDouble(temperature10) - 273.15;
                            Double fah10=(temp10*1.8)+32;
                            if(unitOfTemp){
                                textTemp10.setText(temp10.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp10.setText(fah10.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray10 = object10.getJSONArray("weather");
                            JSONObject particle10 = ray10.getJSONObject(0);
                            String main10 = particle10.getString("main");
                            textMain10.setText(main10);
                            try {
                                String date10 = object10.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day10 = format2.format(format1.parse(date10));
                                textDate10.setText(final_day10);
                            } catch (Exception e) {
                            }

                            String icon10 = particle10.getString("icon");
                            String iconUrl10 = "https://openweathermap.org/img/wn/" + icon10 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl10).into(image10);


                            JSONArray array11 = response.getJSONArray("list");
                            JSONObject object11 = array11.getJSONObject(10);
                            JSONObject article11 = object11.getJSONObject("main");
                            String temperature11 = article11.getString("temp");
                            Double temp11 = Double.parseDouble(temperature11) - 273.15;
                            Double fah11=(temp11*1.8)+32;
                            if(unitOfTemp){
                                textTemp11.setText(temp11.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp11.setText(fah11.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray11 = object11.getJSONArray("weather");
                            JSONObject particle11 = ray11.getJSONObject(0);
                            String main11 = particle11.getString("main");
                            textMain11.setText(main11);
                            try {
                                String date11 = object11.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day11 = format2.format(format1.parse(date11));
                                textDate11.setText(final_day11);
                            } catch (Exception e) {
                            }

                            String icon11 = particle11.getString("icon");
                            String iconUrl11 = "https://openweathermap.org/img/wn/" + icon11 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl11).into(image11);


                            JSONArray array12 = response.getJSONArray("list");
                            JSONObject object12 = array12.getJSONObject(11);
                            JSONObject article12 = object12.getJSONObject("main");
                            String temperature12 = article12.getString("temp");
                            Double temp12 = Double.parseDouble(temperature12) - 273.15;
                            Double fah12=(temp12*1.8)+32;
                            if(unitOfTemp){
                                textTemp12.setText(temp12.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp12.setText(fah12.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray12 = object12.getJSONArray("weather");
                            JSONObject particle12 = ray12.getJSONObject(0);
                            String main12 = particle12.getString("main");
                            textMain12.setText(main12);
                            try {
                                String date12 = object12.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day12 = format2.format(format1.parse(date12));
                                textDate12.setText(final_day12);
                            } catch (Exception e) {
                            }

                            String icon12 = particle12.getString("icon");
                            String iconUrl12 = "https://openweathermap.org/img/wn/" + icon12 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl12).into(image12);

                            JSONArray array13 = response.getJSONArray("list");
                            JSONObject object13 = array13.getJSONObject(12);
                            JSONObject article13 = object13.getJSONObject("main");
                            String temperature13 = article13.getString("temp");
                            Double temp13 = Double.parseDouble(temperature13) - 273.15;
                            Double fah13=(temp13*1.8)+32;
                            if(unitOfTemp){
                                textTemp13.setText(temp13.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp13.setText(fah13.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray13 = object13.getJSONArray("weather");
                            JSONObject particle13 = ray13.getJSONObject(0);
                            String main13 = particle13.getString("main");
                            textMain13.setText(main13);
                            try {
                                String date13 = object13.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day13 = format2.format(format1.parse(date13));
                                textDate13.setText(final_day13);
                            } catch (Exception e) {
                            }

                            String icon13 = particle13.getString("icon");
                            String iconUrl13 = "https://openweathermap.org/img/wn/" + icon13 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl13).into(image13);

                            JSONArray array14 = response.getJSONArray("list");
                            JSONObject object14 = array14.getJSONObject(13);
                            JSONObject article14 = object14.getJSONObject("main");
                            String temperature14 = article14.getString("temp");
                            Double temp14 = Double.parseDouble(temperature14) - 273.15;
                            Double fah14=(temp14*1.8)+32;
                            if(unitOfTemp){
                                textTemp14.setText(temp14.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp14.setText(fah14.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray14 = object14.getJSONArray("weather");
                            JSONObject particle14 = ray14.getJSONObject(0);
                            String main14 = particle14.getString("main");
                            textMain14.setText(main14);
                            try {
                                String date14 = object14.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day14 = format2.format(format1.parse(date14));
                                textDate14.setText(final_day14);
                            } catch (Exception e) {
                            }
                            String icon14 = particle14.getString("icon");
                            String iconUrl14 = "https://openweathermap.org/img/wn/" + icon14 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl14).into(image14);

                            JSONArray array15 = response.getJSONArray("list");
                            JSONObject object15 = array15.getJSONObject(14);
                            JSONObject article15 = object15.getJSONObject("main");
                            String temperature15 = article15.getString("temp");
                            Double temp15 = Double.parseDouble(temperature15) - 273.15;
                            Double fah15=(temp15*1.8)+32;
                            if(unitOfTemp){
                                textTemp15.setText(temp15.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp15.setText(fah15.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray15 = object15.getJSONArray("weather");
                            JSONObject particle15 = ray15.getJSONObject(0);
                            String main15 = particle15.getString("main");
                            textMain15.setText(main15);
                            try {
                                String date15 = object15.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day15 = format2.format(format1.parse(date15));
                                textDate15.setText(final_day15);
                            } catch (Exception e) {
                            }

                            String icon15 = particle15.getString("icon");
                            String iconUrl15 = "https://openweathermap.org/img/wn/" + icon15 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl15).into(image15);

                            JSONArray array16 = response.getJSONArray("list");
                            JSONObject object16 = array16.getJSONObject(15);
                            JSONObject article16 = object16.getJSONObject("main");
                            String temperature16 = article16.getString("temp");
                            Double temp16 = Double.parseDouble(temperature16) - 273.15;
                            Double fah16=(temp16*1.8)+32;
                            if(unitOfTemp){
                                textTemp16.setText(temp16.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp16.setText(fah16.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray16 = object16.getJSONArray("weather");
                            JSONObject particle16 = ray16.getJSONObject(0);
                            String main16 = particle16.getString("main");
                            textMain16.setText(main16);
                            try {
                                String date16 = object16.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day16 = format2.format(format1.parse(date16));
                                textDate16.setText(final_day16);
                            } catch (Exception e) {
                            }

                            String icon16 = particle16.getString("icon");
                            String iconUrl16 = "https://openweathermap.org/img/wn/" + icon16 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl16).into(image16);

                            JSONArray array17 = response.getJSONArray("list");
                            JSONObject object17 = array17.getJSONObject(16);
                            JSONObject article17 = object17.getJSONObject("main");
                            String temperature17 = article17.getString("temp");
                            Double temp17 = Double.parseDouble(temperature17) - 273.15;
                            Double fah17=(temp17*1.8)+32;
                            if(unitOfTemp){
                                textTemp17.setText(temp17.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp17.setText(fah17.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray17 = object17.getJSONArray("weather");
                            JSONObject particle17 = ray17.getJSONObject(0);
                            String main17 = particle17.getString("main");
                            textMain17.setText(main17);
                            try {
                                String date17 = object17.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day17 = format2.format(format1.parse(date17));
                                textDate17.setText(final_day17);
                            } catch (Exception e) {
                            }
                            String icon17 = particle17.getString("icon");
                            String iconUrl17 = "https://openweathermap.org/img/wn/" + icon17 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl17).into(image17);

                            JSONArray array18 = response.getJSONArray("list");
                            JSONObject object18 = array18.getJSONObject(17);
                            JSONObject article18 = object18.getJSONObject("main");
                            String temperature18 = article18.getString("temp");
                            Double temp18 = Double.parseDouble(temperature18) - 273.15;
                            Double fah18=(temp18*1.8)+32;
                            if(unitOfTemp){
                                textTemp18.setText(temp18.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp18.setText(fah18.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray18 = object18.getJSONArray("weather");
                            JSONObject particle18 = ray18.getJSONObject(0);
                            String main18 = particle18.getString("main");
                            textMain18.setText(main18);
                            try {
                                String date18 = object18.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day18 = format2.format(format1.parse(date18));
                                textDate18.setText(final_day18);
                            } catch (Exception e) {
                            }

                            String icon18 = particle18.getString("icon");
                            String iconUrl18 = "https://openweathermap.org/img/wn/" + icon18 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl18).into(image18);

                            JSONArray array19 = response.getJSONArray("list");
                            JSONObject object19 = array19.getJSONObject(18);
                            JSONObject article19 = object19.getJSONObject("main");
                            String temperature19 = article19.getString("temp");
                            Double temp19 = Double.parseDouble(temperature19) - 273.15;
                            Double fah19=(temp19*1.8)+32;
                            if(unitOfTemp){
                                textTemp19.setText(temp19.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp19.setText(fah19.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray19 = object19.getJSONArray("weather");
                            JSONObject particle19 = ray19.getJSONObject(0);
                            String main19 = particle19.getString("main");
                            textMain19.setText(main19);
                            try {
                                String date19 = object19.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day19 = format2.format(format1.parse(date19));
                                textDate19.setText(final_day19);
                            } catch (Exception e) {
                            }

                            String icon19 = particle19.getString("icon");
                            String iconUrl19 = "https://openweathermap.org/img/wn/" + icon19 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl19).into(image19);

                            JSONArray array20 = response.getJSONArray("list");
                            JSONObject object20 = array20.getJSONObject(19);
                            JSONObject article20 = object20.getJSONObject("main");
                            String temperature20 = article20.getString("temp");
                            Double temp20 = Double.parseDouble(temperature20) - 273.15;
                            Double fah20=(temp20*1.8)+32;
                            if(unitOfTemp){
                                textTemp20.setText(temp20.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp20.setText(fah20.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray20 = object20.getJSONArray("weather");
                            JSONObject particle20 = ray20.getJSONObject(0);
                            String main20 = particle20.getString("main");
                            textMain20.setText(main20);
                            try {
                                String date20 = object20.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day20 = format2.format(format1.parse(date20));
                                textDate20.setText(final_day20);
                            } catch (Exception e) {
                            }

                            String icon20 = particle20.getString("icon");
                            String iconUrl20 = "https://openweathermap.org/img/wn/" + icon20 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl20).into(image20);

                            JSONArray array21 = response.getJSONArray("list");
                            JSONObject object21 = array21.getJSONObject(20);
                            JSONObject article21 = object21.getJSONObject("main");
                            String temperature21 = article21.getString("temp");
                            Double temp21 = Double.parseDouble(temperature21) - 273.15;
                            Double fah21=(temp21*1.8)+32;
                            if(unitOfTemp){
                                textTemp21.setText(temp21.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp21.setText(fah21.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray21 = object21.getJSONArray("weather");
                            JSONObject particle21 = ray21.getJSONObject(0);
                            String main21 = particle21.getString("main");
                            textMain21.setText(main21);
                            try {
                                String date21 = object21.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day21 = format2.format(format1.parse(date21));
                                textDate21.setText(final_day21);
                            } catch (Exception e) {
                            }

                            String icon21 = particle21.getString("icon");
                            String iconUrl21 = "https://openweathermap.org/img/wn/" + icon21 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl21).into(image21);

                            JSONArray array22 = response.getJSONArray("list");
                            JSONObject object22 = array22.getJSONObject(21);
                            JSONObject article22 = object22.getJSONObject("main");
                            String temperature22 = article22.getString("temp");
                            Double temp22 = Double.parseDouble(temperature22) - 273.15;
                            Double fah22=(temp22*1.8)+32;
                            if(unitOfTemp){
                                textTemp22.setText(temp22.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp22.setText(fah22.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray22 = object22.getJSONArray("weather");
                            JSONObject particle22 = ray22.getJSONObject(0);
                            String main22 = particle22.getString("main");
                            textMain22.setText(main22);
                            try {
                                String date22 = object22.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day22 = format2.format(format1.parse(date22));
                                textDate22.setText(final_day22);
                            } catch (Exception e) {
                            }

                            String icon22 = particle22.getString("icon");
                            String iconUrl22 = "https://openweathermap.org/img/wn/" + icon22 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl22).into(image22);

                            JSONArray array23 = response.getJSONArray("list");
                            JSONObject object23 = array23.getJSONObject(22);
                            JSONObject article23 = object23.getJSONObject("main");
                            String temperature23 = article23.getString("temp");
                            Double temp23 = Double.parseDouble(temperature23) - 273.15;
                            Double fah23=(temp23*1.8)+32;
                            if(unitOfTemp){
                                textTemp23.setText(temp23.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp23.setText(fah23.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray23 = object23.getJSONArray("weather");
                            JSONObject particle23 = ray23.getJSONObject(0);
                            String main23 = particle23.getString("main");
                            textMain23.setText(main23);
                            try {
                                String date23 = object23.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day23 = format2.format(format1.parse(date23));
                                textDate23.setText(final_day23);
                            } catch (Exception e) {
                            }

                            String icon23 = particle23.getString("icon");
                            String iconUrl23 = "https://openweathermap.org/img/wn/" + icon23 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl23).into(image23);

                            JSONArray array24 = response.getJSONArray("list");
                            JSONObject object24 = array24.getJSONObject(23);
                            JSONObject article24 = object24.getJSONObject("main");
                            String temperature24 = article24.getString("temp");
                            Double temp24 = Double.parseDouble(temperature24) - 273.15;
                            Double fah24=(temp24*1.8)+32;
                            if(unitOfTemp){
                                textTemp24.setText(temp24.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp24.setText(fah24.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray24 = object24.getJSONArray("weather");
                            JSONObject particle24 = ray24.getJSONObject(0);
                            String main24 = particle24.getString("main");
                            textMain24.setText(main24);
                            try {
                                String date24 = object24.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day24 = format2.format(format1.parse(date24));
                                textDate24.setText(final_day24);
                            } catch (Exception e) {
                            }

                            String icon24 = particle24.getString("icon");
                            String iconUrl24 = "https://openweathermap.org/img/wn/" + icon24 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl24).into(image24);

                            JSONArray array25 = response.getJSONArray("list");
                            JSONObject object25 = array25.getJSONObject(24);
                            JSONObject article25 = object25.getJSONObject("main");
                            String temperature25 = article25.getString("temp");
                            Double temp25 = Double.parseDouble(temperature25) - 273.15;
                            Double fah25=(temp25*1.8)+32;
                            if(unitOfTemp){
                                textTemp25.setText(temp25.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp25.setText(fah25.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray25 = object25.getJSONArray("weather");
                            JSONObject particle25 = ray25.getJSONObject(0);
                            String main25 = particle25.getString("main");
                            textMain25.setText(main25);
                            try {
                                String date25 = object25.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day25 = format2.format(format1.parse(date25));
                                textDate25.setText(final_day25);
                            } catch (Exception e) {
                            }

                            String icon25 = particle25.getString("icon");
                            String iconUrl25 = "https://openweathermap.org/img/wn/" + icon25 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl25).into(image25);

                            JSONArray array26 = response.getJSONArray("list");
                            JSONObject object26 = array26.getJSONObject(25);
                            JSONObject article26 = object26.getJSONObject("main");
                            String temperature26 = article26.getString("temp");
                            Double temp26 = Double.parseDouble(temperature26) - 273.15;
                            Double fah26=(temp26*1.8)+32;
                            if(unitOfTemp){
                                textTemp26.setText(temp26.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp26.setText(fah26.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray26 = object26.getJSONArray("weather");
                            JSONObject particle26 = ray26.getJSONObject(0);
                            String main26 = particle26.getString("main");
                            textMain26.setText(main26);
                            try {
                                String date26 = object26.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day26 = format2.format(format1.parse(date26));
                                textDate26.setText(final_day26);
                            } catch (Exception e) {
                            }

                            String icon26 = particle26.getString("icon");
                            String iconUrl26 = "https://openweathermap.org/img/wn/" + icon26 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl26).into(image26);

                            JSONArray array27 = response.getJSONArray("list");
                            JSONObject object27 = array27.getJSONObject(26);
                            JSONObject article27 = object27.getJSONObject("main");
                            String temperature27 = article27.getString("temp");
                            Double temp27 = Double.parseDouble(temperature27) - 273.15;
                            Double fah27=(temp27*1.8)+32;
                            if(unitOfTemp){
                                textTemp27.setText(temp27.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp27.setText(fah27.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray27 = object27.getJSONArray("weather");
                            JSONObject particle27 = ray27.getJSONObject(0);
                            String main27 = particle27.getString("main");
                            textMain27.setText(main27);
                            try {
                                String date27 = object27.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day27 = format2.format(format1.parse(date27));
                                textDate27.setText(final_day27);
                            } catch (Exception e) {
                            }

                            String icon27 = particle27.getString("icon");
                            String iconUrl27 = "https://openweathermap.org/img/wn/" + icon27 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl27).into(image27);

                            JSONArray array28 = response.getJSONArray("list");
                            JSONObject object28 = array28.getJSONObject(27);
                            JSONObject article28 = object28.getJSONObject("main");
                            String temperature28 = article28.getString("temp");
                            Double temp28 = Double.parseDouble(temperature28) - 273.15;
                            Double fah28=(temp28*1.8)+32;
                            if(unitOfTemp){
                                textTemp28.setText(temp28.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp28.setText(fah28.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray28 = object28.getJSONArray("weather");
                            JSONObject particle28 = ray28.getJSONObject(0);
                            String main28 = particle28.getString("main");
                            textMain28.setText(main28);
                            try {
                                String date28 = object28.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day28 = format2.format(format1.parse(date28));
                                textDate28.setText(final_day28);
                            } catch (Exception e) {
                            }

                            String icon28 = particle28.getString("icon");
                            String iconUrl28 = "https://openweathermap.org/img/wn/" + icon28 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl28).into(image28);

                            JSONArray array29 = response.getJSONArray("list");
                            JSONObject object29 = array29.getJSONObject(28);
                            JSONObject article29 = object29.getJSONObject("main");
                            String temperature29 = article29.getString("temp");
                            Double temp29 = Double.parseDouble(temperature29) - 273.15;
                            Double fah29=(temp29*1.8)+32;
                            if(unitOfTemp){
                                textTemp29.setText(temp29.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp29.setText(fah29.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray29 = object29.getJSONArray("weather");
                            JSONObject particle29 = ray29.getJSONObject(0);
                            String main29 = particle29.getString("main");
                            textMain29.setText(main29);
                            try {
                                String date29 = object29.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day29 = format2.format(format1.parse(date29));
                                textDate29.setText(final_day29);
                            } catch (Exception e) {
                            }

                            String icon29 = particle29.getString("icon");
                            String iconUrl29 = "https://openweathermap.org/img/wn/" + icon29 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl29).into(image29);

                            JSONArray array30 = response.getJSONArray("list");
                            JSONObject object30 = array30.getJSONObject(29);
                            JSONObject article30 = object30.getJSONObject("main");
                            String temperature30 = article30.getString("temp");
                            Double temp30 = Double.parseDouble(temperature30) - 273.15;
                            Double fah30=(temp30*1.8)+32;
                            if(unitOfTemp){
                                textTemp30.setText(temp30.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp30.setText(fah30.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray30 = object30.getJSONArray("weather");
                            JSONObject particle30 = ray30.getJSONObject(0);
                            String main30 = particle30.getString("main");
                            textMain30.setText(main30);
                            try {
                                String date30 = object30.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day30 = format2.format(format1.parse(date30));
                                textDate30.setText(final_day30);
                            } catch (Exception e) {
                            }
                            String icon30 = particle30.getString("icon");
                            String iconUrl30 = "https://openweathermap.org/img/wn/" + icon30 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl30).into(image30);

                            JSONArray array31 = response.getJSONArray("list");
                            JSONObject object31 = array31.getJSONObject(30);
                            JSONObject article31 = object31.getJSONObject("main");
                            String temperature31 = article31.getString("temp");
                            Double temp31 = Double.parseDouble(temperature31) - 273.15;
                            Double fah31=(temp31*1.8)+32;
                            if(unitOfTemp){
                                textTemp31.setText(temp31.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp31.setText(fah31.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray31 = object31.getJSONArray("weather");
                            JSONObject particle31 = ray31.getJSONObject(0);
                            String main31 = particle31.getString("main");
                            textMain31.setText(main31);
                            try {
                                String date31 = object31.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day31 = format2.format(format1.parse(date31));
                                textDate31.setText(final_day31);
                            } catch (Exception e) {
                            }

                            String icon31 = particle31.getString("icon");
                            String iconUrl31 = "https://openweathermap.org/img/wn/" + icon31 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl31).into(image31);

                            JSONArray array32 = response.getJSONArray("list");
                            JSONObject object32 = array32.getJSONObject(31);
                            JSONObject article32 = object32.getJSONObject("main");
                            String temperature32 = article32.getString("temp");
                            Double temp32 = Double.parseDouble(temperature32) - 273.15;
                            Double fah32=(temp32*1.8)+32;
                            if(unitOfTemp){
                                textTemp32.setText(temp32.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp32.setText(fah32.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray32 = object32.getJSONArray("weather");
                            JSONObject particle32 = ray32.getJSONObject(0);
                            String main32 = particle32.getString("main");
                            textMain32.setText(main32);
                            try {
                                String date32 = object32.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day32 = format2.format(format1.parse(date32));
                                textDate32.setText(final_day32);
                            } catch (Exception e) {
                            }

                            String icon32 = particle32.getString("icon");
                            String iconUrl32 = "https://openweathermap.org/img/wn/" + icon32 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl32).into(image32);

                            JSONArray array33 = response.getJSONArray("list");
                            JSONObject object33 = array33.getJSONObject(32);
                            JSONObject article33 = object33.getJSONObject("main");
                            String temperature33 = article33.getString("temp");
                            Double temp33 = Double.parseDouble(temperature33) - 273.15;
                            Double fah33=(temp33*1.8)+32;
                            if(unitOfTemp){
                                textTemp33.setText(temp33.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp33.setText(fah33.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray33 = object33.getJSONArray("weather");
                            JSONObject particle33 = ray33.getJSONObject(0);
                            String main33 = particle33.getString("main");
                            textMain33.setText(main33);
                            try {
                                String date33 = object33.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day33 = format2.format(format1.parse(date33));
                                textDate33.setText(final_day33);
                            } catch (Exception e) {
                            }

                            String icon33 = particle33.getString("icon");
                            String iconUrl33 = "https://openweathermap.org/img/wn/" + icon33 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl33).into(image33);

                            JSONArray array34 = response.getJSONArray("list");
                            JSONObject object34 = array34.getJSONObject(33);
                            JSONObject article34 = object34.getJSONObject("main");
                            String temperature34 = article34.getString("temp");
                            Double temp34 = Double.parseDouble(temperature34) - 273.15;
                            Double fah34=(temp34*1.8)+32;
                            if(unitOfTemp){
                                textTemp34.setText(temp34.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp34.setText(fah34.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray34 = object34.getJSONArray("weather");
                            JSONObject particle34 = ray34.getJSONObject(0);
                            String main34 = particle34.getString("main");
                            textMain34.setText(main34);
                            try {
                                String date34 = object34.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day34 = format2.format(format1.parse(date34));
                                textDate34.setText(final_day34);
                            } catch (Exception e) {
                            }

                            String icon34 = particle34.getString("icon");
                            String iconUrl34 = "https://openweathermap.org/img/wn/" + icon34 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl34).into(image34);

                            JSONArray array35 = response.getJSONArray("list");
                            JSONObject object35 = array35.getJSONObject(34);
                            JSONObject article35 = object35.getJSONObject("main");
                            String temperature35 = article35.getString("temp");
                            Double temp35 = Double.parseDouble(temperature35) - 273.15;
                            Double fah35=(temp35*1.8)+32;
                            if(unitOfTemp){
                                textTemp35.setText(temp35.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp35.setText(fah35.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray35 = object35.getJSONArray("weather");
                            JSONObject particle35 = ray35.getJSONObject(0);
                            String main35 = particle35.getString("main");
                            textMain35.setText(main35);
                            try {
                                String date35 = object35.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day35 = format2.format(format1.parse(date35));
                                textDate35.setText(final_day35);
                            } catch (Exception e) {
                            }

                            String icon35 = particle35.getString("icon");
                            String iconUrl35 = "https://openweathermap.org/img/wn/" + icon35 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl35).into(image35);


                            JSONArray array36 = response.getJSONArray("list");
                            JSONObject object36 = array36.getJSONObject(35);
                            JSONObject article36 = object36.getJSONObject("main");
                            String temperature36 = article36.getString("temp");
                            Double temp36 = Double.parseDouble(temperature36) - 273.15;
                            Double fah36=(temp36*1.8)+32;
                            if(unitOfTemp){
                                textTemp36.setText(temp36.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp36.setText(fah36.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray36 = object36.getJSONArray("weather");
                            JSONObject particle36 = ray36.getJSONObject(0);
                            String main36 = particle36.getString("main");
                            textMain36.setText(main36);
                            try {
                                String date36 = object36.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day36 = format2.format(format1.parse(date36));
                                textDate36.setText(final_day36);
                            } catch (Exception e) {
                            }

                            String icon36 = particle36.getString("icon");
                            String iconUrl36 = "https://openweathermap.org/img/wn/" + icon36 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl36).into(image36);

                            JSONArray array37 = response.getJSONArray("list");
                            JSONObject object37 = array37.getJSONObject(36);
                            JSONObject article37 = object37.getJSONObject("main");
                            String temperature37 = article37.getString("temp");
                            Double temp37 = Double.parseDouble(temperature37) - 273.15;
                            Double fah37=(temp37*1.8)+32;
                            if(unitOfTemp){
                                textTemp37.setText(temp37.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp37.setText(fah37.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray37 = object37.getJSONArray("weather");
                            JSONObject particle37 = ray37.getJSONObject(0);
                            String main37 = particle37.getString("main");
                            textMain37.setText(main37);
                            try {
                                String date37 = object37.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day37 = format2.format(format1.parse(date37));
                                textDate37.setText(final_day37);
                            } catch (Exception e) {
                            }


                            String icon37 = particle37.getString("icon");
                            String iconUrl37 = "https://openweathermap.org/img/wn/" + icon37 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl37).into(image37);

                            JSONArray array38 = response.getJSONArray("list");
                            JSONObject object38 = array38.getJSONObject(37);
                            JSONObject article38 = object38.getJSONObject("main");
                            String temperature38 = article38.getString("temp");
                            Double temp38 = Double.parseDouble(temperature38) - 273.15;
                            Double fah38=(temp38*1.8)+32;
                            if(unitOfTemp){
                                textTemp38.setText(temp38.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp38.setText(fah38.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray38 = object38.getJSONArray("weather");
                            JSONObject particle38 = ray38.getJSONObject(0);
                            String main38 = particle38.getString("main");
                            textMain38.setText(main38);

                            try {
                                String date38 = object38.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day38 = format2.format(format1.parse(date38));
                                textDate38.setText(final_day38);
                            } catch (Exception e) {
                            }

                            String icon38 = particle38.getString("icon");
                            String iconUrl38 = "https://openweathermap.org/img/wn/" + icon38 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl38).into(image38);

                            JSONArray array39 = response.getJSONArray("list");
                            JSONObject object39 = array39.getJSONObject(38);
                            JSONObject article39 = object39.getJSONObject("main");
                            String temperature39 = article39.getString("temp");
                            Double temp39 = Double.parseDouble(temperature39) - 273.15;
                            Double fah39=(temp39*1.8)+32;
                            if(unitOfTemp){
                                textTemp39.setText(temp39.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp39.setText(fah39.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONArray ray39 = object39.getJSONArray("weather");
                            JSONObject particle39 = ray39.getJSONObject(0);
                            String main39 = particle39.getString("main");
                            textMain39.setText(main39);
                            try {
                                String date39 = object39.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day39 = format2.format(format1.parse(date39));
                                textDate39.setText(final_day39);
                            } catch (Exception e) {
                            }


                            String icon39 = particle39.getString("icon");
                            String iconUrl39 = "https://openweathermap.org/img/wn/" + icon39 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl39).into(image39);


                            JSONArray array40 = response.getJSONArray("list");
                            JSONObject object40 = array40.getJSONObject(39);
                            JSONObject article40 = object40.getJSONObject("main");
                            String temperature40 = article40.getString("temp");
                            Double temp40 = Double.parseDouble(temperature40) - 273.15;
                            Double fah40=(temp40*1.8)+32;
                            if(unitOfTemp){
                                textTemp40.setText(temp40.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                textTemp40.setText(fah40.toString().substring(0, 2) + "\u00B0");
                            }

                            JSONArray ray40 = object40.getJSONArray("weather");
                            JSONObject particle40 = ray40.getJSONObject(0);
                            String main40 = particle40.getString("main");
                            textMain40.setText(main40);

                            try {
                                String date40 = object40.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEEE, h a");
                                String final_day40 = format2.format(format1.parse(date40));
                                textDate40.setText(final_day40);
                            } catch (Exception e) {
                            }

                            String icon40 = particle40.getString("icon");
                            String iconUrl40 = "https://openweathermap.org/img/wn/" + icon40 + "@2x.png";
                            Glide.with(MainActivity.this).load(iconUrl40).into(image40);


                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
    String sun_rise;
    String sun_set;
    String moon_set;
    String moon_rise;

    private void hourly() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        Boolean unitOfTemp=WindyPreferences.isMetric(this);
        String url ="https://api.weatherapi.com/v1/forecast.json?key=9ef0030383af453f9d0171034212003&q="+addressString+"&days=1&aqi=yes";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONObject hourForecast1=response.getJSONObject("forecast");
                            JSONArray hour_forecast_date1=hourForecast1.getJSONArray("forecastday");
                            JSONObject day_hour1=hour_forecast_date1.getJSONObject(0);
                            JSONArray hours = day_hour1.getJSONArray("hour");
                            JSONObject astronomy=day_hour1.getJSONObject("astro");
                            sun_rise=astronomy.getString("sunrise");
                            sun_set=astronomy.getString("sunset");
                            moon_rise=astronomy.getString("moonrise");
                            moon_set=astronomy.getString("moonset");
                            info.setText("Today's Details");
                            sunny.setText("Sunrise: "+sun_rise);
                            unSunny.setText("Sunset: "+sun_set);

                            JSONObject epoch1 = hours.getJSONObject(0);

                            String tempC1 = epoch1.getString("temp_c");
                            String tempF1 = epoch1.getString("temp_f");
                            if(unitOfTemp){
                                tem1.setText(tempC1.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem1.setText(tempF1.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition1 = epoch1.getJSONObject("condition");
                            String hourUrl1 = condition1.getString("icon");
                            String imgAppear = "https:" + hourUrl1;
                            Glide.with(MainActivity.this).load(imgAppear).into(hourImg1);
                            try {
                                String part1 = epoch1.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t1 = format3.format(format1.parse(part1));
                                hour1.setText(Main_time_t1);
                            } catch (Exception e) {


                            }

                            JSONObject epoch2 = hours.getJSONObject(1);

                            String tempC2 = epoch2.getString("temp_c");
                            String tempF2 = epoch2.getString("temp_f");
                            if(unitOfTemp){
                                tem2.setText(tempC2.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem2.setText(tempF2.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition2 = epoch2.getJSONObject("condition");
                            String hourUrl2 = condition1.getString("icon");
                            String imgAppear2 = "https:" + hourUrl2;
                            Glide.with(MainActivity.this).load(imgAppear2).into(hourImg2);
                            try {
                                String part2= epoch2.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t2 = format3.format(format1.parse(part2));
                                hour2.setText(Main_time_t2);
                            } catch (Exception e) {


                            }
                            JSONObject epoch3= hours.getJSONObject(2);

                            String tempC3 = epoch3.getString("temp_c");
                            String tempF3 = epoch3.getString("temp_f");
                            if(unitOfTemp){
                                tem3.setText(tempC3.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem3.setText(tempF3.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition3 = epoch3.getJSONObject("condition");
                            String hourUrl3 = condition3.getString("icon");
                            String imgAppear3 = "https:" + hourUrl3;
                            Glide.with(MainActivity.this).load(imgAppear3).into(hourImg3);
                            try {
                                String part3 = epoch3.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t3 = format3.format(format1.parse(part3));
                                hour3.setText(Main_time_t3);
                            } catch (Exception e) {


                            }
                            JSONObject epoch4 = hours.getJSONObject(3);

                            String tempC4 = epoch4.getString("temp_c");
                            String tempF4 = epoch4.getString("temp_f");
                            if(unitOfTemp){
                                tem4.setText(tempC4.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem4.setText(tempF4.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition4 = epoch4.getJSONObject("condition");
                            String hourUrl4 = condition4.getString("icon");
                            String imgAppear4 = "https:" + hourUrl4;
                            Glide.with(MainActivity.this).load(imgAppear4).into(hourImg4);
                            try {
                                String part4 = epoch4.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t4 = format3.format(format1.parse(part4));
                                hour4.setText(Main_time_t4);
                            } catch (Exception e) {


                            }
                            JSONObject epoch5 = hours.getJSONObject(4);

                            String tempC5 = epoch5.getString("temp_c");
                            String tempF5 = epoch5.getString("temp_f");
                            if(unitOfTemp){
                                tem5.setText(tempC5.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem5.setText(tempF5.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition5 = epoch5.getJSONObject("condition");
                            String hourUrl5 = condition5.getString("icon");
                            String imgAppear5 = "https:" + hourUrl5;
                            Glide.with(MainActivity.this).load(imgAppear5).into(hourImg5);
                            try {
                                String part5 = epoch5.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t5 = format3.format(format1.parse(part5));
                                hour5.setText(Main_time_t5);
                            } catch (Exception e) {


                            }
                            JSONObject epoch6 = hours.getJSONObject(5);

                            String tempC6 = epoch6.getString("temp_c");
                            String tempF6 = epoch6.getString("temp_f");
                            if(unitOfTemp){
                                tem6.setText(tempC6.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem6.setText(tempF6.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition6 = epoch6.getJSONObject("condition");
                            String hourUrl6 = condition6.getString("icon");
                            String imgAppear6 = "https:" + hourUrl6;
                            Glide.with(MainActivity.this).load(imgAppear6).into(hourImg6);
                            try {
                                String part6 = epoch6.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t6 = format3.format(format1.parse(part6));
                                hour6.setText(Main_time_t6);
                            } catch (Exception e) {


                            }
                            JSONObject epoch7 = hours.getJSONObject(6);

                            String tempC7 = epoch7.getString("temp_c");
                            String tempF7 = epoch7.getString("temp_f");
                            if(unitOfTemp){
                                tem7.setText(tempC7.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem7.setText(tempF7.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition7 = epoch7.getJSONObject("condition");
                            String hourUrl7 = condition7.getString("icon");
                            String imgAppear7 = "https:" + hourUrl7;
                            Glide.with(MainActivity.this).load(imgAppear7).into(hourImg7);
                            try {
                                String part7 = epoch7.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t7 = format3.format(format1.parse(part7));
                                hour7.setText(Main_time_t7);
                            } catch (Exception e) {


                            }
                            JSONObject epoch8 = hours.getJSONObject(7);

                            String tempC8 = epoch8.getString("temp_c");
                            String tempF8= epoch8.getString("temp_f");
                            if(unitOfTemp){
                                tem8.setText(tempC8.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem8.setText(tempF8.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition8 = epoch8.getJSONObject("condition");
                            String hourUrl8 = condition8.getString("icon");
                            String imgAppear8 = "https:" + hourUrl8;
                            Glide.with(MainActivity.this).load(imgAppear8).into(hourImg8);
                            try {
                                String part8= epoch8.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t8 = format3.format(format1.parse(part8));
                                hour8.setText(Main_time_t8);
                            } catch (Exception e) {


                            }
                            JSONObject epoch9 = hours.getJSONObject(8);

                            String tempC9 = epoch9.getString("temp_c");
                            String tempF9 = epoch9.getString("temp_f");
                            if(unitOfTemp){
                                tem9.setText(tempC9.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem9.setText(tempF9.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition9 = epoch9.getJSONObject("condition");
                            String hourUrl9 = condition9.getString("icon");
                            String imgAppear9 = "https:" + hourUrl9;
                            Glide.with(MainActivity.this).load(imgAppear9).into(hourImg9);
                            try {
                                String part9 = epoch9.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t9 = format3.format(format1.parse(part9));
                                hour9.setText(Main_time_t9);
                            } catch (Exception e) {


                            }
                            JSONObject epoch10= hours.getJSONObject(9);

                            String tempC10 = epoch10.getString("temp_c");
                            String tempF10 = epoch10.getString("temp_f");
                            if(unitOfTemp){
                                tem10.setText(tempC10.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem10.setText(tempF10.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition10 = epoch10.getJSONObject("condition");
                            String hourUrl10 = condition10.getString("icon");
                            String imgAppear10 = "https:" + hourUrl10;
                            Glide.with(MainActivity.this).load(imgAppear10).into(hourImg10);
                            try {
                                String part10 = epoch10.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t10 = format3.format(format1.parse(part10));
                                hour10.setText(Main_time_t10);
                            } catch (Exception e) {


                            }
                            JSONObject epoch11 = hours.getJSONObject(10);

                            String tempC11 = epoch11.getString("temp_c");
                            String tempF11 = epoch11.getString("temp_f");
                            if(unitOfTemp){
                                tem11.setText(tempC11.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem11.setText(tempF11.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition11 = epoch11.getJSONObject("condition");
                            String hourUrl11 = condition11.getString("icon");
                            String imgAppear11 = "https:" + hourUrl11;
                            Glide.with(MainActivity.this).load(imgAppear11).into(hourImg11);
                            try {
                                String part11 = epoch11.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t11= format3.format(format1.parse(part11));
                                hour11.setText(Main_time_t11);
                            } catch (Exception e) {


                            }
                            JSONObject epoch12 = hours.getJSONObject(11);

                            String tempC12 = epoch12.getString("temp_c");
                            String tempF12 = epoch12.getString("temp_f");
                            if(unitOfTemp){
                                tem12.setText(tempC12.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem12.setText(tempF12.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition12 = epoch12.getJSONObject("condition");
                            String hourUrl12 = condition12.getString("icon");
                            String imgAppear12 = "https:" + hourUrl12;
                            Glide.with(MainActivity.this).load(imgAppear12).into(hourImg12);
                            try {
                                String part12 = epoch12.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t12 = format3.format(format1.parse(part12));
                                hour12.setText(Main_time_t12);
                            } catch (Exception e) {


                            }
                            JSONObject epoch13 = hours.getJSONObject(12);

                            String tempC13 = epoch13.getString("temp_c");
                            String tempF13 = epoch13.getString("temp_f");
                            if(unitOfTemp){
                                tem13.setText(tempC13.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem13.setText(tempF13.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition13 = epoch13.getJSONObject("condition");
                            String hourUrl13 = condition13.getString("icon");
                            String imgAppear13 = "https:" + hourUrl13;
                            Glide.with(MainActivity.this).load(imgAppear13).into(hourImg13);
                            try {
                                String part13 = epoch13.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h");
                                String Main_time_t13 = format3.format(format1.parse(part13));
                                hour13.setText(Main_time_t13+" pm");
                            } catch (Exception e) {


                            }
                            JSONObject epoch14 = hours.getJSONObject(13);

                            String tempC14 = epoch14.getString("temp_c");
                            String tempF14 = epoch14.getString("temp_f");
                            if(unitOfTemp){
                                tem14.setText(tempC14.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem14.setText(tempF14.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition14 = epoch14.getJSONObject("condition");
                            String hourUrl14 = condition14.getString("icon");
                            String imgAppear14 = "https:" + hourUrl14;
                            Glide.with(MainActivity.this).load(imgAppear14).into(hourImg14);
                            try {
                                String part14 = epoch14.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t14 = format3.format(format1.parse(part14));
                                hour14.setText(Main_time_t14);
                            } catch (Exception e) {


                            }
                            JSONObject epoch15 = hours.getJSONObject(14);

                            String tempC15 = epoch15.getString("temp_c");
                            String tempF15 = epoch15.getString("temp_f");
                            if(unitOfTemp){
                                tem15.setText(tempC15.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem15.setText(tempF15.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition15 = epoch15.getJSONObject("condition");
                            String hourUrl15 = condition15.getString("icon");
                            String imgAppear15 = "https:" + hourUrl15;
                            Glide.with(MainActivity.this).load(imgAppear15).into(hourImg15);
                            try {
                                String part15 = epoch15.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t15 = format3.format(format1.parse(part15));
                                hour15.setText(Main_time_t15);
                            } catch (Exception e) {


                            }
                            JSONObject epoch16 = hours.getJSONObject(15);

                            String tempC16 = epoch16.getString("temp_c");
                            String tempF16 = epoch16.getString("temp_f");
                            if(unitOfTemp){
                                tem16.setText(tempC16.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem16.setText(tempF16.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition16 = epoch16.getJSONObject("condition");
                            String hourUrl16 = condition16.getString("icon");
                            String imgAppear16= "https:" + hourUrl16;
                            Glide.with(MainActivity.this).load(imgAppear16).into(hourImg16);
                            try {
                                String part16 = epoch16.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t16 = format3.format(format1.parse(part16));
                                hour16.setText(Main_time_t16);
                            } catch (Exception e) {


                            }
                            JSONObject epoch17 = hours.getJSONObject(16);

                            String tempC17 = epoch17.getString("temp_c");
                            String tempF17= epoch17.getString("temp_f");
                            if(unitOfTemp){
                                tem17.setText(tempC17.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem17.setText(tempF17.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition17 = epoch17.getJSONObject("condition");
                            String hourUrl17 = condition17.getString("icon");
                            String imgAppear17 = "https:" + hourUrl17;
                            Glide.with(MainActivity.this).load(imgAppear17).into(hourImg17);
                            try {
                                String part17 = epoch17.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t17 = format3.format(format1.parse(part17));
                                hour17.setText(Main_time_t17);
                            } catch (Exception e) {


                            }
                            JSONObject epoch18 = hours.getJSONObject(17);

                            String tempC18 = epoch18.getString("temp_c");
                            String tempF18 = epoch18.getString("temp_f");
                            if(unitOfTemp){
                                tem18.setText(tempC18.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem18.setText(tempF18.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition18 = epoch18.getJSONObject("condition");
                            String hourUrl18 = condition18.getString("icon");
                            String imgAppear18 = "https:" + hourUrl18;
                            Glide.with(MainActivity.this).load(imgAppear18).into(hourImg18);
                            try {
                                String part18 = epoch18.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t18 = format3.format(format1.parse(part18));
                                hour18.setText(Main_time_t18);
                            } catch (Exception e) {


                            }
                            JSONObject epoch19 = hours.getJSONObject(18);

                            String tempC19 = epoch19.getString("temp_c");
                            String tempF19 = epoch19.getString("temp_f");
                            if(unitOfTemp){
                                tem19.setText(tempC19.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem19.setText(tempF19.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition19 = epoch19.getJSONObject("condition");
                            String hourUrl19 = condition19.getString("icon");
                            String imgAppear19 = "https:" + hourUrl19;
                            Glide.with(MainActivity.this).load(imgAppear19).into(hourImg19);
                            try {
                                String part19 = epoch19.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t19 = format3.format(format1.parse(part19));
                                hour19.setText(Main_time_t19);
                            } catch (Exception e) {


                            }
                            JSONObject epoch20 = hours.getJSONObject(19);

                            String tempC20 = epoch20.getString("temp_c");
                            String tempF20 = epoch20.getString("temp_f");
                            if(unitOfTemp){
                                tem20.setText(tempC20.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem20.setText(tempF20.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition20 = epoch20.getJSONObject("condition");
                            String hourUrl20 = condition20.getString("icon");
                            String imgAppear20 = "https:" + hourUrl20;
                            Glide.with(MainActivity.this).load(imgAppear20).into(hourImg20);
                            try {
                                String part20 = epoch20.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t20 = format3.format(format1.parse(part20));
                                hour20.setText(Main_time_t20);
                            } catch (Exception e) {


                            }
                            JSONObject epoch21 = hours.getJSONObject(20);

                            String tempC21 = epoch21.getString("temp_c");
                            String tempF21 = epoch21.getString("temp_f");
                            if(unitOfTemp){
                                tem21.setText(tempC21.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem21.setText(tempF21.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition21 = epoch21.getJSONObject("condition");
                            String hourUrl21 = condition21.getString("icon");
                            String imgAppear21 = "https:" + hourUrl21;
                            Glide.with(MainActivity.this).load(imgAppear21).into(hourImg21);
                            try {
                                String part21 = epoch21.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t21 = format3.format(format1.parse(part21));
                                hour21.setText(Main_time_t21);
                            } catch (Exception e) {


                            }
                            JSONObject epoch22 = hours.getJSONObject(21);

                            String tempC22 = epoch22.getString("temp_c");
                            String tempF22 = epoch22.getString("temp_f");
                            if(unitOfTemp){
                                tem22.setText(tempC22.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem22.setText(tempF22.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition22 = epoch22.getJSONObject("condition");
                            String hourUrl22 = condition22.getString("icon");
                            String imgAppear22 = "https:" + hourUrl22;
                            Glide.with(MainActivity.this).load(imgAppear22).into(hourImg22);
                            try {
                                String part22 = epoch22.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t22 = format3.format(format1.parse(part22));
                                hour22.setText(Main_time_t22);
                            } catch (Exception e) {


                            }
                            JSONObject epoch23 = hours.getJSONObject(22);

                            String tempC23 = epoch23.getString("temp_c");
                            String tempF23 = epoch23.getString("temp_f");
                            if(unitOfTemp){
                                tem23.setText(tempC23.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem23.setText(tempF23.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition23 = epoch23.getJSONObject("condition");
                            String hourUrl23 = condition3.getString("icon");
                            String imgAppear23 = "https:" + hourUrl23;
                            Glide.with(MainActivity.this).load(imgAppear23).into(hourImg23);
                            try {
                                String part23 = epoch23.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t23 = format3.format(format1.parse(part23));
                                hour23.setText(Main_time_t23);
                            } catch (Exception e) {


                            }
                            JSONObject epoch24 = hours.getJSONObject(23);

                            String tempC24 = epoch24.getString("temp_c");
                            String tempF24= epoch24.getString("temp_f");
                            if(unitOfTemp){
                                tem24.setText(tempC24.toString().substring(0, 2) + "\u00B0");
                            }
                            else{
                                tem24.setText(tempF24.toString().substring(0, 2) + "\u00B0");
                            }
                            JSONObject condition24 = epoch24.getJSONObject("condition");
                            String hourUrl24 = condition24.getString("icon");
                            String imgAppear24 = "https:" + hourUrl24;
                            Glide.with(MainActivity.this).load(imgAppear24).into(hourImg24);
                            try {
                                String part24 = epoch24.getString("time");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
                                SimpleDateFormat format3 = new SimpleDateFormat("h a");
                                String Main_time_t24 = format3.format(format1.parse(part24));
                                hour24.setText(Main_time_t24);
                            } catch (Exception e) {


                            }
                        }
                        catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
    private void get_aqi() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        Boolean unitOfTemp=WindyPreferences.isMetric(this);
        String url = "https://api.weatherapi.com/v1/forecast.json?key=9ef0030383af453f9d0171034212003&q="+addressString+"&days=1&aqi=yes";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONObject aqi_main = response.getJSONObject("current");
                            JSONObject aqi_main2 = aqi_main.getJSONObject("air_quality");
                            Double air1 = aqi_main2.getDouble("co");
                            Double air2 = aqi_main2.getDouble("no2");
                            Double air3 = aqi_main2.getDouble("o3");
                            Double air4 = aqi_main2.getDouble("so2");
                            Double air5 = aqi_main2.getDouble("pm2_5");
                            Double air6 = aqi_main2.getDouble("pm10");
                            Double air = air1 + air2 + air3 + air4 + air5 + air6;
                            Double aqi = air / 6;
                            if(air1>air2){
                                if(air1>air3){
                                    if(air1>air4){
                                        if(air1>air5){
                                            if(air1>air6){
                                                airQualityIndex.setText(air1.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }

                                        }

                                    }else{
                                        if(air4>air5){
                                            if(air4>air6){
                                                airQualityIndex.setText(air4.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }
                                }else{
                                    if(air3>air4){
                                        if(air3>air5){
                                            if(air3>air6){
                                                airQualityIndex.setText(air3.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }else{
                                        if(air4>air5){
                                            if(air4>air6){
                                                airQualityIndex.setText(air4.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }
                                }
                            }else{
                                if(air2>air3){
                                    if(air2>air4){
                                        if(air2>air5){
                                            if(air2>air6){
                                                airQualityIndex.setText(air2.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }else{
                                        if(air4>air5){
                                            if(air4>air6){
                                                airQualityIndex.setText(air4.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }

                                    }
                                }else{
                                    if(air3>air4){
                                        if(air3>air5){
                                            if(air3>air6){
                                                airQualityIndex.setText(air3.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }else{
                                        if(air4>air5){
                                            if(air4>air6){
                                                airQualityIndex.setText(air4.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }else{
                                            if(air5>air6){
                                                airQualityIndex.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                            else{
                                                airQualityIndex.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                                            }
                                        }
                                    }
                                }
                            }


                        }catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
    private void get_daily() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        Boolean unitOfTemp=WindyPreferences.isMetric(this);
        String unit;
        if(unitOfTemp){
            unit="M";
        }
        else{
            unit="I";
        }
        String url = "https://api.weatherbit.io/v2.0/forecast/daily?city="+addressString+"&key=0be17abc16ae481284c71ad148d80130&units="+unit;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray data=response.getJSONArray("data");
                            JSONObject day1=data.getJSONObject(0);
                            Double tempers=day1.getDouble("temp");
                            int temper=(int)Math.round(tempers);
                            temperly1.setText(temper+"\u00B0");
                            weekTemp1.setText(temper+"\u00B0");

                            try{
                                String date1=day1.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day1 = format2.format(format1.parse(date1));
                                String week_day1 = format3.format(format1.parse(date1));
                                String week_date1 = format4.format(format1.parse(date1));
                                daily1.setText(first_day1);
                                weekDay1.setText(week_day1);
                                week1.setText(week_date1);


                            } catch (Exception e) {
                            }

                            JSONObject weather1=day1.getJSONObject("weather");
                            String visual=weather1.getString("icon");
                            String weather_url1="https://www.weatherbit.io/static/img/icons/"+visual+".png";
                            Glide.with(MainActivity.this).load(weather_url1).into(imagely1);
                            Glide.with(MainActivity.this).load(weather_url1).into(weekImage1);

                            JSONObject day2=data.getJSONObject(1);
                            Double tempers2=day2.getDouble("temp");
                            int temper2=(int)Math.round(tempers2);
                            temperly2.setText(temper2+"\u00B0");
                            weekTemp2.setText(temper2+"\u00B0");
                            try{
                                String date2=day2.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day2 = format2.format(format1.parse(date2));
                                String week_day2 = format3.format(format1.parse(date2));
                                String week_date2 = format4.format(format1.parse(date2));
                                daily2.setText(first_day2);
                                weekDay2.setText(week_day2);
                                week2.setText(week_date2);
                            } catch (Exception e) {
                            }

                            JSONObject weather2=day2.getJSONObject("weather");
                            String visual2=weather2.getString("icon");
                            String weather_url2="https://www.weatherbit.io/static/img/icons/"+visual2+".png";
                            Glide.with(MainActivity.this).load(weather_url2).into(imagely2);
                            Glide.with(MainActivity.this).load(weather_url2).into(weekImage2);

                            JSONObject day3=data.getJSONObject(2);
                            Double tempers3=day3.getDouble("temp");
                            int temper3=(int)Math.round(tempers3);
                            temperly3.setText(temper3+"\u00B0");
                            weekTemp3.setText(temper3+"\u00B0");

                            try{
                                String date3=day3.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day3 = format2.format(format1.parse(date3));
                                String week_day3 = format3.format(format1.parse(date3));
                                String week_date3 = format4.format(format1.parse(date3));
                                daily3.setText(first_day3);
                                weekDay3.setText(week_day3);
                                week3.setText(week_date3);
                            } catch (Exception e) {
                            }

                            JSONObject weather3=day3.getJSONObject("weather");
                            String visual3=weather3.getString("icon");
                            String weather_url3="https://www.weatherbit.io/static/img/icons/"+visual3+".png";
                            Glide.with(MainActivity.this).load(weather_url3).into(imagely3);
                            Glide.with(MainActivity.this).load(weather_url3).into(weekImage3);

                            JSONObject day4=data.getJSONObject(3);
                            Double tempers4=day4.getDouble("temp");
                            int temper4=(int)Math.round(tempers4);
                            temperly4.setText(temper4+"\u00B0");
                            weekTemp4.setText(temper4+"\u00B0");

                            try{
                                String date4=day4.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day4= format2.format(format1.parse(date4));
                                String week_day4 = format3.format(format1.parse(date4));
                                String week_date4 = format4.format(format1.parse(date4));
                                daily4.setText(first_day4);
                                weekDay4.setText(week_day4);
                                week4.setText(week_date4);
                            } catch (Exception e) {
                            }

                            JSONObject weather4=day4.getJSONObject("weather");
                            String visual4=weather4.getString("icon");
                            String weather_url4="https://www.weatherbit.io/static/img/icons/"+visual4+".png";
                            Glide.with(MainActivity.this).load(weather_url4 ).into(imagely4);
                            Glide.with(MainActivity.this).load(weather_url4).into(weekImage4);

                            JSONObject day5=data.getJSONObject(4);
                            Double tempers5=day5.getDouble("temp");
                            int temper5=(int)Math.round(tempers5);
                            temperly5.setText(temper5+"\u00B0");
                            weekTemp5.setText(temper5+"\u00B0");

                            try{
                                String date5=day5.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day5 = format2.format(format1.parse(date5));
                                String week_day5 = format3.format(format1.parse(date5));
                                String week_date5 = format4.format(format1.parse(date5));
                                daily5.setText(first_day5);
                                weekDay5.setText(week_day5);
                                week5.setText(week_date5);
                            } catch (Exception e) {
                            }

                            JSONObject weather5=day5.getJSONObject("weather");
                            String visual5=weather5.getString("icon");
                            String weather_url5="https://www.weatherbit.io/static/img/icons/"+visual5+".png";
                            Glide.with(MainActivity.this).load(weather_url5).into(imagely5);
                            Glide.with(MainActivity.this).load(weather_url5).into(weekImage5);

                            JSONObject day6=data.getJSONObject(5);
                            Double tempers6=day6.getDouble("temp");
                            int temper6=(int)Math.round(tempers6);
                            temperly6.setText(temper6+"\u00B0");
                            weekTemp6.setText(temper6+"\u00B0");

                            try{
                                String date6=day6.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day6 = format2.format(format1.parse(date6));
                                String week_day6 = format3.format(format1.parse(date6));
                                String week_date6 = format4.format(format1.parse(date6));

                                daily6.setText(first_day6);
                                weekDay6.setText(week_day6);
                                week6.setText(week_date6);
                            } catch (Exception e) {
                            }

                            JSONObject weather6=day6.getJSONObject("weather");
                            String visual6=weather6.getString("icon");
                            String weather_url6="https://www.weatherbit.io/static/img/icons/"+visual6+".png";
                            Glide.with(MainActivity.this).load(weather_url6).into(imagely6);
                            Glide.with(MainActivity.this).load(weather_url6).into(weekImage6);

                            JSONObject day7=data.getJSONObject(6);
                            Double tempers7=day7.getDouble("temp");
                            int temper7=(int)Math.round(tempers7);
                            temperly7.setText(temper7+"\u00B0");
                            weekTemp7.setText(temper7+"\u00B0");

                            try{
                                String date7=day7.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
                                SimpleDateFormat format4 = new SimpleDateFormat("MMM dd");
                                String first_day7 = format2.format(format1.parse(date7));
                                String week_day7 = format3.format(format1.parse(date7));
                                String week_date7 = format4.format(format1.parse(date7));
                                daily7.setText(first_day7);
                                weekDay7.setText(week_day7);
                                week7.setText(week_date7);
                            } catch (Exception e) {
                            }

                            JSONObject weather7=day7.getJSONObject("weather");
                            String visual7=weather7.getString("icon");
                            String weather_url7="https://www.weatherbit.io/static/img/icons/"+visual7+".png";
                            Glide.with(MainActivity.this).load(weather_url7).into(imagely7);
                            Glide.with(MainActivity.this).load(weather_url7).into(weekImage7);

                            JSONObject day8=data.getJSONObject(7);
                            Double tempers8=day8.getDouble("temp");
                            int temper8=(int)Math.round(tempers8);
                            temperly8.setText(temper8+"\u00B0");

                            try{
                                String date8=day8.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day8 = format2.format(format1.parse(date8));
                                daily8.setText(first_day8);
                            } catch (Exception e) {
                            }

                            JSONObject weather8=day8.getJSONObject("weather");
                            String visual8=weather8.getString("icon");
                            String weather_url8="https://www.weatherbit.io/static/img/icons/"+visual8+".png";
                            Glide.with(MainActivity.this).load(weather_url8).into(imagely8);

                            JSONObject day9=data.getJSONObject(8);
                            Double tempers9=day9.getDouble("temp");
                            int temper9=(int)Math.round(tempers9);
                            temperly9.setText(temper9+"\u00B0");

                            try{
                                String date9=day9.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day9 = format2.format(format1.parse(date9));
                                daily9.setText(first_day9);
                            } catch (Exception e) {
                            }

                            JSONObject weather9=day9.getJSONObject("weather");
                            String visual9=weather9.getString("icon");
                            String weather_url9="https://www.weatherbit.io/static/img/icons/"+visual9+".png";
                            Glide.with(MainActivity.this).load(weather_url9).into(imagely9);

                            JSONObject day10=data.getJSONObject(9);
                            Double tempers10=day10.getDouble("temp");
                            int temper10=(int)Math.round(tempers10);
                            temperly10.setText(temper10+"\u00B0");

                            try{
                                String date10=day10.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day10 = format2.format(format1.parse(date10));
                                daily10.setText(first_day10);
                            } catch (Exception e) {
                            }

                            JSONObject weather10=day10.getJSONObject("weather");
                            String visual10=weather10.getString("icon");
                            String weather_url10="https://www.weatherbit.io/static/img/icons/"+visual10+".png";
                            Glide.with(MainActivity.this).load(weather_url10).into(imagely10);

                            JSONObject day11=data.getJSONObject(10);
                            Double tempers11=day11.getDouble("temp");
                            int temper11=(int)Math.round(tempers11);
                            temperly11.setText(temper11+"\u00B0");

                            try{
                                String date11=day11.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day11 = format2.format(format1.parse(date11));
                                daily11.setText(first_day11);
                            } catch (Exception e) {
                            }

                            JSONObject weather11=day11.getJSONObject("weather");
                            String visual11=weather11.getString("icon");
                            String weather_url11="https://www.weatherbit.io/static/img/icons/"+visual11+".png";
                            Glide.with(MainActivity.this).load(weather_url11).into(imagely11);

                            JSONObject day12=data.getJSONObject(11);
                            Double tempers12=day12.getDouble("temp");
                            int temper12=(int)Math.round(tempers12);
                            temperly12.setText(temper12+"\u00B0");

                            try{
                                String date12=day12.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day12 = format2.format(format1.parse(date12));
                                daily12.setText(first_day12);
                            } catch (Exception e) {
                            }

                            JSONObject weather12=day12.getJSONObject("weather");
                            String visual12=weather12.getString("icon");
                            String weather_url12="https://www.weatherbit.io/static/img/icons/"+visual12+".png";
                            Glide.with(MainActivity.this).load(weather_url12).into(imagely12);

                            JSONObject day13=data.getJSONObject(12);
                            Double tempers13=day13.getDouble("temp");
                            int temper13=(int)Math.round(tempers13);
                            temperly13.setText(temper13+"\u00B0");

                            try{
                                String date13=day13.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day13 = format2.format(format1.parse(date13));
                                daily13.setText(first_day13);
                            } catch (Exception e) {
                            }

                            JSONObject weather13=day13.getJSONObject("weather");
                            String visual13=weather13.getString("icon");
                            String weather_url13="https://www.weatherbit.io/static/img/icons/"+visual13+".png";
                            Glide.with(MainActivity.this).load(weather_url13).into(imagely13);

                            JSONObject day14=data.getJSONObject(13);
                            Double tempers14=day14.getDouble("temp");
                            int temper14=(int)Math.round(tempers14);
                            temperly14.setText(temper14+"\u00B0");

                            try{
                                String date14=day14.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day14 = format2.format(format1.parse(date14));
                                daily14.setText(first_day14);
                            } catch (Exception e) {
                            }

                            JSONObject weather14=day14.getJSONObject("weather");
                            String visual14=weather14.getString("icon");
                            String weather_url14="https://www.weatherbit.io/static/img/icons/"+visual14+".png";
                            Glide.with(MainActivity.this).load(weather_url14).into(imagely14);

                            JSONObject day15=data.getJSONObject(14);
                            Double tempers15=day15.getDouble("temp");
                            int temper15=(int)Math.round(tempers15);
                            temperly15.setText(temper15+"\u00B0");

                            try{
                                String date15=day15.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day15 = format2.format(format1.parse(date15));
                                daily15.setText(first_day15);
                            } catch (Exception e) {
                            }

                            JSONObject weather15=day15.getJSONObject("weather");
                            String visual15=weather15.getString("icon");
                            String weather_url15="https://www.weatherbit.io/static/img/icons/"+visual15+".png";
                            Glide.with(MainActivity.this).load(weather_url15).into(imagely15);

                            JSONObject day16=data.getJSONObject(15);
                            Double tempers16=day16.getDouble("temp");
                            int temper16=(int)Math.round(tempers16);
                            temperly16.setText(temper16+"\u00B0");

                            try{
                                String date16=day16.getString("datetime");

                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format2 = new SimpleDateFormat("EEE dd");
                                String first_day16 = format2.format(format1.parse(date16));
                                daily16.setText(first_day16);
                            } catch (Exception e) {
                            }

                            JSONObject weather16=day16.getJSONObject("weather");
                            String visual16=weather16.getString("icon");
                            String weather_url16="https://www.weatherbit.io/static/img/icons/"+visual16+".png";
                            Glide.with(MainActivity.this).load(weather_url16).into(imagely16);




                        }
                        catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                        }




                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
                    }






