package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class AppListView extends AppCompatActivity {

    private ArrayList<AppListing> appListings;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        appListings = AppRepository.getAppListings();

        //generateTextView();
    }

    public void generateTextView(final AppListing appListing) {
        TextView tv = new TextView(context);
        tv.setText(appListing.getAppName());
        tv.setPadding(15, 5, 15, 5);
        tv.setTextSize(24);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AppDetailsActivity.class);
                intent.putExtra("key", appListing.getImageURL());
                startActivity(intent);
            }});
    }
}