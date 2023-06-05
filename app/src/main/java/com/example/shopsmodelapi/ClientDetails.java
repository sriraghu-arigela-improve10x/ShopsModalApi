package com.example.shopsmodelapi;

import com.google.gson.annotations.SerializedName;

public class ClientDetails {

    @SerializedName( "accept_language")
    private String acceptlanguage;

    @SerializedName( "browser_height")
    private Integer browser_height;

    @SerializedName("browser_ip")
    private String browser_ip;

    @SerializedName("browser_width")
    private Integer browserWidth;

    @SerializedName("session_hash")
    private String sessionHash;

}
