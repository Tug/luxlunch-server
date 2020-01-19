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
 * Body11
 */

public class Body11 {
  @SerializedName("merchants")
  private List<String> merchants = null;

  /**
   * Action to do with merchants id list
   */
  @JsonAdapter(MerchantsOperationEnum.Adapter.class)
  public enum MerchantsOperationEnum {
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    MerchantsOperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MerchantsOperationEnum fromValue(String text) {
      for (MerchantsOperationEnum b : MerchantsOperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MerchantsOperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MerchantsOperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MerchantsOperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MerchantsOperationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("merchantsOperation")
  private MerchantsOperationEnum merchantsOperation = null;

  public Body11 merchants(List<String> merchants) {
    this.merchants = merchants;
    return this;
  }

  public Body11 addMerchantsItem(String merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<String>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

   /**
   * Array of merchant ID
   * @return merchants
  **/
  @ApiModelProperty(value = "Array of merchant ID")
  public List<String> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<String> merchants) {
    this.merchants = merchants;
  }

  public Body11 merchantsOperation(MerchantsOperationEnum merchantsOperation) {
    this.merchantsOperation = merchantsOperation;
    return this;
  }

   /**
   * Action to do with merchants id list
   * @return merchantsOperation
  **/
  @ApiModelProperty(value = "Action to do with merchants id list")
  public MerchantsOperationEnum getMerchantsOperation() {
    return merchantsOperation;
  }

  public void setMerchantsOperation(MerchantsOperationEnum merchantsOperation) {
    this.merchantsOperation = merchantsOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body11 body11 = (Body11) o;
    return Objects.equals(this.merchants, body11.merchants) &&
        Objects.equals(this.merchantsOperation, body11.merchantsOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants, merchantsOperation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body11 {\n");
    
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    merchantsOperation: ").append(toIndentedString(merchantsOperation)).append("\n");
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

