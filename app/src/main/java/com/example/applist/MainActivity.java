package com.example.applist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.applist.AppRepository.getAppListings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<AppListing> appListings = new ArrayList<>();
        appListings = getAppListings();


        for (AppListing listing : appListings){
            TextView tv = new TextView(this);
            LinearLayout linearLayout = findViewById(R.id.linear_layout_child);
            tv.setText(listing.getApp_name());
            tv.setTextSize(25);



            linearLayout.addView(tv);
        }
    }
}
