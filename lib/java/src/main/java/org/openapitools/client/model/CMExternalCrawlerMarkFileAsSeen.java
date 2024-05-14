/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.Asset;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * An mark-file-as-seen object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMExternalCrawlerMarkFileAsSeen {
  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private Asset asset;

  public static final String SERIALIZED_NAME_ENCRYPTED = "encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public CMExternalCrawlerMarkFileAsSeen() {
  }

  public CMExternalCrawlerMarkFileAsSeen objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * the type of this class, just in case this object is encrypted
   * @return objectType
  **/
  @javax.annotation.Nonnull
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public CMExternalCrawlerMarkFileAsSeen organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the main organisation (its guid id) for this source/crawler
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMExternalCrawlerMarkFileAsSeen kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id of this context item, a guid-string
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMExternalCrawlerMarkFileAsSeen sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
   * @return sid
  **/
  @javax.annotation.Nonnull
  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public CMExternalCrawlerMarkFileAsSeen sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id of this crawler (ie. the crawler&#39;s id)
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMExternalCrawlerMarkFileAsSeen asset(Asset asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nonnull
  public Asset getAsset() {
    return asset;
  }


  public void setAsset(Asset asset) {
    this.asset = asset;
  }


  public CMExternalCrawlerMarkFileAsSeen encrypted(Boolean encrypted) {
    
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Do we need to add transport encryption
   * @return encrypted
  **/
  @javax.annotation.Nonnull
  public Boolean getEncrypted() {
    return encrypted;
  }


  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }


  public CMExternalCrawlerMarkFileAsSeen seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * The seed used if encrypted
   * @return seed
  **/
  @javax.annotation.Nonnull
  public Integer getSeed() {
    return seed;
  }


  public void setSeed(Integer seed) {
    this.seed = seed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMExternalCrawlerMarkFileAsSeen cmExternalCrawlerMarkFileAsSeen = (CMExternalCrawlerMarkFileAsSeen) o;
    return Objects.equals(this.objectType, cmExternalCrawlerMarkFileAsSeen.objectType) &&
        Objects.equals(this.organisationId, cmExternalCrawlerMarkFileAsSeen.organisationId) &&
        Objects.equals(this.kbId, cmExternalCrawlerMarkFileAsSeen.kbId) &&
        Objects.equals(this.sid, cmExternalCrawlerMarkFileAsSeen.sid) &&
        Objects.equals(this.sourceId, cmExternalCrawlerMarkFileAsSeen.sourceId) &&
        Objects.equals(this.asset, cmExternalCrawlerMarkFileAsSeen.asset) &&
        Objects.equals(this.encrypted, cmExternalCrawlerMarkFileAsSeen.encrypted) &&
        Objects.equals(this.seed, cmExternalCrawlerMarkFileAsSeen.seed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, organisationId, kbId, sid, sourceId, asset, encrypted, seed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMExternalCrawlerMarkFileAsSeen {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("objectType");
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("sid");
    openapiFields.add("sourceId");
    openapiFields.add("asset");
    openapiFields.add("encrypted");
    openapiFields.add("seed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objectType");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sid");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("asset");
    openapiRequiredFields.add("encrypted");
    openapiRequiredFields.add("seed");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMExternalCrawlerMarkFileAsSeen
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMExternalCrawlerMarkFileAsSeen.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMExternalCrawlerMarkFileAsSeen is not found in the empty JSON string", CMExternalCrawlerMarkFileAsSeen.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMExternalCrawlerMarkFileAsSeen.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMExternalCrawlerMarkFileAsSeen` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMExternalCrawlerMarkFileAsSeen.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      // validate the required field `asset`
      Asset.validateJsonElement(jsonObj.get("asset"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMExternalCrawlerMarkFileAsSeen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMExternalCrawlerMarkFileAsSeen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMExternalCrawlerMarkFileAsSeen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMExternalCrawlerMarkFileAsSeen.class));

       return (TypeAdapter<T>) new TypeAdapter<CMExternalCrawlerMarkFileAsSeen>() {
           @Override
           public void write(JsonWriter out, CMExternalCrawlerMarkFileAsSeen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMExternalCrawlerMarkFileAsSeen read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMExternalCrawlerMarkFileAsSeen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMExternalCrawlerMarkFileAsSeen
  * @throws IOException if the JSON string is invalid with respect to CMExternalCrawlerMarkFileAsSeen
  */
  public static CMExternalCrawlerMarkFileAsSeen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMExternalCrawlerMarkFileAsSeen.class);
  }

 /**
  * Convert an instance of CMExternalCrawlerMarkFileAsSeen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

