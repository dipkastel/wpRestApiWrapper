package com.notrika.wpRestApi.entities.systemStatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class SystemStatus {

    @SerializedName("environment")
    @Expose
    public Environment environment;
    @SerializedName("database")
    @Expose
    public Database database;
    @SerializedName("active_plugins")
    @Expose
    public List<Plugin> activePlugins = null;
    @SerializedName("inactive_plugins")
    @Expose
    public List<Plugin> inactivePlugins = null;
    @SerializedName("dropins_mu_plugins")
    @Expose
    public DropinsMuPlugins dropinsMuPlugins;
    @SerializedName("theme")
    @Expose
    public Theme theme;
    @SerializedName("settings")
    @Expose
    public Settings settings;
    @SerializedName("security")
    @Expose
    public Security security;
    @SerializedName("pages")
    @Expose
    public List<Page> pages = null;
    @SerializedName("post_type_counts")
    @Expose
    public List<PostTypeCount> postTypeCounts = null;

}
