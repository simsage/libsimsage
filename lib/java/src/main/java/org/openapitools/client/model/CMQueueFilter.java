/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
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
 * CMQueueFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:21:46.672184776Z[Europe/London]")
public class CMQueueFilter {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_SORT_DIRECTION = "sortDirection";
  @SerializedName(SERIALIZED_NAME_SORT_DIRECTION)
  private Integer sortDirection;

  public static final String SERIALIZED_NAME_SORT_COLUMN = "sortColumn";
  @SerializedName(SERIALIZED_NAME_SORT_COLUMN)
  private String sortColumn;

  public static final String SERIALIZED_NAME_SHOW_ALL = "showAll";
  @SerializedName(SERIALIZED_NAME_SHOW_ALL)
  private Boolean showAll;

  public CMQueueFilter() {
  }

  public CMQueueFilter organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMQueueFilter page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public CMQueueFilter pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public CMQueueFilter sortDirection(Integer sortDirection) {
    
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * Get sortDirection
   * @return sortDirection
  **/
  @javax.annotation.Nonnull
  public Integer getSortDirection() {
    return sortDirection;
  }


  public void setSortDirection(Integer sortDirection) {
    this.sortDirection = sortDirection;
  }


  public CMQueueFilter sortColumn(String sortColumn) {
    
    this.sortColumn = sortColumn;
    return this;
  }

   /**
   * Get sortColumn
   * @return sortColumn
  **/
  @javax.annotation.Nonnull
  public String getSortColumn() {
    return sortColumn;
  }


  public void setSortColumn(String sortColumn) {
    this.sortColumn = sortColumn;
  }


  public CMQueueFilter showAll(Boolean showAll) {
    
    this.showAll = showAll;
    return this;
  }

   /**
   * Get showAll
   * @return showAll
  **/
  @javax.annotation.Nonnull
  public Boolean getShowAll() {
    return showAll;
  }


  public void setShowAll(Boolean showAll) {
    this.showAll = showAll;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMQueueFilter cmQueueFilter = (CMQueueFilter) o;
    return Objects.equals(this.organisationId, cmQueueFilter.organisationId) &&
        Objects.equals(this.page, cmQueueFilter.page) &&
        Objects.equals(this.pageSize, cmQueueFilter.pageSize) &&
        Objects.equals(this.sortDirection, cmQueueFilter.sortDirection) &&
        Objects.equals(this.sortColumn, cmQueueFilter.sortColumn) &&
        Objects.equals(this.showAll, cmQueueFilter.showAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, page, pageSize, sortDirection, sortColumn, showAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMQueueFilter {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortColumn: ").append(toIndentedString(sortColumn)).append("\n");
    sb.append("    showAll: ").append(toIndentedString(showAll)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("pageSize");
    openapiFields.add("sortDirection");
    openapiFields.add("sortColumn");
    openapiFields.add("showAll");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("pageSize");
    openapiRequiredFields.add("sortDirection");
    openapiRequiredFields.add("sortColumn");
    openapiRequiredFields.add("showAll");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMQueueFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMQueueFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMQueueFilter is not found in the empty JSON string", CMQueueFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMQueueFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMQueueFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMQueueFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("sortColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortColumn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMQueueFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMQueueFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMQueueFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMQueueFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CMQueueFilter>() {
           @Override
           public void write(JsonWriter out, CMQueueFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMQueueFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMQueueFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMQueueFilter
  * @throws IOException if the JSON string is invalid with respect to CMQueueFilter
  */
  public static CMQueueFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMQueueFilter.class);
  }

 /**
  * Convert an instance of CMQueueFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

