package com.example.israel.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppListingDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_listing_details);

        Intent intent = getIntent();
        AppListing appListing = (AppListing) intent.getSerializableExtra("app listing");

        TextView idTextView = findViewById(R.id.text_view_id);
        idTextView.setText("Id: " + appListing.getId());

        TextView nameTextView = findViewById(R.id.text_view_name);
        nameTextView.setText("Name: " + appListing.getAppName());

        TextView versionTextView = findViewById(R.id.text_view_version);
        versionTextView.setText("Version: " + appListing.getAppVersion());

        TextView domainTextView = findViewById(R.id.text_view_domain);
        domainTextView.setText("Domain: " + appListing.getDomainName());

        TextView contactTextView = findViewById(R.id.text_view_contact);
        contactTextView.setText("Contact: " + appListing.getContactEmail());

        TextView imageUrlTextView = findViewById(R.id.text_view_image_url);
        imageUrlTextView.setText("Image: " + appListing.getImageUrl());

    }
}
