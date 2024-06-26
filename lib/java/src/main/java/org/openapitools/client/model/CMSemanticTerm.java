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
 * CMSemanticTerm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSemanticTerm {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_REDACT = "redact";
  @SerializedName(SERIALIZED_NAME_REDACT)
  private Boolean redact;

  public static final String SERIALIZED_NAME_REDACTION_DISABLED = "redactionDisabled";
  @SerializedName(SERIALIZED_NAME_REDACTION_DISABLED)
  private Boolean redactionDisabled;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private Boolean search;

  public static final String SERIALIZED_NAME_SEARCH_DISABLED = "searchDisabled";
  @SerializedName(SERIALIZED_NAME_SEARCH_DISABLED)
  private Boolean searchDisabled;

  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public CMSemanticTerm() {
  }

  public CMSemanticTerm key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CMSemanticTerm redact(Boolean redact) {
    
    this.redact = redact;
    return this;
  }

   /**
   * Get redact
   * @return redact
  **/
  @javax.annotation.Nonnull
  public Boolean getRedact() {
    return redact;
  }


  public void setRedact(Boolean redact) {
    this.redact = redact;
  }


  public CMSemanticTerm redactionDisabled(Boolean redactionDisabled) {
    
    this.redactionDisabled = redactionDisabled;
    return this;
  }

   /**
   * Get redactionDisabled
   * @return redactionDisabled
  **/
  @javax.annotation.Nonnull
  public Boolean getRedactionDisabled() {
    return redactionDisabled;
  }


  public void setRedactionDisabled(Boolean redactionDisabled) {
    this.redactionDisabled = redactionDisabled;
  }


  public CMSemanticTerm search(Boolean search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nonnull
  public Boolean getSearch() {
    return search;
  }


  public void setSearch(Boolean search) {
    this.search = search;
  }


  public CMSemanticTerm searchDisabled(Boolean searchDisabled) {
    
    this.searchDisabled = searchDisabled;
    return this;
  }

   /**
   * Get searchDisabled
   * @return searchDisabled
  **/
  @javax.annotation.Nonnull
  public Boolean getSearchDisabled() {
    return searchDisabled;
  }


  public void setSearchDisabled(Boolean searchDisabled) {
    this.searchDisabled = searchDisabled;
  }


  public CMSemanticTerm caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @javax.annotation.Nonnull
  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSemanticTerm cmSemanticTerm = (CMSemanticTerm) o;
    return Objects.equals(this.key, cmSemanticTerm.key) &&
        Objects.equals(this.redact, cmSemanticTerm.redact) &&
        Objects.equals(this.redactionDisabled, cmSemanticTerm.redactionDisabled) &&
        Objects.equals(this.search, cmSemanticTerm.search) &&
        Objects.equals(this.searchDisabled, cmSemanticTerm.searchDisabled) &&
        Objects.equals(this.caption, cmSemanticTerm.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, redact, redactionDisabled, search, searchDisabled, caption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSemanticTerm {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    redact: ").append(toIndentedString(redact)).append("\n");
    sb.append("    redactionDisabled: ").append(toIndentedString(redactionDisabled)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    searchDisabled: ").append(toIndentedString(searchDisabled)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("redact");
    openapiFields.add("redactionDisabled");
    openapiFields.add("search");
    openapiFields.add("searchDisabled");
    openapiFields.add("caption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("redact");
    openapiRequiredFields.add("redactionDisabled");
    openapiRequiredFields.add("search");
    openapiRequiredFields.add("searchDisabled");
    openapiRequiredFields.add("caption");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSemanticTerm
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSemanticTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSemanticTerm is not found in the empty JSON string", CMSemanticTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSemanticTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSemanticTerm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSemanticTerm.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSemanticTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSemanticTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSemanticTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSemanticTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSemanticTerm>() {
           @Override
           public void write(JsonWriter out, CMSemanticTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSemanticTerm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSemanticTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSemanticTerm
  * @throws IOException if the JSON string is invalid with respect to CMSemanticTerm
  */
  public static CMSemanticTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSemanticTerm.class);
  }

 /**
  * Convert an instance of CMSemanticTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

