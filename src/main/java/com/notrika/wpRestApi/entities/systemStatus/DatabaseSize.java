package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DatabaseSize {

    @SerializedName("data")
    @Expose
    public Float data;
    @SerializedName("index")
    @Expose
    public Float index;

}
