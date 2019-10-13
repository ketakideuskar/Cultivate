package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.Places;

//DUBHACKS 2019
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.Cultivate.MESSAGE";
    private EditText name;
    private EditText password;
    private TextView info;
    private Button button;
    private HashMap<String, String> passwordMap = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the SDK
        Places.initialize(getApplicationContext(), "AIzaSyDp7RDmSHrZ-tx3ezwafjlAAPzN-VQqBhs");

// Create a new Places client instance
        PlacesClient placesClient = Places.createClient(this);
    }

    public void validate(String userName, String userPassword) {
        //if (passwordMap.keySet().contains(userName) && passwordMap.get(userName).equals(userPassword)) {
            Intent intent = new Intent(this, MetroAreaSelect.class);
            intent.putExtra("Username", userName);
            startActivity(intent);
        //}
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        EditText username = (EditText) findViewById(R.id.editText);
        Intent intent = new Intent(this, MetroAreaSelect.class);
        intent.putExtra("Username", username.getText().toString());
        startActivity(intent);
    }

    public void goToSignUp(View view) {
        Intent i = new Intent(this, SignUp.class);
        startActivity(i);
    }



}

