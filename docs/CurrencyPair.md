
# CurrencyPair

Spot currency pair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Currency pair |  [optional]
**base** | **String** | Base currency |  [optional]
**quote** | **String** | Quote currency |  [optional]
**fee** | **String** | Trading fee |  [optional]
**minBaseAmount** | **String** | Minimum amount of base currency to trade, &#x60;null&#x60; means no limit |  [optional]
**minQuoteAmount** | **String** | Minimum amount of quote currency to trade, &#x60;null&#x60; means no limit |  [optional]
**amountPrecision** | **Integer** | Amount scale |  [optional]
**precision** | **Integer** | Price scale |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | How currency pair can be traded  - untradable: cannot be bought or sold - buyable: can be bought - sellable: can be sold - tradable: can be bought or sold |  [optional]

## Enum: TradeStatusEnum

Name | Value
---- | -----
UNTRADABLE | &quot;untradable&quot;
BUYABLE | &quot;buyable&quot;
SELLABLE | &quot;sellable&quot;
TRADABLE | &quot;tradable&quot;

