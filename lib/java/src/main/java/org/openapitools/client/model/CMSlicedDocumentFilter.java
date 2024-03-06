/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
 * CMSlicedDocumentFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMSlicedDocumentFilter {
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

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<String> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_USERS = "selectedUsers";
  @SerializedName(SERIALIZED_NAME_SELECTED_USERS)
  private List<String> selectedUsers = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_SOURCES = "selectedSources";
  @SerializedName(SERIALIZED_NAME_SELECTED_SOURCES)
  private List<String> selectedSources = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTED_CONFIDENCES = "selectedConfidences";
  @SerializedName(SERIALIZED_NAME_SELECTED_CONFIDENCES)
  private List<String> selectedConfidences = new ArrayList<>();

  public CMSlicedDocumentFilter() {
  }

  public CMSlicedDocumentFilter page(Integer page) {
    
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


  public CMSlicedDocumentFilter pageSize(Integer pageSize) {
    
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


  public CMSlicedDocumentFilter sortDirection(Integer sortDirection) {
    
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


  public CMSlicedDocumentFilter sortColumn(String sortColumn) {
    
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


  public CMSlicedDocumentFilter statuses(List<String> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public CMSlicedDocumentFilter addStatusesItem(String statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @javax.annotation.Nonnull
  public List<String> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<String> statuses) {
    this.statuses = statuses;
  }


  public CMSlicedDocumentFilter selectedUsers(List<String> selectedUsers) {
    
    this.selectedUsers = selectedUsers;
    return this;
  }

  public CMSlicedDocumentFilter addSelectedUsersItem(String selectedUsersItem) {
    if (this.selectedUsers == null) {
      this.selectedUsers = new ArrayList<>();
    }
    this.selectedUsers.add(selectedUsersItem);
    return this;
  }

   /**
   * Get selectedUsers
   * @return selectedUsers
  **/
  @javax.annotation.Nonnull
  public List<String> getSelectedUsers() {
    return selectedUsers;
  }


  public void setSelectedUsers(List<String> selectedUsers) {
    this.selectedUsers = selectedUsers;
  }


  public CMSlicedDocumentFilter selectedSources(List<String> selectedSources) {
    
    this.selectedSources = selectedSources;
    return this;
  }

  public CMSlicedDocumentFilter addSelectedSourcesItem(String selectedSourcesItem) {
    if (this.selectedSources == null) {
      this.selectedSources = new ArrayList<>();
    }
    this.selectedSources.add(selectedSourcesItem);
    return this;
  }

   /**
   * Get selectedSources
   * @return selectedSources
  **/
  @javax.annotation.Nonnull
  public List<String> getSelectedSources() {
    return selectedSources;
  }


  public void setSelectedSources(List<String> selectedSources) {
    this.selectedSources = selectedSources;
  }


  public CMSlicedDocumentFilter selectedConfidences(List<String> selectedConfidences) {
    
    this.selectedConfidences = selectedConfidences;
    return this;
  }

  public CMSlicedDocumentFilter addSelectedConfidencesItem(String selectedConfidencesItem) {
    if (this.selectedConfidences == null) {
      this.selectedConfidences = new ArrayList<>();
    }
    this.selectedConfidences.add(selectedConfidencesItem);
    return this;
  }

   /**
   * Get selectedConfidences
   * @return selectedConfidences
  **/
  @javax.annotation.Nonnull
  public List<String> getSelectedConfidences() {
    return selectedConfidences;
  }


  public void setSelectedConfidences(List<String> selectedConfidences) {
    this.selectedConfidences = selectedConfidences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSlicedDocumentFilter cmSlicedDocumentFilter = (CMSlicedDocumentFilter) o;
    return Objects.equals(this.page, cmSlicedDocumentFilter.page) &&
        Objects.equals(this.pageSize, cmSlicedDocumentFilter.pageSize) &&
        Objects.equals(this.sortDirection, cmSlicedDocumentFilter.sortDirection) &&
        Objects.equals(this.sortColumn, cmSlicedDocumentFilter.sortColumn) &&
        Objects.equals(this.statuses, cmSlicedDocumentFilter.statuses) &&
        Objects.equals(this.selectedUsers, cmSlicedDocumentFilter.selectedUsers) &&
        Objects.equals(this.selectedSources, cmSlicedDocumentFilter.selectedSources) &&
        Objects.equals(this.selectedConfidences, cmSlicedDocumentFilter.selectedConfidences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, sortDirection, sortColumn, statuses, selectedUsers, selectedSources, selectedConfidences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSlicedDocumentFilter {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    sortColumn: ").append(toIndentedString(sortColumn)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    selectedUsers: ").append(toIndentedString(selectedUsers)).append("\n");
    sb.append("    selectedSources: ").append(toIndentedString(selectedSources)).append("\n");
    sb.append("    selectedConfidences: ").append(toIndentedString(selectedConfidences)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("pageSize");
    openapiFields.add("sortDirection");
    openapiFields.add("sortColumn");
    openapiFields.add("statuses");
    openapiFields.add("selectedUsers");
    openapiFields.add("selectedSources");
    openapiFields.add("selectedConfidences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("pageSize");
    openapiRequiredFields.add("sortDirection");
    openapiRequiredFields.add("sortColumn");
    openapiRequiredFields.add("statuses");
    openapiRequiredFields.add("selectedUsers");
    openapiRequiredFields.add("selectedSources");
    openapiRequiredFields.add("selectedConfidences");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSlicedDocumentFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSlicedDocumentFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSlicedDocumentFilter is not found in the empty JSON string", CMSlicedDocumentFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSlicedDocumentFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSlicedDocumentFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSlicedDocumentFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sortColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortColumn").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("statuses") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("selectedUsers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("selectedUsers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedUsers` to be an array in the JSON string but got `%s`", jsonObj.get("selectedUsers").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("selectedSources") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("selectedSources").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedSources` to be an array in the JSON string but got `%s`", jsonObj.get("selectedSources").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("selectedConfidences") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("selectedConfidences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedConfidences` to be an array in the JSON string but got `%s`", jsonObj.get("selectedConfidences").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSlicedDocumentFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSlicedDocumentFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSlicedDocumentFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSlicedDocumentFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSlicedDocumentFilter>() {
           @Override
           public void write(JsonWriter out, CMSlicedDocumentFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSlicedDocumentFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSlicedDocumentFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSlicedDocumentFilter
  * @throws IOException if the JSON string is invalid with respect to CMSlicedDocumentFilter
  */
  public static CMSlicedDocumentFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSlicedDocumentFilter.class);
  }

 /**
  * Convert an instance of CMSlicedDocumentFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

