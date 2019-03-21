package com.example.israel.applist;

import java.io.Serializable;

public class AppListing implements Serializable {

    public AppListing(String id, String appName, String appVersion, String domainName, String contactEmail, String imageUrl) {
        this.id = id;
        this.appName = appName;
        this.appVersion = appVersion;
        this.domainName = domainName;
        this.contactEmail = contactEmail;
        this.imageUrl = imageUrl;
    }

    private String id;
    private String appName;
    private String appVersion;
    private String domainName;
    private String contactEmail;
    private String imageUrl;

    public String getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
