package com.notrika.wpRestApi.entities;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Attribute {

    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("position")
    @Expose
    public Integer position;
    @SerializedName("visible")
    @Expose
    public Boolean visible;
    @SerializedName("variation")
    @Expose
    public Boolean variation;
    @SerializedName("options")
    @Expose
    public List<String> options = null;
}
