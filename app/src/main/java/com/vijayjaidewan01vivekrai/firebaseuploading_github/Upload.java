package com.vijayjaidewan01vivekrai.firebaseuploading_github;

import com.google.firebase.database.Exclude;

/**
 * Created by MR VIVEK RAI on 02-06-2018.
 */

public class Upload {

    private String name;
    private String imageUrl;
    private String key;

    public Upload() {
    }

    public Upload(String name, String imageUrl) {
        if (name.trim() == ""){
            name = "No Name";
        }
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return key;
    }

    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
