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
 * Source base-info represents information needed by external UI systems interacting with SimSage.  This object has information pertaining to a source in SimSage.  Its name, id, what sort of a source it is, and what sort of security integration (if any) this source has.  This object is contained inside a CMKnowledgeBaseInfo object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSourceBaseInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_CUSTOM_RENDER = "customRender";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RENDER)
  private Boolean customRender;

  public CMSourceBaseInfo() {
  }

  public CMSourceBaseInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of this source
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CMSourceBaseInfo sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the id of this source
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMSourceBaseInfo sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * the type of this source
   * @return sourceType
  **/
  @javax.annotation.Nonnull
  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public CMSourceBaseInfo customRender(Boolean customRender) {
    
    this.customRender = customRender;
    return this;
  }

   /**
   * Does this source require custom render templates or use ordinary search-results?
   * @return customRender
  **/
  @javax.annotation.Nonnull
  public Boolean getCustomRender() {
    return customRender;
  }


  public void setCustomRender(Boolean customRender) {
    this.customRender = customRender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSourceBaseInfo cmSourceBaseInfo = (CMSourceBaseInfo) o;
    return Objects.equals(this.name, cmSourceBaseInfo.name) &&
        Objects.equals(this.sourceId, cmSourceBaseInfo.sourceId) &&
        Objects.equals(this.sourceType, cmSourceBaseInfo.sourceType) &&
        Objects.equals(this.customRender, cmSourceBaseInfo.customRender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sourceId, sourceType, customRender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSourceBaseInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    customRender: ").append(toIndentedString(customRender)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("sourceId");
    openapiFields.add("sourceType");
    openapiFields.add("customRender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("sourceType");
    openapiRequiredFields.add("customRender");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSourceBaseInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSourceBaseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSourceBaseInfo is not found in the empty JSON string", CMSourceBaseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSourceBaseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSourceBaseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSourceBaseInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("sourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSourceBaseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSourceBaseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSourceBaseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSourceBaseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSourceBaseInfo>() {
           @Override
           public void write(JsonWriter out, CMSourceBaseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSourceBaseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSourceBaseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSourceBaseInfo
  * @throws IOException if the JSON string is invalid with respect to CMSourceBaseInfo
  */
  public static CMSourceBaseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSourceBaseInfo.class);
  }

 /**
  * Convert an instance of CMSourceBaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

