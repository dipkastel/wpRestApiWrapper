package com.notrika.wpRestApi.entities.systemStatus;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Settings {

    @SerializedName("api_enabled")
    @Expose
    public Boolean apiEnabled;
    @SerializedName("force_ssl")
    @Expose
    public Boolean forceSsl;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("currency_symbol")
    @Expose
    public String currencySymbol;
    @SerializedName("currency_position")
    @Expose
    public String currencyPosition;
    @SerializedName("thousand_separator")
    @Expose
    public String thousandSeparator;
    @SerializedName("decimal_separator")
    @Expose
    public String decimalSeparator;
    @SerializedName("number_of_decimals")
    @Expose
    public Integer numberOfDecimals;
    @SerializedName("geolocation_enabled")
    @Expose
    public Boolean geolocationEnabled;
    @SerializedName("taxonomies")
    @Expose
    public Taxonomies taxonomies;
    @SerializedName("product_visibility_terms")
    @Expose
    public ProductVisibilityTerms productVisibilityTerms;
    @SerializedName("woocommerce_com_connected")
    @Expose
    public String woocommerceComConnected;

}
