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
import org.openapitools.client.model.CMSubTerm;

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
 * CMSearchTerm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMSearchTerm {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  /**
   * Gets or Sets searchUsage
   */
  @JsonAdapter(SearchUsageEnum.Adapter.class)
  public enum SearchUsageEnum {
    REQUIRED("REQUIRED"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    DEFAULT_ON("DEFAULT_ON"),
    
    DEFAULT_OFF("DEFAULT_OFF");

    private String value;

    SearchUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SearchUsageEnum fromValue(String value) {
      for (SearchUsageEnum b : SearchUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SearchUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearchUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SearchUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SearchUsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEARCH_USAGE = "searchUsage";
  @SerializedName(SERIALIZED_NAME_SEARCH_USAGE)
  private SearchUsageEnum searchUsage;

  /**
   * Gets or Sets redactionUsage
   */
  @JsonAdapter(RedactionUsageEnum.Adapter.class)
  public enum RedactionUsageEnum {
    REQUIRED("REQUIRED"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    DEFAULT_ON("DEFAULT_ON"),
    
    DEFAULT_OFF("DEFAULT_OFF");

    private String value;

    RedactionUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RedactionUsageEnum fromValue(String value) {
      for (RedactionUsageEnum b : RedactionUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RedactionUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RedactionUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RedactionUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RedactionUsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REDACTION_USAGE = "redactionUsage";
  @SerializedName(SERIALIZED_NAME_REDACTION_USAGE)
  private RedactionUsageEnum redactionUsage;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_SUB_TERMS = "subTerms";
  @SerializedName(SERIALIZED_NAME_SUB_TERMS)
  private List<CMSubTerm> subTerms = new ArrayList<>();

  public CMSearchTerm() {
  }

  public CMSearchTerm key(String key) {
    
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


  public CMSearchTerm caption(String caption) {
    
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


  public CMSearchTerm searchUsage(SearchUsageEnum searchUsage) {
    
    this.searchUsage = searchUsage;
    return this;
  }

   /**
   * Get searchUsage
   * @return searchUsage
  **/
  @javax.annotation.Nonnull
  public SearchUsageEnum getSearchUsage() {
    return searchUsage;
  }


  public void setSearchUsage(SearchUsageEnum searchUsage) {
    this.searchUsage = searchUsage;
  }


  public CMSearchTerm redactionUsage(RedactionUsageEnum redactionUsage) {
    
    this.redactionUsage = redactionUsage;
    return this;
  }

   /**
   * Get redactionUsage
   * @return redactionUsage
  **/
  @javax.annotation.Nonnull
  public RedactionUsageEnum getRedactionUsage() {
    return redactionUsage;
  }


  public void setRedactionUsage(RedactionUsageEnum redactionUsage) {
    this.redactionUsage = redactionUsage;
  }


  public CMSearchTerm defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nonnull
  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public CMSearchTerm subTerms(List<CMSubTerm> subTerms) {
    
    this.subTerms = subTerms;
    return this;
  }

  public CMSearchTerm addSubTermsItem(CMSubTerm subTermsItem) {
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
  public List<CMSubTerm> getSubTerms() {
    return subTerms;
  }


  public void setSubTerms(List<CMSubTerm> subTerms) {
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
    CMSearchTerm cmSearchTerm = (CMSearchTerm) o;
    return Objects.equals(this.key, cmSearchTerm.key) &&
        Objects.equals(this.caption, cmSearchTerm.caption) &&
        Objects.equals(this.searchUsage, cmSearchTerm.searchUsage) &&
        Objects.equals(this.redactionUsage, cmSearchTerm.redactionUsage) &&
        Objects.equals(this.defaultValue, cmSearchTerm.defaultValue) &&
        Objects.equals(this.subTerms, cmSearchTerm.subTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, caption, searchUsage, redactionUsage, defaultValue, subTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSearchTerm {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    searchUsage: ").append(toIndentedString(searchUsage)).append("\n");
    sb.append("    redactionUsage: ").append(toIndentedString(redactionUsage)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
    openapiFields.add("caption");
    openapiFields.add("searchUsage");
    openapiFields.add("redactionUsage");
    openapiFields.add("defaultValue");
    openapiFields.add("subTerms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("caption");
    openapiRequiredFields.add("searchUsage");
    openapiRequiredFields.add("redactionUsage");
    openapiRequiredFields.add("defaultValue");
    openapiRequiredFields.add("subTerms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSearchTerm
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSearchTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSearchTerm is not found in the empty JSON string", CMSearchTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSearchTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSearchTerm` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSearchTerm.openapiRequiredFields) {
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
      if (!jsonObj.get("searchUsage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchUsage").toString()));
      }
      if (!jsonObj.get("redactionUsage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redactionUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redactionUsage").toString()));
      }
      if (!jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("subTerms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subTerms` to be an array in the JSON string but got `%s`", jsonObj.get("subTerms").toString()));
      }

      JsonArray jsonArraysubTerms = jsonObj.getAsJsonArray("subTerms");
      // validate the required field `subTerms` (array)
      for (int i = 0; i < jsonArraysubTerms.size(); i++) {
        CMSubTerm.validateJsonElement(jsonArraysubTerms.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSearchTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSearchTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSearchTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSearchTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSearchTerm>() {
           @Override
           public void write(JsonWriter out, CMSearchTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSearchTerm read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSearchTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSearchTerm
  * @throws IOException if the JSON string is invalid with respect to CMSearchTerm
  */
  public static CMSearchTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSearchTerm.class);
  }

 /**
  * Convert an instance of CMSearchTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
