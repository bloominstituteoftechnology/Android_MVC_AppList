package com.jakeesveld.applist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.mbms.DownloadRequest;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ViewerActivity extends AppCompatActivity {
    LinearLayout layoutImage;
    LinearLayout layoutTextList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);

        context = this;
        layoutImage = findViewById(R.id.layout_image);
        layoutTextList = findViewById(R.id.layout_text_list);

        Intent intent = getIntent();
        ArrayList<AppListing> appListing = AppRepository.getAppListing();
        int index = (int) intent.getSerializableExtra("object");
        AppListing app = new AppListing();


            for (AppListing listing : appListing) {
                if (listing.getId() == index) {
                    app = listing;
                }
            }
        createImageView(app.getImageURL());
        createTextView(app.getAppName());
        createTextView(app.getAppVersion());
        createTextView(app.getDomainName());
        createTextView(app.getContactEmail());
    }


    private TextView createImageView (String imageUrl){
        TextView urlText = new TextView(context);
        urlText.setText(imageUrl);
        layoutImage.addView(urlText);
        return urlText;
    }

    private TextView createTextView (String text){
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTextSize(28);
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        layoutTextList.addView(textView);
        return textView;
    }
}
