package com.example.windy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;




public final class WindyPreferences {
    public static final String prefCity = "city";
    public static void setLocationDetails(Context context, String loc) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(prefCity, loc);
        editor.apply();
    }
    public static void resetLocationCoordinates(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(prefCity);
        editor.apply();
    }
    public static String getPreferredWeatherLocation(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        String keyForLocation = context.getString(R.string.Location);
        String defaultLocation = context.getString(R.string.Chennai);

        return sp.getString(keyForLocation, defaultLocation);
    }

    public static boolean isMetric(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String keyForUnits = context.getString(R.string.TemperatureUnits);
        String defaultUnits = context.getString(R.string.Celsius);
        String preferredUnits = sp.getString(keyForUnits, defaultUnits);
        String metric = context.getString(R.string.Celsius);
        String imperial = context.getString(R.string.Fahrenheit);


        if (preferredUnits.equals("1")) {
          return true;
        }

         else if(preferredUnits.equals(("2")))
            return false;

          return true;


    }



}