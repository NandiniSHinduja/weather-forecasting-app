package com.example.windy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Chennai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chennai_spots);
        setTitle("Chennai tourist spots ");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
    public void myRipon(View view){
        Intent RiponIntent = new Intent(Chennai.this, Chennai1.class);
        startActivity(RiponIntent);
    }
    public void myGov(View view){
        Intent GovIntent = new Intent(Chennai.this, Chennai2.class);
        startActivity(GovIntent);
    }
    public void myMarina(View view){
        Intent MarinaIntent = new Intent(Chennai.this, Chennai3.class);
        startActivity(MarinaIntent);
    }
    public void myTho(View view){
        Intent ThoIntent = new Intent(Chennai.this, Chennai4.class);
        startActivity(ThoIntent);
    }
    public void myEll(View view){
        Intent EllIntent = new Intent(Chennai.this, Chennai5.class);
        startActivity(EllIntent);
    }
    public void myDak(View view){
        Intent DakIntent = new Intent(Chennai.this, Chennai6.class);
        startActivity(DakIntent);
    }
    public void myAsh(View view){
        Intent AshIntent = new Intent(Chennai.this, Chennai7.class);
        startActivity(AshIntent);
    }
    public void myMy(View view){
        Intent MyIntent = new Intent(Chennai.this, Chennai8.class);
        startActivity(MyIntent);
    }
    public void myGui(View view){
        Intent GuiIntent = new Intent(Chennai.this,Chennai9.class);
        startActivity(GuiIntent);
    }
    public void myConn(View view){
        Intent ConnIntent = new Intent(Chennai.this, Chennai10.class);
        startActivity(ConnIntent);
    }
    public void myFish(View view){
        Intent myFishIntent = new Intent(Chennai.this, Chennai11.class);
        startActivity(myFishIntent);
    }

    public void mySemm(View view){
        Intent mySemmIntent = new Intent(Chennai.this, Chennai12.class);
        startActivity(mySemmIntent);
    }
    public void myCroc(View view){
        Intent CrocIntent = new Intent(Chennai.this, Chennai13.class);
        startActivity(CrocIntent);
    }
    public void myBirla(View view){
        Intent BirlaIntent = new Intent(Chennai.this, Chennai14.class);
        startActivity(BirlaIntent);
    }
    public void myVgp(View view){
        Intent VgpIntent = new Intent(Chennai.this, Chennai15.class);
        startActivity(VgpIntent);
    }
    public void myAnnai(View view){
        Intent AnnaiIntent = new Intent(Chennai.this, Chennai16.class);
        startActivity(AnnaiIntent);
    }
    public void myZoos(View view){
        Intent ZoosIntent = new Intent(Chennai.this,Chennai17.class);
        startActivity(ZoosIntent);
    }
    public void myMGR(View view){
        Intent MGRIntent = new Intent(Chennai.this, Chennai18.class);
        startActivity(MGRIntent);
    }
    public void myPark(View view){
        Intent ParkIntent = new Intent(Chennai.this, Chennai19.class);
        startActivity(ParkIntent);
    }

}
