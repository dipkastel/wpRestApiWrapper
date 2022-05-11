package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProductVisibilityTerms {

    @SerializedName("exclude-from-catalog")
    @Expose
    public String excludeFromCatalog;
    @SerializedName("exclude-from-search")
    @Expose
    public String excludeFromSearch;
    @SerializedName("featured")
    @Expose
    public String featured;
    @SerializedName("outofstock")
    @Expose
    public String outofstock;
    @SerializedName("rated-1")
    @Expose
    public String rated1;
    @SerializedName("rated-2")
    @Expose
    public String rated2;
    @SerializedName("rated-3")
    @Expose
    public String rated3;
    @SerializedName("rated-4")
    @Expose
    public String rated4;
    @SerializedName("rated-5")
    @Expose
    public String rated5;

}

