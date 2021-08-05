package com.example.windy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mumbai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mumbai_spots);
        setTitle("Mumbai tourist spots ");
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
    public void Mumbai1(View view){
        Intent RiponIntent = new Intent(Mumbai.this, Mumbai1.class);
        startActivity(RiponIntent);
    }
    public void Mumbai2(View view){
        Intent GovIntent = new Intent(Mumbai.this, Mumbai2.class);
        startActivity(GovIntent);
    }
    public void Mumbai3(View view){
        Intent MarinaIntent = new Intent(Mumbai.this, Mumbai3.class);
        startActivity(MarinaIntent);
    }
    public void Mumbai4(View view){
        Intent ThoIntent = new Intent(Mumbai.this, Mumbai4.class);
        startActivity(ThoIntent);
    }
    public void Mumbai5(View view){
        Intent EllIntent = new Intent(Mumbai.this, Mumbai5.class);
        startActivity(EllIntent);
    }
    public void Mumbai6(View view){
        Intent DakIntent = new Intent(Mumbai.this, Mumbai6.class);
        startActivity(DakIntent);
    }
    public void Mumbai7(View view){
        Intent AshIntent = new Intent(Mumbai.this, Mumbai7.class);
        startActivity(AshIntent);
    }
    public void Mumbai8(View view){
        Intent MyIntent = new Intent(Mumbai.this, Mumbai8.class);
        startActivity(MyIntent);
    }
    public void Mumbai9(View view){
        Intent GuiIntent = new Intent(Mumbai.this,Mumbai9.class);
        startActivity(GuiIntent);
    }
    public void Mumbai10(View view){
        Intent ConnIntent = new Intent(Mumbai.this, Mumbai10.class);
        startActivity(ConnIntent);
    }
    public void Mumbai11(View view){
        Intent myFishIntent = new Intent(Mumbai.this, Mumbai11.class);
        startActivity(myFishIntent);
    }

    public void Mumbai12(View view){
        Intent mySemmIntent = new Intent(Mumbai.this, Mumbai12.class);
        startActivity(mySemmIntent);
    }
    public void Mumbai13(View view){
        Intent CrocIntent = new Intent(Mumbai.this, Mumbai13.class);
        startActivity(CrocIntent);
    }
    public void Mumbai14(View view){
        Intent BirlaIntent = new Intent(Mumbai.this, Mumbai14.class);
        startActivity(BirlaIntent);
    }
    public void Mumbai15(View view){
        Intent VgpIntent = new Intent(Mumbai.this, Mumbai15.class);
        startActivity(VgpIntent);
    }
    public void Mumbai16(View view){
        Intent AnnaiIntent = new Intent(Mumbai.this, Mumbai16.class);
        startActivity(AnnaiIntent);
    }
    public void Mumbai17(View view){
        Intent ZoosIntent = new Intent(Mumbai.this,Mumbai17.class);
        startActivity(ZoosIntent);
    }
    public void Mumbai18(View view){
        Intent MGRIntent = new Intent(Mumbai.this, Mumbai18.class);
        startActivity(MGRIntent);
    }
    public void Mumbai19(View view){
        Intent ParkIntent = new Intent(Mumbai.this, Mumbai19.class);
        startActivity(ParkIntent);
    }

}
