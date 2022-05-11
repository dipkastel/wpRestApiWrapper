package com.notrika.wpRestApi.entities.systemStatus;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PostTypeCount {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("count")
    @Expose
    public String count;

}
