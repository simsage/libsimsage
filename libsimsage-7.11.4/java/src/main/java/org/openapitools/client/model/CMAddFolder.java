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
 * the folder add object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMAddFolder {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_FOLDER_NAME = "folderName";
  @SerializedName(SERIALIZED_NAME_FOLDER_NAME)
  private String folderName;

  public static final String SERIALIZED_NAME_PREV_URL = "prevUrl";
  @SerializedName(SERIALIZED_NAME_PREV_URL)
  private String prevUrl;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public CMAddFolder() {
  }

  public CMAddFolder organisationId(String organisationId) {
    
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


  public CMAddFolder kbId(String kbId) {
    
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


  public CMAddFolder sourceId(Integer sourceId) {
    
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


  public CMAddFolder folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * the id of the folder.
   * @return folderId
  **/
  @javax.annotation.Nonnull
  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public CMAddFolder folderName(String folderName) {
    
    this.folderName = folderName;
    return this;
  }

   /**
   * the folder&#39;s new name.
   * @return folderName
  **/
  @javax.annotation.Nonnull
  public String getFolderName() {
    return folderName;
  }


  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }


  public CMAddFolder prevUrl(String prevUrl) {
    
    this.prevUrl = prevUrl;
    return this;
  }

   /**
   * pagination, the previous last URL for the page-set (null is first page)
   * @return prevUrl
  **/
  @javax.annotation.Nullable
  public String getPrevUrl() {
    return prevUrl;
  }


  public void setPrevUrl(String prevUrl) {
    this.prevUrl = prevUrl;
  }


  public CMAddFolder pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * page-size for a paginated set
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMAddFolder cmAddFolder = (CMAddFolder) o;
    return Objects.equals(this.organisationId, cmAddFolder.organisationId) &&
        Objects.equals(this.kbId, cmAddFolder.kbId) &&
        Objects.equals(this.sourceId, cmAddFolder.sourceId) &&
        Objects.equals(this.folderId, cmAddFolder.folderId) &&
        Objects.equals(this.folderName, cmAddFolder.folderName) &&
        Objects.equals(this.prevUrl, cmAddFolder.prevUrl) &&
        Objects.equals(this.pageSize, cmAddFolder.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, sourceId, folderId, folderName, prevUrl, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMAddFolder {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    prevUrl: ").append(toIndentedString(prevUrl)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("sourceId");
    openapiFields.add("folderId");
    openapiFields.add("folderName");
    openapiFields.add("prevUrl");
    openapiFields.add("pageSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("folderId");
    openapiRequiredFields.add("folderName");
    openapiRequiredFields.add("pageSize");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMAddFolder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMAddFolder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMAddFolder is not found in the empty JSON string", CMAddFolder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMAddFolder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMAddFolder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMAddFolder.openapiRequiredFields) {
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
      if (!jsonObj.get("folderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderId").toString()));
      }
      if (!jsonObj.get("folderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderName").toString()));
      }
      if ((jsonObj.get("prevUrl") != null && !jsonObj.get("prevUrl").isJsonNull()) && !jsonObj.get("prevUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMAddFolder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMAddFolder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMAddFolder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMAddFolder.class));

       return (TypeAdapter<T>) new TypeAdapter<CMAddFolder>() {
           @Override
           public void write(JsonWriter out, CMAddFolder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMAddFolder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMAddFolder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMAddFolder
  * @throws IOException if the JSON string is invalid with respect to CMAddFolder
  */
  public static CMAddFolder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMAddFolder.class);
  }

 /**
  * Convert an instance of CMAddFolder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

