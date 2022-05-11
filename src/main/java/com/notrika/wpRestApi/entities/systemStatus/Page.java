package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Page {

    @SerializedName("page_name")
    @Expose
    public String pageName;
    @SerializedName("page_id")
    @Expose
    public String pageId;
    @SerializedName("page_set")
    @Expose
    public Boolean pageSet;
    @SerializedName("page_exists")
    @Expose
    public Boolean pageExists;
    @SerializedName("page_visible")
    @Expose
    public Boolean pageVisible;
    @SerializedName("shortcode")
    @Expose
    public String shortcode;
    @SerializedName("block")
    @Expose
    public String block;
    @SerializedName("shortcode_required")
    @Expose
    public Boolean shortcodeRequired;
    @SerializedName("shortcode_present")
    @Expose
    public Boolean shortcodePresent;
    @SerializedName("block_present")
    @Expose
    public Boolean blockPresent;
    @SerializedName("block_required")
    @Expose
    public Boolean blockRequired;

}
