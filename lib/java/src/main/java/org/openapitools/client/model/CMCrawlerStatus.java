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
 * CMCrawlerStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMCrawlerStatus {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_PROJECT_TITLE = "projectTitle";
  @SerializedName(SERIALIZED_NAME_PROJECT_TITLE)
  private String projectTitle;

  public static final String SERIALIZED_NAME_PROJECT_TYPE = "projectType";
  @SerializedName(SERIALIZED_NAME_PROJECT_TYPE)
  private String projectType;

  public static final String SERIALIZED_NAME_CRAWLER_ID = "crawlerId";
  @SerializedName(SERIALIZED_NAME_CRAWLER_ID)
  private String crawlerId;

  public static final String SERIALIZED_NAME_CRAWLER_NAME = "crawlerName";
  @SerializedName(SERIALIZED_NAME_CRAWLER_NAME)
  private String crawlerName;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime;

  public static final String SERIALIZED_NAME_IS_RUNNING = "isRunning";
  @SerializedName(SERIALIZED_NAME_IS_RUNNING)
  private Boolean isRunning;

  public static final String SERIALIZED_NAME_SPECIFIC_JSON = "specificJson";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_JSON)
  private String specificJson;

  public CMCrawlerStatus() {
  }

  public CMCrawlerStatus organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMCrawlerStatus kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * Get kbId
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMCrawlerStatus projectTitle(String projectTitle) {
    
    this.projectTitle = projectTitle;
    return this;
  }

   /**
   * Get projectTitle
   * @return projectTitle
  **/
  @javax.annotation.Nonnull
  public String getProjectTitle() {
    return projectTitle;
  }


  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }


  public CMCrawlerStatus projectType(String projectType) {
    
    this.projectType = projectType;
    return this;
  }

   /**
   * Get projectType
   * @return projectType
  **/
  @javax.annotation.Nonnull
  public String getProjectType() {
    return projectType;
  }


  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }


  public CMCrawlerStatus crawlerId(String crawlerId) {
    
    this.crawlerId = crawlerId;
    return this;
  }

   /**
   * Get crawlerId
   * @return crawlerId
  **/
  @javax.annotation.Nonnull
  public String getCrawlerId() {
    return crawlerId;
  }


  public void setCrawlerId(String crawlerId) {
    this.crawlerId = crawlerId;
  }


  public CMCrawlerStatus crawlerName(String crawlerName) {
    
    this.crawlerName = crawlerName;
    return this;
  }

   /**
   * Get crawlerName
   * @return crawlerName
  **/
  @javax.annotation.Nonnull
  public String getCrawlerName() {
    return crawlerName;
  }


  public void setCrawlerName(String crawlerName) {
    this.crawlerName = crawlerName;
  }


  public CMCrawlerStatus startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public CMCrawlerStatus endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public CMCrawlerStatus isRunning(Boolean isRunning) {
    
    this.isRunning = isRunning;
    return this;
  }

   /**
   * Get isRunning
   * @return isRunning
  **/
  @javax.annotation.Nonnull
  public Boolean getIsRunning() {
    return isRunning;
  }


  public void setIsRunning(Boolean isRunning) {
    this.isRunning = isRunning;
  }


  public CMCrawlerStatus specificJson(String specificJson) {
    
    this.specificJson = specificJson;
    return this;
  }

   /**
   * Get specificJson
   * @return specificJson
  **/
  @javax.annotation.Nonnull
  public String getSpecificJson() {
    return specificJson;
  }


  public void setSpecificJson(String specificJson) {
    this.specificJson = specificJson;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMCrawlerStatus cmCrawlerStatus = (CMCrawlerStatus) o;
    return Objects.equals(this.organisationId, cmCrawlerStatus.organisationId) &&
        Objects.equals(this.kbId, cmCrawlerStatus.kbId) &&
        Objects.equals(this.projectTitle, cmCrawlerStatus.projectTitle) &&
        Objects.equals(this.projectType, cmCrawlerStatus.projectType) &&
        Objects.equals(this.crawlerId, cmCrawlerStatus.crawlerId) &&
        Objects.equals(this.crawlerName, cmCrawlerStatus.crawlerName) &&
        Objects.equals(this.startTime, cmCrawlerStatus.startTime) &&
        Objects.equals(this.endTime, cmCrawlerStatus.endTime) &&
        Objects.equals(this.isRunning, cmCrawlerStatus.isRunning) &&
        Objects.equals(this.specificJson, cmCrawlerStatus.specificJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, projectTitle, projectType, crawlerId, crawlerName, startTime, endTime, isRunning, specificJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMCrawlerStatus {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
    sb.append("    crawlerId: ").append(toIndentedString(crawlerId)).append("\n");
    sb.append("    crawlerName: ").append(toIndentedString(crawlerName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isRunning: ").append(toIndentedString(isRunning)).append("\n");
    sb.append("    specificJson: ").append(toIndentedString(specificJson)).append("\n");
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
    openapiFields.add("projectTitle");
    openapiFields.add("projectType");
    openapiFields.add("crawlerId");
    openapiFields.add("crawlerName");
    openapiFields.add("startTime");
    openapiFields.add("endTime");
    openapiFields.add("isRunning");
    openapiFields.add("specificJson");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("projectTitle");
    openapiRequiredFields.add("projectType");
    openapiRequiredFields.add("crawlerId");
    openapiRequiredFields.add("crawlerName");
    openapiRequiredFields.add("startTime");
    openapiRequiredFields.add("endTime");
    openapiRequiredFields.add("isRunning");
    openapiRequiredFields.add("specificJson");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMCrawlerStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMCrawlerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMCrawlerStatus is not found in the empty JSON string", CMCrawlerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMCrawlerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMCrawlerStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMCrawlerStatus.openapiRequiredFields) {
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
      if (!jsonObj.get("projectTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectTitle").toString()));
      }
      if (!jsonObj.get("projectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectType").toString()));
      }
      if (!jsonObj.get("crawlerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crawlerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crawlerId").toString()));
      }
      if (!jsonObj.get("crawlerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crawlerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crawlerName").toString()));
      }
      if (!jsonObj.get("specificJson").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specificJson` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specificJson").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMCrawlerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMCrawlerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMCrawlerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMCrawlerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<CMCrawlerStatus>() {
           @Override
           public void write(JsonWriter out, CMCrawlerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMCrawlerStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMCrawlerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMCrawlerStatus
  * @throws IOException if the JSON string is invalid with respect to CMCrawlerStatus
  */
  public static CMCrawlerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMCrawlerStatus.class);
  }

 /**
  * Convert an instance of CMCrawlerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

