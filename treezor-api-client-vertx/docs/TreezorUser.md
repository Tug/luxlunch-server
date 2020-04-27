
# TreezorUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Integer** |  |  [optional]
**userTypeId** | **Integer** |  |  [optional]
**userStatus** | [**UserStatusEnum**](#UserStatusEnum) |  |  [optional]
**userTag** | **String** |  |  [optional]
**parentUserId** | **Integer** |  |  [optional]
**parentType** | **String** |  |  [optional]
**controllingPersonType** | **Integer** |  |  [optional]
**employeeType** | **Integer** |  |  [optional]
**specifiedUSPerson** | **Integer** |  |  [optional]
**title** | [**TitleEnum**](#TitleEnum) |  |  [optional]
**firstname** | **String** |  |  [optional]
**lastname** | **String** |  |  [optional]
**middleNames** | **String** |  |  [optional]
**birthday** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**address1** | **String** |  |  [optional]
**address2** | **String** |  |  [optional]
**postcode** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**countryName** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**mobile** | **String** |  |  [optional]
**nationality** | **String** |  |  [optional]
**nationalityOther** | **String** |  |  [optional]
**placeOfBirth** | **String** |  |  [optional]
**birthCountry** | **String** |  |  [optional]
**occupation** | **String** |  |  [optional]
**incomeRange** | **String** |  |  [optional]
**legalName** | **String** |  |  [optional]
**legalNameEmbossed** | **String** |  |  [optional]
**legalRegistrationNumber** | **String** |  |  [optional]
**legalTvaNumber** | **String** |  |  [optional]
**legalRegistrationDate** | **String** | Date YYYY-MM-DD |  [optional]
**legalForm** | **String** |  |  [optional]
**legalShareCapital** | **Integer** |  |  [optional]
**legalSector** | **String** |  |  [optional]
**legalAnnualTurnOver** | **String** |  |  [optional]
**legalNetIncomeRange** | **String** |  |  [optional]
**legalNumberOfEmployeeRange** | **String** |  |  [optional]
**effectiveBeneficiary** | **Integer** |  |  [optional]
**kycLevel** | **Integer** | | Value | Description | |----|----| | 0 | NONE | | 1 | LIGHT | | 2 | REGULAR | | 4 | REFUSED |  |  [optional]
**kycReview** | **Integer** | | Value | Description | |----|----| | 0 | NONE | | 1 | PENDING | | 2 | VALIDATED | | 3 | REFUSED |  |  [optional]
**kycReviewComment** | **String** |  |  [optional]
**isFreezed** | **Integer** |  |  [optional]
**language** | **String** |  |  [optional]
**optInMailing** | **Integer** |  |  [optional]
**sepaCreditorIdentifier** | **String** |  |  [optional]
**taxNumber** | **String** |  |  [optional]
**taxResidence** | **String** |  |  [optional]
**position** | **String** |  |  [optional]
**personalAssets** | **String** |  |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**walletCount** | **Integer** |  |  [optional]
**payinCount** | **Integer** |  |  [optional]
**totalRows** | **Integer** |  |  [optional]


<a name="UserStatusEnum"></a>
## Enum: UserStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;


<a name="TitleEnum"></a>
## Enum: TitleEnum
Name | Value
---- | -----
M | &quot;M&quot;
MME | &quot;MME&quot;
MLLE | &quot;MLLE&quot;



