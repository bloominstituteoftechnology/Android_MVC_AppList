package com.vivekvishwanath.applist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    LinearLayout appListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        ArrayList<AppListing> appListings = AppRepository.getAppListings();

        appListView = findViewById(R.id.app_list_view);
        for(AppListing applisting : appListings) {
            appListView.addView(createAppView(applisting));
        }
    }

    public TextView createAppView(AppListing appListing) {
        TextView appView = new TextView(context);
        appView.setTextSize(20);
        appView.setPadding(5,5,5,5);
        appView.setText("Application Name : " + appListing.getAppName());
        return appView;
    }
}
