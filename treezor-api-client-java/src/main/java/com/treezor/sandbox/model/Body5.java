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
 * Body5
 */

public class Body5 {
  @SerializedName("name")
  private String name = null;

  /**
   * Status of the country group
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

  @SerializedName("countries")
  private List<Integer> countries = null;

  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("fields")
  private List<String> fields = null;

  public Body5 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the country restriction group
   * @return name
  **/
  @ApiModelProperty(value = "Name of the country restriction group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body5 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the country group
   * @return status
  **/
  @ApiModelProperty(value = "Status of the country group")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Body5 isWhitelist(Boolean isWhitelist) {
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

  public Body5 countries(List<Integer> countries) {
    this.countries = countries;
    return this;
  }

  public Body5 addCountriesItem(Integer countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<Integer>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Array of countries
   * @return countries
  **/
  @ApiModelProperty(value = "Array of countries")
  public List<Integer> getCountries() {
    return countries;
  }

  public void setCountries(List<Integer> countries) {
    this.countries = countries;
  }

  public Body5 startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date at which the country restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS
   * @return startDate
  **/
  @ApiModelProperty(value = "The date at which the country restriction group will be take into account. Format YYYY-MM-DD HH:MM:SS")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Body5 fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public Body5 addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<String>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * List of the object&#39;s properties you want to pick up.
   * @return fields
  **/
  @ApiModelProperty(value = "List of the object's properties you want to pick up.")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body5 body5 = (Body5) o;
    return Objects.equals(this.name, body5.name) &&
        Objects.equals(this.status, body5.status) &&
        Objects.equals(this.isWhitelist, body5.isWhitelist) &&
        Objects.equals(this.countries, body5.countries) &&
        Objects.equals(this.startDate, body5.startDate) &&
        Objects.equals(this.fields, body5.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, isWhitelist, countries, startDate, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body5 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isWhitelist: ").append(toIndentedString(isWhitelist)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
