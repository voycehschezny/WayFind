package com.dima.findway.entity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dima.findway.MainActivity;
import com.dima.findway.R;
import com.dima.findway.SystemApp;

public class Login extends MainActivity {

    private EditText username = null;
    private EditText password = null;
    private TextView attempts;
    private Button login;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        username = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        attempts = (TextView) findViewById(R.id.textView5);
        attempts.setText(Integer.toString(counter));
        login = (Button) findViewById(R.id.button1);
    }

    public void login(View view) {
        String passNext = username.getText().toString();
        String userNext = password.getText().toString();
        if (userNext.equals("admin") && passNext.equals("admin")) {
            Intent intent = new Intent(this, SystemApp.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            attempts.setBackgroundColor(Color.RED);
            counter--;
            attempts.setText(Integer.toString(counter));
            if (counter == 0) {
                login.setEnabled(false);
            }
        }
    }

    public void GoRegister(View view) {
        Button button = (Button) findViewById(R.id.backNext);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}






