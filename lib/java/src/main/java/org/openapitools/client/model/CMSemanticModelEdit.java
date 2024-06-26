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
 * a semantic update/create object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSemanticModelEdit {
  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word;

  public static final String SERIALIZED_NAME_PREV_WORD = "prevWord";
  @SerializedName(SERIALIZED_NAME_PREV_WORD)
  private String prevWord;

  public static final String SERIALIZED_NAME_SEMANTIC = "semantic";
  @SerializedName(SERIALIZED_NAME_SEMANTIC)
  private String semantic;

  public CMSemanticModelEdit() {
  }

  public CMSemanticModelEdit word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * The word of a semantic is the more specific concept (eg. in &#39;John is a person&#39;, then &#39;John&#39; is the more specific concept, and &#39;person&#39; is the semantic).
   * @return word
  **/
  @javax.annotation.Nonnull
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public CMSemanticModelEdit prevWord(String prevWord) {
    
    this.prevWord = prevWord;
    return this;
  }

   /**
   * The previous value for &#39;word&#39; if this is a semantic changing its word value (update)
   * @return prevWord
  **/
  @javax.annotation.Nonnull
  public String getPrevWord() {
    return prevWord;
  }


  public void setPrevWord(String prevWord) {
    this.prevWord = prevWord;
  }


  public CMSemanticModelEdit semantic(String semantic) {
    
    this.semantic = semantic;
    return this;
  }

   /**
   * The semantic is the more general concept (eg. in &#39;John is a person&#39;, &#39;person&#39; is the more general concept, and &#39;John&#39; is more specific).
   * @return semantic
  **/
  @javax.annotation.Nonnull
  public String getSemantic() {
    return semantic;
  }


  public void setSemantic(String semantic) {
    this.semantic = semantic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSemanticModelEdit cmSemanticModelEdit = (CMSemanticModelEdit) o;
    return Objects.equals(this.word, cmSemanticModelEdit.word) &&
        Objects.equals(this.prevWord, cmSemanticModelEdit.prevWord) &&
        Objects.equals(this.semantic, cmSemanticModelEdit.semantic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, prevWord, semantic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSemanticModelEdit {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    prevWord: ").append(toIndentedString(prevWord)).append("\n");
    sb.append("    semantic: ").append(toIndentedString(semantic)).append("\n");
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
    openapiFields.add("word");
    openapiFields.add("prevWord");
    openapiFields.add("semantic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word");
    openapiRequiredFields.add("prevWord");
    openapiRequiredFields.add("semantic");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSemanticModelEdit
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSemanticModelEdit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSemanticModelEdit is not found in the empty JSON string", CMSemanticModelEdit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSemanticModelEdit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSemanticModelEdit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSemanticModelEdit.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("word").toString()));
      }
      if (!jsonObj.get("prevWord").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevWord` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevWord").toString()));
      }
      if (!jsonObj.get("semantic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `semantic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("semantic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSemanticModelEdit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSemanticModelEdit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSemanticModelEdit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSemanticModelEdit.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSemanticModelEdit>() {
           @Override
           public void write(JsonWriter out, CMSemanticModelEdit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSemanticModelEdit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSemanticModelEdit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSemanticModelEdit
  * @throws IOException if the JSON string is invalid with respect to CMSemanticModelEdit
  */
  public static CMSemanticModelEdit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSemanticModelEdit.class);
  }

 /**
  * Convert an instance of CMSemanticModelEdit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

