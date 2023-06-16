package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void startMainMenuActivity(View v) {
        startActivity((new Intent(this, MainMenu.class)));
    }
    public void startPhotoActivity(View v) {
        startActivity((new Intent(this, Photo.class)));
    }
    public void startLoginActivity(View v) {
        startActivity((new Intent(this, Login.class)));
    }
}