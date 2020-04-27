
# TreezorTransfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | **Integer** |  |  [optional]
**transferStatus** | [**TransferStatusEnum**](#TransferStatusEnum) |  |  [optional]
**transferTag** | **String** |  |  [optional]
**walletId** | **Integer** |  |  [optional]
**walletTypeId** | **Integer** | | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  |  [optional]
**beneficiaryWalletId** | **Integer** |  |  [optional]
**beneficiaryWalletTypeId** | **Integer** | | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) |  |  [optional]
**transferDate** | **String** | Date YYYY-MM-DD |  [optional]
**walletEventName** | **String** |  |  [optional]
**walletAlias** | **String** |  |  [optional]
**beneficiaryWalletEventName** | **String** |  |  [optional]
**beneficiaryWalletAlias** | **String** |  |  [optional]
**amount** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**label** | **String** |  |  [optional]
**transferTypeId** | **Integer** | Transfer type  | Status | Description | | ------ | -------     | | 1 | Wallet to wallet | | 2 | Card transaction | | 3 | Client fees | | 4 | Credit note |  |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**totalRows** | **Integer** |  |  [optional]


<a name="TransferStatusEnum"></a>
## Enum: TransferStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;



