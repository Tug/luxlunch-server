
# TreezorMandate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mandateId** | **Integer** |  |  [optional]
**title** | **String** |  |  [optional]
**legalInformations** | **String** |  |  [optional]
**uniqueMandateReference** | **String** |  |  [optional]
**mandateStatus** | [**MandateStatusEnum**](#MandateStatusEnum) |  |  [optional]
**userId** | **Integer** |  |  [optional]
**debtorName** | **String** |  |  [optional]
**debtorAddress** | **String** |  |  [optional]
**debtorCity** | **String** |  |  [optional]
**debtorZipCode** | **String** |  |  [optional]
**debtorCountry** | **String** |  |  [optional]
**debtorIban** | **String** |  |  [optional]
**debtorBic** | **String** |  |  [optional]
**sequenceType** | [**SequenceTypeEnum**](#SequenceTypeEnum) |  |  [optional]
**creditorName** | **String** |  |  [optional]
**sepaCreditorIdentifier** | **String** |  |  [optional]
**creditorAddress** | **String** |  |  [optional]
**creditorCity** | **String** |  |  [optional]
**creditorZipCode** | **String** |  |  [optional]
**creditorCountry** | **String** |  |  [optional]
**signatureDate** | **String** | Date YYYY-MM-DD |  [optional]
**debtorSignatureIp** | **String** |  |  [optional]
**signed** | **Integer** |  |  [optional]
**debtorIdentificationCode** | **String** |  |  [optional]
**debtorReferencePartyName** | **String** |  |  [optional]
**debtorReferenceIdentificationCode** | **String** |  |  [optional]
**creditorReferencePartyName** | **String** |  |  [optional]
**creditorReferenceIdentificationCode** | **String** |  |  [optional]
**contractIdentificationNumber** | **String** |  |  [optional]
**contractDescription** | **String** |  |  [optional]
**isPaper** | **Boolean** |  |  [optional]
**sddType** | [**SddTypeEnum**](#SddTypeEnum) |  |  [optional]
**revocationSignatureDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**createdIp** | **String** |  |  [optional]
**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]
**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional]


<a name="MandateStatusEnum"></a>
## Enum: MandateStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CANCELED | &quot;CANCELED&quot;
VALIDATED | &quot;VALIDATED&quot;


<a name="SequenceTypeEnum"></a>
## Enum: SequenceTypeEnum
Name | Value
---- | -----
ONE_OFF | &quot;one-off&quot;
RECURRENT | &quot;recurrent&quot;


<a name="SddTypeEnum"></a>
## Enum: SddTypeEnum
Name | Value
---- | -----
CORE | &quot;core&quot;
B2B | &quot;b2b&quot;



