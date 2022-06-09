package com.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class General extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

    }

    public void moveToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveToOne(View view) {
        Intent intent = new Intent(this, One.class);
        startActivity(intent);
    }

    public void moveToTwo(View view) {
        Intent intent = new Intent(this, Two.class);
        startActivity(intent);
    }

    public void moveToGeneral(View view) {
        Intent intent = new Intent(this, General.class);
        startActivity(intent);
    }

    public void moveToThree(View view) {
        Intent intent = new Intent(this, Three.class);
        startActivity(intent);
    }

    public void moveToFour(View view) {
        Intent intent = new Intent(this, Four.class);
        startActivity(intent);
    }



}