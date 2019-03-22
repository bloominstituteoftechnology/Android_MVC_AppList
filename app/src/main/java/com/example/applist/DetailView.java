package com.example.applist;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;

public class DetailView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        Intent intent = getIntent();
        AppListing listing = (AppListing)intent.getSerializableExtra("LISTING_KEY");

        TextView textView = findViewById(R.id.text_view_details1);

        textView.setText("App Name" + ": " + listing.getApp_name());

        textView = findViewById(R.id.text_view_details2);

        textView.setText("Version: " + listing.getApp_version());

        textView = findViewById(R.id.text_view_details3);

        textView.setText("Domain: " + listing.getDomain_name() + "  Contact Email:" + listing.getContact_email());

        textView = findViewById(R.id.text_view_details4);

        textView.setText("Image URL: " + listing.getImage_url());


    }
}
