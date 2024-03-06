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
 * CMDeleteProjectCmd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMDeleteProjectCmd {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private String returnAddress;

  public static final String SERIALIZED_NAME_ERROR_STR = "errorStr";
  @SerializedName(SERIALIZED_NAME_ERROR_STR)
  private String errorStr;

  public static final String SERIALIZED_NAME_TIME_OUT = "timeOut";
  @SerializedName(SERIALIZED_NAME_TIME_OUT)
  private Long timeOut;

  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_IS_RETURN_RESULT = "isReturnResult";
  @SerializedName(SERIALIZED_NAME_IS_RETURN_RESULT)
  private Boolean isReturnResult;

  public static final String SERIALIZED_NAME_RETURN_RESULT = "returnResult";
  @SerializedName(SERIALIZED_NAME_RETURN_RESULT)
  private Boolean returnResult;

  public CMDeleteProjectCmd() {
  }

  public CMDeleteProjectCmd organisationId(String organisationId) {
    
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


  public CMDeleteProjectCmd kbId(String kbId) {
    
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


  public CMDeleteProjectCmd projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public CMDeleteProjectCmd jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nonnull
  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public CMDeleteProjectCmd returnAddress(String returnAddress) {
    
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @javax.annotation.Nonnull
  public String getReturnAddress() {
    return returnAddress;
  }


  public void setReturnAddress(String returnAddress) {
    this.returnAddress = returnAddress;
  }


  public CMDeleteProjectCmd errorStr(String errorStr) {
    
    this.errorStr = errorStr;
    return this;
  }

   /**
   * Get errorStr
   * @return errorStr
  **/
  @javax.annotation.Nonnull
  public String getErrorStr() {
    return errorStr;
  }


  public void setErrorStr(String errorStr) {
    this.errorStr = errorStr;
  }


  public CMDeleteProjectCmd timeOut(Long timeOut) {
    
    this.timeOut = timeOut;
    return this;
  }

   /**
   * Get timeOut
   * @return timeOut
  **/
  @javax.annotation.Nonnull
  public Long getTimeOut() {
    return timeOut;
  }


  public void setTimeOut(Long timeOut) {
    this.timeOut = timeOut;
  }


  public CMDeleteProjectCmd async(Boolean async) {
    
    this.async = async;
    return this;
  }

   /**
   * Get async
   * @return async
  **/
  @javax.annotation.Nonnull
  public Boolean getAsync() {
    return async;
  }


  public void setAsync(Boolean async) {
    this.async = async;
  }


  public CMDeleteProjectCmd isReturnResult(Boolean isReturnResult) {
    
    this.isReturnResult = isReturnResult;
    return this;
  }

   /**
   * Get isReturnResult
   * @return isReturnResult
  **/
  @javax.annotation.Nonnull
  public Boolean getIsReturnResult() {
    return isReturnResult;
  }


  public void setIsReturnResult(Boolean isReturnResult) {
    this.isReturnResult = isReturnResult;
  }


  public CMDeleteProjectCmd returnResult(Boolean returnResult) {
    
    this.returnResult = returnResult;
    return this;
  }

   /**
   * Get returnResult
   * @return returnResult
  **/
  @javax.annotation.Nullable
  public Boolean getReturnResult() {
    return returnResult;
  }


  public void setReturnResult(Boolean returnResult) {
    this.returnResult = returnResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDeleteProjectCmd cmDeleteProjectCmd = (CMDeleteProjectCmd) o;
    return Objects.equals(this.organisationId, cmDeleteProjectCmd.organisationId) &&
        Objects.equals(this.kbId, cmDeleteProjectCmd.kbId) &&
        Objects.equals(this.projectId, cmDeleteProjectCmd.projectId) &&
        Objects.equals(this.jobId, cmDeleteProjectCmd.jobId) &&
        Objects.equals(this.returnAddress, cmDeleteProjectCmd.returnAddress) &&
        Objects.equals(this.errorStr, cmDeleteProjectCmd.errorStr) &&
        Objects.equals(this.timeOut, cmDeleteProjectCmd.timeOut) &&
        Objects.equals(this.async, cmDeleteProjectCmd.async) &&
        Objects.equals(this.isReturnResult, cmDeleteProjectCmd.isReturnResult) &&
        Objects.equals(this.returnResult, cmDeleteProjectCmd.returnResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, projectId, jobId, returnAddress, errorStr, timeOut, async, isReturnResult, returnResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDeleteProjectCmd {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    errorStr: ").append(toIndentedString(errorStr)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    isReturnResult: ").append(toIndentedString(isReturnResult)).append("\n");
    sb.append("    returnResult: ").append(toIndentedString(returnResult)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("jobId");
    openapiFields.add("returnAddress");
    openapiFields.add("errorStr");
    openapiFields.add("timeOut");
    openapiFields.add("async");
    openapiFields.add("isReturnResult");
    openapiFields.add("returnResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("jobId");
    openapiRequiredFields.add("returnAddress");
    openapiRequiredFields.add("errorStr");
    openapiRequiredFields.add("timeOut");
    openapiRequiredFields.add("async");
    openapiRequiredFields.add("isReturnResult");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDeleteProjectCmd
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDeleteProjectCmd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDeleteProjectCmd is not found in the empty JSON string", CMDeleteProjectCmd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDeleteProjectCmd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDeleteProjectCmd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDeleteProjectCmd.openapiRequiredFields) {
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
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if (!jsonObj.get("returnAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnAddress").toString()));
      }
      if (!jsonObj.get("errorStr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorStr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorStr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDeleteProjectCmd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDeleteProjectCmd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDeleteProjectCmd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDeleteProjectCmd.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDeleteProjectCmd>() {
           @Override
           public void write(JsonWriter out, CMDeleteProjectCmd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDeleteProjectCmd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDeleteProjectCmd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDeleteProjectCmd
  * @throws IOException if the JSON string is invalid with respect to CMDeleteProjectCmd
  */
  public static CMDeleteProjectCmd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDeleteProjectCmd.class);
  }

 /**
  * Convert an instance of CMDeleteProjectCmd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

