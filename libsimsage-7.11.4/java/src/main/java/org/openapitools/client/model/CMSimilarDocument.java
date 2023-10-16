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
 * A document that is similar to another document.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMSimilarDocument {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private Float similarity;

  public CMSimilarDocument() {
  }

  public CMSimilarDocument url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the url of the document that is similar
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMSimilarDocument urlId(Integer urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * the url-id of the document that is similar
   * @return urlId
  **/
  @javax.annotation.Nonnull
  public Integer getUrlId() {
    return urlId;
  }


  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }


  public CMSimilarDocument similarity(Float similarity) {
    
    this.similarity = similarity;
    return this;
  }

   /**
   * how similar that document is (e.g. 1.0 &#x3D; 100%)
   * @return similarity
  **/
  @javax.annotation.Nonnull
  public Float getSimilarity() {
    return similarity;
  }


  public void setSimilarity(Float similarity) {
    this.similarity = similarity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSimilarDocument cmSimilarDocument = (CMSimilarDocument) o;
    return Objects.equals(this.url, cmSimilarDocument.url) &&
        Objects.equals(this.urlId, cmSimilarDocument.urlId) &&
        Objects.equals(this.similarity, cmSimilarDocument.similarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlId, similarity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSimilarDocument {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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
    openapiFields.add("urlId");
    openapiFields.add("similarity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("similarity");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSimilarDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSimilarDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSimilarDocument is not found in the empty JSON string", CMSimilarDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSimilarDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSimilarDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSimilarDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSimilarDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSimilarDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSimilarDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSimilarDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSimilarDocument>() {
           @Override
           public void write(JsonWriter out, CMSimilarDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSimilarDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSimilarDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSimilarDocument
  * @throws IOException if the JSON string is invalid with respect to CMSimilarDocument
  */
  public static CMSimilarDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSimilarDocument.class);
  }

 /**
  * Convert an instance of CMSimilarDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

