package com.notrika.wpRestApi.entities.common;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("date_created")
    @Expose
    public String dateCreated;
    @SerializedName("date_created_gmt")
    @Expose
    public String dateCreatedGmt;
    @SerializedName("date_modified")
    @Expose
    public String dateModified;
    @SerializedName("date_modified_gmt")
    @Expose
    public String dateModifiedGmt;
    @SerializedName("src")
    @Expose
    public String src;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("alt")
    @Expose
    public String alt;

}
