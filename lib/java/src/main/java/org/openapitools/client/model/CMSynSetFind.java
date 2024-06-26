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
 * a SynSet find object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSynSetFind {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public CMSynSetFind() {
  }

  public CMSynSetFind organisationId(String organisationId) {
    
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


  public CMSynSetFind kbId(String kbId) {
    
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


  public CMSynSetFind page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * pagination control, the page to get (starting at zero (0))
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public CMSynSetFind pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of results to return maximum
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public CMSynSetFind filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * the synset(s) to look for
   * @return filter
  **/
  @javax.annotation.Nonnull
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSynSetFind cmSynSetFind = (CMSynSetFind) o;
    return Objects.equals(this.organisationId, cmSynSetFind.organisationId) &&
        Objects.equals(this.kbId, cmSynSetFind.kbId) &&
        Objects.equals(this.page, cmSynSetFind.page) &&
        Objects.equals(this.pageSize, cmSynSetFind.pageSize) &&
        Objects.equals(this.filter, cmSynSetFind.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, page, pageSize, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSynSetFind {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("pageSize");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("pageSize");
    openapiRequiredFields.add("filter");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSynSetFind
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSynSetFind.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSynSetFind is not found in the empty JSON string", CMSynSetFind.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSynSetFind.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSynSetFind` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSynSetFind.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSynSetFind.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSynSetFind' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSynSetFind> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSynSetFind.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSynSetFind>() {
           @Override
           public void write(JsonWriter out, CMSynSetFind value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSynSetFind read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSynSetFind given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSynSetFind
  * @throws IOException if the JSON string is invalid with respect to CMSynSetFind
  */
  public static CMSynSetFind fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSynSetFind.class);
  }

 /**
  * Convert an instance of CMSynSetFind to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

