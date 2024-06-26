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
import org.openapitools.client.model.CMSynonym;

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
 * A paginated synonym return list matching a request for the same.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSynonymsPaginatedResult {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_SYNONYM_LIST = "synonymList";
  @SerializedName(SERIALIZED_NAME_SYNONYM_LIST)
  private List<CMSynonym> synonymList = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUM_SYNONYMS = "numSynonyms";
  @SerializedName(SERIALIZED_NAME_NUM_SYNONYMS)
  private Integer numSynonyms;

  public CMSynonymsPaginatedResult() {
  }

  public CMSynonymsPaginatedResult organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id).
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMSynonymsPaginatedResult kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base (its guid id).
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMSynonymsPaginatedResult filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * The filter that was used to find these items.
   * @return filter
  **/
  @javax.annotation.Nonnull
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public CMSynonymsPaginatedResult synonymList(List<CMSynonym> synonymList) {
    
    this.synonymList = synonymList;
    return this;
  }

  public CMSynonymsPaginatedResult addSynonymListItem(CMSynonym synonymListItem) {
    if (this.synonymList == null) {
      this.synonymList = new ArrayList<>();
    }
    this.synonymList.add(synonymListItem);
    return this;
  }

   /**
   * the resulting list of synonyms (return)
   * @return synonymList
  **/
  @javax.annotation.Nonnull
  public List<CMSynonym> getSynonymList() {
    return synonymList;
  }


  public void setSynonymList(List<CMSynonym> synonymList) {
    this.synonymList = synonymList;
  }


  public CMSynonymsPaginatedResult numSynonyms(Integer numSynonyms) {
    
    this.numSynonyms = numSynonyms;
    return this;
  }

   /**
   * the total number of synonyms that matched.
   * @return numSynonyms
  **/
  @javax.annotation.Nonnull
  public Integer getNumSynonyms() {
    return numSynonyms;
  }


  public void setNumSynonyms(Integer numSynonyms) {
    this.numSynonyms = numSynonyms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSynonymsPaginatedResult cmSynonymsPaginatedResult = (CMSynonymsPaginatedResult) o;
    return Objects.equals(this.organisationId, cmSynonymsPaginatedResult.organisationId) &&
        Objects.equals(this.kbId, cmSynonymsPaginatedResult.kbId) &&
        Objects.equals(this.filter, cmSynonymsPaginatedResult.filter) &&
        Objects.equals(this.synonymList, cmSynonymsPaginatedResult.synonymList) &&
        Objects.equals(this.numSynonyms, cmSynonymsPaginatedResult.numSynonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, filter, synonymList, numSynonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSynonymsPaginatedResult {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    synonymList: ").append(toIndentedString(synonymList)).append("\n");
    sb.append("    numSynonyms: ").append(toIndentedString(numSynonyms)).append("\n");
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
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("filter");
    openapiFields.add("synonymList");
    openapiFields.add("numSynonyms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("synonymList");
    openapiRequiredFields.add("numSynonyms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSynonymsPaginatedResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSynonymsPaginatedResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSynonymsPaginatedResult is not found in the empty JSON string", CMSynonymsPaginatedResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSynonymsPaginatedResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSynonymsPaginatedResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSynonymsPaginatedResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("synonymList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `synonymList` to be an array in the JSON string but got `%s`", jsonObj.get("synonymList").toString()));
      }

      JsonArray jsonArraysynonymList = jsonObj.getAsJsonArray("synonymList");
      // validate the required field `synonymList` (array)
      for (int i = 0; i < jsonArraysynonymList.size(); i++) {
        CMSynonym.validateJsonElement(jsonArraysynonymList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSynonymsPaginatedResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSynonymsPaginatedResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSynonymsPaginatedResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSynonymsPaginatedResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSynonymsPaginatedResult>() {
           @Override
           public void write(JsonWriter out, CMSynonymsPaginatedResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSynonymsPaginatedResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSynonymsPaginatedResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSynonymsPaginatedResult
  * @throws IOException if the JSON string is invalid with respect to CMSynonymsPaginatedResult
  */
  public static CMSynonymsPaginatedResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSynonymsPaginatedResult.class);
  }

 /**
  * Convert an instance of CMSynonymsPaginatedResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

