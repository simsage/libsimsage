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
 * CMReassignSliceDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMReassignSliceDocument {
  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_NEW_USER_ID = "newUserId";
  @SerializedName(SERIALIZED_NAME_NEW_USER_ID)
  private String newUserId;

  public static final String SERIALIZED_NAME_NEW_SLICE_ID = "newSliceId";
  @SerializedName(SERIALIZED_NAME_NEW_SLICE_ID)
  private String newSliceId;

  public CMReassignSliceDocument() {
  }

  public CMReassignSliceDocument taskId(String taskId) {
    
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


  public CMReassignSliceDocument organisationId(String organisationId) {
    
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


  public CMReassignSliceDocument documentKey(String documentKey) {
    
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @javax.annotation.Nonnull
  public String getDocumentKey() {
    return documentKey;
  }


  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }


  public CMReassignSliceDocument newUserId(String newUserId) {
    
    this.newUserId = newUserId;
    return this;
  }

   /**
   * Get newUserId
   * @return newUserId
  **/
  @javax.annotation.Nonnull
  public String getNewUserId() {
    return newUserId;
  }


  public void setNewUserId(String newUserId) {
    this.newUserId = newUserId;
  }


  public CMReassignSliceDocument newSliceId(String newSliceId) {
    
    this.newSliceId = newSliceId;
    return this;
  }

   /**
   * Get newSliceId
   * @return newSliceId
  **/
  @javax.annotation.Nonnull
  public String getNewSliceId() {
    return newSliceId;
  }


  public void setNewSliceId(String newSliceId) {
    this.newSliceId = newSliceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMReassignSliceDocument cmReassignSliceDocument = (CMReassignSliceDocument) o;
    return Objects.equals(this.taskId, cmReassignSliceDocument.taskId) &&
        Objects.equals(this.organisationId, cmReassignSliceDocument.organisationId) &&
        Objects.equals(this.documentKey, cmReassignSliceDocument.documentKey) &&
        Objects.equals(this.newUserId, cmReassignSliceDocument.newUserId) &&
        Objects.equals(this.newSliceId, cmReassignSliceDocument.newSliceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, organisationId, documentKey, newUserId, newSliceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMReassignSliceDocument {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    newUserId: ").append(toIndentedString(newUserId)).append("\n");
    sb.append("    newSliceId: ").append(toIndentedString(newSliceId)).append("\n");
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
    openapiFields.add("taskId");
    openapiFields.add("organisationId");
    openapiFields.add("documentKey");
    openapiFields.add("newUserId");
    openapiFields.add("newSliceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("taskId");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("newUserId");
    openapiRequiredFields.add("newSliceId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMReassignSliceDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMReassignSliceDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMReassignSliceDocument is not found in the empty JSON string", CMReassignSliceDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMReassignSliceDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMReassignSliceDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMReassignSliceDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("taskId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taskId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taskId").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("documentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentKey").toString()));
      }
      if (!jsonObj.get("newUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newUserId").toString()));
      }
      if (!jsonObj.get("newSliceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newSliceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newSliceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMReassignSliceDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMReassignSliceDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMReassignSliceDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMReassignSliceDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CMReassignSliceDocument>() {
           @Override
           public void write(JsonWriter out, CMReassignSliceDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMReassignSliceDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMReassignSliceDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMReassignSliceDocument
  * @throws IOException if the JSON string is invalid with respect to CMReassignSliceDocument
  */
  public static CMReassignSliceDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMReassignSliceDocument.class);
  }

 /**
  * Convert an instance of CMReassignSliceDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

