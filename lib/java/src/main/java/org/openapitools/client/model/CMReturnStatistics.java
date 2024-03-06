/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
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
import java.util.HashMap;
import java.util.Map;

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
 * This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMReturnStatistics {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_ACCESS_FREQUENCY = "accessFrequency";
  @SerializedName(SERIALIZED_NAME_ACCESS_FREQUENCY)
  private Integer accessFrequency;

  public static final String SERIALIZED_NAME_QUERY_WORD_FREQUENCY = "queryWordFrequency";
  @SerializedName(SERIALIZED_NAME_QUERY_WORD_FREQUENCY)
  private Map<String, Integer> queryWordFrequency = new HashMap<>();

  public static final String SERIALIZED_NAME_GENERAL_STATISTICS = "generalStatistics";
  @SerializedName(SERIALIZED_NAME_GENERAL_STATISTICS)
  private Map<String, Long> generalStatistics = new HashMap<>();

  public static final String SERIALIZED_NAME_FILE_TYPE_STATISTICS = "fileTypeStatistics";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE_STATISTICS)
  private Map<String, Integer> fileTypeStatistics = new HashMap<>();

  public CMReturnStatistics() {
  }

  public CMReturnStatistics organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id)
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMReturnStatistics kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id (its guid id)
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMReturnStatistics year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * the year of the request
   * @return year
  **/
  @javax.annotation.Nonnull
  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  public CMReturnStatistics month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * the month of the request
   * @return month
  **/
  @javax.annotation.Nonnull
  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public CMReturnStatistics accessFrequency(Integer accessFrequency) {
    
    this.accessFrequency = accessFrequency;
    return this;
  }

   /**
   * A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month.
   * @return accessFrequency
  **/
  @javax.annotation.Nonnull
  public Integer getAccessFrequency() {
    return accessFrequency;
  }


  public void setAccessFrequency(Integer accessFrequency) {
    this.accessFrequency = accessFrequency;
  }


  public CMReturnStatistics queryWordFrequency(Map<String, Integer> queryWordFrequency) {
    
    this.queryWordFrequency = queryWordFrequency;
    return this;
  }

  public CMReturnStatistics putQueryWordFrequencyItem(String key, Integer queryWordFrequencyItem) {
    if (this.queryWordFrequency == null) {
      this.queryWordFrequency = new HashMap<>();
    }
    this.queryWordFrequency.put(key, queryWordFrequencyItem);
    return this;
  }

   /**
   * The top list of queries (the strings) and their frequencies
   * @return queryWordFrequency
  **/
  @javax.annotation.Nonnull
  public Map<String, Integer> getQueryWordFrequency() {
    return queryWordFrequency;
  }


  public void setQueryWordFrequency(Map<String, Integer> queryWordFrequency) {
    this.queryWordFrequency = queryWordFrequency;
  }


  public CMReturnStatistics generalStatistics(Map<String, Long> generalStatistics) {
    
    this.generalStatistics = generalStatistics;
    return this;
  }

  public CMReturnStatistics putGeneralStatisticsItem(String key, Long generalStatisticsItem) {
    if (this.generalStatistics == null) {
      this.generalStatistics = new HashMap<>();
    }
    this.generalStatistics.put(key, generalStatisticsItem);
    return this;
  }

   /**
   * Some more general statistics (eg. number of documents) and their frequencies
   * @return generalStatistics
  **/
  @javax.annotation.Nonnull
  public Map<String, Long> getGeneralStatistics() {
    return generalStatistics;
  }


  public void setGeneralStatistics(Map<String, Long> generalStatistics) {
    this.generalStatistics = generalStatistics;
  }


  public CMReturnStatistics fileTypeStatistics(Map<String, Integer> fileTypeStatistics) {
    
    this.fileTypeStatistics = fileTypeStatistics;
    return this;
  }

  public CMReturnStatistics putFileTypeStatisticsItem(String key, Integer fileTypeStatisticsItem) {
    if (this.fileTypeStatistics == null) {
      this.fileTypeStatistics = new HashMap<>();
    }
    this.fileTypeStatistics.put(key, fileTypeStatisticsItem);
    return this;
  }

   /**
   * The breakdown of file-types (by file extension) and their frequencies
   * @return fileTypeStatistics
  **/
  @javax.annotation.Nonnull
  public Map<String, Integer> getFileTypeStatistics() {
    return fileTypeStatistics;
  }


  public void setFileTypeStatistics(Map<String, Integer> fileTypeStatistics) {
    this.fileTypeStatistics = fileTypeStatistics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMReturnStatistics cmReturnStatistics = (CMReturnStatistics) o;
    return Objects.equals(this.organisationId, cmReturnStatistics.organisationId) &&
        Objects.equals(this.kbId, cmReturnStatistics.kbId) &&
        Objects.equals(this.year, cmReturnStatistics.year) &&
        Objects.equals(this.month, cmReturnStatistics.month) &&
        Objects.equals(this.accessFrequency, cmReturnStatistics.accessFrequency) &&
        Objects.equals(this.queryWordFrequency, cmReturnStatistics.queryWordFrequency) &&
        Objects.equals(this.generalStatistics, cmReturnStatistics.generalStatistics) &&
        Objects.equals(this.fileTypeStatistics, cmReturnStatistics.fileTypeStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, year, month, accessFrequency, queryWordFrequency, generalStatistics, fileTypeStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMReturnStatistics {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    accessFrequency: ").append(toIndentedString(accessFrequency)).append("\n");
    sb.append("    queryWordFrequency: ").append(toIndentedString(queryWordFrequency)).append("\n");
    sb.append("    generalStatistics: ").append(toIndentedString(generalStatistics)).append("\n");
    sb.append("    fileTypeStatistics: ").append(toIndentedString(fileTypeStatistics)).append("\n");
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
    openapiFields.add("year");
    openapiFields.add("month");
    openapiFields.add("accessFrequency");
    openapiFields.add("queryWordFrequency");
    openapiFields.add("generalStatistics");
    openapiFields.add("fileTypeStatistics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("accessFrequency");
    openapiRequiredFields.add("queryWordFrequency");
    openapiRequiredFields.add("generalStatistics");
    openapiRequiredFields.add("fileTypeStatistics");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMReturnStatistics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMReturnStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMReturnStatistics is not found in the empty JSON string", CMReturnStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMReturnStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMReturnStatistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMReturnStatistics.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMReturnStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMReturnStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMReturnStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMReturnStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<CMReturnStatistics>() {
           @Override
           public void write(JsonWriter out, CMReturnStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMReturnStatistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMReturnStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMReturnStatistics
  * @throws IOException if the JSON string is invalid with respect to CMReturnStatistics
  */
  public static CMReturnStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMReturnStatistics.class);
  }

 /**
  * Convert an instance of CMReturnStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

