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
import com.treezor.sandbox.model.InlineResponse2004Businessinformations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004
 */

public class InlineResponse2004 {
  @SerializedName("businessinformations")
  private List<InlineResponse2004Businessinformations> businessinformations = null;

  public InlineResponse2004 businessinformations(List<InlineResponse2004Businessinformations> businessinformations) {
    this.businessinformations = businessinformations;
    return this;
  }

  public InlineResponse2004 addBusinessinformationsItem(InlineResponse2004Businessinformations businessinformationsItem) {
    if (this.businessinformations == null) {
      this.businessinformations = new ArrayList<InlineResponse2004Businessinformations>();
    }
    this.businessinformations.add(businessinformationsItem);
    return this;
  }

   /**
   * Get businessinformations
   * @return businessinformations
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2004Businessinformations> getBusinessinformations() {
    return businessinformations;
  }

  public void setBusinessinformations(List<InlineResponse2004Businessinformations> businessinformations) {
    this.businessinformations = businessinformations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.businessinformations, inlineResponse2004.businessinformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessinformations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    businessinformations: ").append(toIndentedString(businessinformations)).append("\n");
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
