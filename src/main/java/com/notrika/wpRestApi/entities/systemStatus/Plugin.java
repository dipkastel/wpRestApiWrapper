package com.notrika.wpRestApi.entities.systemStatus;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Plugin {

    @SerializedName("plugin")
    @Expose
    public String plugin;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("version")
    @Expose
    public String version;
    @SerializedName("version_latest")
    @Expose
    public String versionLatest;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("author_name")
    @Expose
    public String authorName;
    @SerializedName("author_url")
    @Expose
    public String authorUrl;
    @SerializedName("network_activated")
    @Expose
    public Boolean networkActivated;

}
