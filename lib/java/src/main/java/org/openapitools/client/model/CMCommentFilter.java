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
 * CMCommentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMCommentFilter {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_SLICE_ID = "sliceId";
  @SerializedName(SERIALIZED_NAME_SLICE_ID)
  private String sliceId;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_COMMENT_LEVEL = "commentLevel";
  @SerializedName(SERIALIZED_NAME_COMMENT_LEVEL)
  private String commentLevel;

  public CMCommentFilter() {
  }

  public CMCommentFilter organisationId(String organisationId) {
    
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


  public CMCommentFilter projectId(String projectId) {
    
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


  public CMCommentFilter sliceId(String sliceId) {
    
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


  public CMCommentFilter documentKey(String documentKey) {
    
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


  public CMCommentFilter commentLevel(String commentLevel) {
    
    this.commentLevel = commentLevel;
    return this;
  }

   /**
   * Get commentLevel
   * @return commentLevel
  **/
  @javax.annotation.Nonnull
  public String getCommentLevel() {
    return commentLevel;
  }


  public void setCommentLevel(String commentLevel) {
    this.commentLevel = commentLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMCommentFilter cmCommentFilter = (CMCommentFilter) o;
    return Objects.equals(this.organisationId, cmCommentFilter.organisationId) &&
        Objects.equals(this.projectId, cmCommentFilter.projectId) &&
        Objects.equals(this.sliceId, cmCommentFilter.sliceId) &&
        Objects.equals(this.documentKey, cmCommentFilter.documentKey) &&
        Objects.equals(this.commentLevel, cmCommentFilter.commentLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, projectId, sliceId, documentKey, commentLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMCommentFilter {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    commentLevel: ").append(toIndentedString(commentLevel)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("sliceId");
    openapiFields.add("documentKey");
    openapiFields.add("commentLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("commentLevel");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMCommentFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMCommentFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMCommentFilter is not found in the empty JSON string", CMCommentFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMCommentFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMCommentFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMCommentFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("sliceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sliceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sliceId").toString()));
      }
      if (!jsonObj.get("documentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentKey").toString()));
      }
      if (!jsonObj.get("commentLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentLevel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMCommentFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMCommentFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMCommentFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMCommentFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CMCommentFilter>() {
           @Override
           public void write(JsonWriter out, CMCommentFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMCommentFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMCommentFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMCommentFilter
  * @throws IOException if the JSON string is invalid with respect to CMCommentFilter
  */
  public static CMCommentFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMCommentFilter.class);
  }

 /**
  * Convert an instance of CMCommentFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

