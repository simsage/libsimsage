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
 * A SynSet is an ambiguous noun.  A SynSet tells SimSage how to distinguish between different homoglyphs (same word) with different meanings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMSynSet {
  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word;

  public static final String SERIALIZED_NAME_LEMMA = "lemma";
  @SerializedName(SERIALIZED_NAME_LEMMA)
  private String lemma;

  public static final String SERIALIZED_NAME_WORD_CLOUD_CSV_LIST = "wordCloudCsvList";
  @SerializedName(SERIALIZED_NAME_WORD_CLOUD_CSV_LIST)
  private String wordCloudCsvList;

  public CMSynSet() {
  }

  public CMSynSet word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * the word that makes a synset group (an ambiguous noun language concept) (eg. &#39;bank&#39;)
   * @return word
  **/
  @javax.annotation.Nonnull
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public CMSynSet lemma(String lemma) {
    
    this.lemma = lemma;
    return this;
  }

   /**
   * the lemma of this word (ie. the simplified base, usually the same as the word, but the lemma of &#39;banks&#39; is &#39;bank&#39;)
   * @return lemma
  **/
  @javax.annotation.Nonnull
  public String getLemma() {
    return lemma;
  }


  public void setLemma(String lemma) {
    this.lemma = lemma;
  }


  public CMSynSet wordCloudCsvList(String wordCloudCsvList) {
    
    this.wordCloudCsvList = wordCloudCsvList;
    return this;
  }

   /**
   * A list of word-clouds that form each distinct synset.  Each string in this variable is itself a csv string.  The first word of this cloud forms the distinct marker of the synset.
   * @return wordCloudCsvList
  **/
  @javax.annotation.Nonnull
  public String getWordCloudCsvList() {
    return wordCloudCsvList;
  }


  public void setWordCloudCsvList(String wordCloudCsvList) {
    this.wordCloudCsvList = wordCloudCsvList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSynSet cmSynSet = (CMSynSet) o;
    return Objects.equals(this.word, cmSynSet.word) &&
        Objects.equals(this.lemma, cmSynSet.lemma) &&
        Objects.equals(this.wordCloudCsvList, cmSynSet.wordCloudCsvList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, lemma, wordCloudCsvList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSynSet {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    lemma: ").append(toIndentedString(lemma)).append("\n");
    sb.append("    wordCloudCsvList: ").append(toIndentedString(wordCloudCsvList)).append("\n");
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
    openapiFields.add("lemma");
    openapiFields.add("wordCloudCsvList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word");
    openapiRequiredFields.add("lemma");
    openapiRequiredFields.add("wordCloudCsvList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSynSet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSynSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSynSet is not found in the empty JSON string", CMSynSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSynSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSynSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSynSet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("word").toString()));
      }
      if (!jsonObj.get("lemma").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lemma` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lemma").toString()));
      }
      if (!jsonObj.get("wordCloudCsvList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wordCloudCsvList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wordCloudCsvList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSynSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSynSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSynSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSynSet.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSynSet>() {
           @Override
           public void write(JsonWriter out, CMSynSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSynSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSynSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSynSet
  * @throws IOException if the JSON string is invalid with respect to CMSynSet
  */
  public static CMSynSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSynSet.class);
  }

 /**
  * Convert an instance of CMSynSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
