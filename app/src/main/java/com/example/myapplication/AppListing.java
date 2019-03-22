package com.example.myapplication;

public class AppListing {

    //id,app_name,app_version,domain_name,contact_email,image_url

    private int id;
    private String appName;
    private String appVersion;
    private String domainName;
    private String contactEmail;
    private String imageURL;

    public AppListing(int id, String appName, String appVersion, String domainName, String contactEmail, String imageURL) {
        this.id = id;
        this.appName = appName;
        this.appVersion = appVersion;
        this.domainName = domainName;
        this.contactEmail = contactEmail;
        this.imageURL = imageURL;
    }

    public int getId() {
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

    public String getImageURL() {
        return imageURL;
    }
}
