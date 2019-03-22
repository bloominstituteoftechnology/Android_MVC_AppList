package com.example.applist;

public class AppListing {

    private int id;
    private String appName, appVersion, domainName, contactEmail, imageUrl;

    public AppListing(int id, String appName, String appVersion, String domainName, String contactEmail, String imageUrl){
        this.id = id;
        this.appName = appName;
        this.appVersion = appVersion;
        this.domainName = domainName;
        this.contactEmail = contactEmail;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return String.format("ID: %d\nApp Name: %s\nApp Version: %s\nDomain Name: %s\nContact Email: %s\nImage Url: %s", id, appName, appVersion, domainName, contactEmail, imageUrl);
    }

    //    id,app_name,app_version,domain_name,contact_email,image_url



}
