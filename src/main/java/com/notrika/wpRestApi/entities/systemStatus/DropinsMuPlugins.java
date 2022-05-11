package com.notrika.wpRestApi.entities.systemStatus;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DropinsMuPlugins {

    @SerializedName("dropins")
    @Expose
    public List<Dropin> dropins = null;
    @SerializedName("mu_plugins")
    @Expose
    public List<Object> muPlugins = null;

}
