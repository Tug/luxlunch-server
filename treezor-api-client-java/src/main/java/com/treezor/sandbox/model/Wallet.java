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


package com.treezor.sandbox.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Wallet
 */

public class Wallet {
  @SerializedName("walletId")
  private Integer walletId = null;

  @SerializedName("walletTypeId")
  private Integer walletTypeId = null;

  /**
   * Gets or Sets walletStatus
   */
  @JsonAdapter(WalletStatusEnum.Adapter.class)
  public enum WalletStatusEnum {
    PENDING("PENDING"),
    
    CANCELED("CANCELED"),
    
    VALIDATED("VALIDATED");

    private String value;

    WalletStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WalletStatusEnum fromValue(String text) {
      for (WalletStatusEnum b : WalletStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WalletStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WalletStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WalletStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WalletStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("walletStatus")
  private WalletStatusEnum walletStatus = null;

  @SerializedName("codeStatus")
  private Integer codeStatus = null;

  @SerializedName("informationStatus")
  private String informationStatus = null;

  @SerializedName("walletTag")
  private String walletTag = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("userLastname")
  private String userLastname = null;

  @SerializedName("userFirstname")
  private String userFirstname = null;

  @SerializedName("jointUserId")
  private Integer jointUserId = null;

  @SerializedName("tariffId")
  private Integer tariffId = null;

  @SerializedName("eventName")
  private String eventName = null;

  @SerializedName("eventAlias")
  private String eventAlias = null;

  @SerializedName("eventDate")
  private String eventDate = null;

  @SerializedName("eventMessage")
  private String eventMessage = null;

  @SerializedName("eventPayinStartDate")
  private String eventPayinStartDate = null;

  @SerializedName("eventPayinEndDate")
  private String eventPayinEndDate = null;

  @SerializedName("contractSigned")
  private Integer contractSigned = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("urlImage")
  private String urlImage = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("modifiedDate")
  private String modifiedDate = null;

  @SerializedName("payinCount")
  private Integer payinCount = null;

  @SerializedName("payoutCount")
  private Integer payoutCount = null;

  @SerializedName("transferCount")
  private Integer transferCount = null;

  @SerializedName("solde")
  private Integer solde = null;

  @SerializedName("authorizedBalance")
  private Integer authorizedBalance = null;

  @SerializedName("totalRows")
  private Integer totalRows = null;

  public Wallet walletId(Integer walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @ApiModelProperty(value = "")
  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(Integer walletId) {
    this.walletId = walletId;
  }

  public Wallet walletTypeId(Integer walletTypeId) {
    this.walletTypeId = walletTypeId;
    return this;
  }

   /**
   * | Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) | 
   * @return walletTypeId
  **/
  @ApiModelProperty(value = "| Id | Description | |----|----| | 9 | Electronic Money Wallet | | 10 | Payment Account Wallet | | 13 | Mirror Wallet | | 14 | Electronic Money Card (Internal only) | ")
  public Integer getWalletTypeId() {
    return walletTypeId;
  }

  public void setWalletTypeId(Integer walletTypeId) {
    this.walletTypeId = walletTypeId;
  }

  public Wallet walletStatus(WalletStatusEnum walletStatus) {
    this.walletStatus = walletStatus;
    return this;
  }

   /**
   * Get walletStatus
   * @return walletStatus
  **/
  @ApiModelProperty(value = "")
  public WalletStatusEnum getWalletStatus() {
    return walletStatus;
  }

  public void setWalletStatus(WalletStatusEnum walletStatus) {
    this.walletStatus = walletStatus;
  }

  public Wallet codeStatus(Integer codeStatus) {
    this.codeStatus = codeStatus;
    return this;
  }

   /**
   * Get codeStatus
   * @return codeStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getCodeStatus() {
    return codeStatus;
  }

  public void setCodeStatus(Integer codeStatus) {
    this.codeStatus = codeStatus;
  }

  public Wallet informationStatus(String informationStatus) {
    this.informationStatus = informationStatus;
    return this;
  }

   /**
   * Get informationStatus
   * @return informationStatus
  **/
  @ApiModelProperty(value = "")
  public String getInformationStatus() {
    return informationStatus;
  }

  public void setInformationStatus(String informationStatus) {
    this.informationStatus = informationStatus;
  }

  public Wallet walletTag(String walletTag) {
    this.walletTag = walletTag;
    return this;
  }

   /**
   * Get walletTag
   * @return walletTag
  **/
  @ApiModelProperty(value = "")
  public String getWalletTag() {
    return walletTag;
  }

  public void setWalletTag(String walletTag) {
    this.walletTag = walletTag;
  }

  public Wallet userId(Integer userId) {
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

  public Wallet userLastname(String userLastname) {
    this.userLastname = userLastname;
    return this;
  }

   /**
   * Get userLastname
   * @return userLastname
  **/
  @ApiModelProperty(value = "")
  public String getUserLastname() {
    return userLastname;
  }

  public void setUserLastname(String userLastname) {
    this.userLastname = userLastname;
  }

  public Wallet userFirstname(String userFirstname) {
    this.userFirstname = userFirstname;
    return this;
  }

   /**
   * Get userFirstname
   * @return userFirstname
  **/
  @ApiModelProperty(value = "")
  public String getUserFirstname() {
    return userFirstname;
  }

  public void setUserFirstname(String userFirstname) {
    this.userFirstname = userFirstname;
  }

  public Wallet jointUserId(Integer jointUserId) {
    this.jointUserId = jointUserId;
    return this;
  }

   /**
   * Get jointUserId
   * @return jointUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getJointUserId() {
    return jointUserId;
  }

  public void setJointUserId(Integer jointUserId) {
    this.jointUserId = jointUserId;
  }

  public Wallet tariffId(Integer tariffId) {
    this.tariffId = tariffId;
    return this;
  }

   /**
   * Get tariffId
   * @return tariffId
  **/
  @ApiModelProperty(value = "")
  public Integer getTariffId() {
    return tariffId;
  }

  public void setTariffId(Integer tariffId) {
    this.tariffId = tariffId;
  }

  public Wallet eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Wallet eventAlias(String eventAlias) {
    this.eventAlias = eventAlias;
    return this;
  }

   /**
   * Get eventAlias
   * @return eventAlias
  **/
  @ApiModelProperty(value = "")
  public String getEventAlias() {
    return eventAlias;
  }

  public void setEventAlias(String eventAlias) {
    this.eventAlias = eventAlias;
  }

  public Wallet eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD
   * @return eventDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD")
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public Wallet eventMessage(String eventMessage) {
    this.eventMessage = eventMessage;
    return this;
  }

   /**
   * Get eventMessage
   * @return eventMessage
  **/
  @ApiModelProperty(value = "")
  public String getEventMessage() {
    return eventMessage;
  }

  public void setEventMessage(String eventMessage) {
    this.eventMessage = eventMessage;
  }

  public Wallet eventPayinStartDate(String eventPayinStartDate) {
    this.eventPayinStartDate = eventPayinStartDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD
   * @return eventPayinStartDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD")
  public String getEventPayinStartDate() {
    return eventPayinStartDate;
  }

  public void setEventPayinStartDate(String eventPayinStartDate) {
    this.eventPayinStartDate = eventPayinStartDate;
  }

  public Wallet eventPayinEndDate(String eventPayinEndDate) {
    this.eventPayinEndDate = eventPayinEndDate;
    return this;
  }

   /**
   * Date YYYY-MM-DD
   * @return eventPayinEndDate
  **/
  @ApiModelProperty(value = "Date YYYY-MM-DD")
  public String getEventPayinEndDate() {
    return eventPayinEndDate;
  }

  public void setEventPayinEndDate(String eventPayinEndDate) {
    this.eventPayinEndDate = eventPayinEndDate;
  }

  public Wallet contractSigned(Integer contractSigned) {
    this.contractSigned = contractSigned;
    return this;
  }

   /**
   * Get contractSigned
   * @return contractSigned
  **/
  @ApiModelProperty(value = "")
  public Integer getContractSigned() {
    return contractSigned;
  }

  public void setContractSigned(Integer contractSigned) {
    this.contractSigned = contractSigned;
  }

  public Wallet bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Wallet iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(value = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Wallet urlImage(String urlImage) {
    this.urlImage = urlImage;
    return this;
  }

   /**
   * Get urlImage
   * @return urlImage
  **/
  @ApiModelProperty(value = "")
  public String getUrlImage() {
    return urlImage;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }

  public Wallet currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Wallet createdDate(String createdDate) {
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

  public Wallet modifiedDate(String modifiedDate) {
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

  public Wallet payinCount(Integer payinCount) {
    this.payinCount = payinCount;
    return this;
  }

   /**
   * Get payinCount
   * @return payinCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPayinCount() {
    return payinCount;
  }

  public void setPayinCount(Integer payinCount) {
    this.payinCount = payinCount;
  }

  public Wallet payoutCount(Integer payoutCount) {
    this.payoutCount = payoutCount;
    return this;
  }

   /**
   * Get payoutCount
   * @return payoutCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPayoutCount() {
    return payoutCount;
  }

  public void setPayoutCount(Integer payoutCount) {
    this.payoutCount = payoutCount;
  }

  public Wallet transferCount(Integer transferCount) {
    this.transferCount = transferCount;
    return this;
  }

   /**
   * Get transferCount
   * @return transferCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTransferCount() {
    return transferCount;
  }

  public void setTransferCount(Integer transferCount) {
    this.transferCount = transferCount;
  }

  public Wallet solde(Integer solde) {
    this.solde = solde;
    return this;
  }

   /**
   * Get solde
   * @return solde
  **/
  @ApiModelProperty(value = "")
  public Integer getSolde() {
    return solde;
  }

  public void setSolde(Integer solde) {
    this.solde = solde;
  }

  public Wallet authorizedBalance(Integer authorizedBalance) {
    this.authorizedBalance = authorizedBalance;
    return this;
  }

   /**
   * Get authorizedBalance
   * @return authorizedBalance
  **/
  @ApiModelProperty(value = "")
  public Integer getAuthorizedBalance() {
    return authorizedBalance;
  }

  public void setAuthorizedBalance(Integer authorizedBalance) {
    this.authorizedBalance = authorizedBalance;
  }

  public Wallet totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

   /**
   * Get totalRows
   * @return totalRows
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.walletId, wallet.walletId) &&
        Objects.equals(this.walletTypeId, wallet.walletTypeId) &&
        Objects.equals(this.walletStatus, wallet.walletStatus) &&
        Objects.equals(this.codeStatus, wallet.codeStatus) &&
        Objects.equals(this.informationStatus, wallet.informationStatus) &&
        Objects.equals(this.walletTag, wallet.walletTag) &&
        Objects.equals(this.userId, wallet.userId) &&
        Objects.equals(this.userLastname, wallet.userLastname) &&
        Objects.equals(this.userFirstname, wallet.userFirstname) &&
        Objects.equals(this.jointUserId, wallet.jointUserId) &&
        Objects.equals(this.tariffId, wallet.tariffId) &&
        Objects.equals(this.eventName, wallet.eventName) &&
        Objects.equals(this.eventAlias, wallet.eventAlias) &&
        Objects.equals(this.eventDate, wallet.eventDate) &&
        Objects.equals(this.eventMessage, wallet.eventMessage) &&
        Objects.equals(this.eventPayinStartDate, wallet.eventPayinStartDate) &&
        Objects.equals(this.eventPayinEndDate, wallet.eventPayinEndDate) &&
        Objects.equals(this.contractSigned, wallet.contractSigned) &&
        Objects.equals(this.bic, wallet.bic) &&
        Objects.equals(this.iban, wallet.iban) &&
        Objects.equals(this.urlImage, wallet.urlImage) &&
        Objects.equals(this.currency, wallet.currency) &&
        Objects.equals(this.createdDate, wallet.createdDate) &&
        Objects.equals(this.modifiedDate, wallet.modifiedDate) &&
        Objects.equals(this.payinCount, wallet.payinCount) &&
        Objects.equals(this.payoutCount, wallet.payoutCount) &&
        Objects.equals(this.transferCount, wallet.transferCount) &&
        Objects.equals(this.solde, wallet.solde) &&
        Objects.equals(this.authorizedBalance, wallet.authorizedBalance) &&
        Objects.equals(this.totalRows, wallet.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, walletTypeId, walletStatus, codeStatus, informationStatus, walletTag, userId, userLastname, userFirstname, jointUserId, tariffId, eventName, eventAlias, eventDate, eventMessage, eventPayinStartDate, eventPayinEndDate, contractSigned, bic, iban, urlImage, currency, createdDate, modifiedDate, payinCount, payoutCount, transferCount, solde, authorizedBalance, totalRows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletTypeId: ").append(toIndentedString(walletTypeId)).append("\n");
    sb.append("    walletStatus: ").append(toIndentedString(walletStatus)).append("\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    informationStatus: ").append(toIndentedString(informationStatus)).append("\n");
    sb.append("    walletTag: ").append(toIndentedString(walletTag)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userLastname: ").append(toIndentedString(userLastname)).append("\n");
    sb.append("    userFirstname: ").append(toIndentedString(userFirstname)).append("\n");
    sb.append("    jointUserId: ").append(toIndentedString(jointUserId)).append("\n");
    sb.append("    tariffId: ").append(toIndentedString(tariffId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventAlias: ").append(toIndentedString(eventAlias)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
    sb.append("    eventPayinStartDate: ").append(toIndentedString(eventPayinStartDate)).append("\n");
    sb.append("    eventPayinEndDate: ").append(toIndentedString(eventPayinEndDate)).append("\n");
    sb.append("    contractSigned: ").append(toIndentedString(contractSigned)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    urlImage: ").append(toIndentedString(urlImage)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    payinCount: ").append(toIndentedString(payinCount)).append("\n");
    sb.append("    payoutCount: ").append(toIndentedString(payoutCount)).append("\n");
    sb.append("    transferCount: ").append(toIndentedString(transferCount)).append("\n");
    sb.append("    solde: ").append(toIndentedString(solde)).append("\n");
    sb.append("    authorizedBalance: ").append(toIndentedString(authorizedBalance)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
