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
import org.openapitools.client.model.CMSlicedDocumentFilter;

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
 * CMSlicedDocumentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMSlicedDocumentRequest {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_SLICE_ID = "sliceId";
  @SerializedName(SERIALIZED_NAME_SLICE_ID)
  private String sliceId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private CMSlicedDocumentFilter filter;

  public CMSlicedDocumentRequest() {
  }

  public CMSlicedDocumentRequest organisationId(String organisationId) {
    
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


  public CMSlicedDocumentRequest taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nonnull
  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public CMSlicedDocumentRequest sliceId(String sliceId) {
    
    this.sliceId = sliceId;
    return this;
  }

   /**
   * Get sliceId
   * @return sliceId
  **/
  @javax.annotation.Nonnull
  public String getSliceId() {
    return sliceId;
  }


  public void setSliceId(String sliceId) {
    this.sliceId = sliceId;
  }


  public CMSlicedDocumentRequest filter(CMSlicedDocumentFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public CMSlicedDocumentFilter getFilter() {
    return filter;
  }


  public void setFilter(CMSlicedDocumentFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSlicedDocumentRequest cmSlicedDocumentRequest = (CMSlicedDocumentRequest) o;
    return Objects.equals(this.organisationId, cmSlicedDocumentRequest.organisationId) &&
        Objects.equals(this.taskId, cmSlicedDocumentRequest.taskId) &&
        Objects.equals(this.sliceId, cmSlicedDocumentRequest.sliceId) &&
        Objects.equals(this.filter, cmSlicedDocumentRequest.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, taskId, sliceId, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSlicedDocumentRequest {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("taskId");
    openapiFields.add("sliceId");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("taskId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("filter");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSlicedDocumentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSlicedDocumentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSlicedDocumentRequest is not found in the empty JSON string", CMSlicedDocumentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSlicedDocumentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSlicedDocumentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSlicedDocumentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
      if (!jsonObj.get("sliceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sliceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sliceId").toString()));
      }
      // validate the required field `filter`
      CMSlicedDocumentFilter.validateJsonElement(jsonObj.get("filter"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSlicedDocumentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSlicedDocumentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSlicedDocumentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSlicedDocumentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSlicedDocumentRequest>() {
           @Override
           public void write(JsonWriter out, CMSlicedDocumentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSlicedDocumentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSlicedDocumentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSlicedDocumentRequest
  * @throws IOException if the JSON string is invalid with respect to CMSlicedDocumentRequest
  */
  public static CMSlicedDocumentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSlicedDocumentRequest.class);
  }

 /**
  * Convert an instance of CMSlicedDocumentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

