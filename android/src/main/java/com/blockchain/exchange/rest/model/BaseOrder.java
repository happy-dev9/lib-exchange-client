/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import com.blockchain.exchange.rest.model.OrdType;
import com.blockchain.exchange.rest.model.Side;
import com.blockchain.exchange.rest.model.TimeInForce;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BaseOrder {
  
  @SerializedName("clOrdId")
  private String clOrdId = null;
  @SerializedName("ordType")
  private OrdType ordType = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private Side side = null;
  @SerializedName("orderQty")
  private Double orderQty = null;
  @SerializedName("timeInForce")
  private TimeInForce timeInForce = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("expireDate")
  private Integer expireDate = null;
  @SerializedName("minQty")
  private Double minQty = null;
  @SerializedName("stopPx")
  private Double stopPx = null;

  /**
   * Reference field provided by client and cannot exceed 20 characters
   **/
  @ApiModelProperty(required = true, value = "Reference field provided by client and cannot exceed 20 characters")
  public String getClOrdId() {
    return clOrdId;
  }
  public void setClOrdId(String clOrdId) {
    this.clOrdId = clOrdId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrdType getOrdType() {
    return ordType;
  }
  public void setOrdType(OrdType ordType) {
    this.ordType = ordType;
  }

  /**
   * Blockchain symbol identifier
   **/
  @ApiModelProperty(required = true, value = "Blockchain symbol identifier")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Side getSide() {
    return side;
  }
  public void setSide(Side side) {
    this.side = side;
  }

  /**
   * The order size in the terms of the base currency
   **/
  @ApiModelProperty(required = true, value = "The order size in the terms of the base currency")
  public Double getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(Double orderQty) {
    this.orderQty = orderQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimeInForce getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   * The limit price for the order
   **/
  @ApiModelProperty(value = "The limit price for the order")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * expiry date in the format YYYYMMDD
   * minimum: 20200101
   * maximum: 20501231
   **/
  @ApiModelProperty(value = "expiry date in the format YYYYMMDD")
  public Integer getExpireDate() {
    return expireDate;
  }
  public void setExpireDate(Integer expireDate) {
    this.expireDate = expireDate;
  }

  /**
   * The minimum quantity required for an IOC fill
   **/
  @ApiModelProperty(value = "The minimum quantity required for an IOC fill")
  public Double getMinQty() {
    return minQty;
  }
  public void setMinQty(Double minQty) {
    this.minQty = minQty;
  }

  /**
   * The limit price for the order
   **/
  @ApiModelProperty(value = "The limit price for the order")
  public Double getStopPx() {
    return stopPx;
  }
  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseOrder baseOrder = (BaseOrder) o;
    return (this.clOrdId == null ? baseOrder.clOrdId == null : this.clOrdId.equals(baseOrder.clOrdId)) &&
        (this.ordType == null ? baseOrder.ordType == null : this.ordType.equals(baseOrder.ordType)) &&
        (this.symbol == null ? baseOrder.symbol == null : this.symbol.equals(baseOrder.symbol)) &&
        (this.side == null ? baseOrder.side == null : this.side.equals(baseOrder.side)) &&
        (this.orderQty == null ? baseOrder.orderQty == null : this.orderQty.equals(baseOrder.orderQty)) &&
        (this.timeInForce == null ? baseOrder.timeInForce == null : this.timeInForce.equals(baseOrder.timeInForce)) &&
        (this.price == null ? baseOrder.price == null : this.price.equals(baseOrder.price)) &&
        (this.expireDate == null ? baseOrder.expireDate == null : this.expireDate.equals(baseOrder.expireDate)) &&
        (this.minQty == null ? baseOrder.minQty == null : this.minQty.equals(baseOrder.minQty)) &&
        (this.stopPx == null ? baseOrder.stopPx == null : this.stopPx.equals(baseOrder.stopPx));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.clOrdId == null ? 0: this.clOrdId.hashCode());
    result = 31 * result + (this.ordType == null ? 0: this.ordType.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.orderQty == null ? 0: this.orderQty.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.expireDate == null ? 0: this.expireDate.hashCode());
    result = 31 * result + (this.minQty == null ? 0: this.minQty.hashCode());
    result = 31 * result + (this.stopPx == null ? 0: this.stopPx.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseOrder {\n");
    
    sb.append("  clOrdId: ").append(clOrdId).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  orderQty: ").append(orderQty).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("  minQty: ").append(minQty).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
