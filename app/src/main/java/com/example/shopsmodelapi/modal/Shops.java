package com.example.shopsmodelapi.modal;

import com.example.shopsmodelapi.ClientDetails;
import com.example.shopsmodelapi.money.CurrentTotalPriceSet;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

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
    public CurrentTotalPriceSet currentSubTotalPrice;

    @SerializedName("current_total_discounts")
    public String currentTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    public CurrentTotalPriceSet currentTotalDiscountsSet;

    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;

    @SerializedName("current_total_price")
    private String currentTotalPrice;

    @SerializedName("current_total_price_set")
    public CurrentTotalPriceSet currentTotalPriceSet;

    @SerializedName("current_total_tax")
    private String currentTotalTax;

    @SerializedName("current_total_tax_set")
    public CurrentTotalPriceSet currentTotalTaxSet;

    @SerializedName("customer_locale")
    private String customerLocale;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("discount_codes")
    private ArrayList<String> discountCodes;

    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;

    @SerializedName("financial_status")
    private String financialStatus;

    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;

    @SerializedName("gateway")
    private String gateway;

    @SerializedName("landing_site")
    private String landingSite;

    @SerializedName( "landing_site_ref")
    private String landingSiteRef;

    @SerializedName("location_id")
    private String locationId;

    @SerializedName("name")
    private String name;

    @SerializedName("note")
    private String note;

    @SerializedName("note_attributes")
    private ArrayList<String> noteAttributes;

    @SerializedName("number")
    private Integer number;

    @SerializedName("order_number")
    private Integer orderNumber;

    @SerializedName("order_status_url")
    private String orderStatusUrl;

    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;

    @SerializedName("payment_gateway_names")
    private ArrayList<String> paymentGatewayNames;

    @SerializedName("presentment_currency")
    private String presentmentCurrency;

    @SerializedName("processed_at")
    private String processedAt;

    @SerializedName("processing_method")
    private String processingMethod;

    @SerializedName("reference")
    private String reference;

    @SerializedName("referring_site")
    private String referringSite;

    @SerializedName( "source_identifier")
    private String sourceIdentifier;

    @SerializedName("source_name")
    private String sourceName;

    @SerializedName("source_url")
    private String sourceUrl;

    @SerializedName("subtotal_price")
    private String subtotalPrice;
}
