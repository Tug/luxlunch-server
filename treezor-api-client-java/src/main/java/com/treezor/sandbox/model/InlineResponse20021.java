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
import com.treezor.sandbox.model.TaxResidence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20021
 */

public class InlineResponse20021 {
  @SerializedName("taxResidences")
  private List<TaxResidence> taxResidences = null;

  public InlineResponse20021 taxResidences(List<TaxResidence> taxResidences) {
    this.taxResidences = taxResidences;
    return this;
  }

  public InlineResponse20021 addTaxResidencesItem(TaxResidence taxResidencesItem) {
    if (this.taxResidences == null) {
      this.taxResidences = new ArrayList<TaxResidence>();
    }
    this.taxResidences.add(taxResidencesItem);
    return this;
  }

   /**
   * Get taxResidences
   * @return taxResidences
  **/
  @ApiModelProperty(value = "")
  public List<TaxResidence> getTaxResidences() {
    return taxResidences;
  }

  public void setTaxResidences(List<TaxResidence> taxResidences) {
    this.taxResidences = taxResidences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021 inlineResponse20021 = (InlineResponse20021) o;
    return Objects.equals(this.taxResidences, inlineResponse20021.taxResidences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxResidences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021 {\n");
    
    sb.append("    taxResidences: ").append(toIndentedString(taxResidences)).append("\n");
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

