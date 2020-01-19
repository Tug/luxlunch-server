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
import com.treezor.sandbox.model.Wallet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20028
 */

public class InlineResponse20028 {
  @SerializedName("wallets")
  private List<Wallet> wallets = null;

  public InlineResponse20028 wallets(List<Wallet> wallets) {
    this.wallets = wallets;
    return this;
  }

  public InlineResponse20028 addWalletsItem(Wallet walletsItem) {
    if (this.wallets == null) {
      this.wallets = new ArrayList<Wallet>();
    }
    this.wallets.add(walletsItem);
    return this;
  }

   /**
   * Get wallets
   * @return wallets
  **/
  @ApiModelProperty(value = "")
  public List<Wallet> getWallets() {
    return wallets;
  }

  public void setWallets(List<Wallet> wallets) {
    this.wallets = wallets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20028 inlineResponse20028 = (InlineResponse20028) o;
    return Objects.equals(this.wallets, inlineResponse20028.wallets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20028 {\n");
    
    sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
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
