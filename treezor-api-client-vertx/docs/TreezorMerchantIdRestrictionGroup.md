
# TreezorMerchantIdRestrictionGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Merchant ID Group&#39;s id |  [optional]
**name** | **String** | Merchant ID Group&#39;s name |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**merchants** | **List&lt;String&gt;** | Array of Merchant ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status of the Merchant ID group |  [optional]
**startDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;



