/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
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
 * A knowledge-base is SimSage&#39;s representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMKnowledgeBase {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SECURITY_ID = "securityId";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_MAX_QUERIES_PER_DAY = "maxQueriesPerDay";
  @SerializedName(SERIALIZED_NAME_MAX_QUERIES_PER_DAY)
  private Long maxQueriesPerDay;

  public static final String SERIALIZED_NAME_ANALYTICS_WINDOW_IN_MONTHS = "analyticsWindowInMonths";
  @SerializedName(SERIALIZED_NAME_ANALYTICS_WINDOW_IN_MONTHS)
  private Integer analyticsWindowInMonths;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_OPERATOR_ENABLED = "operatorEnabled";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ENABLED)
  private Boolean operatorEnabled;

  public static final String SERIALIZED_NAME_CAPACITY_WARNINGS = "capacityWarnings";
  @SerializedName(SERIALIZED_NAME_CAPACITY_WARNINGS)
  private Boolean capacityWarnings;

  public static final String SERIALIZED_NAME_INDEX_SCHEDULE = "indexSchedule";
  @SerializedName(SERIALIZED_NAME_INDEX_SCHEDULE)
  private String indexSchedule;

  public static final String SERIALIZED_NAME_LAST_INDEX_OPTIMIZATION_TIME = "lastIndexOptimizationTime";
  @SerializedName(SERIALIZED_NAME_LAST_INDEX_OPTIMIZATION_TIME)
  private Long lastIndexOptimizationTime;

  public CMKnowledgeBase() {
  }

  public CMKnowledgeBase organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the main organisation (its guid id)
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMKnowledgeBase kbId(String kbId) {
    
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


  public CMKnowledgeBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of this knowledge-base (must be unique within an organisation)
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CMKnowledgeBase email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * the support email of the person to email with any UI generated questions
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CMKnowledgeBase securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems.
   * @return securityId
  **/
  @javax.annotation.Nonnull
  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public CMKnowledgeBase created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * when this knowledge-base was created, a unix date-time long
   * @return created
  **/
  @javax.annotation.Nonnull
  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public CMKnowledgeBase maxQueriesPerDay(Long maxQueriesPerDay) {
    
    this.maxQueriesPerDay = maxQueriesPerDay;
    return this;
  }

   /**
   * limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits.
   * @return maxQueriesPerDay
  **/
  @javax.annotation.Nonnull
  public Long getMaxQueriesPerDay() {
    return maxQueriesPerDay;
  }


  public void setMaxQueriesPerDay(Long maxQueriesPerDay) {
    this.maxQueriesPerDay = maxQueriesPerDay;
  }


  public CMKnowledgeBase analyticsWindowInMonths(Integer analyticsWindowInMonths) {
    
    this.analyticsWindowInMonths = analyticsWindowInMonths;
    return this;
  }

   /**
   * How long to keep analytics for in months.  A value of zero (0) indicates forever
   * @return analyticsWindowInMonths
  **/
  @javax.annotation.Nonnull
  public Integer getAnalyticsWindowInMonths() {
    return analyticsWindowInMonths;
  }


  public void setAnalyticsWindowInMonths(Integer analyticsWindowInMonths) {
    this.analyticsWindowInMonths = analyticsWindowInMonths;
  }


  public CMKnowledgeBase enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CMKnowledgeBase operatorEnabled(Boolean operatorEnabled) {
    
    this.operatorEnabled = operatorEnabled;
    return this;
  }

   /**
   * a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base&#39;s operator from interacting with end-users.
   * @return operatorEnabled
  **/
  @javax.annotation.Nonnull
  public Boolean getOperatorEnabled() {
    return operatorEnabled;
  }


  public void setOperatorEnabled(Boolean operatorEnabled) {
    this.operatorEnabled = operatorEnabled;
  }


  public CMKnowledgeBase capacityWarnings(Boolean capacityWarnings) {
    
    this.capacityWarnings = capacityWarnings;
    return this;
  }

   /**
   * All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation.
   * @return capacityWarnings
  **/
  @javax.annotation.Nonnull
  public Boolean getCapacityWarnings() {
    return capacityWarnings;
  }


  public void setCapacityWarnings(Boolean capacityWarnings) {
    this.capacityWarnings = capacityWarnings;
  }


  public CMKnowledgeBase indexSchedule(String indexSchedule) {
    
    this.indexSchedule = indexSchedule;
    return this;
  }

   /**
   * the time-schedule for index-optimization, when active.
   * @return indexSchedule
  **/
  @javax.annotation.Nonnull
  public String getIndexSchedule() {
    return indexSchedule;
  }


  public void setIndexSchedule(String indexSchedule) {
    this.indexSchedule = indexSchedule;
  }


  public CMKnowledgeBase lastIndexOptimizationTime(Long lastIndexOptimizationTime) {
    
    this.lastIndexOptimizationTime = lastIndexOptimizationTime;
    return this;
  }

   /**
   * the last time this triggered and ran as a unix date-time (read only)
   * @return lastIndexOptimizationTime
  **/
  @javax.annotation.Nonnull
  public Long getLastIndexOptimizationTime() {
    return lastIndexOptimizationTime;
  }


  public void setLastIndexOptimizationTime(Long lastIndexOptimizationTime) {
    this.lastIndexOptimizationTime = lastIndexOptimizationTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMKnowledgeBase cmKnowledgeBase = (CMKnowledgeBase) o;
    return Objects.equals(this.organisationId, cmKnowledgeBase.organisationId) &&
        Objects.equals(this.kbId, cmKnowledgeBase.kbId) &&
        Objects.equals(this.name, cmKnowledgeBase.name) &&
        Objects.equals(this.email, cmKnowledgeBase.email) &&
        Objects.equals(this.securityId, cmKnowledgeBase.securityId) &&
        Objects.equals(this.created, cmKnowledgeBase.created) &&
        Objects.equals(this.maxQueriesPerDay, cmKnowledgeBase.maxQueriesPerDay) &&
        Objects.equals(this.analyticsWindowInMonths, cmKnowledgeBase.analyticsWindowInMonths) &&
        Objects.equals(this.enabled, cmKnowledgeBase.enabled) &&
        Objects.equals(this.operatorEnabled, cmKnowledgeBase.operatorEnabled) &&
        Objects.equals(this.capacityWarnings, cmKnowledgeBase.capacityWarnings) &&
        Objects.equals(this.indexSchedule, cmKnowledgeBase.indexSchedule) &&
        Objects.equals(this.lastIndexOptimizationTime, cmKnowledgeBase.lastIndexOptimizationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, name, email, securityId, created, maxQueriesPerDay, analyticsWindowInMonths, enabled, operatorEnabled, capacityWarnings, indexSchedule, lastIndexOptimizationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMKnowledgeBase {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    maxQueriesPerDay: ").append(toIndentedString(maxQueriesPerDay)).append("\n");
    sb.append("    analyticsWindowInMonths: ").append(toIndentedString(analyticsWindowInMonths)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    operatorEnabled: ").append(toIndentedString(operatorEnabled)).append("\n");
    sb.append("    capacityWarnings: ").append(toIndentedString(capacityWarnings)).append("\n");
    sb.append("    indexSchedule: ").append(toIndentedString(indexSchedule)).append("\n");
    sb.append("    lastIndexOptimizationTime: ").append(toIndentedString(lastIndexOptimizationTime)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("securityId");
    openapiFields.add("created");
    openapiFields.add("maxQueriesPerDay");
    openapiFields.add("analyticsWindowInMonths");
    openapiFields.add("enabled");
    openapiFields.add("operatorEnabled");
    openapiFields.add("capacityWarnings");
    openapiFields.add("indexSchedule");
    openapiFields.add("lastIndexOptimizationTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("securityId");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("maxQueriesPerDay");
    openapiRequiredFields.add("analyticsWindowInMonths");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("operatorEnabled");
    openapiRequiredFields.add("capacityWarnings");
    openapiRequiredFields.add("indexSchedule");
    openapiRequiredFields.add("lastIndexOptimizationTime");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMKnowledgeBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMKnowledgeBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMKnowledgeBase is not found in the empty JSON string", CMKnowledgeBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMKnowledgeBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMKnowledgeBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMKnowledgeBase.openapiRequiredFields) {
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
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("securityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `securityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("securityId").toString()));
      }
      if (!jsonObj.get("indexSchedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indexSchedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indexSchedule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMKnowledgeBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMKnowledgeBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMKnowledgeBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMKnowledgeBase.class));

       return (TypeAdapter<T>) new TypeAdapter<CMKnowledgeBase>() {
           @Override
           public void write(JsonWriter out, CMKnowledgeBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMKnowledgeBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMKnowledgeBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMKnowledgeBase
  * @throws IOException if the JSON string is invalid with respect to CMKnowledgeBase
  */
  public static CMKnowledgeBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMKnowledgeBase.class);
  }

 /**
  * Convert an instance of CMKnowledgeBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
