package com.lambda.applist;

import java.util.ArrayList;

public class AppDataRepository {

    public static AppListing getByAppName(String name) {
        return AppRepositoryAPI.getAppName(name);

    }

    public static ArrayList<AppListing> getByPartialBrandName(String name) {
        return AppRepositoryAPI.getByPartialAppName(name);
    }
}
