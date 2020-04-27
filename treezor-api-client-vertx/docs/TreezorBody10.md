
# TreezorBody10

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the merchant ID restriction group |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the merchant ID restriction group |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**merchants** | **List&lt;String&gt;** | Array of merchant ID |  [optional]
**startDate** | **String** | The date at which the merchant ID group will be take into account. Format YYYY-MM-DD HH:MM:SS |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALIDATED | &quot;VALIDATED&quot;
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;



