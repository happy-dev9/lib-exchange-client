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
package com.blockchain.exchange.rest.model

import com.blockchain.exchange.rest.model.WithdrawalStatus

import com.squareup.moshi.Json
/**
 * 
 * @param amount The amount to withdraw in the currency specified
 * @param currency 
 * @param beneficiary 
 * @param withdrawalId Unique ID for this withdrawal
 * @param fee The amount charged in fees for this withdrawal
 * @param state 
 * @param timestamp Time in ms since 01/01/1970 (epoch)
 */

data class WithdrawalInfo (
    /* The amount to withdraw in the currency specified */
    @Json(name = "amount")
    val amount: kotlin.Double,
    @Json(name = "currency")
    val currency: kotlin.String,
    @Json(name = "beneficiary")
    val beneficiary: kotlin.String,
    /* Unique ID for this withdrawal */
    @Json(name = "withdrawalId")
    val withdrawalId: kotlin.String? = null,
    /* The amount charged in fees for this withdrawal */
    @Json(name = "fee")
    val fee: kotlin.Double? = null,
    @Json(name = "state")
    val state: WithdrawalStatus? = null,
    /* Time in ms since 01/01/1970 (epoch) */
    @Json(name = "timestamp")
    val timestamp: kotlin.Long? = null
)

