package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Environment {

    @SerializedName("home_url")
    @Expose
    public String homeUrl;
    @SerializedName("site_url")
    @Expose
    public String siteUrl;
    @SerializedName("version")
    @Expose
    public String version;
    @SerializedName("log_directory")
    @Expose
    public String logDirectory;
    @SerializedName("log_directory_writable")
    @Expose
    public Boolean logDirectoryWritable;
    @SerializedName("wp_version")
    @Expose
    public String wpVersion;
    @SerializedName("wp_multisite")
    @Expose
    public Boolean wpMultisite;
    @SerializedName("wp_memory_limit")
    @Expose
    public Integer wpMemoryLimit;
    @SerializedName("wp_debug_mode")
    @Expose
    public Boolean wpDebugMode;
    @SerializedName("wp_cron")
    @Expose
    public Boolean wpCron;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("external_object_cache")
    @Expose
    public Object externalObjectCache;
    @SerializedName("server_info")
    @Expose
    public String serverInfo;
    @SerializedName("php_version")
    @Expose
    public String phpVersion;
    @SerializedName("php_post_max_size")
    @Expose
    public Integer phpPostMaxSize;
    @SerializedName("php_max_execution_time")
    @Expose
    public Integer phpMaxExecutionTime;
    @SerializedName("php_max_input_vars")
    @Expose
    public Integer phpMaxInputVars;
    @SerializedName("curl_version")
    @Expose
    public String curlVersion;
    @SerializedName("suhosin_installed")
    @Expose
    public Boolean suhosinInstalled;
    @SerializedName("max_upload_size")
    @Expose
    public Integer maxUploadSize;
    @SerializedName("mysql_version")
    @Expose
    public String mysqlVersion;
    @SerializedName("mysql_version_string")
    @Expose
    public String mysqlVersionString;
    @SerializedName("default_timezone")
    @Expose
    public String defaultTimezone;
    @SerializedName("fsockopen_or_curl_enabled")
    @Expose
    public Boolean fsockopenOrCurlEnabled;
    @SerializedName("soapclient_enabled")
    @Expose
    public Boolean soapclientEnabled;
    @SerializedName("domdocument_enabled")
    @Expose
    public Boolean domdocumentEnabled;
    @SerializedName("gzip_enabled")
    @Expose
    public Boolean gzipEnabled;
    @SerializedName("mbstring_enabled")
    @Expose
    public Boolean mbstringEnabled;
    @SerializedName("remote_post_successful")
    @Expose
    public Boolean remotePostSuccessful;
    @SerializedName("remote_post_response")
    @Expose
    public Integer remotePostResponse;
    @SerializedName("remote_get_successful")
    @Expose
    public Boolean remoteGetSuccessful;
    @SerializedName("remote_get_response")
    @Expose
    public Integer remoteGetResponse;

}
