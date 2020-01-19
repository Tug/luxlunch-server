
# Body8

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the MCC restriction group |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the MCC group |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**mcc** | **List&lt;Integer&gt;** | Array of MCC |  [optional]
**startDate** | **String** | The date at which the MCC restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS |  [optional]
**fields** | **List&lt;String&gt;** | List of the object&#39;s properties you want to pick up. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALIDATED | &quot;VALIDATED&quot;
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;



