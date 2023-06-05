package com.example.shopsmodelapi.modal;

import com.example.shopsmodelapi.ClientDetails;
import com.example.shopsmodelapi.money.CurrentSubTotalPrice;
import com.example.shopsmodelapi.money.CurrentTotalDiscountsSet;
import com.google.gson.annotations.SerializedName;

public class Shops {
    @SerializedName("_id")
    private String serverId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @SerializedName("app_id")
    private Integer appId;

    @SerializedName("browser_ip")
    private String browserIp;

    @SerializedName("buyer_accepts_marketing")
    private boolean buyerAcceptsMarketing;

    @SerializedName("cancel_reason")
    private String cancelReason;

    @SerializedName("cancelled_at")
    private String cancelledAt;

    @SerializedName("cart_token")
    private String cartToken;

    @SerializedName("checkout_id")
    private String checkoutId;

    @SerializedName("checkout_token")
    private String checkoutToken;

    @SerializedName("client_details")
    public ClientDetails clientDetails;

    @SerializedName("user_agent")
    private String userAgent;

    @SerializedName("closed_at")
    private String closedAt;

    @SerializedName("confirmed")
    private String confirmed;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("currency")
    private String currency;

    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;

    @SerializedName("current_subtotal_price_set")
    public CurrentSubTotalPrice currentSubTotalPrice;

    @SerializedName("current_total_discounts")
    public String currentTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    public CurrentTotalDiscountsSet currentTotalDiscountsSet;
}
