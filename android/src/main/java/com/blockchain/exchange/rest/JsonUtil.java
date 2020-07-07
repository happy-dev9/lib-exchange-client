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

package com.blockchain.exchange.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import com.blockchain.exchange.rest.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Balance".equalsIgnoreCase(className)) {
      return new TypeToken<List<Balance>>(){}.getType();
    }
    
    if ("BalanceMap".equalsIgnoreCase(className)) {
      return new TypeToken<List<BalanceMap>>(){}.getType();
    }
    
    if ("BaseOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<BaseOrder>>(){}.getType();
    }
    
    if ("CancelOrderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelOrderRequest>>(){}.getType();
    }
    
    if ("CreateWithdrawalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateWithdrawalRequest>>(){}.getType();
    }
    
    if ("DepositAddressCrypto".equalsIgnoreCase(className)) {
      return new TypeToken<List<DepositAddressCrypto>>(){}.getType();
    }
    
    if ("DepositInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<DepositInfo>>(){}.getType();
    }
    
    if ("Fees".equalsIgnoreCase(className)) {
      return new TypeToken<List<Fees>>(){}.getType();
    }
    
    if ("OrdType".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrdType>>(){}.getType();
    }
    
    if ("OrderBook".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderBook>>(){}.getType();
    }
    
    if ("OrderBookEntry".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderBookEntry>>(){}.getType();
    }
    
    if ("OrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatus>>(){}.getType();
    }
    
    if ("OrderSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderSummary>>(){}.getType();
    }
    
    if ("PriceEvent".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceEvent>>(){}.getType();
    }
    
    if ("PriceEventList".equalsIgnoreCase(className)) {
      return new TypeToken<List<PriceEventList>>(){}.getType();
    }
    
    if ("Side".equalsIgnoreCase(className)) {
      return new TypeToken<List<Side>>(){}.getType();
    }
    
    if ("SymbolStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<SymbolStatus>>(){}.getType();
    }
    
    if ("TimeInForce".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeInForce>>(){}.getType();
    }
    
    if ("TimeInForceStop".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeInForceStop>>(){}.getType();
    }
    
    if ("UnauthorizedError".equalsIgnoreCase(className)) {
      return new TypeToken<List<UnauthorizedError>>(){}.getType();
    }
    
    if ("WhitelistEntry".equalsIgnoreCase(className)) {
      return new TypeToken<List<WhitelistEntry>>(){}.getType();
    }
    
    if ("WithdrawalInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawalInfo>>(){}.getType();
    }
    
    if ("WithdrawalStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawalStatus>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Balance".equalsIgnoreCase(className)) {
      return new TypeToken<Balance>(){}.getType();
    }
    
    if ("BalanceMap".equalsIgnoreCase(className)) {
      return new TypeToken<BalanceMap>(){}.getType();
    }
    
    if ("BaseOrder".equalsIgnoreCase(className)) {
      return new TypeToken<BaseOrder>(){}.getType();
    }
    
    if ("CancelOrderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CancelOrderRequest>(){}.getType();
    }
    
    if ("CreateWithdrawalRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateWithdrawalRequest>(){}.getType();
    }
    
    if ("DepositAddressCrypto".equalsIgnoreCase(className)) {
      return new TypeToken<DepositAddressCrypto>(){}.getType();
    }
    
    if ("DepositInfo".equalsIgnoreCase(className)) {
      return new TypeToken<DepositInfo>(){}.getType();
    }
    
    if ("Fees".equalsIgnoreCase(className)) {
      return new TypeToken<Fees>(){}.getType();
    }
    
    if ("OrdType".equalsIgnoreCase(className)) {
      return new TypeToken<OrdType>(){}.getType();
    }
    
    if ("OrderBook".equalsIgnoreCase(className)) {
      return new TypeToken<OrderBook>(){}.getType();
    }
    
    if ("OrderBookEntry".equalsIgnoreCase(className)) {
      return new TypeToken<OrderBookEntry>(){}.getType();
    }
    
    if ("OrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatus>(){}.getType();
    }
    
    if ("OrderSummary".equalsIgnoreCase(className)) {
      return new TypeToken<OrderSummary>(){}.getType();
    }
    
    if ("PriceEvent".equalsIgnoreCase(className)) {
      return new TypeToken<PriceEvent>(){}.getType();
    }
    
    if ("PriceEventList".equalsIgnoreCase(className)) {
      return new TypeToken<PriceEventList>(){}.getType();
    }
    
    if ("Side".equalsIgnoreCase(className)) {
      return new TypeToken<Side>(){}.getType();
    }
    
    if ("SymbolStatus".equalsIgnoreCase(className)) {
      return new TypeToken<SymbolStatus>(){}.getType();
    }
    
    if ("TimeInForce".equalsIgnoreCase(className)) {
      return new TypeToken<TimeInForce>(){}.getType();
    }
    
    if ("TimeInForceStop".equalsIgnoreCase(className)) {
      return new TypeToken<TimeInForceStop>(){}.getType();
    }
    
    if ("UnauthorizedError".equalsIgnoreCase(className)) {
      return new TypeToken<UnauthorizedError>(){}.getType();
    }
    
    if ("WhitelistEntry".equalsIgnoreCase(className)) {
      return new TypeToken<WhitelistEntry>(){}.getType();
    }
    
    if ("WithdrawalInfo".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawalInfo>(){}.getType();
    }
    
    if ("WithdrawalStatus".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawalStatus>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
