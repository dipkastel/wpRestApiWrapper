package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Database {

    @SerializedName("wc_database_version")
    @Expose
    public String wcDatabaseVersion;
    @SerializedName("database_prefix")
    @Expose
    public String databasePrefix;
    @SerializedName("maxmind_geoip_database")
    @Expose
    public String maxmindGeoipDatabase;
    @SerializedName("database_tables")
    @Expose
    public DatabaseTables databaseTables;
    @SerializedName("database_size")
    @Expose
    public DatabaseSize databaseSize;

}
