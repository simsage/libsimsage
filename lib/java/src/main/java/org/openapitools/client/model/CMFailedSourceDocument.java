/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
 * Description of an external document upload failure.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMFailedSourceDocument {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_SOURCE_SYSTEM_ID = "sourceSystemId";
  @SerializedName(SERIALIZED_NAME_SOURCE_SYSTEM_ID)
  private String sourceSystemId;

  public static final String SERIALIZED_NAME_WEB_URL = "webUrl";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private Long runId;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ENCRYPTED = "encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public CMFailedSourceDocument() {
  }

  public CMFailedSourceDocument organisationId(String organisationId) {
    
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


  public CMFailedSourceDocument kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id (its guid id) for this source/crawler
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMFailedSourceDocument sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id, primary key of the source
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMFailedSourceDocument sourceSystemId(String sourceSystemId) {
    
    this.sourceSystemId = sourceSystemId;
    return this;
  }

   /**
   * the unique id of the document in the source system, mostly same as web url
   * @return sourceSystemId
  **/
  @javax.annotation.Nonnull
  public String getSourceSystemId() {
    return sourceSystemId;
  }


  public void setSourceSystemId(String sourceSystemId) {
    this.sourceSystemId = sourceSystemId;
  }


  public CMFailedSourceDocument webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * the web url to access the document, can be different from url
   * @return webUrl
  **/
  @javax.annotation.Nonnull
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public CMFailedSourceDocument runId(Long runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * the timestamp of the crawler run adding the exception
   * @return runId
  **/
  @javax.annotation.Nonnull
  public Long getRunId() {
    return runId;
  }


  public void setRunId(Long runId) {
    this.runId = runId;
  }


  public CMFailedSourceDocument errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * the error message added by the system
   * @return errorMessage
  **/
  @javax.annotation.Nonnull
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CMFailedSourceDocument encrypted(Boolean encrypted) {
    
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


  public CMFailedSourceDocument seed(Integer seed) {
    
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


  public CMFailedSourceDocument sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
   * @return sid
  **/
  @javax.annotation.Nonnull
  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMFailedSourceDocument cmFailedSourceDocument = (CMFailedSourceDocument) o;
    return Objects.equals(this.organisationId, cmFailedSourceDocument.organisationId) &&
        Objects.equals(this.kbId, cmFailedSourceDocument.kbId) &&
        Objects.equals(this.sourceId, cmFailedSourceDocument.sourceId) &&
        Objects.equals(this.sourceSystemId, cmFailedSourceDocument.sourceSystemId) &&
        Objects.equals(this.webUrl, cmFailedSourceDocument.webUrl) &&
        Objects.equals(this.runId, cmFailedSourceDocument.runId) &&
        Objects.equals(this.errorMessage, cmFailedSourceDocument.errorMessage) &&
        Objects.equals(this.encrypted, cmFailedSourceDocument.encrypted) &&
        Objects.equals(this.seed, cmFailedSourceDocument.seed) &&
        Objects.equals(this.sid, cmFailedSourceDocument.sid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, sourceId, sourceSystemId, webUrl, runId, errorMessage, encrypted, seed, sid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMFailedSourceDocument {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
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
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("sourceId");
    openapiFields.add("sourceSystemId");
    openapiFields.add("webUrl");
    openapiFields.add("runId");
    openapiFields.add("errorMessage");
    openapiFields.add("encrypted");
    openapiFields.add("seed");
    openapiFields.add("sid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("sourceSystemId");
    openapiRequiredFields.add("webUrl");
    openapiRequiredFields.add("runId");
    openapiRequiredFields.add("errorMessage");
    openapiRequiredFields.add("encrypted");
    openapiRequiredFields.add("seed");
    openapiRequiredFields.add("sid");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMFailedSourceDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMFailedSourceDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMFailedSourceDocument is not found in the empty JSON string", CMFailedSourceDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMFailedSourceDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMFailedSourceDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMFailedSourceDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("sourceSystemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceSystemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceSystemId").toString()));
      }
      if (!jsonObj.get("webUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webUrl").toString()));
      }
      if (!jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if (!jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMFailedSourceDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMFailedSourceDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMFailedSourceDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMFailedSourceDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CMFailedSourceDocument>() {
           @Override
           public void write(JsonWriter out, CMFailedSourceDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMFailedSourceDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMFailedSourceDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMFailedSourceDocument
  * @throws IOException if the JSON string is invalid with respect to CMFailedSourceDocument
  */
  public static CMFailedSourceDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMFailedSourceDocument.class);
  }

 /**
  * Convert an instance of CMFailedSourceDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
