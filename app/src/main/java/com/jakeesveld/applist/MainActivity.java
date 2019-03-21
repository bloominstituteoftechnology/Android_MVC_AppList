package com.jakeesveld.applist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context context;
    LinearLayout layoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        layoutList = findViewById(R.id.layout_list);

        ArrayList<AppListing> dataModels = AppRepository.getAppListing();

        for(AppListing input: dataModels){
            createTextView(input);
        }
    }

    public TextView createTextView(final AppListing item){
        TextView view = new TextView(context);
        view.setText(item.getAppName() + " v" + item.getAppVersion());
        view.setTextSize(24);
        view.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewerActivity.class);
                intent.putExtra("object", item.getId());
                startActivity(intent);
            }
        });

        layoutList.addView(view);

        return view;
    }

}