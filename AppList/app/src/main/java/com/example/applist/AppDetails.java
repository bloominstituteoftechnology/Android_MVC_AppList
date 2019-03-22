package com.example.applist;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.mbms.DownloadRequest;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class AppDetails extends AppCompatActivity  {
ImageView appImage;
TextView appText;
String urlString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_details);
        appImage = findViewById(R.id.image_id);
        appText = findViewById(R.id.app_details);
        Intent detailIntent = getIntent();
        String appDetails = detailIntent.getStringExtra("details");
        urlString = detailIntent.getStringExtra("image");
        Uri image = Uri.parse(urlString);
        appImage.setImageURI(image);
        appText.setText(appDetails);
//        final  Uri newUri = new DownloadRequest(urlString);
    }









    
}
