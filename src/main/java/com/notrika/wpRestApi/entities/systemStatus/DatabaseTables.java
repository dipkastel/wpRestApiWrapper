package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DatabaseTables {

    @SerializedName("woocommerce")
    @Expose
    public Object woocommerce;
    @SerializedName("other")
    @Expose
    public Object other;

}
