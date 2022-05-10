package com.notrika.wpRestApi.entities;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MetaDatum {

    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("key")
    @Expose
    public String key;
    @SerializedName("value")
    @Expose
    public Object value;

}
