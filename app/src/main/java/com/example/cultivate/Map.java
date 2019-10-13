package com.example.cultivate;

import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map<S, P> extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        city = intent.getStringExtra("City");

        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng coords = new LatLng(0,0);
        if (city.equals("Seattle")) {
            coords = new LatLng(47.6062, -122.3321);
            mMap.addMarker(new MarkerOptions().position(new LatLng(47.610377, -122.2006786 )).title("Teacher in Bellevue"));
            mMap.addMarker(new MarkerOptions().position(new LatLng(47.6062095, -122.3320708)).title("Teacher in Seattle"));
            mMap.addMarker(new MarkerOptions().position(new LatLng(47.7623204, -122.2054035)).title("Teacher in Bothell"));
        } else if (city.equals("New York")){
            coords = new LatLng(40.730610, -73.935242);
        } else if (city.equals("Los Angeles")) {
            coords = new LatLng(34.0522, -118.2437);
        } else { // Chicago
            coords = new LatLng(41.8781, -87.6298);
        }
        //mMap.addMarker(new MarkerOptions().position(coords).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(coords));
        mMap.setMaxZoomPreference(22);
        mMap.setMinZoomPreference(9);
    }
}
