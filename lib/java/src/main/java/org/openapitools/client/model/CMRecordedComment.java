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
import java.time.OffsetDateTime;
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
 * CMRecordedComment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMRecordedComment {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

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

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_IS_AUDIT_EVENT = "isAuditEvent";
  @SerializedName(SERIALIZED_NAME_IS_AUDIT_EVENT)
  private Boolean isAuditEvent;

  public CMRecordedComment() {
  }

  public CMRecordedComment created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CMRecordedComment projectId(String projectId) {
    
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


  public CMRecordedComment sliceId(String sliceId) {
    
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


  public CMRecordedComment documentKey(String documentKey) {
    
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


  public CMRecordedComment commentLevel(String commentLevel) {
    
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


  public CMRecordedComment comment(String comment) {
    
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


  public CMRecordedComment user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public CMRecordedComment isAuditEvent(Boolean isAuditEvent) {
    
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
    CMRecordedComment cmRecordedComment = (CMRecordedComment) o;
    return Objects.equals(this.created, cmRecordedComment.created) &&
        Objects.equals(this.projectId, cmRecordedComment.projectId) &&
        Objects.equals(this.sliceId, cmRecordedComment.sliceId) &&
        Objects.equals(this.documentKey, cmRecordedComment.documentKey) &&
        Objects.equals(this.commentLevel, cmRecordedComment.commentLevel) &&
        Objects.equals(this.comment, cmRecordedComment.comment) &&
        Objects.equals(this.user, cmRecordedComment.user) &&
        Objects.equals(this.isAuditEvent, cmRecordedComment.isAuditEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, projectId, sliceId, documentKey, commentLevel, comment, user, isAuditEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMRecordedComment {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    commentLevel: ").append(toIndentedString(commentLevel)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("projectId");
    openapiFields.add("sliceId");
    openapiFields.add("documentKey");
    openapiFields.add("commentLevel");
    openapiFields.add("comment");
    openapiFields.add("user");
    openapiFields.add("isAuditEvent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("commentLevel");
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("isAuditEvent");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMRecordedComment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMRecordedComment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMRecordedComment is not found in the empty JSON string", CMRecordedComment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMRecordedComment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMRecordedComment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMRecordedComment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (!jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMRecordedComment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMRecordedComment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMRecordedComment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMRecordedComment.class));

       return (TypeAdapter<T>) new TypeAdapter<CMRecordedComment>() {
           @Override
           public void write(JsonWriter out, CMRecordedComment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMRecordedComment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMRecordedComment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMRecordedComment
  * @throws IOException if the JSON string is invalid with respect to CMRecordedComment
  */
  public static CMRecordedComment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMRecordedComment.class);
  }

 /**
  * Convert an instance of CMRecordedComment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

