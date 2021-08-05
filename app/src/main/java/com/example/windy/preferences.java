package com.example.windy;



import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

import java.util.Arrays;

public class preferences extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    private SharedPreferences sharedPreferences;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pref);
    }
    @Override
    public void onResume() {
        super.onResume();

        sharedPreferences = getPreferenceManager().getSharedPreferences();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);

        PreferenceScreen preferenceScreen = getPreferenceScreen();
        for(int i = 0; i < preferenceScreen.getPreferenceCount(); i++) {
            setSummary(getPreferenceScreen().getPreference(i));
        }
    }

    @Override
    public void onPause() {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        Preference pref = getPreferenceScreen().findPreference(key);
        setSummary(pref);
    }

    private void setSummary(Preference pref) {
        if (pref instanceof EditTextPreference) {
            updateSummary((EditTextPreference) pref);
        }

    }






    private void updateSummary(EditTextPreference preference) {
        preference.setSummary(preference.getText());

    }

}












