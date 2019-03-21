package com.example.applist;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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


        for (final AppListing listing : appListings){
            TextView tv = new TextView(this);
            LinearLayout linearLayout = findViewById(R.id.linear_layout_child);
            tv.setText(listing.getApp_name());
            tv.setTextSize(25);
            tv.setTypeface(Typeface.DEFAULT_BOLD);
            tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppListing temp = listing;
                    Intent intent = new Intent(getApplicationContext(),DetailView.class);
                    intent.putExtra("LISTING_KEY", temp);
                    startActivity(intent);

                }
            });



            linearLayout.addView(tv);
        }
    }
}
