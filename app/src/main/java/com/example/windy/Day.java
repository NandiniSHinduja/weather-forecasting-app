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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Day extends AppCompatActivity {
    TextView text;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day);
        setTitle("Day Preparation");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        get_day();
        text=(TextView)findViewById(R.id.text);
        image=(ImageView)findViewById(R.id.img);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    private void get_day() {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        String url = "https://api.weatherbit.io/v2.0/forecast/daily?city=" + addressString + "&key=0be17abc16ae481284c71ad148d80130&units=M";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray data = response.getJSONArray("data");
                            JSONObject day1 = data.getJSONObject(0);
                            Double tempers = day1.getDouble("temp");
                            int temper = (int) Math.round(tempers);
                            if(temper<=10){
                                text.setText("Its snowy outside. Better wear gloves and light up a fire!");
                                image.setImageResource(R.drawable.gloves);

                            }
                            else if(temper>10 & temper<=20){
                                text.setText("It might rain today. Carry an umbrella or wear a raincoat!");
                                image.setImageResource(R.drawable.umbrella);
                            }
                            else if(temper>20 & temper<=30){
                                text.setText("It scorching hot outside. Don't forget your sunscreen and shades!");
                                image.setImageResource(R.drawable.sunscreen);
                            }
                            else if(temper>30){
                                text.setText("Its extremely sunny outdoors. Better stay home!");
                                image.setImageResource(R.drawable.homey);
                            }

                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                        }


                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Day.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
}
