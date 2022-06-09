package com.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);


        // Text view number 1 to add hyperlink
        TextView linkTextView = findViewById(R.id.Setting6);

        // method to redirect to provided link
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView.setLinkTextColor(Color.YELLOW);

        // Text view number 2 to add hyperlink
        TextView linkTextView2 = findViewById(R.id.Setting7);

        // method to redirect to provided link
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        // method to change color of link
        linkTextView2.setLinkTextColor(Color.YELLOW);
    }
}