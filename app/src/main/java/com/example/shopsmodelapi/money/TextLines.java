package com.example.shopsmodelapi.money;

import com.google.gson.annotations.SerializedName;

public class TextLines {
    private String address2;
    private String city;
    private String zip;
    @SerializedName("channel_liable")
    private Boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private CurrentTotalPriceSet priceSet;
    private Float rate;
    private String title;
}
