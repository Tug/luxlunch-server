/*
 * Treezor
 * Treezor API.  more info [here](https://www.treezor.com). 
 *
 * OpenAPI spec version: 0.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TreezorMandate
 */

public class TreezorMandate {
  @JsonProperty("mandateId")
  private Integer mandateId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("legalInformations")
  private String legalInformations = null;

  @JsonProperty("uniqueMandateReference")
  private String uniqueMandateReference = null;

  /**
   * Gets or Sets mandateStatus
   */
  public enum MandateStatusEnum {
    PENDING("PENDING"),
    
    CANCELED("CANCELED"),
    
    VALIDATED("VALIDATED");

    private String value;

    MandateStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MandateStatusEnum fromValue(String text) {
      for (MandateStatusEnum b : MandateStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mandateStatus")
  private MandateStatusEnum mandateStatus = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("debtorName")
  private String debtorName = null;

  @JsonProperty("debtorAddress")
  private String debtorAddress = null;

  @JsonProperty("debtorCity")
  private String debtorCity = null;

  @JsonProperty("debtorZipCode")
  private String debtorZipCode = null;

  @JsonProperty("debtorCountry")
  private String debtorCountry = null;

  @JsonProperty("debtorIban")
  private String debtorIban = null;

  @JsonProperty("debtorBic")
  private String debtorBic = null;

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    ONE_OFF("one-off"),
    
    RECURRENT("recurrent");

    private String value;

    SequenceTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SequenceTypeEnum fromValue(String text) {
      for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sequenceType")
  private SequenceTypeEnum sequenceType = null;

  @JsonProperty("creditorName")
  private String creditorName = null;

  @JsonProperty("sepaCreditorIdentifier")
  private String sepaCreditorIdentifier = null;

  @JsonProperty("creditorAddress")
  private String creditorAddress = null;

  @JsonProperty("creditorCity")
  private String creditorCity = null;

  @JsonProperty("creditorZipCode")
  private String creditorZipCode = null;

  @JsonProperty("creditorCountry")
  private String creditorCountry = null;

  @JsonProperty("signatureDate")
  private String signatureDate = null;

  @JsonProperty("debtorSignatureIp")
  private String debtorSignatureIp = null;

  @JsonProperty("signed")
  private Integer signed = null;

  @JsonProperty("debtorIdentificationCode")
  private String debtorIdentificationCode = null;

  @JsonProperty("debtorReferencePartyName")
  private String debtorReferencePartyName = null;

  @JsonProperty("debtorReferenceIdentificationCode")
  private String debtorReferenceIdentificationCode = null;

  @JsonProperty("creditorReferencePartyName")
  private String creditorReferencePartyName = null;

  @JsonProperty("creditorReferenceIdentificationCode")
  private String creditorReferenceIdentificationCode = null;

  @JsonProperty("contractIdentificationNumber")
  private String contractIdentificationNumber = null;

  @JsonProperty("contractDescription")
  private String contractDescription = null;

  @JsonProperty("isPaper")
  private Boolean isPaper = null;

  /**
   * Gets or Sets sddType
   */
  public enum SddTypeEnum {
    CORE("core"),
    
    B2B("b2b");

    private String value;

    SddTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SddTypeEnum fromValue(String text) {
      for (SddTypeEnum b : SddTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sddType")
  private SddTypeEnum sddType = null;

  @JsonProperty("revocationSignatureDate")
  private String revocationSignatureDate = null;

  @JsonProperty("createdIp")
  private String createdIp = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("modifiedDate")
  private String modifiedDate = null;

  public TreezorMandate mandateId(Integer mandateId) {
    this.mandateId = mandateId;
    return this;
  }

   /**
   * Get mandateId
   * @return mandateId
  **/
  @ApiModelProperty(value = "")
  public Integer getMandateId() {
    return mandateId;
  }

  public void setMandateId(Integer mandateId) {
    this.mandateId = mandateId;
  }

  public TreezorMandate title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TreezorMandate legalInformations(String legalInformations) {
    this.legalInformations = legalInformations;
    return this;
  }

   /**
   * Get legalInformations
   * @return legalInformations
  **/
  @ApiModelProperty(value = "")
  public String getLegalInformations() {
    return legalInformations;
  }

  public void setLegalInformations(String legalInformations) {
    this.legalInformations = legalInformations;
  }

  public TreezorMandate uniqueMandateReference(String uniqueMandateReference) {
    this.uniqueMandateReference = uniqueMandateReference;
    return this;
  }

   /**
   * Get uniqueMandateReference
   * @return uniqueMandateReference
  **/
  @ApiModelProperty(value = "")
  public String getUniqueMandateReference() {
    return uniqueMandateReference;
  }

  public void setUniqueMandateReference(String uniqueMandateReference) {
    this.uniqueMandateReference = uniqueMandateReference;
  }

  public TreezorMandate mandateStatus(MandateStatusEnum mandateStatus) {
    this.mandateStatus = mandateStatus;
    return this;
  }

   /**
   * Get mandateStatus
   * @return mandateStatus
  **/
  @ApiModelProperty(value = "")
  public MandateStatusEnum getMandateStatus() {
    return mandateStatus;
  }

  public void setMandateStatus(MandateStatusEnum mandateStatus) {
    this.mandateStatus = mandateStatus;
  }

  public TreezorMandate userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public TreezorMandate debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

   /**
   * Get debtorName
   * @return debtorName
  **/
  @ApiModelProperty(value = "")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public TreezorMandate debtorAddress(String debtorAddress) {
    this.debtorAddress = debtorAddress;
    return this;
  }

   /**
   * Get debtorAddress
   * @return debtorAddress
  **/
  @ApiModelProperty(value = "")
  public String getDebtorAddress() {
    return debtorAddress;
  }

  public void setDebtorAddress(String debtorAddress) {
    this.debtorAddress = debtorAddress;
  }

  public TreezorMandate debtorCity(String debtorCity) {
    this.debtorCity = debtorCity;
    return this;
  }

   /**
   * Get debtorCity
   * @return debtorCity
  **/
  @ApiModelProperty(value = "")
  public String getDebtorCity() {
    return debtorCity;
  }

  public void setDebtorCity(String debtorCity) {
    this.debtorCity = debtorCity;
  }

  public TreezorMandate debtorZipCode(String debtorZipCode) {
    this.debtorZipCode = debtorZipCode;
    return this;
  }

   /**
   * Get debtorZipCode
   * @return debtorZipCode
  **/
  @ApiModelProperty(value = "")
  public String getDebtorZipCode() {
    return debtorZipCode;
  }

  public void setDebtorZipCode(String debtorZipCode) {
    this.debtorZipCode = debtorZipCode;
  }

  public TreezorMandate debtorCountry(String debtorCountry) {
    this.debtorCountry = debtorCountry;
    return this;
  }

   /**
   * Get debtorCountry
   * @return debtorCountry
  **/
  @ApiModelProperty(value = "")
  public String getDebtorCountry() {
    return debtorCountry;
  }

  public void setDebtorCountry(String debtorCountry) {
    this.debtorCountry = debtorCountry;
  }

  public TreezorMandate debtorIban(String debtorIban) {
    this.debtorIban = debtorIban;
    return this;
  }

   /**
   * Get debtorIban
   * @return debtorIban
  **/
  @ApiModelProperty(value = "")
  public String getDebtorIban() {
    return debtorIban;
  }

  public void setDebtorIban(String debtorIban) {
    this.debtorIban = debtorIban;
  }

  public TreezorMandate debtorBic(String debtorBic) {
    this.debtorBic = debtorBic;
    return this;
  }

   /**
   * Get debtorBic
   * @return debtorBic
  **/
  @ApiModelProperty(value = "")
  public String getDebtorBic() {
    return debtorBic;
  }

  public void setDebtorBic(String debtorBic) {
    this.debtorBic = debtorBic;
  }

  public TreezorMandate sequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

   /**
   * Get sequenceType
   * @return sequenceType
  **/
  @ApiModelProperty(value = "")
  public SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public TreezorMandate creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

   /**
   * Get creditorName
   * @return creditorName
  **/
  @ApiModelProperty(value = "")
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public TreezorMandate sepaCreditorIdentifier(String sepaCreditorIdentifier) {
    this.sepaCreditorIdentifier = sepaCreditorIdentifier;
    return this;
  }

   /**
   * Get sepaCreditorIdentifier
   * @return sepaCreditorIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getSepaCreditorIdentifier() {
    return sepaCreditorIdentifier;
  }

  public void setSepaCreditorIdentifier(String sepaCreditorIdentifier) {
    this.sepaCreditorIdentifier = sepaCreditorIdentifier;
  }

  public TreezorMandate creditorAddress(String creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

   /**
   * Get creditorAddress
   * @return creditorAddress
  **/
  @ApiModelProperty(value = "")
  public String getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(String creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public TreezorMandate creditorCity(String creditorCity) {
    this.creditorCity = creditorCity;
    return this;
  }

   /**
   * Get creditorCity
   * @return creditorCity
  **/
  @ApiModelProperty(value = "")
  public String getCreditorCity() {
    return creditorCity;
  }

  public void setCreditorCity(String creditorCity) {
    this.creditorCity = creditorCity;
  }

  public TreezorMandate creditorZipCode(String creditorZipCode) {
    this.creditorZipCode = creditorZipCode;
    return this;
  }

   /**
   * Get creditorZipCode
   * @return creditorZipCode
  **/
  @ApiModelProperty(value = "")
  public String getCreditorZipCode() {
    return creditorZipCode;
  }

  public void setCreditorZipCode(String creditorZipCode) {
    this.creditorZipCode = creditorZipCode;
  }

  public TreezorMandate creditorCountry(String creditorCountry) {
    this.creditorCountry = creditorCountry;
    return this;
  }

   /**
   * Get creditorCountry
   * @return creditorCountry
  **/
  @ApiModelProperty(value = "")
  public String getCreditorCountry() {
    return creditorCountry;
  }

  public void setCreditorCountry(String creditorCountry) {
    this.creditorCountry = creditorCountry;
  }

  public TreezorMandate signatureDate(String signatureDate) {
    this.signatureDate = signatureDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD
   * @return signatureDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD")
  public String getSignatureDate() {
    return signatureDate;
  }

  public void setSignatureDate(String signatureDate) {
    this.signatureDate = signatureDate;
  }

  public TreezorMandate debtorSignatureIp(String debtorSignatureIp) {
    this.debtorSignatureIp = debtorSignatureIp;
    return this;
  }

   /**
   * Get debtorSignatureIp
   * @return debtorSignatureIp
  **/
  @ApiModelProperty(value = "")
  public String getDebtorSignatureIp() {
    return debtorSignatureIp;
  }

  public void setDebtorSignatureIp(String debtorSignatureIp) {
    this.debtorSignatureIp = debtorSignatureIp;
  }

  public TreezorMandate signed(Integer signed) {
    this.signed = signed;
    return this;
  }

   /**
   * Get signed
   * @return signed
  **/
  @ApiModelProperty(value = "")
  public Integer getSigned() {
    return signed;
  }

  public void setSigned(Integer signed) {
    this.signed = signed;
  }

  public TreezorMandate debtorIdentificationCode(String debtorIdentificationCode) {
    this.debtorIdentificationCode = debtorIdentificationCode;
    return this;
  }

   /**
   * Get debtorIdentificationCode
   * @return debtorIdentificationCode
  **/
  @ApiModelProperty(value = "")
  public String getDebtorIdentificationCode() {
    return debtorIdentificationCode;
  }

  public void setDebtorIdentificationCode(String debtorIdentificationCode) {
    this.debtorIdentificationCode = debtorIdentificationCode;
  }

  public TreezorMandate debtorReferencePartyName(String debtorReferencePartyName) {
    this.debtorReferencePartyName = debtorReferencePartyName;
    return this;
  }

   /**
   * Get debtorReferencePartyName
   * @return debtorReferencePartyName
  **/
  @ApiModelProperty(value = "")
  public String getDebtorReferencePartyName() {
    return debtorReferencePartyName;
  }

  public void setDebtorReferencePartyName(String debtorReferencePartyName) {
    this.debtorReferencePartyName = debtorReferencePartyName;
  }

  public TreezorMandate debtorReferenceIdentificationCode(String debtorReferenceIdentificationCode) {
    this.debtorReferenceIdentificationCode = debtorReferenceIdentificationCode;
    return this;
  }

   /**
   * Get debtorReferenceIdentificationCode
   * @return debtorReferenceIdentificationCode
  **/
  @ApiModelProperty(value = "")
  public String getDebtorReferenceIdentificationCode() {
    return debtorReferenceIdentificationCode;
  }

  public void setDebtorReferenceIdentificationCode(String debtorReferenceIdentificationCode) {
    this.debtorReferenceIdentificationCode = debtorReferenceIdentificationCode;
  }

  public TreezorMandate creditorReferencePartyName(String creditorReferencePartyName) {
    this.creditorReferencePartyName = creditorReferencePartyName;
    return this;
  }

   /**
   * Get creditorReferencePartyName
   * @return creditorReferencePartyName
  **/
  @ApiModelProperty(value = "")
  public String getCreditorReferencePartyName() {
    return creditorReferencePartyName;
  }

  public void setCreditorReferencePartyName(String creditorReferencePartyName) {
    this.creditorReferencePartyName = creditorReferencePartyName;
  }

  public TreezorMandate creditorReferenceIdentificationCode(String creditorReferenceIdentificationCode) {
    this.creditorReferenceIdentificationCode = creditorReferenceIdentificationCode;
    return this;
  }

   /**
   * Get creditorReferenceIdentificationCode
   * @return creditorReferenceIdentificationCode
  **/
  @ApiModelProperty(value = "")
  public String getCreditorReferenceIdentificationCode() {
    return creditorReferenceIdentificationCode;
  }

  public void setCreditorReferenceIdentificationCode(String creditorReferenceIdentificationCode) {
    this.creditorReferenceIdentificationCode = creditorReferenceIdentificationCode;
  }

  public TreezorMandate contractIdentificationNumber(String contractIdentificationNumber) {
    this.contractIdentificationNumber = contractIdentificationNumber;
    return this;
  }

   /**
   * Get contractIdentificationNumber
   * @return contractIdentificationNumber
  **/
  @ApiModelProperty(value = "")
  public String getContractIdentificationNumber() {
    return contractIdentificationNumber;
  }

  public void setContractIdentificationNumber(String contractIdentificationNumber) {
    this.contractIdentificationNumber = contractIdentificationNumber;
  }

  public TreezorMandate contractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
    return this;
  }

   /**
   * Get contractDescription
   * @return contractDescription
  **/
  @ApiModelProperty(value = "")
  public String getContractDescription() {
    return contractDescription;
  }

  public void setContractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
  }

  public TreezorMandate isPaper(Boolean isPaper) {
    this.isPaper = isPaper;
    return this;
  }

   /**
   * Get isPaper
   * @return isPaper
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPaper() {
    return isPaper;
  }

  public void setIsPaper(Boolean isPaper) {
    this.isPaper = isPaper;
  }

  public TreezorMandate sddType(SddTypeEnum sddType) {
    this.sddType = sddType;
    return this;
  }

   /**
   * Get sddType
   * @return sddType
  **/
  @ApiModelProperty(value = "")
  public SddTypeEnum getSddType() {
    return sddType;
  }

  public void setSddType(SddTypeEnum sddType) {
    this.sddType = sddType;
  }

  public TreezorMandate revocationSignatureDate(String revocationSignatureDate) {
    this.revocationSignatureDate = revocationSignatureDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD HH:MM:SS
   * @return revocationSignatureDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD HH:MM:SS")
  public String getRevocationSignatureDate() {
    return revocationSignatureDate;
  }

  public void setRevocationSignatureDate(String revocationSignatureDate) {
    this.revocationSignatureDate = revocationSignatureDate;
  }

  public TreezorMandate createdIp(String createdIp) {
    this.createdIp = createdIp;
    return this;
  }

   /**
   * Get createdIp
   * @return createdIp
  **/
  @ApiModelProperty(value = "")
  public String getCreatedIp() {
    return createdIp;
  }

  public void setCreatedIp(String createdIp) {
    this.createdIp = createdIp;
  }

  public TreezorMandate createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD HH:MM:SS
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD HH:MM:SS")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public TreezorMandate modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD HH:MM:SS
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD HH:MM:SS")
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorMandate mandate = (TreezorMandate) o;
    return Objects.equals(this.mandateId, mandate.mandateId) &&
        Objects.equals(this.title, mandate.title) &&
        Objects.equals(this.legalInformations, mandate.legalInformations) &&
        Objects.equals(this.uniqueMandateReference, mandate.uniqueMandateReference) &&
        Objects.equals(this.mandateStatus, mandate.mandateStatus) &&
        Objects.equals(this.userId, mandate.userId) &&
        Objects.equals(this.debtorName, mandate.debtorName) &&
        Objects.equals(this.debtorAddress, mandate.debtorAddress) &&
        Objects.equals(this.debtorCity, mandate.debtorCity) &&
        Objects.equals(this.debtorZipCode, mandate.debtorZipCode) &&
        Objects.equals(this.debtorCountry, mandate.debtorCountry) &&
        Objects.equals(this.debtorIban, mandate.debtorIban) &&
        Objects.equals(this.debtorBic, mandate.debtorBic) &&
        Objects.equals(this.sequenceType, mandate.sequenceType) &&
        Objects.equals(this.creditorName, mandate.creditorName) &&
        Objects.equals(this.sepaCreditorIdentifier, mandate.sepaCreditorIdentifier) &&
        Objects.equals(this.creditorAddress, mandate.creditorAddress) &&
        Objects.equals(this.creditorCity, mandate.creditorCity) &&
        Objects.equals(this.creditorZipCode, mandate.creditorZipCode) &&
        Objects.equals(this.creditorCountry, mandate.creditorCountry) &&
        Objects.equals(this.signatureDate, mandate.signatureDate) &&
        Objects.equals(this.debtorSignatureIp, mandate.debtorSignatureIp) &&
        Objects.equals(this.signed, mandate.signed) &&
        Objects.equals(this.debtorIdentificationCode, mandate.debtorIdentificationCode) &&
        Objects.equals(this.debtorReferencePartyName, mandate.debtorReferencePartyName) &&
        Objects.equals(this.debtorReferenceIdentificationCode, mandate.debtorReferenceIdentificationCode) &&
        Objects.equals(this.creditorReferencePartyName, mandate.creditorReferencePartyName) &&
        Objects.equals(this.creditorReferenceIdentificationCode, mandate.creditorReferenceIdentificationCode) &&
        Objects.equals(this.contractIdentificationNumber, mandate.contractIdentificationNumber) &&
        Objects.equals(this.contractDescription, mandate.contractDescription) &&
        Objects.equals(this.isPaper, mandate.isPaper) &&
        Objects.equals(this.sddType, mandate.sddType) &&
        Objects.equals(this.revocationSignatureDate, mandate.revocationSignatureDate) &&
        Objects.equals(this.createdIp, mandate.createdIp) &&
        Objects.equals(this.createdDate, mandate.createdDate) &&
        Objects.equals(this.modifiedDate, mandate.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateId, title, legalInformations, uniqueMandateReference, mandateStatus, userId, debtorName, debtorAddress, debtorCity, debtorZipCode, debtorCountry, debtorIban, debtorBic, sequenceType, creditorName, sepaCreditorIdentifier, creditorAddress, creditorCity, creditorZipCode, creditorCountry, signatureDate, debtorSignatureIp, signed, debtorIdentificationCode, debtorReferencePartyName, debtorReferenceIdentificationCode, creditorReferencePartyName, creditorReferenceIdentificationCode, contractIdentificationNumber, contractDescription, isPaper, sddType, revocationSignatureDate, createdIp, createdDate, modifiedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorMandate {\n");
    
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    legalInformations: ").append(toIndentedString(legalInformations)).append("\n");
    sb.append("    uniqueMandateReference: ").append(toIndentedString(uniqueMandateReference)).append("\n");
    sb.append("    mandateStatus: ").append(toIndentedString(mandateStatus)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAddress: ").append(toIndentedString(debtorAddress)).append("\n");
    sb.append("    debtorCity: ").append(toIndentedString(debtorCity)).append("\n");
    sb.append("    debtorZipCode: ").append(toIndentedString(debtorZipCode)).append("\n");
    sb.append("    debtorCountry: ").append(toIndentedString(debtorCountry)).append("\n");
    sb.append("    debtorIban: ").append(toIndentedString(debtorIban)).append("\n");
    sb.append("    debtorBic: ").append(toIndentedString(debtorBic)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    sepaCreditorIdentifier: ").append(toIndentedString(sepaCreditorIdentifier)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorCity: ").append(toIndentedString(creditorCity)).append("\n");
    sb.append("    creditorZipCode: ").append(toIndentedString(creditorZipCode)).append("\n");
    sb.append("    creditorCountry: ").append(toIndentedString(creditorCountry)).append("\n");
    sb.append("    signatureDate: ").append(toIndentedString(signatureDate)).append("\n");
    sb.append("    debtorSignatureIp: ").append(toIndentedString(debtorSignatureIp)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    debtorIdentificationCode: ").append(toIndentedString(debtorIdentificationCode)).append("\n");
    sb.append("    debtorReferencePartyName: ").append(toIndentedString(debtorReferencePartyName)).append("\n");
    sb.append("    debtorReferenceIdentificationCode: ").append(toIndentedString(debtorReferenceIdentificationCode)).append("\n");
    sb.append("    creditorReferencePartyName: ").append(toIndentedString(creditorReferencePartyName)).append("\n");
    sb.append("    creditorReferenceIdentificationCode: ").append(toIndentedString(creditorReferenceIdentificationCode)).append("\n");
    sb.append("    contractIdentificationNumber: ").append(toIndentedString(contractIdentificationNumber)).append("\n");
    sb.append("    contractDescription: ").append(toIndentedString(contractDescription)).append("\n");
    sb.append("    isPaper: ").append(toIndentedString(isPaper)).append("\n");
    sb.append("    sddType: ").append(toIndentedString(sddType)).append("\n");
    sb.append("    revocationSignatureDate: ").append(toIndentedString(revocationSignatureDate)).append("\n");
    sb.append("    createdIp: ").append(toIndentedString(createdIp)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

