
# TreezorBody9

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Merchant ID group | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the Merchant ID group |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**merchants** | **List&lt;String&gt;** | Array of Merchant ID | 
**startDate** | **String** | The date at which the Merchant ID restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALIDATED | &quot;VALIDATED&quot;
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;



