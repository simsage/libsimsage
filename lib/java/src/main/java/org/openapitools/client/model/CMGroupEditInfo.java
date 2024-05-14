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
 * Information for editing groups in the admin interface
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMGroupEditInfo {
  public static final String SERIALIZED_NAME_USER_ID_LIST = "userIdList";
  @SerializedName(SERIALIZED_NAME_USER_ID_LIST)
  private List<String> userIdList = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTIVE_USERS_PAGE = "activeUsersPage";
  @SerializedName(SERIALIZED_NAME_ACTIVE_USERS_PAGE)
  private Integer activeUsersPage;

  public static final String SERIALIZED_NAME_ACTIVE_USERS_FILTER = "activeUsersFilter";
  @SerializedName(SERIALIZED_NAME_ACTIVE_USERS_FILTER)
  private String activeUsersFilter;

  public static final String SERIALIZED_NAME_AVAILABLE_USERS_PAGE = "availableUsersPage";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_USERS_PAGE)
  private Integer availableUsersPage;

  public static final String SERIALIZED_NAME_AVAILABLE_USERS_FILTER = "availableUsersFilter";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_USERS_FILTER)
  private String availableUsersFilter;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public CMGroupEditInfo() {
  }

  public CMGroupEditInfo userIdList(List<String> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public CMGroupEditInfo addUserIdListItem(String userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

   /**
   * a list of user-ids (can be empty) part of this group
   * @return userIdList
  **/
  @javax.annotation.Nonnull
  public List<String> getUserIdList() {
    return userIdList;
  }


  public void setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
  }


  public CMGroupEditInfo activeUsersPage(Integer activeUsersPage) {
    
    this.activeUsersPage = activeUsersPage;
    return this;
  }

   /**
   * pagination into the active (userIdList) set of users
   * @return activeUsersPage
  **/
  @javax.annotation.Nonnull
  public Integer getActiveUsersPage() {
    return activeUsersPage;
  }


  public void setActiveUsersPage(Integer activeUsersPage) {
    this.activeUsersPage = activeUsersPage;
  }


  public CMGroupEditInfo activeUsersFilter(String activeUsersFilter) {
    
    this.activeUsersFilter = activeUsersFilter;
    return this;
  }

   /**
   * a filter for first-name, surname, and/or email of the active users
   * @return activeUsersFilter
  **/
  @javax.annotation.Nonnull
  public String getActiveUsersFilter() {
    return activeUsersFilter;
  }


  public void setActiveUsersFilter(String activeUsersFilter) {
    this.activeUsersFilter = activeUsersFilter;
  }


  public CMGroupEditInfo availableUsersPage(Integer availableUsersPage) {
    
    this.availableUsersPage = availableUsersPage;
    return this;
  }

   /**
   * pagination into the available set of users
   * @return availableUsersPage
  **/
  @javax.annotation.Nonnull
  public Integer getAvailableUsersPage() {
    return availableUsersPage;
  }


  public void setAvailableUsersPage(Integer availableUsersPage) {
    this.availableUsersPage = availableUsersPage;
  }


  public CMGroupEditInfo availableUsersFilter(String availableUsersFilter) {
    
    this.availableUsersFilter = availableUsersFilter;
    return this;
  }

   /**
   * a filter for first-name, surname, and/or email of the available users
   * @return availableUsersFilter
  **/
  @javax.annotation.Nonnull
  public String getAvailableUsersFilter() {
    return availableUsersFilter;
  }


  public void setAvailableUsersFilter(String availableUsersFilter) {
    this.availableUsersFilter = availableUsersFilter;
  }


  public CMGroupEditInfo pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * pagination size of both sets of information
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMGroupEditInfo cmGroupEditInfo = (CMGroupEditInfo) o;
    return Objects.equals(this.userIdList, cmGroupEditInfo.userIdList) &&
        Objects.equals(this.activeUsersPage, cmGroupEditInfo.activeUsersPage) &&
        Objects.equals(this.activeUsersFilter, cmGroupEditInfo.activeUsersFilter) &&
        Objects.equals(this.availableUsersPage, cmGroupEditInfo.availableUsersPage) &&
        Objects.equals(this.availableUsersFilter, cmGroupEditInfo.availableUsersFilter) &&
        Objects.equals(this.pageSize, cmGroupEditInfo.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIdList, activeUsersPage, activeUsersFilter, availableUsersPage, availableUsersFilter, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMGroupEditInfo {\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
    sb.append("    activeUsersPage: ").append(toIndentedString(activeUsersPage)).append("\n");
    sb.append("    activeUsersFilter: ").append(toIndentedString(activeUsersFilter)).append("\n");
    sb.append("    availableUsersPage: ").append(toIndentedString(availableUsersPage)).append("\n");
    sb.append("    availableUsersFilter: ").append(toIndentedString(availableUsersFilter)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("userIdList");
    openapiFields.add("activeUsersPage");
    openapiFields.add("activeUsersFilter");
    openapiFields.add("availableUsersPage");
    openapiFields.add("availableUsersFilter");
    openapiFields.add("pageSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userIdList");
    openapiRequiredFields.add("activeUsersPage");
    openapiRequiredFields.add("activeUsersFilter");
    openapiRequiredFields.add("availableUsersPage");
    openapiRequiredFields.add("availableUsersFilter");
    openapiRequiredFields.add("pageSize");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMGroupEditInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMGroupEditInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMGroupEditInfo is not found in the empty JSON string", CMGroupEditInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMGroupEditInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMGroupEditInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMGroupEditInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("userIdList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("userIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdList` to be an array in the JSON string but got `%s`", jsonObj.get("userIdList").toString()));
      }
      if (!jsonObj.get("activeUsersFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeUsersFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeUsersFilter").toString()));
      }
      if (!jsonObj.get("availableUsersFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableUsersFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableUsersFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMGroupEditInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMGroupEditInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMGroupEditInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMGroupEditInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CMGroupEditInfo>() {
           @Override
           public void write(JsonWriter out, CMGroupEditInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMGroupEditInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMGroupEditInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMGroupEditInfo
  * @throws IOException if the JSON string is invalid with respect to CMGroupEditInfo
  */
  public static CMGroupEditInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMGroupEditInfo.class);
  }

 /**
  * Convert an instance of CMGroupEditInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

