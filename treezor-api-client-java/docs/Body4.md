
# Body4

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the country restriction group | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the country group |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**countries** | **List&lt;Integer&gt;** | Array of countries | 
**startDate** | **String** | The date at which the country restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALIDATED | &quot;VALIDATED&quot;
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;



