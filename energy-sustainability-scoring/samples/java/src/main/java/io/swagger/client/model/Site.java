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
import io.swagger.client.model.Address;
import io.swagger.client.model.SiteMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Site
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T12:58:44.587342+02:00[Europe/Madrid]")
public class Site {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("metadata")
  private SiteMetadata metadata = null;

  @SerializedName("postalAddress")
  private Address postalAddress = null;

  public Site id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "fc64ac6a-abfd-4f5e-9d38-81101152c0ca", description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Site name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Mcdonald's Melton South", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Site type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "Retail", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Site metadata(SiteMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public SiteMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SiteMetadata metadata) {
    this.metadata = metadata;
  }

  public Site postalAddress(Address postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

   /**
   * Get postalAddress
   * @return postalAddress
  **/
  @Schema(description = "")
  public Address getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(Address postalAddress) {
    this.postalAddress = postalAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.id, site.id) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.type, site.type) &&
        Objects.equals(this.metadata, site.metadata) &&
        Objects.equals(this.postalAddress, site.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, metadata, postalAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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
