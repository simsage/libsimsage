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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ContextItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class ContextItem {
  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_NAME_VALUE = "nameValue";
  @SerializedName(SERIALIZED_NAME_NAME_VALUE)
  private Map<String, String> nameValue = new HashMap<>();

  public static final String SERIALIZED_NAME_SYN_SET_LEMMA = "synSetLemma";
  @SerializedName(SERIALIZED_NAME_SYN_SET_LEMMA)
  private String synSetLemma;

  public static final String SERIALIZED_NAME_SYN_SET_CLOUD = "synSetCloud";
  @SerializedName(SERIALIZED_NAME_SYN_SET_CLOUD)
  private List<String> synSetCloud = new ArrayList<>();

  public ContextItem() {
  }

  public ContextItem kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * Get kbId
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public ContextItem created(Long created) {
    
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


  public ContextItem nameValue(Map<String, String> nameValue) {
    
    this.nameValue = nameValue;
    return this;
  }

  public ContextItem putNameValueItem(String key, String nameValueItem) {
    if (this.nameValue == null) {
      this.nameValue = new HashMap<>();
    }
    this.nameValue.put(key, nameValueItem);
    return this;
  }

   /**
   * Get nameValue
   * @return nameValue
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getNameValue() {
    return nameValue;
  }


  public void setNameValue(Map<String, String> nameValue) {
    this.nameValue = nameValue;
  }


  public ContextItem synSetLemma(String synSetLemma) {
    
    this.synSetLemma = synSetLemma;
    return this;
  }

   /**
   * Get synSetLemma
   * @return synSetLemma
  **/
  @javax.annotation.Nonnull
  public String getSynSetLemma() {
    return synSetLemma;
  }


  public void setSynSetLemma(String synSetLemma) {
    this.synSetLemma = synSetLemma;
  }


  public ContextItem synSetCloud(List<String> synSetCloud) {
    
    this.synSetCloud = synSetCloud;
    return this;
  }

  public ContextItem addSynSetCloudItem(String synSetCloudItem) {
    if (this.synSetCloud == null) {
      this.synSetCloud = new ArrayList<>();
    }
    this.synSetCloud.add(synSetCloudItem);
    return this;
  }

   /**
   * Get synSetCloud
   * @return synSetCloud
  **/
  @javax.annotation.Nonnull
  public List<String> getSynSetCloud() {
    return synSetCloud;
  }


  public void setSynSetCloud(List<String> synSetCloud) {
    this.synSetCloud = synSetCloud;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextItem contextItem = (ContextItem) o;
    return Objects.equals(this.kbId, contextItem.kbId) &&
        Objects.equals(this.created, contextItem.created) &&
        Objects.equals(this.nameValue, contextItem.nameValue) &&
        Objects.equals(this.synSetLemma, contextItem.synSetLemma) &&
        Objects.equals(this.synSetCloud, contextItem.synSetCloud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kbId, created, nameValue, synSetLemma, synSetCloud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextItem {\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    nameValue: ").append(toIndentedString(nameValue)).append("\n");
    sb.append("    synSetLemma: ").append(toIndentedString(synSetLemma)).append("\n");
    sb.append("    synSetCloud: ").append(toIndentedString(synSetCloud)).append("\n");
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
    openapiFields.add("kbId");
    openapiFields.add("created");
    openapiFields.add("nameValue");
    openapiFields.add("synSetLemma");
    openapiFields.add("synSetCloud");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("nameValue");
    openapiRequiredFields.add("synSetLemma");
    openapiRequiredFields.add("synSetCloud");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ContextItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContextItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContextItem is not found in the empty JSON string", ContextItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContextItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContextItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContextItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("synSetLemma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `synSetLemma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("synSetLemma").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("synSetCloud") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("synSetCloud").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `synSetCloud` to be an array in the JSON string but got `%s`", jsonObj.get("synSetCloud").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContextItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContextItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContextItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContextItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ContextItem>() {
           @Override
           public void write(JsonWriter out, ContextItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContextItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContextItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContextItem
  * @throws IOException if the JSON string is invalid with respect to ContextItem
  */
  public static ContextItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContextItem.class);
  }

 /**
  * Convert an instance of ContextItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

