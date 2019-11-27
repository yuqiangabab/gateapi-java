# gate-api

Gate API v4
- API version: 4.8.1

APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.

  For more information, please visit [https://www.gate.io/page/contacts](https://www.gate.io/page/contacts)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Specific note for 4.8.0

**BREAKING** change:

4.8.0 add new support with different settle currency for futures API(BTC is the only one allowed before), which makes ALL methods in FuturesApi REQUIRE an additional `settle` parameter.

But previous `/futures/xxx` APIs are still preserved for compatibility usage(will be treated as BTC), so if one of the following condition is met:

- Changing all your futures method call to include `settle` is not a big issue for you
- You need to use futures settled in non-BTC currency

then you'd better move to 4.8.0 and changes all your futures method call to pass in `settle` parameter. Otherwise, you can stick to version<=4.7.3,
but will not receive any future API upgrade support

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.gate</groupId>
  <artifactId>gate-api</artifactId>
  <version>4.8.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.gate:gate-api:4.8.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/gate-api-4.8.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.gate.gateapi.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

import java.io.File;
import java.util.*;

public class FuturesApiExample {

    public static void main(String[] args) {
        ApiClient client = new ApiClient("YOUR_API_KEY", "YOUR_API_SECRET");
        // uncomment the next line if testing the API with other host
        // apiClient.setBasePath("https://some-other-host");
        FuturesApi apiInstance = new FuturesApi(client);
        String settle = "btc"; // String | Settle currency
        String orderId = "12345"; // String | ID returned on order successfully being created
        try {
            FuturesOrder result = apiInstance.cancelFuturesOrder(settle, orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.gateio.ws/api/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FuturesApi* | [**cancelFuturesOrder**](docs/FuturesApi.md#cancelFuturesOrder) | **DELETE** /futures/{settle}/orders/{order_id} | Cancel a single order
*FuturesApi* | [**cancelFuturesOrders**](docs/FuturesApi.md#cancelFuturesOrders) | **DELETE** /futures/{settle}/orders | Cancel all &#x60;open&#x60; orders matched
*FuturesApi* | [**cancelPriceTriggeredOrder**](docs/FuturesApi.md#cancelPriceTriggeredOrder) | **DELETE** /futures/{settle}/price_orders/{order_id} | Cancel a single order
*FuturesApi* | [**cancelPriceTriggeredOrderList**](docs/FuturesApi.md#cancelPriceTriggeredOrderList) | **DELETE** /futures/{settle}/price_orders | Cancel all open orders
*FuturesApi* | [**createFuturesOrder**](docs/FuturesApi.md#createFuturesOrder) | **POST** /futures/{settle}/orders | Create a futures order
*FuturesApi* | [**createPriceTriggeredOrder**](docs/FuturesApi.md#createPriceTriggeredOrder) | **POST** /futures/{settle}/price_orders | Create a price-triggered order
*FuturesApi* | [**getFuturesContract**](docs/FuturesApi.md#getFuturesContract) | **GET** /futures/{settle}/contracts/{contract} | Get a single contract
*FuturesApi* | [**getFuturesOrder**](docs/FuturesApi.md#getFuturesOrder) | **GET** /futures/{settle}/orders/{order_id} | Get a single order
*FuturesApi* | [**getMyTrades**](docs/FuturesApi.md#getMyTrades) | **GET** /futures/{settle}/my_trades | List personal trading history
*FuturesApi* | [**getPosition**](docs/FuturesApi.md#getPosition) | **GET** /futures/{settle}/positions/{contract} | Get single position
*FuturesApi* | [**getPriceTriggeredOrder**](docs/FuturesApi.md#getPriceTriggeredOrder) | **GET** /futures/{settle}/price_orders/{order_id} | Get a single order
*FuturesApi* | [**listFuturesAccountBook**](docs/FuturesApi.md#listFuturesAccountBook) | **GET** /futures/{settle}/account_book | Query account book
*FuturesApi* | [**listFuturesAccounts**](docs/FuturesApi.md#listFuturesAccounts) | **GET** /futures/{settle}/accounts | Query futures account
*FuturesApi* | [**listFuturesCandlesticks**](docs/FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/{settle}/candlesticks | Get futures candlesticks
*FuturesApi* | [**listFuturesContracts**](docs/FuturesApi.md#listFuturesContracts) | **GET** /futures/{settle}/contracts | List all futures contracts
*FuturesApi* | [**listFuturesFundingRateHistory**](docs/FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/{settle}/funding_rate | Funding rate history
*FuturesApi* | [**listFuturesInsuranceLedger**](docs/FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/{settle}/insurance | Futures insurance balance history
*FuturesApi* | [**listFuturesOrderBook**](docs/FuturesApi.md#listFuturesOrderBook) | **GET** /futures/{settle}/order_book | Futures order book
*FuturesApi* | [**listFuturesOrders**](docs/FuturesApi.md#listFuturesOrders) | **GET** /futures/{settle}/orders | List futures orders
*FuturesApi* | [**listFuturesTickers**](docs/FuturesApi.md#listFuturesTickers) | **GET** /futures/{settle}/tickers | List futures tickers
*FuturesApi* | [**listFuturesTrades**](docs/FuturesApi.md#listFuturesTrades) | **GET** /futures/{settle}/trades | Futures trading history
*FuturesApi* | [**listLiquidates**](docs/FuturesApi.md#listLiquidates) | **GET** /futures/{settle}/liquidates | List liquidation history
*FuturesApi* | [**listPositionClose**](docs/FuturesApi.md#listPositionClose) | **GET** /futures/{settle}/position_close | List position close history
*FuturesApi* | [**listPositions**](docs/FuturesApi.md#listPositions) | **GET** /futures/{settle}/positions | List all positions of a user
*FuturesApi* | [**listPriceTriggeredOrders**](docs/FuturesApi.md#listPriceTriggeredOrders) | **GET** /futures/{settle}/price_orders | List all auto orders
*FuturesApi* | [**updatePositionLeverage**](docs/FuturesApi.md#updatePositionLeverage) | **POST** /futures/{settle}/positions/{contract}/leverage | Update position leverage
*FuturesApi* | [**updatePositionMargin**](docs/FuturesApi.md#updatePositionMargin) | **POST** /futures/{settle}/positions/{contract}/margin | Update position margin
*FuturesApi* | [**updatePositionRiskLimit**](docs/FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/{settle}/positions/{contract}/risk_limit | Update position risk limit
*MarginApi* | [**cancelLoan**](docs/MarginApi.md#cancelLoan) | **DELETE** /margin/loans/{loan_id} | Cancel lending loan
*MarginApi* | [**createLoan**](docs/MarginApi.md#createLoan) | **POST** /margin/loans | Lend or borrow
*MarginApi* | [**getLoan**](docs/MarginApi.md#getLoan) | **GET** /margin/loans/{loan_id} | Retrieve one single loan detail
*MarginApi* | [**getLoanRecord**](docs/MarginApi.md#getLoanRecord) | **GET** /margin/loan_records/{loan_record_id} | Get one single loan record
*MarginApi* | [**listFundingAccounts**](docs/MarginApi.md#listFundingAccounts) | **GET** /margin/funding_accounts | Funding account list
*MarginApi* | [**listFundingBook**](docs/MarginApi.md#listFundingBook) | **GET** /margin/funding_book | Order book of lending loans
*MarginApi* | [**listLoanRecords**](docs/MarginApi.md#listLoanRecords) | **GET** /margin/loan_records | List repayment records of specified loan
*MarginApi* | [**listLoanRepayments**](docs/MarginApi.md#listLoanRepayments) | **GET** /margin/loans/{loan_id}/repayment | List loan repayment records
*MarginApi* | [**listLoans**](docs/MarginApi.md#listLoans) | **GET** /margin/loans | List all loans
*MarginApi* | [**listMarginAccounts**](docs/MarginApi.md#listMarginAccounts) | **GET** /margin/accounts | Margin account list
*MarginApi* | [**listMarginCurrencyPairs**](docs/MarginApi.md#listMarginCurrencyPairs) | **GET** /margin/currency_pairs | List all supported currency pairs supported in margin trading
*MarginApi* | [**mergeLoans**](docs/MarginApi.md#mergeLoans) | **POST** /margin/merged_loans | Merge multiple lending loans
*MarginApi* | [**repayLoan**](docs/MarginApi.md#repayLoan) | **POST** /margin/loans/{loan_id}/repayment | Repay a loan
*MarginApi* | [**updateLoan**](docs/MarginApi.md#updateLoan) | **PATCH** /margin/loans/{loan_id} | Modify a loan
*MarginApi* | [**updateLoanRecord**](docs/MarginApi.md#updateLoanRecord) | **PATCH** /margin/loan_records/{loan_record_id} | Modify a loan record
*SpotApi* | [**cancelOrder**](docs/SpotApi.md#cancelOrder) | **DELETE** /spot/orders/{order_id} | Cancel a single order
*SpotApi* | [**cancelOrders**](docs/SpotApi.md#cancelOrders) | **DELETE** /spot/orders | Cancel all &#x60;open&#x60; orders in specified currency pair
*SpotApi* | [**createOrder**](docs/SpotApi.md#createOrder) | **POST** /spot/orders | Create an order
*SpotApi* | [**getCurrencyPair**](docs/SpotApi.md#getCurrencyPair) | **GET** /spot/currency_pairs/{currency_pair} | Get detail of one single order
*SpotApi* | [**getOrder**](docs/SpotApi.md#getOrder) | **GET** /spot/orders/{order_id} | Get a single order
*SpotApi* | [**listCandlesticks**](docs/SpotApi.md#listCandlesticks) | **GET** /spot/candlesticks | Market candlesticks
*SpotApi* | [**listCurrencyPairs**](docs/SpotApi.md#listCurrencyPairs) | **GET** /spot/currency_pairs | List all currency pairs supported
*SpotApi* | [**listMyTrades**](docs/SpotApi.md#listMyTrades) | **GET** /spot/my_trades | List personal trading history
*SpotApi* | [**listOrderBook**](docs/SpotApi.md#listOrderBook) | **GET** /spot/order_book | Retrieve order book
*SpotApi* | [**listOrders**](docs/SpotApi.md#listOrders) | **GET** /spot/orders | List orders
*SpotApi* | [**listSpotAccounts**](docs/SpotApi.md#listSpotAccounts) | **GET** /spot/accounts | List spot accounts
*SpotApi* | [**listTickers**](docs/SpotApi.md#listTickers) | **GET** /spot/tickers | Retrieve ticker information
*SpotApi* | [**listTrades**](docs/SpotApi.md#listTrades) | **GET** /spot/trades | Retrieve market trades
*WalletApi* | [**transfer**](docs/WalletApi.md#transfer) | **POST** /wallet/transfers | Transfer between accounts


## Documentation for Models

 - [Contract](docs/Contract.md)
 - [CurrencyPair](docs/CurrencyPair.md)
 - [FundingAccount](docs/FundingAccount.md)
 - [FundingBookItem](docs/FundingBookItem.md)
 - [FundingRateRecord](docs/FundingRateRecord.md)
 - [FuturesAccount](docs/FuturesAccount.md)
 - [FuturesAccountBook](docs/FuturesAccountBook.md)
 - [FuturesCandlestick](docs/FuturesCandlestick.md)
 - [FuturesInitialOrder](docs/FuturesInitialOrder.md)
 - [FuturesLiquidate](docs/FuturesLiquidate.md)
 - [FuturesOrder](docs/FuturesOrder.md)
 - [FuturesOrderBook](docs/FuturesOrderBook.md)
 - [FuturesOrderBookItem](docs/FuturesOrderBookItem.md)
 - [FuturesPriceTrigger](docs/FuturesPriceTrigger.md)
 - [FuturesPriceTriggeredOrder](docs/FuturesPriceTriggeredOrder.md)
 - [FuturesTicker](docs/FuturesTicker.md)
 - [FuturesTrade](docs/FuturesTrade.md)
 - [InsuranceRecord](docs/InsuranceRecord.md)
 - [Loan](docs/Loan.md)
 - [LoanPatch](docs/LoanPatch.md)
 - [LoanRecord](docs/LoanRecord.md)
 - [MarginAccount](docs/MarginAccount.md)
 - [MarginAccountCurrency](docs/MarginAccountCurrency.md)
 - [MarginCurrencyPair](docs/MarginCurrencyPair.md)
 - [MyFuturesTrade](docs/MyFuturesTrade.md)
 - [Order](docs/Order.md)
 - [OrderBook](docs/OrderBook.md)
 - [Position](docs/Position.md)
 - [PositionClose](docs/PositionClose.md)
 - [PositionCloseOrder](docs/PositionCloseOrder.md)
 - [RepayRequest](docs/RepayRequest.md)
 - [Repayment](docs/Repayment.md)
 - [SpotAccount](docs/SpotAccount.md)
 - [Ticker](docs/Ticker.md)
 - [Trade](docs/Trade.md)
 - [Transfer](docs/Transfer.md)
 - [TriggerOrderResponse](docs/TriggerOrderResponse.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mail.gate.io

