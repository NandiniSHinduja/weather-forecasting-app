package com.example.windy;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MapRoute extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    MarkerOptions place1,place2,place3,place4,place5,place6;
    Polyline currentPolyline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_route);
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.new_map);
        mapFragment.getMapAsync(this);
        place1=new MarkerOptions().position(new LatLng(13.08784,80.27847)).title("33"+"\u00B0"+ "C");
        place2=new MarkerOptions().position(new LatLng(12.9249, 80.1000)).title("37"+"\u00B0"+ "C");
        place3=new MarkerOptions().position(new LatLng(12.6819, 79.9888)).title("37"+"\u00B0"+ "C");
        place4=new MarkerOptions().position(new LatLng(11.9401, 79.4861)).title("37"+"\u00B0"+ "C");
        place5=new MarkerOptions().position(new LatLng(11.6643, 78.1460)).title("34"+"\u00B0"+ "C");
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;
        map.addMarker(place1);
        map.addMarker(place2);
        map.addMarker(place3);
        map.addMarker(place4);
        map.addMarker(place5);

        float zoomLevel = 7.0f; //This goes up to 21
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.08784,80.27847), zoomLevel));
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(13.08784,80.27847),
                        new LatLng(12.9249, 80.1000),
                        new LatLng(12.6819, 79.9888),
                        new LatLng(11.9401, 79.4861),
                        new LatLng(11.6342, 78.8785),
                        new LatLng(11.6643, 78.1460)));



    }
    private String getUrl(LatLng origin, LatLng dest, String directionMode) {
        String str_origin="origin"+origin.latitude+","+origin.longitude;
        String str_dest="destination"+dest.latitude+","+dest.longitude;
        String mode="mode"+directionMode;
        String parameters=str_origin+"&"+str_dest+"&"+mode;
        String output="json";
        String url="https:/maps.googleapis.com/maps/api/directions/"+output+"?"+parameters+"&key"+getString(R.string.map_key);
        return url;
    }

    public void onTaskDone(Object...values){
        if(currentPolyline!=null)
            currentPolyline.remove();
        currentPolyline=map.addPolyline((PolylineOptions)values[0]);

    }


}

