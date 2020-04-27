
# TreezorWallet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletId** | **Integer** |  |  [optional]
**walletTypeId** | **Integer** | | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  |  [optional]
**walletStatus** | [**WalletStatusEnum**](#WalletStatusEnum) |  |  [optional]
**codeStatus** | **Integer** |  |  [optional]
**informationStatus** | **String** |  |  [optional]
**walletTag** | **String** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**userLastname** | **String** |  |  [optional]
**userFirstname** | **String** |  |  [optional]
**jointUserId** | **Integer** |  |  [optional]
**tariffId** | **Integer** |  |  [optional]
**eventName** | **String** |  |  [optional]
**eventAlias** | **String** |  |  [optional]
**eventDate** | **String** | Date YYYY-MM-DD |  [optional]
**eventMessage** | **String** |  |  [optional]
**eventPayinStartDate** | **String** | Date YYYY-MM-DD |  [optional]
**eventPayinEndDate** | **String** | Date YYYY-MM-DD |  [optional]
**contractSigned** | **Integer** |  |  [optional]
**bic** | **String** |  |  [optional]
**iban** | **String** |  |  [optional]
**urlImage** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**payinCount** | **Integer** |  |  [optional]
**payoutCount** | **Integer** |  |  [optional]
**transferCount** | **Integer** |  |  [optional]
**solde** | **Integer** |  |  [optional]
**authorizedBalance** | **Integer** |  |  [optional]
**totalRows** | **Integer** |  |  [optional]


<a name="WalletStatusEnum"></a>
## Enum: WalletStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;



