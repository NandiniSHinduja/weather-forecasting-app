package com.example.windy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Route extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route);
        setTitle("Route Weather");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    EditText start,end;
    String start1, end1;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }



        public void myWeatherRoute (View view){
            start = (EditText) findViewById(R.id.source);
            end = (EditText) findViewById(R.id.dest);
            start1 = start.getText().toString();
            end1 = end.getText().toString();
            if (start1.equals("Chennai") && end1.equals("Salem")) {
                Intent myRoute = new Intent(Route.this, MapRoute.class);
                startActivity(myRoute);
            }
            else if (start1.equals("Delhi") && end1.equals("Chennai")) {
                Intent myRoute2 = new Intent(Route.this, MapRoute2.class);
                startActivity(myRoute2);
            }
            else if (start1.equals("Bangalore") && end1.equals("Surat")) {
                Intent myRoute3 = new Intent(Route.this, MapRoute3.class);
                startActivity(myRoute3);
            }
            else if (start1.equals("Hyderabad") && end1.equals("Coimbatore")) {
                Intent myRoute4 = new Intent(Route.this, MapRoute4.class);
                startActivity(myRoute4);
            }
            else if (start1.equals("Mumbai") && end1.equals("Chennai") ) {
                Intent myRoute5 = new Intent(Route.this, MapRoute5.class);
                startActivity(myRoute5);
            }
            else {
                Toast.makeText(this, "Please enter a valid starting location and destination location.", Toast.LENGTH_SHORT).show();
            }
        }
    }

