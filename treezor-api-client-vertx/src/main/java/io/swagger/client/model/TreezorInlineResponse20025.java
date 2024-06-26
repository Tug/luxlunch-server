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
import io.swagger.client.model.TreezorTransferrefund;
import java.util.ArrayList;
import java.util.List;

/**
 * TreezorInlineResponse20025
 */

public class TreezorInlineResponse20025 {
  @JsonProperty("transfers")
  private List<TreezorTransferrefund> transfers = null;

  public TreezorInlineResponse20025 transfers(List<TreezorTransferrefund> transfers) {
    this.transfers = transfers;
    return this;
  }

  public TreezorInlineResponse20025 addTransfersItem(TreezorTransferrefund transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @ApiModelProperty(value = "")
  public List<TreezorTransferrefund> getTransfers() {
    return transfers;
  }

  public void setTransfers(List<TreezorTransferrefund> transfers) {
    this.transfers = transfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreezorInlineResponse20025 inlineResponse20025 = (TreezorInlineResponse20025) o;
    return Objects.equals(this.transfers, inlineResponse20025.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreezorInlineResponse20025 {\n");
    
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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

