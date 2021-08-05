package com.example.windy;

import  android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

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

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Random;

import static androidx.core.content.ContextCompat.getSystemService;

public class  Notifications extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        get_main();
        noti();
    }
    public void noti() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "1")
                .setSmallIcon(R.drawable.ic_baseline_cloud_24)
                .setOngoing(true)
                .setContentTitle("Weather")
                .setContentText(pls)
                .setContentIntent(pendingIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);


        //NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("1", name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
            notificationManager.notify(1, builder.build());

        }
    }
    Random rand = new Random();
    int temp1=rand.nextInt(4)+26;
    String pls="Today's weather forecast: "+temp1+"\u00B0"+" in Chennai";

    private void get_main(){
        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        String url="https://api.openweathermap.org/data/2.5/forecast?q=chennai&appid=2acda03f3cd040c49d571383da8815b4";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray array=response.getJSONArray("list");
                            JSONObject object=array.getJSONObject(0);
                            JSONObject article=object.getJSONObject("main");
                            String temperature=article.getString("temp");
                            Double  temp = Double.parseDouble(temperature) - 273.15;
                            String temp11=temp.toString().substring(0,2);
                            JSONArray ray=object.getJSONArray("weather");
                            JSONObject particle=ray.getJSONObject(0);
                            String main=particle.getString("main");

                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Notifications.this, error.toString(),Toast.LENGTH_LONG).show();

                    }
                });
        queue.add(jsonObjectRequest);


    }





    }





















