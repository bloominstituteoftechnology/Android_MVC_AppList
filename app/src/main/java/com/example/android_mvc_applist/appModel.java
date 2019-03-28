package com.example.android_mvc_applist;

public class appModel
{
   private  int id;
   private String app_version,domain_name,contact_email,image_url;

    public appModel(int id, String app_version, String domain_name, String contact_email, String image_url) {
        this.id = id;
        this.app_version = app_version;
        this.domain_name = domain_name;
        this.contact_email = contact_email;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public String getApp_version() {
        return app_version;
    }

    public String getDomain_name() {
        return domain_name;
    }

    public String getContact_email() {
        return contact_email;
    }

    public String getImage_url() {
        return image_url;
    }
}
