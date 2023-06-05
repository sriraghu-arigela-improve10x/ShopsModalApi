package com.example.shopsmodelapi.money;

import com.google.gson.annotations.SerializedName;

public class CurrentSubTotalPrice {
    @SerializedName("shop_money")
    public ShopMoney shopMoney;

    @SerializedName("presentment_money")
    public PresentmentMoney presentmentMoney;
}
