package com.example.applist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<AppListing> list;
    LinearLayout layoutLinear;
    Intent fullIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutLinear = findViewById(R.id.layout_linear);
        list = AppRepository.getAppListings();
//    private int id;
//    private String appName, appVersion, domainName, contactEmail, imageUrl;
        String elementDetails;
        int elementId;
        for (int i = 0; i < list.size(); ++i) {
            
            elementId = i;



        }
    }


    public TextView createTextView(final int id, final String appDetails) {
        fullIntent = new Intent(MainActivity.this, AppDetails.class);
        TextView textView = new TextView (getApplicationContext());
        layoutLinear.addView(textView);
        textView.setId(id);
        textView.setText(appDetails);
        textView.setTextSize(15);
        textView.setPadding(10,10,10,10);
        textView.setWidth(200);
        textView.setHeight(100);
        textView.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                fullIntent.putExtra("index", id);
                fullIntent.putExtra("details", appDetails);
                startActivity(fullIntent);
            }
        });
        return textView;
    }
}
