package com.example.windy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FrontPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
    }
    public void myNews(View view){
        Intent NewsIntent = new Intent(FrontPage.this, News.class);
        startActivity(NewsIntent);
    }
    public void myDay(View view){
        Intent DayIntent = new Intent(FrontPage.this, Day.class);
        startActivity(DayIntent);
    }
    public void myFact(View view){
        Intent FactIntent = new Intent(FrontPage.this, Fact.class);
        startActivity(FactIntent);
    }
    public void myLive(View view){
        Intent LiveIntent = new Intent(FrontPage.this, MainActivity.class);
        startActivity(LiveIntent);
    }
    public void myTourist(View view){
        Intent TouristIntent = new Intent(FrontPage.this, Tourist.class);
        startActivity(TouristIntent);
    }
    public void myRoute(View view){
        Intent RouteIntent = new Intent(FrontPage.this, Route.class);
        startActivity(RouteIntent);
    }


}
