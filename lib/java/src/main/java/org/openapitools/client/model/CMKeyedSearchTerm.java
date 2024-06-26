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
import java.util.List;
import org.openapitools.client.model.CMSearchSubTerm;

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
 * CMKeyedSearchTerm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMKeyedSearchTerm {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_REDACT = "redact";
  @SerializedName(SERIALIZED_NAME_REDACT)
  private Boolean redact;

  public static final String SERIALIZED_NAME_REDACTION_DISABLED = "redactionDisabled";
  @SerializedName(SERIALIZED_NAME_REDACTION_DISABLED)
  private Boolean redactionDisabled;

  public static final String SERIALIZED_NAME_ROW_REQUIRED = "rowRequired";
  @SerializedName(SERIALIZED_NAME_ROW_REQUIRED)
  private Boolean rowRequired;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private Boolean search;

  public static final String SERIALIZED_NAME_SEARCH_DISABLED = "searchDisabled";
  @SerializedName(SERIALIZED_NAME_SEARCH_DISABLED)
  private Boolean searchDisabled;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_SUB_TERMS = "subTerms";
  @SerializedName(SERIALIZED_NAME_SUB_TERMS)
  private List<CMSearchSubTerm> subTerms = new ArrayList<>();

  public CMKeyedSearchTerm() {
  }

  public CMKeyedSearchTerm key(String key) {
    
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


  public CMKeyedSearchTerm redact(Boolean redact) {
    
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


  public CMKeyedSearchTerm redactionDisabled(Boolean redactionDisabled) {
    
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


  public CMKeyedSearchTerm rowRequired(Boolean rowRequired) {
    
    this.rowRequired = rowRequired;
    return this;
  }

   /**
   * Get rowRequired
   * @return rowRequired
  **/
  @javax.annotation.Nonnull
  public Boolean getRowRequired() {
    return rowRequired;
  }


  public void setRowRequired(Boolean rowRequired) {
    this.rowRequired = rowRequired;
  }


  public CMKeyedSearchTerm search(Boolean search) {
    
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


  public CMKeyedSearchTerm searchDisabled(Boolean searchDisabled) {
    
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


  public CMKeyedSearchTerm value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CMKeyedSearchTerm subTerms(List<CMSearchSubTerm> subTerms) {
    
    this.subTerms = subTerms;
    return this;
  }

  public CMKeyedSearchTerm addSubTermsItem(CMSearchSubTerm subTermsItem) {
    if (this.subTerms == null) {
      this.subTerms = new ArrayList<>();
    }
    this.subTerms.add(subTermsItem);
    return this;
  }

   /**
   * Get subTerms
   * @return subTerms
  **/
  @javax.annotation.Nonnull
  public List<CMSearchSubTerm> getSubTerms() {
    return subTerms;
  }


  public void setSubTerms(List<CMSearchSubTerm> subTerms) {
    this.subTerms = subTerms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMKeyedSearchTerm cmKeyedSearchTerm = (CMKeyedSearchTerm) o;
    return Objects.equals(this.key, cmKeyedSearchTerm.key) &&
        Objects.equals(this.redact, cmKeyedSearchTerm.redact) &&
        Objects.equals(this.redactionDisabled, cmKeyedSearchTerm.redactionDisabled) &&
        Objects.equals(this.rowRequired, cmKeyedSearchTerm.rowRequired) &&
        Objects.equals(this.search, cmKeyedSearchTerm.search) &&
        Objects.equals(this.searchDisabled, cmKeyedSearchTerm.searchDisabled) &&
        Objects.equals(this.value, cmKeyedSearchTerm.value) &&
        Objects.equals(this.subTerms, cmKeyedSearchTerm.subTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, redact, redactionDisabled, rowRequired, search, searchDisabled, value, subTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMKeyedSearchTerm {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    redact: ").append(toIndentedString(redact)).append("\n");
    sb.append("    redactionDisabled: ").append(toIndentedString(redactionDisabled)).append("\n");
    sb.append("    rowRequired: ").append(toIndentedString(rowRequired)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    searchDisabled: ").append(toIndentedString(searchDisabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    subTerms: ").append(toIndentedString(subTerms)).append("\n");
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
    openapiFields.add("rowRequired");
    openapiFields.add("search");
    openapiFields.add("searchDisabled");
    openapiFields.add("value");
    openapiFields.add("subTerms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("redact");
    openapiRequiredFields.add("redactionDisabled");
    openapiRequiredFields.add("rowRequired");
    openapiRequiredFields.add("search");
    openapiRequiredFields.add("searchDisabled");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("subTerms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMKeyedSearchTerm
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMKeyedSearchTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMKeyedSearchTerm is not found in the empty JSON string", CMKeyedSearchTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMKeyedSearchTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMKeyedSearchTerm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMKeyedSearchTerm.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("subTerms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subTerms` to be an array in the JSON string but got `%s`", jsonObj.get("subTerms").toString()));
      }

      JsonArray jsonArraysubTerms = jsonObj.getAsJsonArray("subTerms");
      // validate the required field `subTerms` (array)
      for (int i = 0; i < jsonArraysubTerms.size(); i++) {
        CMSearchSubTerm.validateJsonElement(jsonArraysubTerms.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMKeyedSearchTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMKeyedSearchTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMKeyedSearchTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMKeyedSearchTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<CMKeyedSearchTerm>() {
           @Override
           public void write(JsonWriter out, CMKeyedSearchTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMKeyedSearchTerm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMKeyedSearchTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMKeyedSearchTerm
  * @throws IOException if the JSON string is invalid with respect to CMKeyedSearchTerm
  */
  public static CMKeyedSearchTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMKeyedSearchTerm.class);
  }

 /**
  * Convert an instance of CMKeyedSearchTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

