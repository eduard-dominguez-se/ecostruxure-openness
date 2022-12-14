/*
 * Energy Scoring
 * Schneider Electric provides OpenESX Energy Scoring API for its customer to integrate EcoStruxure services with their own Energy Scoring Provider of choice in order to evaluate buildings energy consumption and provide scores
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CertificationProvider
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T12:58:44.587342+02:00[Europe/Madrid]")
public class CertificationProvider {
  @SerializedName("leedId")
  private Integer leedId = null;

  @SerializedName("leedName")
  private String leedName = null;

   /**
   * Get leedId
   * @return leedId
  **/
  @Schema(example = "8000015697", required = true, description = "")
  public Integer getLeedId() {
    return leedId;
  }

  public CertificationProvider leedName(String leedName) {
    this.leedName = leedName;
    return this;
  }

   /**
   * Get leedName
   * @return leedName
  **/
  @Schema(example = "Mcdonald's Melton South", required = true, description = "")
  public String getLeedName() {
    return leedName;
  }

  public void setLeedName(String leedName) {
    this.leedName = leedName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificationProvider certificationProvider = (CertificationProvider) o;
    return Objects.equals(this.leedId, certificationProvider.leedId) &&
        Objects.equals(this.leedName, certificationProvider.leedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leedId, leedName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificationProvider {\n");
    
    sb.append("    leedId: ").append(toIndentedString(leedId)).append("\n");
    sb.append("    leedName: ").append(toIndentedString(leedName)).append("\n");
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
