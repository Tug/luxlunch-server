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
 * TreezorBody3
 */

public class TreezorBody3 {
  @JsonProperty("cardId")
  private Long cardId = null;

  @JsonProperty("amount")
  private Float amount = null;

  public TreezorBody3 cardId(Long cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * ID of the card
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "ID of the card")
  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
    this.cardId = cardId;
  }

  public TreezorBody3 amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amout you want to check
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amout you want to check")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorBody3 body3 = (TreezorBody3) o;
    return Objects.equals(this.cardId, body3.cardId) &&
        Objects.equals(this.amount, body3.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorBody3 {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

