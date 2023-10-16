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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CMFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMFilter {
  public static final String SERIALIZED_NAME_KNOWLEDGE_BASE = "knowledgeBase";
  @SerializedName(SERIALIZED_NAME_KNOWLEDGE_BASE)
  private String knowledgeBase;

  public static final String SERIALIZED_NAME_FILETYPES = "filetypes";
  @SerializedName(SERIALIZED_NAME_FILETYPES)
  private List<String> filetypes;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<String> sources;

  public CMFilter() {
  }

  public CMFilter knowledgeBase(String knowledgeBase) {
    
    this.knowledgeBase = knowledgeBase;
    return this;
  }

   /**
   * Get knowledgeBase
   * @return knowledgeBase
  **/
  @javax.annotation.Nonnull
  public String getKnowledgeBase() {
    return knowledgeBase;
  }


  public void setKnowledgeBase(String knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  public CMFilter filetypes(List<String> filetypes) {
    
    this.filetypes = filetypes;
    return this;
  }

  public CMFilter addFiletypesItem(String filetypesItem) {
    if (this.filetypes == null) {
      this.filetypes = new ArrayList<>();
    }
    this.filetypes.add(filetypesItem);
    return this;
  }

   /**
   * Get filetypes
   * @return filetypes
  **/
  @javax.annotation.Nullable
  public List<String> getFiletypes() {
    return filetypes;
  }


  public void setFiletypes(List<String> filetypes) {
    this.filetypes = filetypes;
  }


  public CMFilter sources(List<String> sources) {
    
    this.sources = sources;
    return this;
  }

  public CMFilter addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  public List<String> getSources() {
    return sources;
  }


  public void setSources(List<String> sources) {
    this.sources = sources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMFilter cmFilter = (CMFilter) o;
    return Objects.equals(this.knowledgeBase, cmFilter.knowledgeBase) &&
        Objects.equals(this.filetypes, cmFilter.filetypes) &&
        Objects.equals(this.sources, cmFilter.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeBase, filetypes, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMFilter {\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    filetypes: ").append(toIndentedString(filetypes)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
    openapiFields.add("knowledgeBase");
    openapiFields.add("filetypes");
    openapiFields.add("sources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("knowledgeBase");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMFilter is not found in the empty JSON string", CMFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("knowledgeBase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `knowledgeBase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("knowledgeBase").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("filetypes") != null && !jsonObj.get("filetypes").isJsonNull() && !jsonObj.get("filetypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filetypes` to be an array in the JSON string but got `%s`", jsonObj.get("filetypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sources") != null && !jsonObj.get("sources").isJsonNull() && !jsonObj.get("sources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sources` to be an array in the JSON string but got `%s`", jsonObj.get("sources").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CMFilter>() {
           @Override
           public void write(JsonWriter out, CMFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMFilter
  * @throws IOException if the JSON string is invalid with respect to CMFilter
  */
  public static CMFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMFilter.class);
  }

 /**
  * Convert an instance of CMFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

