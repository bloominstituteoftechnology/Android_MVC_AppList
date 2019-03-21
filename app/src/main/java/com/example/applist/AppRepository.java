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

            AppListing foobar = new AppListing();
            foobar.setListingId(appChars[0]);
            foobar.setDomainName(appChars[3]);
            foobar.setAppVersion(appChars[2]);
            foobar.setAppName(appChars[1]);
            foobar.setContactEmail(appChars[4]);
            foobar.setImageURL(appChars[5]);

            rtn.add(foobar);

            if(foobar.getListingId().equals("id")) {
                rtn.remove(foobar);
            }
        }

        return rtn;
    }


}

