package com.lambda.applist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity_detail);


        receiveData();

    }
    private void receiveData(){
        TextView tv=findViewById(R.id.text_detail);
        ImageData id=(ImageData) getIntent().getSerializableExtra("DATA");
        if(id==null)return;

        tv.setText(id.toString());
    }


}


