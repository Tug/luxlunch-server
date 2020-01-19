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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Body7
 */

public class Body7 {
  @SerializedName("name")
  private String name = null;

  /**
   * Status of the MCC group
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALIDATED("VALIDATED"),
    
    PENDING("PENDING"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("isWhitelist")
  private Boolean isWhitelist = true;

  @SerializedName("mcc")
  private List<Integer> mcc = new ArrayList<Integer>();

  @SerializedName("startDate")
  private String startDate = null;

  public Body7 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the MCC restriction group
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the MCC restriction group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body7 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the MCC group
   * @return status
  **/
  @ApiModelProperty(value = "Status of the MCC group")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Body7 isWhitelist(Boolean isWhitelist) {
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

  public Body7 mcc(List<Integer> mcc) {
    this.mcc = mcc;
    return this;
  }

  public Body7 addMccItem(Integer mccItem) {
    this.mcc.add(mccItem);
    return this;
  }

   /**
   * Array of MCC
   * @return mcc
  **/
  @ApiModelProperty(required = true, value = "Array of MCC")
  public List<Integer> getMcc() {
    return mcc;
  }

  public void setMcc(List<Integer> mcc) {
    this.mcc = mcc;
  }

  public Body7 startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date at which the MCC restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS
   * @return startDate
  **/
  @ApiModelProperty(value = "The date at which the MCC restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS")
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
    Body7 body7 = (Body7) o;
    return Objects.equals(this.name, body7.name) &&
        Objects.equals(this.status, body7.status) &&
        Objects.equals(this.isWhitelist, body7.isWhitelist) &&
        Objects.equals(this.mcc, body7.mcc) &&
        Objects.equals(this.startDate, body7.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, isWhitelist, mcc, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body7 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isWhitelist: ").append(toIndentedString(isWhitelist)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
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

