package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.Places;

//DUBHACKS 2019
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.Cultivate.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the SDK
        Places.initialize(getApplicationContext(), "AIzaSyDp7RDmSHrZ-tx3ezwafjlAAPzN-VQqBhs");

// Create a new Places client instance
        PlacesClient placesClient = Places.createClient(this);
    }



    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MetroAreaSelect.class);
        startActivity(intent);
    }

}

