package com.example.windy;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

import java.text.SimpleDateFormat;

public class Mumbai16 extends AppCompatActivity {
    TextView Date;
    TextView MaxTemp;
    TextView Head;
    TextView Humidity;
    TextView Pressure;
    TextView Wind;
    TextView Main;
    ImageView img;
    TextView Date1;
    TextView MaxTemp1;
    TextView Head1;
    TextView Humidity1;
    TextView Pressure1;
    TextView Wind1;
    TextView Main1;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mumbai16);
        setTitle("Dharavi Slum");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Date=(TextView)(findViewById(R.id.textDate));
        Head=(TextView)(findViewById(R.id.head));
        Main=(TextView)(findViewById(R.id.textMain));
        Wind=(TextView)(findViewById(R.id.textWind));
        Pressure=(TextView)(findViewById(R.id.textPressure));
        Humidity=(TextView)(findViewById(R.id.textHumidity));
        MaxTemp=(TextView)(findViewById(R.id.textMaxTemp));
        Date1=(TextView)(findViewById(R.id.textDate1));
        Head1=(TextView)(findViewById(R.id.head1));
        Main1=(TextView)(findViewById(R.id.textMain1));
        Wind1=(TextView)(findViewById(R.id.textWind1));
        Humidity1=(TextView)(findViewById(R.id.textHumidity1));
        MaxTemp1=(TextView)(findViewById(R.id.textMaxTemp1));

        img=(ImageView)(findViewById(R.id.image));
        img1=(ImageView)(findViewById(R.id.image1));


        get_main();

    }

    private void get_main() {
        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        String url="https://api.weatherapi.com/v1/forecast.json?key=9ef0030383af453f9d0171034212003&q=dharavi&days=2";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {

                            JSONObject forecast1=response.getJSONObject("forecast");
                            JSONArray forecast_date=forecast1.getJSONArray("forecastday");
                            JSONObject day=forecast_date.getJSONObject(0);
                            JSONObject day1=forecast_date.getJSONObject(1);

                            try {
                                String date=day.getString("date");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd");
                                String Main_day_d = format3.format(format1.parse(date));
                                Date.setText(Main_day_d);
                            } catch (Exception e) {
                            }
                            try {
                                String date1=day1.getString("date");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd");
                                String Main_day_d1 = format3.format(format1.parse(date1));
                                Date1.setText(Main_day_d1);
                            } catch (Exception e) {
                            }
                            JSONObject realDay=day.getJSONObject("day");
                            String temp=realDay.getString("avgtemp_c");
                            String humidity=realDay.getString("avghumidity");
                            String wind=realDay.getString("maxwind_kph");
                            Wind.setText("Wind: "+wind+" kph");
                            Humidity.setText("Humidity: " +humidity+"%");
                            MaxTemp.setText(temp.substring(0,2)+"\u2103");
                            JSONObject conditions=realDay.getJSONObject("condition");
                            String icon=conditions.getString("icon");
                            String iconUrl="https:"+icon;
                            String main=conditions.getString("text");
                            Main.setText(main);
                            Glide.with(Mumbai16.this).load(iconUrl).into(img);
                            JSONObject realDay1=day1.getJSONObject("day");
                            String temp1=realDay1.getString("avgtemp_c");
                            String humidity1=realDay1.getString("avghumidity");
                            String wind1=realDay1.getString("maxwind_kph");
                            Wind1.setText("Wind: "+wind1+" kph");
                            Humidity1.setText("Humidity: " +humidity1+"%");
                            MaxTemp1.setText(temp1.substring(0,2)+"\u2103");
                            JSONObject conditions1=realDay1.getJSONObject("condition");
                            String icon1=conditions1.getString("icon");
                            String iconUrl1="https:"+icon1;
                            String main1=conditions1.getString("text");
                            Main1.setText(main1);
                            Glide.with(Mumbai16.this).load(iconUrl1).into(img1);
                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Mumbai16.this, error.toString(),Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
