package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Map<String, String> passwordMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        MyApplication a = (MyApplication) getApplication();
        passwordMap = a.holdData;
    }

    public void addToMap(View view) {
        username = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.newPassword);
        String mapUsername = username.getText().toString();
        String mapPassword = password.getText().toString();
        if (!passwordMap.containsKey(mapUsername)) {
            passwordMap.put(mapUsername, mapPassword);
        } else {
            Toast.makeText(this, "Username Taken", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToMap(View view) {
        Intent i = new Intent(this, MetroAreaSelect.class);
        i.putExtra("Username", "Paul");
        startActivity(i);
    }
}
