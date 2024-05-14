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
import org.openapitools.client.model.CMSearchResultSummary;
import org.openapitools.client.model.CMTaskInfo;

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
 * CMSearchResultSummaryTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSearchResultSummaryTask {
  public static final String SERIALIZED_NAME_TASK_INFO = "taskInfo";
  @SerializedName(SERIALIZED_NAME_TASK_INFO)
  private CMTaskInfo taskInfo;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private CMSearchResultSummary detail;

  public CMSearchResultSummaryTask() {
  }

  public CMSearchResultSummaryTask taskInfo(CMTaskInfo taskInfo) {
    
    this.taskInfo = taskInfo;
    return this;
  }

   /**
   * Get taskInfo
   * @return taskInfo
  **/
  @javax.annotation.Nonnull
  public CMTaskInfo getTaskInfo() {
    return taskInfo;
  }


  public void setTaskInfo(CMTaskInfo taskInfo) {
    this.taskInfo = taskInfo;
  }


  public CMSearchResultSummaryTask detail(CMSearchResultSummary detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nonnull
  public CMSearchResultSummary getDetail() {
    return detail;
  }


  public void setDetail(CMSearchResultSummary detail) {
    this.detail = detail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSearchResultSummaryTask cmSearchResultSummaryTask = (CMSearchResultSummaryTask) o;
    return Objects.equals(this.taskInfo, cmSearchResultSummaryTask.taskInfo) &&
        Objects.equals(this.detail, cmSearchResultSummaryTask.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskInfo, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSearchResultSummaryTask {\n");
    sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("taskInfo");
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taskInfo");
    openapiRequiredFields.add("detail");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSearchResultSummaryTask
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSearchResultSummaryTask.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSearchResultSummaryTask is not found in the empty JSON string", CMSearchResultSummaryTask.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSearchResultSummaryTask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSearchResultSummaryTask` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSearchResultSummaryTask.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `taskInfo`
      CMTaskInfo.validateJsonElement(jsonObj.get("taskInfo"));
      // validate the required field `detail`
      CMSearchResultSummary.validateJsonElement(jsonObj.get("detail"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSearchResultSummaryTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSearchResultSummaryTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSearchResultSummaryTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSearchResultSummaryTask.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSearchResultSummaryTask>() {
           @Override
           public void write(JsonWriter out, CMSearchResultSummaryTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSearchResultSummaryTask read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSearchResultSummaryTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSearchResultSummaryTask
  * @throws IOException if the JSON string is invalid with respect to CMSearchResultSummaryTask
  */
  public static CMSearchResultSummaryTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSearchResultSummaryTask.class);
  }

 /**
  * Convert an instance of CMSearchResultSummaryTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

