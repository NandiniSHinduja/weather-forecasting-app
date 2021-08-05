package com.example.windy;

import android.app.Activity;
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

public class weather12 extends AppCompatActivity {
    TextView Date;
    TextView MaxTemp;
    TextView Head;
    TextView Humidity;
    TextView Pressure;
    TextView Wind;
    TextView Main;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Details");
        setContentView(R.layout.weather12);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Date=(TextView)(findViewById(R.id.textDate));
        Head=(TextView)(findViewById(R.id.head));
        Main=(TextView)(findViewById(R.id.textMain));
        Wind=(TextView)(findViewById(R.id.textDate));
        Pressure=(TextView)(findViewById(R.id.textPressure));
        Humidity=(TextView)(findViewById(R.id.textHumidity));
        MaxTemp=(TextView)(findViewById(R.id.textMaxTemp));

        img=(ImageView)(findViewById(R.id.image));

        get_main();


    }

    private void get_main(){
        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        String addressString = WindyPreferences.getPreferredWeatherLocation(this);
        Boolean unitOfTemp=WindyPreferences.isMetric(this);
        String url="https://api.openweathermap.org/data/2.5/forecast?q="+addressString+"&appid=2acda03f3cd040c49d571383da8815b4";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {

                            JSONArray array=response.getJSONArray("list");
                            JSONObject object=array.getJSONObject(11);
                            JSONObject article=object.getJSONObject("main");
                            JSONObject article2=object.getJSONObject("wind");

                            String temperature=article.getString("temp");

                            Double temp = Double.parseDouble(temperature) - 273.15;
                            Double fah=(temp*1.8)+32;
                            if(unitOfTemp){
                                MaxTemp.setText(temp.toString().substring(0, 2) + "\u2103");
                            }
                            else{
                                MaxTemp.setText(fah.toString().substring(0, 2) + "\u2109");
                            }
                            JSONArray ray=object.getJSONArray("weather");
                            JSONObject particle=ray.getJSONObject(0);
                            String main=particle.getString("main");
                            String pressure=article.getString("pressure");
                            String humidity=article.getString("humidity");
                            Main.setText(main);

                            Pressure.setText("Pressure: "+pressure+" hPa");
                            Humidity.setText("Humidity: " +humidity+"%");

                            String icon=particle.getString("icon");
                            String iconUrl="https://openweathermap.org/img/wn/"+icon+"@2x.png";
                            Glide.with(weather12.this).load(iconUrl).into(img);


                            try {
                                String date = object.getString("dt_txt");
                                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                SimpleDateFormat format3 = new SimpleDateFormat("MMM dd");
                                SimpleDateFormat format4= new SimpleDateFormat("h a");
                                String Main_day = format4.format(format1.parse(date));
                                String Main_day_d = format3.format(format1.parse(date));
                                Date.setText(Main_day);
                                Head.setText(Main_day_d);


                            } catch (Exception e) {
                            }






                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_LONG).show();


                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(weather12.this, error.toString(),Toast.LENGTH_LONG).show();

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



