package com.notrika.wpRestApi.entities.systemStatus;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Security {

    @SerializedName("secure_connection")
    @Expose
    public Boolean secureConnection;
    @SerializedName("hide_errors")
    @Expose
    public Boolean hideErrors;

}
