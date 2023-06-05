package com.example.shopsmodelapi.money;

import com.google.gson.annotations.SerializedName;

public class PresentmentMoney {
    @SerializedName("amount")
    private String amount;

    @SerializedName("currency_code")
    private String currencyCode;
}
