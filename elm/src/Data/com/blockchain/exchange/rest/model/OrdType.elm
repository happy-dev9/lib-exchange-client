{-
   Blockchain.com Exchange REST API
   ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.OrdType exposing (OrdType(..), decoder, encode, toString)

import Dict exposing (Dict)
import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (optional, required)
import Json.Encode as Encode


type OrdType
    = MARKET
    | LIMIT
    | STOP
    | STOPLIMIT



decoder : Decoder OrdType
decoder =
    Decode.string
        |> Decode.andThen
            (\str ->
                case str of
                    "MARKET" ->
                        Decode.succeed MARKET

                    "LIMIT" ->
                        Decode.succeed LIMIT

                    "STOP" ->
                        Decode.succeed STOP

                    "STOPLIMIT" ->
                        Decode.succeed STOPLIMIT

                    other ->
                        Decode.fail <| "Unknown type: " ++ other
            )



encode : OrdType -> Encode.Value
encode model =
    case model of
        MARKET ->
            Encode.string "MARKET"

        LIMIT ->
            Encode.string "LIMIT"

        STOP ->
            Encode.string "STOP"

        STOPLIMIT ->
            Encode.string "STOPLIMIT"




toString : OrdType -> String
toString model =
    case model of
        MARKET ->
            "MARKET"

        LIMIT ->
            "LIMIT"

        STOP ->
            "STOP"

        STOPLIMIT ->
            "STOPLIMIT"



