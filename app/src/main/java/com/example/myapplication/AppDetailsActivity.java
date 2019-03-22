package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.Serializable;
import java.net.URI;
import java.net.URL;

public class AppDetailsActivity extends AppCompatActivity implements Serializable {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        iv = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String imageURL = (String)intent.getSerializableExtra("key");



        iv.setImageURI(Uri.parse(imageURL.toString()));
    }
}
