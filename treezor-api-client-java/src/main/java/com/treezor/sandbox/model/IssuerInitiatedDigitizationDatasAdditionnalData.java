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
 * This parameter is required in the case of APPLE tokenRequestor
 */
@ApiModel(description = "This parameter is required in the case of APPLE tokenRequestor")

public class IssuerInitiatedDigitizationDatasAdditionnalData {
  @SerializedName("certificates")
  private List<String> certificates = null;

  @SerializedName("nonce")
  private String nonce = null;

  @SerializedName("nonceSignature")
  private byte[] nonceSignature = null;

  public IssuerInitiatedDigitizationDatasAdditionnalData certificates(List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  public IssuerInitiatedDigitizationDatasAdditionnalData addCertificatesItem(String certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<String>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * The certificate chain. Required when tokenRequestor is APPLE. The first element of array is the leaf certificate and the last should be the root certificate. There can be 0 or several sub certificates inbetween the first element of array and the last. All certificates are of type string (base64 encoded of DER format)
   * @return certificates
  **/
  @ApiModelProperty(value = "The certificate chain. Required when tokenRequestor is APPLE. The first element of array is the leaf certificate and the last should be the root certificate. There can be 0 or several sub certificates inbetween the first element of array and the last. All certificates are of type string (base64 encoded of DER format)")
  public List<String> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

  public IssuerInitiatedDigitizationDatasAdditionnalData nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * The nonce as provided by the Apple SDK. Required when tokenRequestor is APPLE
   * @return nonce
  **/
  @ApiModelProperty(value = "The nonce as provided by the Apple SDK. Required when tokenRequestor is APPLE")
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public IssuerInitiatedDigitizationDatasAdditionnalData nonceSignature(byte[] nonceSignature) {
    this.nonceSignature = nonceSignature;
    return this;
  }

   /**
   * The nonce signature as provided by the Apple SDK. Required when tokenRequestor is APPLE
   * @return nonceSignature
  **/
  @ApiModelProperty(value = "The nonce signature as provided by the Apple SDK. Required when tokenRequestor is APPLE")
  public byte[] getNonceSignature() {
    return nonceSignature;
  }

  public void setNonceSignature(byte[] nonceSignature) {
    this.nonceSignature = nonceSignature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuerInitiatedDigitizationDatasAdditionnalData issuerInitiatedDigitizationDatasAdditionnalData = (IssuerInitiatedDigitizationDatasAdditionnalData) o;
    return Objects.equals(this.certificates, issuerInitiatedDigitizationDatasAdditionnalData.certificates) &&
        Objects.equals(this.nonce, issuerInitiatedDigitizationDatasAdditionnalData.nonce) &&
        Arrays.equals(this.nonceSignature, issuerInitiatedDigitizationDatasAdditionnalData.nonceSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, nonce, Arrays.hashCode(nonceSignature));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuerInitiatedDigitizationDatasAdditionnalData {\n");
    
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    nonceSignature: ").append(toIndentedString(nonceSignature)).append("\n");
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

