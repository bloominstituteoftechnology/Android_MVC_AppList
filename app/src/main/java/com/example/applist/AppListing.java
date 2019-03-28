package com.example.applist;

import android.net.Uri;

public class AppListing {

     //id,app_name,app_version,domain_name,contact_email,image_url

    private int id, app_version;
    private String app_name, domain_name, contact_email;
    private Uri image_url;

    public AppListing(int id, int app_version, String app_name, String domain_name, String contact_email, Uri image_url) {
        this.id = id;
        this.app_version = app_version;
        this.app_name = app_name;
        this.domain_name = domain_name;
        this.contact_email = contact_email;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApp_version() {
        return app_version;
    }

    public void setApp_version(int app_version) {
        this.app_version = app_version;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public void setDomain_name(String domain_name) {
        this.domain_name = domain_name;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public Uri getImage_url() {
        return image_url;
    }

    public void setImage_url(Uri image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nApp Name: %s\nApp Version: %s\nDomain Name: %s\nContact Email: %s\nImage Url: %s",
                id, app_name, app_version, domain_name, contact_email, image_url);
              //id,app_name,app_version,domain_name,contact_email,image_url
    }
}
