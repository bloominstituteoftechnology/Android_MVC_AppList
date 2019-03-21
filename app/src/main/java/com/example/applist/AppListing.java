package com.example.applist;

public class AppListing {
    //id,app_name,app_version,domain_name,contact_email,image_url
    private int listingId =0;
    private String appVersion;
    private String domainName= "";
    private String contactEmail= "";
    private String imageURL="";

    public AppListing(int listingId, String appVersion, String domainName, String contactEmail, String imageURL) {
        this.listingId = listingId;
        this.appVersion = appVersion;
        this.domainName = domainName;
        this.contactEmail = contactEmail;
        this.imageURL = imageURL;
    }

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
