package com.vivekvishwanath.applist;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URL;

public class AppDetails extends AppCompatActivity {
    private TextView id;
    private TextView name;
    private TextView version;
    private TextView domain;
    private TextView email;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_details);

        id = findViewById(R.id.app_id);
        name = findViewById(R.id.app_name);
        version = findViewById(R.id.app_version);
        domain = findViewById(R.id.app_domain);
        email = findViewById(R.id.app_email);
        image = findViewById(R.id.app_image);

        Intent appDetailIntent = getIntent();
        AppListing appListing = (AppListing) appDetailIntent.getSerializableExtra("details");

        id.setText("ID : " + appListing.getId());
        name.setText("Name: " + appListing.getAppName());
        version.setText("App Version: " + appListing.getAppVersion());
        domain.setText("Domain: " + appListing.getDomainName());
        email.setText("Contact Email: " + appListing.getContactEmail());


    }
}
