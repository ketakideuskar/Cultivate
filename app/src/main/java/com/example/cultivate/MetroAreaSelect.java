package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MetroAreaSelect extends AppCompatActivity {

    private String userName;
    private String city;
    private Spinner mySpinner;
    private Spinner mySpinner2;
    private String language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        userName = intent.getExtras().getString("Username");
        setContentView(R.layout.activity_metro_area_select);

        mySpinner = (Spinner) findViewById(R.id.location_spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MetroAreaSelect.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2 = (Spinner) findViewById(R.id.location_spinner2);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MetroAreaSelect.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names2));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner2.setAdapter(myAdapter2);
    }

    public void sendMessage(View view) {
        city = mySpinner.getSelectedItem().toString();
        language = mySpinner2.getSelectedItem().toString();
        Intent intent = new Intent(this, Map.class);
        intent.putExtra("Username", userName);
        intent.putExtra("City", city);
        intent.putExtra("Language", language);
        startActivity(intent);
    }
}
