package com.notrika.wpRestApi.entities.common;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Links {

    @SerializedName("self")
    @Expose
    public List<href> self = null;
    @SerializedName("collection")
    @Expose
    public List<href> collection = null;
    @SerializedName("up")
    @Expose
    public List<href> up = null;

}
