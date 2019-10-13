package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MetroAreaSelect extends AppCompatActivity {

    private String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        userName = intent.getExtras().getString("Username");
        setContentView(R.layout.activity_metro_area_select);


        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        //create a list of items for the spinner.
        String[] items = new String[]{"Seattle", "New York", "Los Angeles", "Chicago"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Map.class);
        intent.putExtra("Username", userName);
        intent.putExtra("City", "Seattle");
        startActivity(intent);
    }
<<<<<<< HEAD


=======
>>>>>>> b25967078173fc58647ea6691134ee8d62bf6ada
}
