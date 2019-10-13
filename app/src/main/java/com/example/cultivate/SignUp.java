package com.example.cultivate;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;

import java.util.HashMap;

public class SignUp extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void addToMap(View view) {
        username = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.newPassword);
        String mapUsername = username.getText().toString();
        String mapPassword = password.getText().toString();
    }
}
