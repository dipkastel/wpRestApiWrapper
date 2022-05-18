package com.notrika.wpRestApi.entities.Tag;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.notrika.wpRestApi.entities.common.Links;


public class Tag {
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("count")
    @Expose
    public Integer Count;
    @SerializedName("_links")
    @Expose
    public Links links;

}
