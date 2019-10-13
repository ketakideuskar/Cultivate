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
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Map.class);
        intent.putExtra("Username", userName);
        startActivity(intent);
    }
}
