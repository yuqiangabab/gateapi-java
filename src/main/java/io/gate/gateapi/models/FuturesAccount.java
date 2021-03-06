/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * FuturesAccount
 */
public class FuturesAccount {
    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private String total;

    public static final String SERIALIZED_NAME_UNREALISED_PNL = "unrealised_pnl";
    @SerializedName(SERIALIZED_NAME_UNREALISED_PNL)
    private String unrealisedPnl;

    public static final String SERIALIZED_NAME_POSITION_MARGIN = "position_margin";
    @SerializedName(SERIALIZED_NAME_POSITION_MARGIN)
    private String positionMargin;

    public static final String SERIALIZED_NAME_ORDER_MARGIN = "order_margin";
    @SerializedName(SERIALIZED_NAME_ORDER_MARGIN)
    private String orderMargin;

    public static final String SERIALIZED_NAME_AVAILABLE = "available";
    @SerializedName(SERIALIZED_NAME_AVAILABLE)
    private String available;

    public static final String SERIALIZED_NAME_POINT = "point";
    @SerializedName(SERIALIZED_NAME_POINT)
    private String point;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;


    public FuturesAccount total(String total) {
        
        this.total = total;
        return this;
    }

     /**
     * Total assets, total &#x3D; position_margin + order_margin + available
     * @return total
    **/
    @javax.annotation.Nullable
    public String getTotal() {
        return total;
    }


    public void setTotal(String total) {
        this.total = total;
    }

    public FuturesAccount unrealisedPnl(String unrealisedPnl) {
        
        this.unrealisedPnl = unrealisedPnl;
        return this;
    }

     /**
     * Unrealized PNL
     * @return unrealisedPnl
    **/
    @javax.annotation.Nullable
    public String getUnrealisedPnl() {
        return unrealisedPnl;
    }


    public void setUnrealisedPnl(String unrealisedPnl) {
        this.unrealisedPnl = unrealisedPnl;
    }

    public FuturesAccount positionMargin(String positionMargin) {
        
        this.positionMargin = positionMargin;
        return this;
    }

     /**
     * Position margin
     * @return positionMargin
    **/
    @javax.annotation.Nullable
    public String getPositionMargin() {
        return positionMargin;
    }


    public void setPositionMargin(String positionMargin) {
        this.positionMargin = positionMargin;
    }

    public FuturesAccount orderMargin(String orderMargin) {
        
        this.orderMargin = orderMargin;
        return this;
    }

     /**
     * Order margin of unfinished orders
     * @return orderMargin
    **/
    @javax.annotation.Nullable
    public String getOrderMargin() {
        return orderMargin;
    }


    public void setOrderMargin(String orderMargin) {
        this.orderMargin = orderMargin;
    }

    public FuturesAccount available(String available) {
        
        this.available = available;
        return this;
    }

     /**
     * Available balance to transfer out or trade
     * @return available
    **/
    @javax.annotation.Nullable
    public String getAvailable() {
        return available;
    }


    public void setAvailable(String available) {
        this.available = available;
    }

    public FuturesAccount point(String point) {
        
        this.point = point;
        return this;
    }

     /**
     * POINT amount
     * @return point
    **/
    @javax.annotation.Nullable
    public String getPoint() {
        return point;
    }


    public void setPoint(String point) {
        this.point = point;
    }

    public FuturesAccount currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Settle currency
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesAccount futuresAccount = (FuturesAccount) o;
        return Objects.equals(this.total, futuresAccount.total) &&
                Objects.equals(this.unrealisedPnl, futuresAccount.unrealisedPnl) &&
                Objects.equals(this.positionMargin, futuresAccount.positionMargin) &&
                Objects.equals(this.orderMargin, futuresAccount.orderMargin) &&
                Objects.equals(this.available, futuresAccount.available) &&
                Objects.equals(this.point, futuresAccount.point) &&
                Objects.equals(this.currency, futuresAccount.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, unrealisedPnl, positionMargin, orderMargin, available, point, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesAccount {\n");
        sb.append("      total: ").append(toIndentedString(total)).append("\n");
        sb.append("      unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
        sb.append("      positionMargin: ").append(toIndentedString(positionMargin)).append("\n");
        sb.append("      orderMargin: ").append(toIndentedString(orderMargin)).append("\n");
        sb.append("      available: ").append(toIndentedString(available)).append("\n");
        sb.append("      point: ").append(toIndentedString(point)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n        ");
    }

}

