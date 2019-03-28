package com.lambda.applist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import android.view.View.OnKeyListener;

public class MainActivity extends AppCompatActivity {





    EditText searchTextView;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchTextView = findViewById(R.id.search_text);
        resultView = findViewById(R.id.result_view);




        findViewById(R.id.search_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // search for drug by brand name
            showResult();
            }
        });



    }


    private void showResult() {
        String searchText = searchTextView.getText().toString();
        resultView.setText(null); //old result has to be erased!

        ArrayList<AppListing> result = AppDataRepository.getByPartialBrandName(searchText);

        String str = "";

        TextView tva=findViewById(R.id.result_view);
        tva.setText("");
        AppListing al;

        for (int i = 0; i <result.size(); i++) {
            al = result.get(i);
            if(al==null){
                str=" /n";
                return;
            }else{
                str = al.toString();
            }
            TextView tv = new TextView(getApplicationContext());

                tv.setText(str);




            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView et = (TextView)v;
                    String str=et.getText().toString();

                    sendDataForDetail(str);


                }
            });
            tva.append(tv.getText());
        }

    }


    void sendDataForDetail(String str){
        TextView tva = findViewById(R.id.search_text);
        tva.setText(str);

        String[] stringSet=new String[5];
        stringSet=str.split("\n",5);


        ImageData imd=new ImageData(stringSet);

        Context context= getApplicationContext();

        Intent intent = new Intent(context, ActivityDetail.class);
        intent.putExtra("DATA", imd);

        startActivity(intent);
    }



}