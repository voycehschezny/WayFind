package com.dima.findway;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dima.findway.entity.Login;
import com.dima.findway.entity.User;


public class MainActivity extends ActionBarActivity {
    private EditText email;
    private EditText username;
    private EditText password;
    private EditText repeatPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.post);
        username = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password1);
        repeatPassword = (EditText) findViewById(R.id.password2);
        Button button = (Button) findViewById(R.id.button);

    }

    User user = new User();

    public void GoTwo(View view) {

        String mail = email.getText().toString();
        String name = username.getText().toString();
        String pass1 = password.getText().toString();
        String pass2 = repeatPassword.getText().toString();

        if (pass1.equals(pass2)) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Error,passwords don't match", Toast.LENGTH_LONG).show();
        }
        if (mail.equals("") && name.equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter your name and e-mail", Toast.LENGTH_LONG).show();
        }
    }
}















