package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Taxonomies {

    @SerializedName("external")
    @Expose
    public String external;
    @SerializedName("grouped")
    @Expose
    public String grouped;
    @SerializedName("simple")
    @Expose
    public String simple;
    @SerializedName("variable")
    @Expose
    public String variable;
    @SerializedName("yith_bundle")
    @Expose
    public String yithBundle;

}
