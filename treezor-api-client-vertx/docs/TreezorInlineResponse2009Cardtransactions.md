
# TreezorInlineResponse2009Cardtransactions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardtransactionId** | **Integer** |  |  [optional]
**cardId** | **Integer** |  |  [optional]
**walletId** | **Integer** |  |  [optional]
**acquirerId** | **Integer** |  |  [optional]
**walletCurrency** | **String** |  |  [optional]
**merchantId** | **String** |  |  [optional]
**merchantName** | **String** |  |  [optional]
**merchantCity** | **String** |  |  [optional]
**merchantCountry** | **String** |  |  [optional]
**mccCode** | **String** |  |  [optional]
**paymentLocalTime** | **String** |  |  [optional]
**publicToken** | **String** |  |  [optional]
**paymentAmount** | **String** |  |  [optional]
**paymentCurrency** | **String** | payment currency. Format: [ISO 4217](https://fr.wikipedia.org/wiki/ISO_4217).  |  [optional]
**fees** | **String** |  |  [optional]
**paymentCountry** | **String** |  |  [optional]
**paymentId** | **String** |  |  [optional]
**paymentStatus** | **String** | Payment status.  | Status | Description | | ------ | -------     | | A | Accepted | | C | Cleared | | I | Declined | | S | Settled | | V | Reversed |  |  [optional]
**paymentLocalAmount** | **String** |  |  [optional]
**posCardholderPresence** | **String** |  |  [optional]
**posPostcode** | **String** |  |  [optional]
**posCountry** | **String** |  |  [optional]
**posTerminalId** | **String** |  |  [optional]
**posCardPresence** | **String** |  |  [optional]
**panEntryMethod** | **String** |  |  [optional]
**authorizationNote** | **String** |  |  [optional]
**authorizationResponseCode** | **String** | Authorization response code.  | Code | Description | | ---- | ----------- | | 00 | All Good | | 01 | Refer to card issuer Refer | | 03 | Invalid merchant Decline | | 05 | Do not honour Decline | | 10 | Partial Approval Approve | | 13 | Invalid amount Decline | | 14 | Invalid card number (no such number) Decline | | 17 | Customer Cancellation Decline | | 33 | Expired card (Capture) Decline &amp; Pickup | | 41 | Lost card (Capture) Decline &amp; Pickup | | 43 | Stolen card (Capture) Decline &amp; Pickup | | 51 | Insufficient funds Decline | | 54 | Expired card Decline | | 55 | Incorrect PIN Decline | | 57 | Transaction not permitted to cardholder Decline | | 58 | Transaction not permitted to terminal Decline | | 61 | Exceeds withdrawal amount limit Decline | | 62 | Restricted card Decline | | 63 | Security Violation Decline | | 65 | Exceeds withdrawal frequency limit Decline | | 68 | Response received too late Decline | | 70 | Cardholder to contact issuer Decline | | 75 | Allowable number of PIN tries exceeded Decline | | 82 | Timeout at IEM Decline | | 85 | PIN Unblock request Approve | | 91 | Issuer or switch is inoperative Decline | | N7 | Decline for CVV2 failure Decline |  |  [optional]
**authorizationIssuerId** | **String** |  |  [optional]
**authorizationIssuerTime** | **String** |  |  [optional]
**authorizationMti** | **String** | Authorization Message Type Identifier  | MTI | Description | | --- | ----| | 01xx | Authorization message | | 04xx | reversal message | | 12xx | Financial message |  |  [optional]
**authorizedBalance** | **String** |  |  [optional]
**limitAtmYear** | **String** |  |  [optional]
**limitAtmMonth** | **String** |  |  [optional]
**limitAtmWeek** | **String** |  |  [optional]
**limitAtmDay** | **String** |  |  [optional]
**limitAtmAll** | **String** |  |  [optional]
**limitPaymentYear** | **String** |  |  [optional]
**limitPaymentMonth** | **String** |  |  [optional]
**limitPaymentWeek** | **String** |  |  [optional]
**limitPaymentDay** | **String** |  |  [optional]
**limitPaymentAll** | **String** |  |  [optional]
**totalLimitAtmYear** | **String** |  |  [optional]
**totalLimitAtmMonth** | **String** |  |  [optional]
**totalLimitAtmWeek** | **String** |  |  [optional]
**totalLimitAtmDay** | **String** |  |  [optional]
**totalLimitAtmAll** | **String** |  |  [optional]
**totalLimitPaymentYear** | **String** |  |  [optional]
**totalLimitPaymentMonth** | **String** |  |  [optional]
**totalLimitPaymentWeek** | **String** |  |  [optional]
**totalLimitPaymentDay** | **String** |  |  [optional]
**totalLimitPaymentAll** | **String** |  |  [optional]
**totalRows** | **Integer** |  |  [optional]



