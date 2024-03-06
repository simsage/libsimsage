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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.AssetACL;

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
 * the asset that was seen
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class Asset {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PARENT_URL = "parentUrl";
  @SerializedName(SERIALIZED_NAME_PARENT_URL)
  private String parentUrl;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_ACLS = "acls";
  @SerializedName(SERIALIZED_NAME_ACLS)
  private List<AssetACL> acls = new ArrayList<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_BINARY_SIZE = "binarySize";
  @SerializedName(SERIALIZED_NAME_BINARY_SIZE)
  private Long binarySize;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private Long lastModified;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private byte[] data;

  public static final String SERIALIZED_NAME_PREVIEW_IMAGE = "previewImage";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE)
  private byte[] previewImage;

  public Asset() {
  }

  public Asset url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Asset parentUrl(String parentUrl) {
    
    this.parentUrl = parentUrl;
    return this;
  }

   /**
   * Get parentUrl
   * @return parentUrl
  **/
  @javax.annotation.Nonnull
  public String getParentUrl() {
    return parentUrl;
  }


  public void setParentUrl(String parentUrl) {
    this.parentUrl = parentUrl;
  }


  public Asset mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public Asset acls(List<AssetACL> acls) {
    
    this.acls = acls;
    return this;
  }

  public Asset addAclsItem(AssetACL aclsItem) {
    if (this.acls == null) {
      this.acls = new ArrayList<>();
    }
    this.acls.add(aclsItem);
    return this;
  }

   /**
   * Get acls
   * @return acls
  **/
  @javax.annotation.Nonnull
  public List<AssetACL> getAcls() {
    return acls;
  }


  public void setAcls(List<AssetACL> acls) {
    this.acls = acls;
  }


  public Asset title(String title) {
    
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


  public Asset author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public Asset binarySize(Long binarySize) {
    
    this.binarySize = binarySize;
    return this;
  }

   /**
   * Get binarySize
   * @return binarySize
  **/
  @javax.annotation.Nonnull
  public Long getBinarySize() {
    return binarySize;
  }


  public void setBinarySize(Long binarySize) {
    this.binarySize = binarySize;
  }


  public Asset template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nonnull
  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public Asset created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public Asset lastModified(Long lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nonnull
  public Long getLastModified() {
    return lastModified;
  }


  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }


  public Asset metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Asset putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public Asset data(byte[] data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public byte[] getData() {
    return data;
  }


  public void setData(byte[] data) {
    this.data = data;
  }


  public Asset previewImage(byte[] previewImage) {
    
    this.previewImage = previewImage;
    return this;
  }

   /**
   * Get previewImage
   * @return previewImage
  **/
  @javax.annotation.Nullable
  public byte[] getPreviewImage() {
    return previewImage;
  }


  public void setPreviewImage(byte[] previewImage) {
    this.previewImage = previewImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.url, asset.url) &&
        Objects.equals(this.parentUrl, asset.parentUrl) &&
        Objects.equals(this.mimeType, asset.mimeType) &&
        Objects.equals(this.acls, asset.acls) &&
        Objects.equals(this.title, asset.title) &&
        Objects.equals(this.author, asset.author) &&
        Objects.equals(this.binarySize, asset.binarySize) &&
        Objects.equals(this.template, asset.template) &&
        Objects.equals(this.created, asset.created) &&
        Objects.equals(this.lastModified, asset.lastModified) &&
        Objects.equals(this.metadata, asset.metadata) &&
        Arrays.equals(this.data, asset.data) &&
        Arrays.equals(this.previewImage, asset.previewImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, parentUrl, mimeType, acls, title, author, binarySize, template, created, lastModified, metadata, Arrays.hashCode(data), Arrays.hashCode(previewImage));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parentUrl: ").append(toIndentedString(parentUrl)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    binarySize: ").append(toIndentedString(binarySize)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("parentUrl");
    openapiFields.add("mimeType");
    openapiFields.add("acls");
    openapiFields.add("title");
    openapiFields.add("author");
    openapiFields.add("binarySize");
    openapiFields.add("template");
    openapiFields.add("created");
    openapiFields.add("lastModified");
    openapiFields.add("metadata");
    openapiFields.add("data");
    openapiFields.add("previewImage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("parentUrl");
    openapiRequiredFields.add("mimeType");
    openapiRequiredFields.add("acls");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("binarySize");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("lastModified");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Asset
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Asset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Asset is not found in the empty JSON string", Asset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Asset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Asset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Asset.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("parentUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentUrl").toString()));
      }
      if (!jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("acls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acls` to be an array in the JSON string but got `%s`", jsonObj.get("acls").toString()));
      }

      JsonArray jsonArrayacls = jsonObj.getAsJsonArray("acls");
      // validate the required field `acls` (array)
      for (int i = 0; i < jsonArrayacls.size(); i++) {
        AssetACL.validateJsonElement(jsonArrayacls.get(i));
      };
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if (!jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Asset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Asset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Asset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Asset.class));

       return (TypeAdapter<T>) new TypeAdapter<Asset>() {
           @Override
           public void write(JsonWriter out, Asset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Asset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Asset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Asset
  * @throws IOException if the JSON string is invalid with respect to Asset
  */
  public static Asset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Asset.class);
  }

 /**
  * Convert an instance of Asset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

