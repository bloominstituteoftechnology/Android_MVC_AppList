package com.example.israel.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout appListingsLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appListingsLinearLayout = findViewById(R.id.linear_layout_appListings);

        ArrayList<AppListing> appListings = AppRepository.getAppListings();

        for (AppListing appListing : appListings) {
            createTextView(appListing);
        }
    }

    private void createTextView(final AppListing appListing) {
        TextView newTextView = new TextView(this);
        newTextView.setText(appListing.getAppName());
        newTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30.f);

        newTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AppListingDetailsActivity.class);
                intent.putExtra("app listing", appListing);
                startActivity(intent);
            }
        });

        appListingsLinearLayout.addView(newTextView);


    }
}
