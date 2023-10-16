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
 * A document that related to this document in some fashion (parent or child)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMDocumentRelationship {
  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public static final String SERIALIZED_NAME_IS_CHILD = "isChild";
  @SerializedName(SERIALIZED_NAME_IS_CHILD)
  private Boolean isChild;

  public static final String SERIALIZED_NAME_RELATED_URL_ID = "relatedUrlId";
  @SerializedName(SERIALIZED_NAME_RELATED_URL_ID)
  private Integer relatedUrlId;

  public static final String SERIALIZED_NAME_RELATED_URL = "relatedUrl";
  @SerializedName(SERIALIZED_NAME_RELATED_URL)
  private String relatedUrl;

  public static final String SERIALIZED_NAME_WEB_URL = "webUrl";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BINARY_SIZE = "binarySize";
  @SerializedName(SERIALIZED_NAME_BINARY_SIZE)
  private Long binarySize;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private Long lastModified;

  public static final String SERIALIZED_NAME_CHILD = "child";
  @SerializedName(SERIALIZED_NAME_CHILD)
  private Boolean child;

  public CMDocumentRelationship() {
  }

  public CMDocumentRelationship urlId(Integer urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * the url-id of this document
   * @return urlId
  **/
  @javax.annotation.Nonnull
  public Integer getUrlId() {
    return urlId;
  }


  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }


  public CMDocumentRelationship isChild(Boolean isChild) {
    
    this.isChild = isChild;
    return this;
  }

   /**
   * if true, this is a child relationship, otherwise a parent relationship
   * @return isChild
  **/
  @javax.annotation.Nonnull
  public Boolean getIsChild() {
    return isChild;
  }


  public void setIsChild(Boolean isChild) {
    this.isChild = isChild;
  }


  public CMDocumentRelationship relatedUrlId(Integer relatedUrlId) {
    
    this.relatedUrlId = relatedUrlId;
    return this;
  }

   /**
   * the related document&#39;s id
   * @return relatedUrlId
  **/
  @javax.annotation.Nonnull
  public Integer getRelatedUrlId() {
    return relatedUrlId;
  }


  public void setRelatedUrlId(Integer relatedUrlId) {
    this.relatedUrlId = relatedUrlId;
  }


  public CMDocumentRelationship relatedUrl(String relatedUrl) {
    
    this.relatedUrl = relatedUrl;
    return this;
  }

   /**
   * the url of the related document
   * @return relatedUrl
  **/
  @javax.annotation.Nonnull
  public String getRelatedUrl() {
    return relatedUrl;
  }


  public void setRelatedUrl(String relatedUrl) {
    this.relatedUrl = relatedUrl;
  }


  public CMDocumentRelationship webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * the web-url (if set) if there is a web-link for this document
   * @return webUrl
  **/
  @javax.annotation.Nonnull
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public CMDocumentRelationship title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * the title of the related document for display
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CMDocumentRelationship binarySize(Long binarySize) {
    
    this.binarySize = binarySize;
    return this;
  }

   /**
   * size in bytes of the related document
   * @return binarySize
  **/
  @javax.annotation.Nonnull
  public Long getBinarySize() {
    return binarySize;
  }


  public void setBinarySize(Long binarySize) {
    this.binarySize = binarySize;
  }


  public CMDocumentRelationship documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * the type of the related document
   * @return documentType
  **/
  @javax.annotation.Nonnull
  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public CMDocumentRelationship created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * The unix creation date-time of the related item
   * @return created
  **/
  @javax.annotation.Nonnull
  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public CMDocumentRelationship lastModified(Long lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The unix last-modified date-time of the related item
   * @return lastModified
  **/
  @javax.annotation.Nonnull
  public Long getLastModified() {
    return lastModified;
  }


  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }


  public CMDocumentRelationship child(Boolean child) {
    
    this.child = child;
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @javax.annotation.Nullable
  public Boolean getChild() {
    return child;
  }


  public void setChild(Boolean child) {
    this.child = child;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDocumentRelationship cmDocumentRelationship = (CMDocumentRelationship) o;
    return Objects.equals(this.urlId, cmDocumentRelationship.urlId) &&
        Objects.equals(this.isChild, cmDocumentRelationship.isChild) &&
        Objects.equals(this.relatedUrlId, cmDocumentRelationship.relatedUrlId) &&
        Objects.equals(this.relatedUrl, cmDocumentRelationship.relatedUrl) &&
        Objects.equals(this.webUrl, cmDocumentRelationship.webUrl) &&
        Objects.equals(this.title, cmDocumentRelationship.title) &&
        Objects.equals(this.binarySize, cmDocumentRelationship.binarySize) &&
        Objects.equals(this.documentType, cmDocumentRelationship.documentType) &&
        Objects.equals(this.created, cmDocumentRelationship.created) &&
        Objects.equals(this.lastModified, cmDocumentRelationship.lastModified) &&
        Objects.equals(this.child, cmDocumentRelationship.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlId, isChild, relatedUrlId, relatedUrl, webUrl, title, binarySize, documentType, created, lastModified, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDocumentRelationship {\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    isChild: ").append(toIndentedString(isChild)).append("\n");
    sb.append("    relatedUrlId: ").append(toIndentedString(relatedUrlId)).append("\n");
    sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    binarySize: ").append(toIndentedString(binarySize)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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
    openapiFields.add("urlId");
    openapiFields.add("isChild");
    openapiFields.add("relatedUrlId");
    openapiFields.add("relatedUrl");
    openapiFields.add("webUrl");
    openapiFields.add("title");
    openapiFields.add("binarySize");
    openapiFields.add("documentType");
    openapiFields.add("created");
    openapiFields.add("lastModified");
    openapiFields.add("child");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("isChild");
    openapiRequiredFields.add("relatedUrlId");
    openapiRequiredFields.add("relatedUrl");
    openapiRequiredFields.add("webUrl");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("binarySize");
    openapiRequiredFields.add("documentType");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("lastModified");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDocumentRelationship
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDocumentRelationship.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDocumentRelationship is not found in the empty JSON string", CMDocumentRelationship.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDocumentRelationship.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDocumentRelationship` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDocumentRelationship.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("relatedUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relatedUrl").toString()));
      }
      if (!jsonObj.get("webUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webUrl").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDocumentRelationship.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDocumentRelationship' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDocumentRelationship> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDocumentRelationship.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDocumentRelationship>() {
           @Override
           public void write(JsonWriter out, CMDocumentRelationship value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDocumentRelationship read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDocumentRelationship given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDocumentRelationship
  * @throws IOException if the JSON string is invalid with respect to CMDocumentRelationship
  */
  public static CMDocumentRelationship fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDocumentRelationship.class);
  }

 /**
  * Convert an instance of CMDocumentRelationship to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

