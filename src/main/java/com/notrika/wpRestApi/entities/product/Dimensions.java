package com.notrika.wpRestApi.entities.product;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Dimensions {

    @SerializedName("length")
    @Expose
    public String length;
    @SerializedName("width")
    @Expose
    public String width;
    @SerializedName("height")
    @Expose
    public String height;

}
