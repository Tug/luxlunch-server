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
import io.swagger.client.model.TreezorCountryRestrictionGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * TreezorInlineResponse20011
 */

public class TreezorInlineResponse20011 {
  @JsonProperty("bankaccounts")
  private List<TreezorCountryRestrictionGroup> bankaccounts = null;

  public TreezorInlineResponse20011 bankaccounts(List<TreezorCountryRestrictionGroup> bankaccounts) {
    this.bankaccounts = bankaccounts;
    return this;
  }

  public TreezorInlineResponse20011 addBankaccountsItem(TreezorCountryRestrictionGroup bankaccountsItem) {
    if (this.bankaccounts == null) {
      this.bankaccounts = new ArrayList<>();
    }
    this.bankaccounts.add(bankaccountsItem);
    return this;
  }

   /**
   * Get bankaccounts
   * @return bankaccounts
  **/
  @ApiModelProperty(value = "")
  public List<TreezorCountryRestrictionGroup> getBankaccounts() {
    return bankaccounts;
  }

  public void setBankaccounts(List<TreezorCountryRestrictionGroup> bankaccounts) {
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
    TreezorInlineResponse20011 inlineResponse20011 = (TreezorInlineResponse20011) o;
    return Objects.equals(this.bankaccounts, inlineResponse20011.bankaccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankaccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorInlineResponse20011 {\n");
    
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

