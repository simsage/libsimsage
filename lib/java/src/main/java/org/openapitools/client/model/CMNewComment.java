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
 * CMNewComment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMNewComment {
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

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_IS_AUDIT_EVENT = "isAuditEvent";
  @SerializedName(SERIALIZED_NAME_IS_AUDIT_EVENT)
  private Boolean isAuditEvent;

  public CMNewComment() {
  }

  public CMNewComment organisationId(String organisationId) {
    
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


  public CMNewComment projectId(String projectId) {
    
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


  public CMNewComment sliceId(String sliceId) {
    
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


  public CMNewComment documentKey(String documentKey) {
    
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


  public CMNewComment commentLevel(String commentLevel) {
    
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


  public CMNewComment comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nonnull
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CMNewComment isAuditEvent(Boolean isAuditEvent) {
    
    this.isAuditEvent = isAuditEvent;
    return this;
  }

   /**
   * Get isAuditEvent
   * @return isAuditEvent
  **/
  @javax.annotation.Nonnull
  public Boolean getIsAuditEvent() {
    return isAuditEvent;
  }


  public void setIsAuditEvent(Boolean isAuditEvent) {
    this.isAuditEvent = isAuditEvent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMNewComment cmNewComment = (CMNewComment) o;
    return Objects.equals(this.organisationId, cmNewComment.organisationId) &&
        Objects.equals(this.projectId, cmNewComment.projectId) &&
        Objects.equals(this.sliceId, cmNewComment.sliceId) &&
        Objects.equals(this.documentKey, cmNewComment.documentKey) &&
        Objects.equals(this.commentLevel, cmNewComment.commentLevel) &&
        Objects.equals(this.comment, cmNewComment.comment) &&
        Objects.equals(this.isAuditEvent, cmNewComment.isAuditEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, projectId, sliceId, documentKey, commentLevel, comment, isAuditEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMNewComment {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    commentLevel: ").append(toIndentedString(commentLevel)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isAuditEvent: ").append(toIndentedString(isAuditEvent)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("isAuditEvent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("commentLevel");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("isAuditEvent");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMNewComment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMNewComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMNewComment is not found in the empty JSON string", CMNewComment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMNewComment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMNewComment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMNewComment.openapiRequiredFields) {
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
      if (!jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMNewComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMNewComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMNewComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMNewComment.class));

       return (TypeAdapter<T>) new TypeAdapter<CMNewComment>() {
           @Override
           public void write(JsonWriter out, CMNewComment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMNewComment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMNewComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMNewComment
  * @throws IOException if the JSON string is invalid with respect to CMNewComment
  */
  public static CMNewComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMNewComment.class);
  }

 /**
  * Convert an instance of CMNewComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

