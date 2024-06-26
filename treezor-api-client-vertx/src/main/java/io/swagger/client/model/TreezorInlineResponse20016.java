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
import io.swagger.client.model.TreezorMerchantIdRestrictionGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * TreezorInlineResponse20016
 */

public class TreezorInlineResponse20016 {
  @JsonProperty("merchantIdRestrictionGroups")
  private List<TreezorMerchantIdRestrictionGroup> merchantIdRestrictionGroups = null;

  public TreezorInlineResponse20016 merchantIdRestrictionGroups(List<TreezorMerchantIdRestrictionGroup> merchantIdRestrictionGroups) {
    this.merchantIdRestrictionGroups = merchantIdRestrictionGroups;
    return this;
  }

  public TreezorInlineResponse20016 addMerchantIdRestrictionGroupsItem(TreezorMerchantIdRestrictionGroup merchantIdRestrictionGroupsItem) {
    if (this.merchantIdRestrictionGroups == null) {
      this.merchantIdRestrictionGroups = new ArrayList<>();
    }
    this.merchantIdRestrictionGroups.add(merchantIdRestrictionGroupsItem);
    return this;
  }

   /**
   * Get merchantIdRestrictionGroups
   * @return merchantIdRestrictionGroups
  **/
  @ApiModelProperty(value = "")
  public List<TreezorMerchantIdRestrictionGroup> getMerchantIdRestrictionGroups() {
    return merchantIdRestrictionGroups;
  }

  public void setMerchantIdRestrictionGroups(List<TreezorMerchantIdRestrictionGroup> merchantIdRestrictionGroups) {
    this.merchantIdRestrictionGroups = merchantIdRestrictionGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorInlineResponse20016 inlineResponse20016 = (TreezorInlineResponse20016) o;
    return Objects.equals(this.merchantIdRestrictionGroups, inlineResponse20016.merchantIdRestrictionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantIdRestrictionGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorInlineResponse20016 {\n");
    
    sb.append("    merchantIdRestrictionGroups: ").append(toIndentedString(merchantIdRestrictionGroups)).append("\n");
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

