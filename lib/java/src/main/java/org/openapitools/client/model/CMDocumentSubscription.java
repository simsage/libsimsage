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
 * the document subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMDocumentSubscription {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_FOLDER = "isFolder";
  @SerializedName(SERIALIZED_NAME_IS_FOLDER)
  private Boolean isFolder;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private Boolean folder;

  public CMDocumentSubscription() {
  }

  public CMDocumentSubscription organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the main organisation (its guid id) for this source/crawler
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMDocumentSubscription kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id of this context item, a guid-string
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMDocumentSubscription userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * the user&#39;s id, a guid
   * @return userId
  **/
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CMDocumentSubscription sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id of the owner of the url
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMDocumentSubscription parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * The parent of a folder or a file (a guid or an empty string for a top-level folder)
   * @return parentId
  **/
  @javax.annotation.Nonnull
  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public CMDocumentSubscription objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Either a file or a folder ID
   * @return objectId
  **/
  @javax.annotation.Nonnull
  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public CMDocumentSubscription url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The unique URL of a document.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMDocumentSubscription urlId(Integer urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * the internal SimSage id for this url
   * @return urlId
  **/
  @javax.annotation.Nonnull
  public Integer getUrlId() {
    return urlId;
  }


  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }


  public CMDocumentSubscription name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the folder or file
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CMDocumentSubscription isFolder(Boolean isFolder) {
    
    this.isFolder = isFolder;
    return this;
  }

   /**
   * is this a subscription to a folder or a file?
   * @return isFolder
  **/
  @javax.annotation.Nonnull
  public Boolean getIsFolder() {
    return isFolder;
  }


  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }


  public CMDocumentSubscription folder(Boolean folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  public Boolean getFolder() {
    return folder;
  }


  public void setFolder(Boolean folder) {
    this.folder = folder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDocumentSubscription cmDocumentSubscription = (CMDocumentSubscription) o;
    return Objects.equals(this.organisationId, cmDocumentSubscription.organisationId) &&
        Objects.equals(this.kbId, cmDocumentSubscription.kbId) &&
        Objects.equals(this.userId, cmDocumentSubscription.userId) &&
        Objects.equals(this.sourceId, cmDocumentSubscription.sourceId) &&
        Objects.equals(this.parentId, cmDocumentSubscription.parentId) &&
        Objects.equals(this.objectId, cmDocumentSubscription.objectId) &&
        Objects.equals(this.url, cmDocumentSubscription.url) &&
        Objects.equals(this.urlId, cmDocumentSubscription.urlId) &&
        Objects.equals(this.name, cmDocumentSubscription.name) &&
        Objects.equals(this.isFolder, cmDocumentSubscription.isFolder) &&
        Objects.equals(this.folder, cmDocumentSubscription.folder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, userId, sourceId, parentId, objectId, url, urlId, name, isFolder, folder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDocumentSubscription {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("sourceId");
    openapiFields.add("parentId");
    openapiFields.add("objectId");
    openapiFields.add("url");
    openapiFields.add("urlId");
    openapiFields.add("name");
    openapiFields.add("isFolder");
    openapiFields.add("folder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("parentId");
    openapiRequiredFields.add("objectId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("isFolder");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDocumentSubscription
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDocumentSubscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDocumentSubscription is not found in the empty JSON string", CMDocumentSubscription.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDocumentSubscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDocumentSubscription` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDocumentSubscription.openapiRequiredFields) {
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
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if (!jsonObj.get("objectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectId").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDocumentSubscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDocumentSubscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDocumentSubscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDocumentSubscription.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDocumentSubscription>() {
           @Override
           public void write(JsonWriter out, CMDocumentSubscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDocumentSubscription read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDocumentSubscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDocumentSubscription
  * @throws IOException if the JSON string is invalid with respect to CMDocumentSubscription
  */
  public static CMDocumentSubscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDocumentSubscription.class);
  }

 /**
  * Convert an instance of CMDocumentSubscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

