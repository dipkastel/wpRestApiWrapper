package com.notrika.wpRestApi.entities.systemStatus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Theme {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("version")
    @Expose
    public String version;
    @SerializedName("version_latest")
    @Expose
    public Integer versionLatest;
    @SerializedName("author_url")
    @Expose
    public String authorUrl;
    @SerializedName("is_child_theme")
    @Expose
    public Boolean isChildTheme;
    @SerializedName("has_woocommerce_support")
    @Expose
    public Boolean hasWoocommerceSupport;
    @SerializedName("has_woocommerce_file")
    @Expose
    public Boolean hasWoocommerceFile;
    @SerializedName("has_outdated_templates")
    @Expose
    public Boolean hasOutdatedTemplates;
    @SerializedName("overrides")
    @Expose
    public List<Object> overrides = null;
    @SerializedName("parent_name")
    @Expose
    public String parentName;
    @SerializedName("parent_version")
    @Expose
    public String parentVersion;
    @SerializedName("parent_version_latest")
    @Expose
    public Integer parentVersionLatest;
    @SerializedName("parent_author_url")
    @Expose
    public String parentAuthorUrl;

}
