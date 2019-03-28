package com.example.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppDetailView extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_detail_view);



       //TextView id = findViewById(R.id.id);
       TextView appName = findViewById(R.id.app_name);
        TextView appVersion = findViewById(R.id.app_verion);
        TextView domainName = findViewById(R.id.domain_name);
        TextView contactEmail = findViewById(R.id.email_contact);
        TextView imageUrl = findViewById(R.id.url_image);

        Intent intent = getIntent();
        AppListingModel model = (AppListingModel) intent.getSerializableExtra("entry");
        //id.setText(model.getId());
        appName.setText(model.getAppName());
        appVersion.setText(model.getAppVersion());
        domainName.setText(model.getDomainName());
        contactEmail.setText(model.getContactEmail());
        imageUrl.setText(model.getImageUrl());


    }
}
