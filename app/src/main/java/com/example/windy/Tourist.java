package com.example.windy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tourist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist);
        setTitle("Tourist Weather");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void myChennai(View view){
        Intent ChennaiIntent = new Intent(Tourist.this, Chennai.class);
        startActivity(ChennaiIntent);
    }
    public void myMumbai(View view){
        Intent MumbaiIntent = new Intent(Tourist.this, Mumbai.class);
        startActivity(MumbaiIntent);
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
