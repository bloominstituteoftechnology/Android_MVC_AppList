package com.lambda.applist;

import java.io.Serializable;

public class ImageData implements Serializable {

    private String id,app_name,app_version,domain_name,contact_email,image_url;

    ImageData(String[] stringSet){
        this.id=stringSet[0];

        this.app_name=stringSet[1];
        this.app_version=stringSet[2];
        this.domain_name=stringSet[3];
        this.contact_email=stringSet[4];
        this.image_url=stringSet[5];
    }
    public String toString(){
        return this.id+

        this.app_name
                +
                this.app_version+
                 this.domain_name+
                 this.contact_email+
                this.image_url
                ;
    }
}
