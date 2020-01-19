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
import com.treezor.sandbox.model.BeneficiariesSddB2bWhitelist;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Body1
 */

public class Body1 {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("nickName")
  private String nickName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("sepaCreditorIdentifier")
  private String sepaCreditorIdentifier = null;

  @SerializedName("sddB2bWhitelist")
  private List<BeneficiariesSddB2bWhitelist> sddB2bWhitelist = null;

  @SerializedName("sddCoreBlacklist")
  private List<String> sddCoreBlacklist = null;

  @SerializedName("usableForSct")
  private Boolean usableForSct = false;

  @SerializedName("fields")
  private List<String> fields = null;

  public Body1 tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Custom data that could be used by caller to search the instance.
   * @return tag
  **/
  @ApiModelProperty(value = "Custom data that could be used by caller to search the instance.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Body1 nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * Name choosen by end user to easily recognize the beneficiary.
   * @return nickName
  **/
  @ApiModelProperty(value = "Name choosen by end user to easily recognize the beneficiary.")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Body1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Beneficiary name, linked to bank account.
   * @return name
  **/
  @ApiModelProperty(value = "Beneficiary name, linked to bank account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body1 address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Beneficiary address, linked to bank account.
   * @return address
  **/
  @ApiModelProperty(value = "Beneficiary address, linked to bank account.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Body1 iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Beneficiary International Bank Account Number. Mandatory if usableForSct is true.
   * @return iban
  **/
  @ApiModelProperty(value = "Beneficiary International Bank Account Number. Mandatory if usableForSct is true.")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Body1 bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Beneficiary Bank Identifier Code. Mandatory if usableForSct is true.
   * @return bic
  **/
  @ApiModelProperty(value = "Beneficiary Bank Identifier Code. Mandatory if usableForSct is true.")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Body1 sepaCreditorIdentifier(String sepaCreditorIdentifier) {
    this.sepaCreditorIdentifier = sepaCreditorIdentifier;
    return this;
  }

   /**
   * Beneficiary SEPA Creditor Identifier. Mandatory to validate incoming direct debit, useless other wise. Between 8 and 35 caracters. If sddB2bWhitelist or sddCoreBlacklist is provided then sepaCreditorIdentifier is mandatory.
   * @return sepaCreditorIdentifier
  **/
  @ApiModelProperty(value = "Beneficiary SEPA Creditor Identifier. Mandatory to validate incoming direct debit, useless other wise. Between 8 and 35 caracters. If sddB2bWhitelist or sddCoreBlacklist is provided then sepaCreditorIdentifier is mandatory.")
  public String getSepaCreditorIdentifier() {
    return sepaCreditorIdentifier;
  }

  public void setSepaCreditorIdentifier(String sepaCreditorIdentifier) {
    this.sepaCreditorIdentifier = sepaCreditorIdentifier;
  }

  public Body1 sddB2bWhitelist(List<BeneficiariesSddB2bWhitelist> sddB2bWhitelist) {
    this.sddB2bWhitelist = sddB2bWhitelist;
    return this;
  }

  public Body1 addSddB2bWhitelistItem(BeneficiariesSddB2bWhitelist sddB2bWhitelistItem) {
    if (this.sddB2bWhitelist == null) {
      this.sddB2bWhitelist = new ArrayList<BeneficiariesSddB2bWhitelist>();
    }
    this.sddB2bWhitelist.add(sddB2bWhitelistItem);
    return this;
  }

   /**
   * Each unique mandate reference, with its frequency type, must be explicitely allowed when doing B2B Direct Debit. Furthermore, a mandate not used during more than 36 months will be automatically rejected even if in the white list.
   * @return sddB2bWhitelist
  **/
  @ApiModelProperty(value = "Each unique mandate reference, with its frequency type, must be explicitely allowed when doing B2B Direct Debit. Furthermore, a mandate not used during more than 36 months will be automatically rejected even if in the white list.")
  public List<BeneficiariesSddB2bWhitelist> getSddB2bWhitelist() {
    return sddB2bWhitelist;
  }

  public void setSddB2bWhitelist(List<BeneficiariesSddB2bWhitelist> sddB2bWhitelist) {
    this.sddB2bWhitelist = sddB2bWhitelist;
  }

  public Body1 sddCoreBlacklist(List<String> sddCoreBlacklist) {
    this.sddCoreBlacklist = sddCoreBlacklist;
    return this;
  }

  public Body1 addSddCoreBlacklistItem(String sddCoreBlacklistItem) {
    if (this.sddCoreBlacklist == null) {
      this.sddCoreBlacklist = new ArrayList<String>();
    }
    this.sddCoreBlacklist.add(sddCoreBlacklistItem);
    return this;
  }

   /**
   * Core Direct Debit are accepted by default. If a Core mandate is to be refused on reception, it has to be added to this list. If wild char * (star) is used instead of a UMR, all Direct Debit from this beneficiary will be refused.
   * @return sddCoreBlacklist
  **/
  @ApiModelProperty(value = "Core Direct Debit are accepted by default. If a Core mandate is to be refused on reception, it has to be added to this list. If wild char * (star) is used instead of a UMR, all Direct Debit from this beneficiary will be refused.")
  public List<String> getSddCoreBlacklist() {
    return sddCoreBlacklist;
  }

  public void setSddCoreBlacklist(List<String> sddCoreBlacklist) {
    this.sddCoreBlacklist = sddCoreBlacklist;
  }

  public Body1 usableForSct(Boolean usableForSct) {
    this.usableForSct = usableForSct;
    return this;
  }

   /**
   * Indicated if the beneficiary can be used for SEPA Credit Transfer. This field is a conveniant way to filter all beneficiaries for a user that would like to do a Credit Transfer. Indeed, beneficaries are created automatically when receiving a Core Direct Debit and therefor by looking at the list you won&#39;t be able to idnetify which beneficary to use on SCT.
   * @return usableForSct
  **/
  @ApiModelProperty(value = "Indicated if the beneficiary can be used for SEPA Credit Transfer. This field is a conveniant way to filter all beneficiaries for a user that would like to do a Credit Transfer. Indeed, beneficaries are created automatically when receiving a Core Direct Debit and therefor by looking at the list you won't be able to idnetify which beneficary to use on SCT.")
  public Boolean isUsableForSct() {
    return usableForSct;
  }

  public void setUsableForSct(Boolean usableForSct) {
    this.usableForSct = usableForSct;
  }

  public Body1 fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public Body1 addFieldsItem(String fieldsItem) {
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
    Body1 body1 = (Body1) o;
    return Objects.equals(this.tag, body1.tag) &&
        Objects.equals(this.nickName, body1.nickName) &&
        Objects.equals(this.name, body1.name) &&
        Objects.equals(this.address, body1.address) &&
        Objects.equals(this.iban, body1.iban) &&
        Objects.equals(this.bic, body1.bic) &&
        Objects.equals(this.sepaCreditorIdentifier, body1.sepaCreditorIdentifier) &&
        Objects.equals(this.sddB2bWhitelist, body1.sddB2bWhitelist) &&
        Objects.equals(this.sddCoreBlacklist, body1.sddCoreBlacklist) &&
        Objects.equals(this.usableForSct, body1.usableForSct) &&
        Objects.equals(this.fields, body1.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, nickName, name, address, iban, bic, sepaCreditorIdentifier, sddB2bWhitelist, sddCoreBlacklist, usableForSct, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    sepaCreditorIdentifier: ").append(toIndentedString(sepaCreditorIdentifier)).append("\n");
    sb.append("    sddB2bWhitelist: ").append(toIndentedString(sddB2bWhitelist)).append("\n");
    sb.append("    sddCoreBlacklist: ").append(toIndentedString(sddCoreBlacklist)).append("\n");
    sb.append("    usableForSct: ").append(toIndentedString(usableForSct)).append("\n");
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

