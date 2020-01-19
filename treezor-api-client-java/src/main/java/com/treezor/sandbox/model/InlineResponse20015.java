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
import com.treezor.sandbox.model.MccRestrictionGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20015
 */

public class InlineResponse20015 {
  @SerializedName("bankaccounts")
  private List<MccRestrictionGroup> bankaccounts = null;

  public InlineResponse20015 bankaccounts(List<MccRestrictionGroup> bankaccounts) {
    this.bankaccounts = bankaccounts;
    return this;
  }

  public InlineResponse20015 addBankaccountsItem(MccRestrictionGroup bankaccountsItem) {
    if (this.bankaccounts == null) {
      this.bankaccounts = new ArrayList<MccRestrictionGroup>();
    }
    this.bankaccounts.add(bankaccountsItem);
    return this;
  }

   /**
   * Get bankaccounts
   * @return bankaccounts
  **/
  @ApiModelProperty(value = "")
  public List<MccRestrictionGroup> getBankaccounts() {
    return bankaccounts;
  }

  public void setBankaccounts(List<MccRestrictionGroup> bankaccounts) {
    this.bankaccounts = bankaccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.bankaccounts, inlineResponse20015.bankaccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankaccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    bankaccounts: ").append(toIndentedString(bankaccounts)).append("\n");
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

