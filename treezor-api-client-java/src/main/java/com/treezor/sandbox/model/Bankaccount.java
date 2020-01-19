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
 * Bankaccount
 */

public class Bankaccount {
  @SerializedName("bankaccountId")
  private Integer bankaccountId = null;

  /**
   * Gets or Sets bankaccountStatus
   */
  @JsonAdapter(BankaccountStatusEnum.Adapter.class)
  public enum BankaccountStatusEnum {
    PENDING("PENDING"),
    
    CANCELED("CANCELED"),
    
    VALIDATED("VALIDATED");

    private String value;

    BankaccountStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BankaccountStatusEnum fromValue(String text) {
      for (BankaccountStatusEnum b : BankaccountStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BankaccountStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BankaccountStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BankaccountStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BankaccountStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("bankaccountStatus")
  private BankaccountStatusEnum bankaccountStatus = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bankaccountOwnerName")
  private String bankaccountOwnerName = null;

  @SerializedName("bankaccountOwnerAddress")
  private String bankaccountOwnerAddress = null;

  @SerializedName("bankaccountIBAN")
  private String bankaccountIBAN = null;

  @SerializedName("bankaccountBIC")
  private String bankaccountBIC = null;

  @SerializedName("bankaccountType")
  private String bankaccountType = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("modifiedDate")
  private String modifiedDate = null;

  @SerializedName("totalRows")
  private Integer totalRows = null;

  public Bankaccount bankaccountId(Integer bankaccountId) {
    this.bankaccountId = bankaccountId;
    return this;
  }

   /**
   * Get bankaccountId
   * @return bankaccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getBankaccountId() {
    return bankaccountId;
  }

  public void setBankaccountId(Integer bankaccountId) {
    this.bankaccountId = bankaccountId;
  }

  public Bankaccount bankaccountStatus(BankaccountStatusEnum bankaccountStatus) {
    this.bankaccountStatus = bankaccountStatus;
    return this;
  }

   /**
   * Get bankaccountStatus
   * @return bankaccountStatus
  **/
  @ApiModelProperty(value = "")
  public BankaccountStatusEnum getBankaccountStatus() {
    return bankaccountStatus;
  }

  public void setBankaccountStatus(BankaccountStatusEnum bankaccountStatus) {
    this.bankaccountStatus = bankaccountStatus;
  }

  public Bankaccount userId(Integer userId) {
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

  public Bankaccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bankaccount bankaccountOwnerName(String bankaccountOwnerName) {
    this.bankaccountOwnerName = bankaccountOwnerName;
    return this;
  }

   /**
   * Get bankaccountOwnerName
   * @return bankaccountOwnerName
  **/
  @ApiModelProperty(value = "")
  public String getBankaccountOwnerName() {
    return bankaccountOwnerName;
  }

  public void setBankaccountOwnerName(String bankaccountOwnerName) {
    this.bankaccountOwnerName = bankaccountOwnerName;
  }

  public Bankaccount bankaccountOwnerAddress(String bankaccountOwnerAddress) {
    this.bankaccountOwnerAddress = bankaccountOwnerAddress;
    return this;
  }

   /**
   * Get bankaccountOwnerAddress
   * @return bankaccountOwnerAddress
  **/
  @ApiModelProperty(value = "")
  public String getBankaccountOwnerAddress() {
    return bankaccountOwnerAddress;
  }

  public void setBankaccountOwnerAddress(String bankaccountOwnerAddress) {
    this.bankaccountOwnerAddress = bankaccountOwnerAddress;
  }

  public Bankaccount bankaccountIBAN(String bankaccountIBAN) {
    this.bankaccountIBAN = bankaccountIBAN;
    return this;
  }

   /**
   * Get bankaccountIBAN
   * @return bankaccountIBAN
  **/
  @ApiModelProperty(value = "")
  public String getBankaccountIBAN() {
    return bankaccountIBAN;
  }

  public void setBankaccountIBAN(String bankaccountIBAN) {
    this.bankaccountIBAN = bankaccountIBAN;
  }

  public Bankaccount bankaccountBIC(String bankaccountBIC) {
    this.bankaccountBIC = bankaccountBIC;
    return this;
  }

   /**
   * Get bankaccountBIC
   * @return bankaccountBIC
  **/
  @ApiModelProperty(value = "")
  public String getBankaccountBIC() {
    return bankaccountBIC;
  }

  public void setBankaccountBIC(String bankaccountBIC) {
    this.bankaccountBIC = bankaccountBIC;
  }

  public Bankaccount bankaccountType(String bankaccountType) {
    this.bankaccountType = bankaccountType;
    return this;
  }

   /**
   * Get bankaccountType
   * @return bankaccountType
  **/
  @ApiModelProperty(value = "")
  public String getBankaccountType() {
    return bankaccountType;
  }

  public void setBankaccountType(String bankaccountType) {
    this.bankaccountType = bankaccountType;
  }

  public Bankaccount createdDate(String createdDate) {
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

  public Bankaccount modifiedDate(String modifiedDate) {
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

  public Bankaccount totalRows(Integer totalRows) {
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
    Bankaccount bankaccount = (Bankaccount) o;
    return Objects.equals(this.bankaccountId, bankaccount.bankaccountId) &&
        Objects.equals(this.bankaccountStatus, bankaccount.bankaccountStatus) &&
        Objects.equals(this.userId, bankaccount.userId) &&
        Objects.equals(this.name, bankaccount.name) &&
        Objects.equals(this.bankaccountOwnerName, bankaccount.bankaccountOwnerName) &&
        Objects.equals(this.bankaccountOwnerAddress, bankaccount.bankaccountOwnerAddress) &&
        Objects.equals(this.bankaccountIBAN, bankaccount.bankaccountIBAN) &&
        Objects.equals(this.bankaccountBIC, bankaccount.bankaccountBIC) &&
        Objects.equals(this.bankaccountType, bankaccount.bankaccountType) &&
        Objects.equals(this.createdDate, bankaccount.createdDate) &&
        Objects.equals(this.modifiedDate, bankaccount.modifiedDate) &&
        Objects.equals(this.totalRows, bankaccount.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankaccountId, bankaccountStatus, userId, name, bankaccountOwnerName, bankaccountOwnerAddress, bankaccountIBAN, bankaccountBIC, bankaccountType, createdDate, modifiedDate, totalRows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankaccount {\n");
    
    sb.append("    bankaccountId: ").append(toIndentedString(bankaccountId)).append("\n");
    sb.append("    bankaccountStatus: ").append(toIndentedString(bankaccountStatus)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankaccountOwnerName: ").append(toIndentedString(bankaccountOwnerName)).append("\n");
    sb.append("    bankaccountOwnerAddress: ").append(toIndentedString(bankaccountOwnerAddress)).append("\n");
    sb.append("    bankaccountIBAN: ").append(toIndentedString(bankaccountIBAN)).append("\n");
    sb.append("    bankaccountBIC: ").append(toIndentedString(bankaccountBIC)).append("\n");
    sb.append("    bankaccountType: ").append(toIndentedString(bankaccountType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

