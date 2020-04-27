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
import java.util.ArrayList;
import java.util.List;

/**
 * TreezorBody9
 */

public class TreezorBody9 {
  @JsonProperty("name")
  private String name = null;

  /**
   * Status of the Merchant ID group
   */
  public enum StatusEnum {
    VALIDATED("VALIDATED"),
    
    PENDING("PENDING"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("isWhitelist")
  private Boolean isWhitelist = true;

  @JsonProperty("merchants")
  private List<String> merchants = new ArrayList<>();

  @JsonProperty("startDate")
  private String startDate = null;

  public TreezorBody9 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Merchant ID group
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Merchant ID group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TreezorBody9 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Merchant ID group
   * @return status
  **/
  @ApiModelProperty(value = "Status of the Merchant ID group")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TreezorBody9 isWhitelist(Boolean isWhitelist) {
    this.isWhitelist = isWhitelist;
    return this;
  }

   /**
   * determines whether it will be a black or a white list
   * @return isWhitelist
  **/
  @ApiModelProperty(value = "determines whether it will be a black or a white list")
  public Boolean isIsWhitelist() {
    return isWhitelist;
  }

  public void setIsWhitelist(Boolean isWhitelist) {
    this.isWhitelist = isWhitelist;
  }

  public TreezorBody9 merchants(List<String> merchants) {
    this.merchants = merchants;
    return this;
  }

  public TreezorBody9 addMerchantsItem(String merchantsItem) {
    this.merchants.add(merchantsItem);
    return this;
  }

   /**
   * Array of Merchant ID
   * @return merchants
  **/
  @ApiModelProperty(required = true, value = "Array of Merchant ID")
  public List<String> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<String> merchants) {
    this.merchants = merchants;
  }

  public TreezorBody9 startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date at which the Merchant ID restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS
   * @return startDate
  **/
  @ApiModelProperty(value = "The date at which the Merchant ID restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorBody9 body9 = (TreezorBody9) o;
    return Objects.equals(this.name, body9.name) &&
        Objects.equals(this.status, body9.status) &&
        Objects.equals(this.isWhitelist, body9.isWhitelist) &&
        Objects.equals(this.merchants, body9.merchants) &&
        Objects.equals(this.startDate, body9.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, isWhitelist, merchants, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorBody9 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isWhitelist: ").append(toIndentedString(isWhitelist)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
