package com.example.applist;

import java.util.ArrayList;

public class AppRepository {
    public final static String APP_DATA = "";

    public static ArrayList<AppListing> getAppListings() {

        // Make list of all text in csv using .split
        String[] appStrings = APP_DATA.split("\n");

        ArrayList<AppListing> rtn = new ArrayList<AppListing>() ;

        for(String s:appStrings) {
            String[] appChars = s.split(", ");
        }
        
    }


}

