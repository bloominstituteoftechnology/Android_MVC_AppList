package com.vivekvishwanath.applist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public TextView createAppView(final AppListing appListing) {
        TextView appView = new TextView(context);
        appView.setTextSize(20);
        appView.setPadding(5,5,5,5);
        appView.setText("Application Name : " + appListing.getAppName());
        appView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appDetailIntent = new Intent(context, AppDetails.class);
                appDetailIntent.putExtra("details", appListing);
                startActivity(appDetailIntent);
            }
        });
        return appView;
    }
}
