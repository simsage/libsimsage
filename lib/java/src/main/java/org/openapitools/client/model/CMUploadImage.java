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
 * An external image representation object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMUploadImage {
  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_PUID = "puid";
  @SerializedName(SERIALIZED_NAME_PUID)
  private String puid;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_ENCRYPTED = "encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public CMUploadImage() {
  }

  public CMUploadImage objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * the type of this class, just in case this object is encrypted
   * @return objectType
  **/
  @javax.annotation.Nonnull
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public CMUploadImage organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id) this image should go into.
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMUploadImage kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base (its guid id) this image should go into.
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMUploadImage sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
   * @return sid
  **/
  @javax.annotation.Nonnull
  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public CMUploadImage sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id of this crawler (ie. the crawler&#39;s id) this image came from.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMUploadImage url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMUploadImage mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime-type of this image, must be either image/jpeg or image/png.
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public CMUploadImage puid(String puid) {
    
    this.puid = puid;
    return this;
  }

   /**
   * The Pronom Unique ID for this image.
   * @return puid
  **/
  @javax.annotation.Nonnull
  public String getPuid() {
    return puid;
  }


  public void setPuid(String puid) {
    this.puid = puid;
  }


  public CMUploadImage data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;.
   * @return data
  **/
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public CMUploadImage encrypted(Boolean encrypted) {
    
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Do we need to add transport encryption
   * @return encrypted
  **/
  @javax.annotation.Nonnull
  public Boolean getEncrypted() {
    return encrypted;
  }


  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }


  public CMUploadImage seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * The seed used if encrypted
   * @return seed
  **/
  @javax.annotation.Nonnull
  public Integer getSeed() {
    return seed;
  }


  public void setSeed(Integer seed) {
    this.seed = seed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUploadImage cmUploadImage = (CMUploadImage) o;
    return Objects.equals(this.objectType, cmUploadImage.objectType) &&
        Objects.equals(this.organisationId, cmUploadImage.organisationId) &&
        Objects.equals(this.kbId, cmUploadImage.kbId) &&
        Objects.equals(this.sid, cmUploadImage.sid) &&
        Objects.equals(this.sourceId, cmUploadImage.sourceId) &&
        Objects.equals(this.url, cmUploadImage.url) &&
        Objects.equals(this.mimeType, cmUploadImage.mimeType) &&
        Objects.equals(this.puid, cmUploadImage.puid) &&
        Objects.equals(this.data, cmUploadImage.data) &&
        Objects.equals(this.encrypted, cmUploadImage.encrypted) &&
        Objects.equals(this.seed, cmUploadImage.seed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, organisationId, kbId, sid, sourceId, url, mimeType, puid, data, encrypted, seed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUploadImage {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    puid: ").append(toIndentedString(puid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
    openapiFields.add("objectType");
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("sid");
    openapiFields.add("sourceId");
    openapiFields.add("url");
    openapiFields.add("mimeType");
    openapiFields.add("puid");
    openapiFields.add("data");
    openapiFields.add("encrypted");
    openapiFields.add("seed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objectType");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sid");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("mimeType");
    openapiRequiredFields.add("puid");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("encrypted");
    openapiRequiredFields.add("seed");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUploadImage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUploadImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUploadImage is not found in the empty JSON string", CMUploadImage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUploadImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUploadImage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUploadImage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if (!jsonObj.get("puid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `puid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("puid").toString()));
      }
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMUploadImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUploadImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUploadImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUploadImage.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUploadImage>() {
           @Override
           public void write(JsonWriter out, CMUploadImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUploadImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUploadImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUploadImage
  * @throws IOException if the JSON string is invalid with respect to CMUploadImage
  */
  public static CMUploadImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUploadImage.class);
  }

 /**
  * Convert an instance of CMUploadImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

