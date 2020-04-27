
# TreezorMccRestrictionGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | MCC Group&#39;s id |  [optional]
**name** | **String** | MCC Group&#39;s name |  [optional]
**isWhitelist** | **Boolean** | determines whether it will be a black or a white list |  [optional]
**mcc** | **List&lt;Integer&gt;** | Array of MCC |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status of the MCC group |  [optional]
**startDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;



