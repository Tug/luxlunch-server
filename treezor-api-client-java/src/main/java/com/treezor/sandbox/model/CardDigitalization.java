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
 * CardDigitalization
 */

public class CardDigitalization {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("cardId")
  private String cardId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("createdDate")
  private String createdDate = null;

  @SerializedName("modifiedDate")
  private String modifiedDate = null;

  public CardDigitalization id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardDigitalization cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @ApiModelProperty(value = "")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public CardDigitalization status(String status) {
    this.status = status;
    return this;
  }

   /**
   * | Status | Description | | ---- | ----------- | | A | Active | | U | Not tokenized | | S | Suspended | | D | Deactivated (Final status, cannot be changed)| 
   * @return status
  **/
  @ApiModelProperty(value = "| Status | Description | | ---- | ----------- | | A | Active | | U | Not tokenized | | S | Suspended | | D | Deactivated (Final status, cannot be changed)| ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CardDigitalization createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public CardDigitalization modifiedDate(String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "")
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
    CardDigitalization cardDigitalization = (CardDigitalization) o;
    return Objects.equals(this.id, cardDigitalization.id) &&
        Objects.equals(this.cardId, cardDigitalization.cardId) &&
        Objects.equals(this.status, cardDigitalization.status) &&
        Objects.equals(this.createdDate, cardDigitalization.createdDate) &&
        Objects.equals(this.modifiedDate, cardDigitalization.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, status, createdDate, modifiedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDigitalization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
