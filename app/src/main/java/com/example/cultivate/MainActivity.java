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
import java.util.Map;

//DUBHACKS 2019
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.Cultivate.MESSAGE";
    private EditText name;
    private EditText password;
    private TextView info;
    private Button button;
    private Map<String, String> passwordMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the SDK
        Places.initialize(getApplicationContext(), "AIzaSyDp7RDmSHrZ-tx3ezwafjlAAPzN-VQqBhs");
        MyApplication a = (MyApplication) getApplication();
        passwordMap = a.holdData;
        passwordMap.put("kdeuskar", "ilovedogs");
        passwordMap.put("paul", "ilovegeo");
    }

    public void validate(String userName, String userPassword) {
        if (passwordMap.containsKey(userName) && passwordMap.get(userName).equals(userPassword)) {
            Intent intent = new Intent(this, MetroAreaSelect.class);
            intent.putExtra("Username", userName);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
        }
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

