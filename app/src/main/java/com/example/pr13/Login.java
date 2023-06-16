package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
    }



    public void startNewActivity(View v) {
        if (TextUtils.isEmpty(email.getText().toString())
                || TextUtils.isEmpty(password.getText().toString())) {
            Toast toast = Toast.makeText(getApplicationContext(), "Поля не заполнены!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            startActivity((new Intent(this, MainMenu.class)));
        }
    }
}