package com.example.applist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
    }

    private TextView createAppView(final AppListing appView) {
        TextView view = new TextView(context);
        view.setText(appView.getAppName());
        view.setPadding(15, 15, 15, 15);
        view.setTextSize(22);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewImageIntent = new Intent(context, DetailsActivity.class);
                viewImageIntent.putExtra("key", appView);
                startActivity(viewImageIntent);
            }
        });

        return view;
    }
}


