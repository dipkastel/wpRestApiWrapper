package com.notrika.wpRestApi.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Links {

    @SerializedName("self")
    @Expose
    public List<Self> self = null;
    @SerializedName("collection")
    @Expose
    public List<Collection> collection = null;

}
