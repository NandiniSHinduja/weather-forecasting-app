package com.example.windy;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Pollution extends AppCompatActivity {
    TextView airQualityIndex1;
    TextView airQualityIndex2;
    TextView airQualityIndex3;
    TextView airQualityIndex4;
    TextView airQualityIndex5;
    TextView airQualityIndex6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pollution);
        setTitle("Air Pollution");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        airQualityIndex1=(TextView) findViewById(R.id.prime);
        airQualityIndex2=(TextView) findViewById(R.id.prime2);
        airQualityIndex3=(TextView) findViewById(R.id.prime3);
        airQualityIndex4=(TextView) findViewById(R.id.prime4);
        airQualityIndex5=(TextView) findViewById(R.id.prime5);
        airQualityIndex6=(TextView) findViewById(R.id.prime6);
        get_aqi();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
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
                            airQualityIndex1.setText(air1.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                            airQualityIndex2.setText(air2.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                            airQualityIndex3.setText(air3.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                            airQualityIndex4.setText(air4.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                            airQualityIndex5.setText(air5.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                            airQualityIndex6.setText(air6.toString().substring(0,3)+" "+"\u00B5"+"g/m3");
                        }catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Pollution.this, error.toString(), Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);

    }
}
