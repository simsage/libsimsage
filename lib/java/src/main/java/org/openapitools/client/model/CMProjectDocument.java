/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
 * CMProjectDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMProjectDocument {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Integer confidence;

  public static final String SERIALIZED_NAME_DISPLAY_TYPE = "displayType";
  @SerializedName(SERIALIZED_NAME_DISPLAY_TYPE)
  private String displayType;

  public CMProjectDocument() {
  }

  public CMProjectDocument projectId(String projectId) {
    
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


  public CMProjectDocument source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public CMProjectDocument extension(String extension) {
    
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @javax.annotation.Nonnull
  public String getExtension() {
    return extension;
  }


  public void setExtension(String extension) {
    this.extension = extension;
  }


  public CMProjectDocument documentKey(String documentKey) {
    
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


  public CMProjectDocument title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CMProjectDocument size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public CMProjectDocument folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nonnull
  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public CMProjectDocument count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public CMProjectDocument confidence(Integer confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nonnull
  public Integer getConfidence() {
    return confidence;
  }


  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  public CMProjectDocument displayType(String displayType) {
    
    this.displayType = displayType;
    return this;
  }

   /**
   * Get displayType
   * @return displayType
  **/
  @javax.annotation.Nonnull
  public String getDisplayType() {
    return displayType;
  }


  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMProjectDocument cmProjectDocument = (CMProjectDocument) o;
    return Objects.equals(this.projectId, cmProjectDocument.projectId) &&
        Objects.equals(this.source, cmProjectDocument.source) &&
        Objects.equals(this.extension, cmProjectDocument.extension) &&
        Objects.equals(this.documentKey, cmProjectDocument.documentKey) &&
        Objects.equals(this.title, cmProjectDocument.title) &&
        Objects.equals(this.size, cmProjectDocument.size) &&
        Objects.equals(this.folderId, cmProjectDocument.folderId) &&
        Objects.equals(this.count, cmProjectDocument.count) &&
        Objects.equals(this.confidence, cmProjectDocument.confidence) &&
        Objects.equals(this.displayType, cmProjectDocument.displayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, source, extension, documentKey, title, size, folderId, count, confidence, displayType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMProjectDocument {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("source");
    openapiFields.add("extension");
    openapiFields.add("documentKey");
    openapiFields.add("title");
    openapiFields.add("size");
    openapiFields.add("folderId");
    openapiFields.add("count");
    openapiFields.add("confidence");
    openapiFields.add("displayType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("extension");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("folderId");
    openapiRequiredFields.add("count");
    openapiRequiredFields.add("confidence");
    openapiRequiredFields.add("displayType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMProjectDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMProjectDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMProjectDocument is not found in the empty JSON string", CMProjectDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMProjectDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMProjectDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMProjectDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (!jsonObj.get("documentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentKey").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("folderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderId").toString()));
      }
      if (!jsonObj.get("displayType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMProjectDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMProjectDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMProjectDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMProjectDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CMProjectDocument>() {
           @Override
           public void write(JsonWriter out, CMProjectDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMProjectDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMProjectDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMProjectDocument
  * @throws IOException if the JSON string is invalid with respect to CMProjectDocument
  */
  public static CMProjectDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMProjectDocument.class);
  }

 /**
  * Convert an instance of CMProjectDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

