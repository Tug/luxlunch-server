
# TreezorBusinesssearchsBusinessinformations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legalName** | **String** | Business commercial name. |  [optional]
**phone** | **String** | Business phone number. |  [optional]
**legalTvaNumber** | **String** | Business VAT number. |  [optional]
**legalRegistrationNumber** | **String** | Business registration number. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | | Code | Description | | ---- | ----------- | |  D   | Deleted     | |  N   | Company non diffusible (Insee) | |  I   | Inactive (Insee) | |  A   | Economically active | |  C   | Closed | |  T   | Transfered | |  S   | Economically stopped (Insee) | |  L   | Liquidation | |  O   | Dormant company |  |  [optional]
**officeType** | **Integer** | | Code | Description | | ---- | ----        | |  0   | Secondary establishment | |  1   | Headquarter |  |  [optional]
**safeNumber** | **String** | Business SAFE number. |  [optional]
**activityType** | **String** | Business sector. Code NAF in France. |  [optional]
**externalId** | **String** | Business external id. |  [optional]
**address1** | **String** | Business&#39; street. |  [optional]
**postcode** | **String** | Business&#39; postal code. |  [optional]
**city** | **String** | Business&#39; city. |  [optional]
**state** | **String** | Business&#39; province. |  [optional]
**country** | **String** | Business&#39; country. |  [optional]
**tradename** | **String** | Business trade name |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
D | &quot;D&quot;
N | &quot;N&quot;
I | &quot;I&quot;
A | &quot;A&quot;
C | &quot;C&quot;
T | &quot;T&quot;
S | &quot;S&quot;
L | &quot;L&quot;
O | &quot;O&quot;



