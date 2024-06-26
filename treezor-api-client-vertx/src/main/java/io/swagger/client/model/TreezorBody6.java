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
import io.swagger.client.model.TreezorIssuerInitiatedDigitizationDatasAdditionnalData;

/**
 * TreezorBody6
 */

public class TreezorBody6 {
  @JsonProperty("cardId")
  private Integer cardId = null;

  /**
   * The Token Requestor also named wallet provider.
   */
  public enum TokenRequestorEnum {
    APPLE("APPLE"),
    
    SAMSUNG("SAMSUNG"),
    
    GOOGLE("GOOGLE");

    private String value;

    TokenRequestorEnum(String value) {
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
    public static TokenRequestorEnum fromValue(String text) {
      for (TokenRequestorEnum b : TokenRequestorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("tokenRequestor")
  private TokenRequestorEnum tokenRequestor = null;

  @JsonProperty("additionnalData")
  private TreezorIssuerInitiatedDigitizationDatasAdditionnalData additionnalData = null;

  public TreezorBody6 cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * The id of the card on which to create an issuerInitiatedDigitizationData request
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "The id of the card on which to create an issuerInitiatedDigitizationData request")
  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public TreezorBody6 tokenRequestor(TokenRequestorEnum tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
    return this;
  }

   /**
   * The Token Requestor also named wallet provider.
   * @return tokenRequestor
  **/
  @ApiModelProperty(required = true, value = "The Token Requestor also named wallet provider.")
  public TokenRequestorEnum getTokenRequestor() {
    return tokenRequestor;
  }

  public void setTokenRequestor(TokenRequestorEnum tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
  }

  public TreezorBody6 additionnalData(TreezorIssuerInitiatedDigitizationDatasAdditionnalData additionnalData) {
    this.additionnalData = additionnalData;
    return this;
  }

   /**
   * Get additionnalData
   * @return additionnalData
  **/
  @ApiModelProperty(value = "")
  public TreezorIssuerInitiatedDigitizationDatasAdditionnalData getAdditionnalData() {
    return additionnalData;
  }

  public void setAdditionnalData(TreezorIssuerInitiatedDigitizationDatasAdditionnalData additionnalData) {
    this.additionnalData = additionnalData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorBody6 body6 = (TreezorBody6) o;
    return Objects.equals(this.cardId, body6.cardId) &&
        Objects.equals(this.tokenRequestor, body6.tokenRequestor) &&
        Objects.equals(this.additionnalData, body6.additionnalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, tokenRequestor, additionnalData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorBody6 {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    tokenRequestor: ").append(toIndentedString(tokenRequestor)).append("\n");
    sb.append("    additionnalData: ").append(toIndentedString(additionnalData)).append("\n");
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

