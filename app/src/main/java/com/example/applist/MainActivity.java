package com.example.applist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import static com.example.applist.AppRepository.getAppListings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<AppListing> listings = new ArrayList<>();
        listings = getAppListings();

        Log.i("Listing contents", listings.get(0).getApp_version());
    }
}
