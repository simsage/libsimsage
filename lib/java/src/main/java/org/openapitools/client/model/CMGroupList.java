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
import org.openapitools.client.model.CMGroup;
import org.openapitools.client.model.CMUser;

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
 * A security-group list.  A list of groups for security purposes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMGroupList {
  public static final String SERIALIZED_NAME_GROUP_LIST = "groupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List<CMGroup> groupList = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_LIST = "userList";
  @SerializedName(SERIALIZED_NAME_USER_LIST)
  private List<CMUser> userList = new ArrayList<>();

  public CMGroupList() {
  }

  public CMGroupList groupList(List<CMGroup> groupList) {
    
    this.groupList = groupList;
    return this;
  }

  public CMGroupList addGroupListItem(CMGroup groupListItem) {
    if (this.groupList == null) {
      this.groupList = new ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * the list of filtered/paginated groups
   * @return groupList
  **/
  @javax.annotation.Nonnull
  public List<CMGroup> getGroupList() {
    return groupList;
  }


  public void setGroupList(List<CMGroup> groupList) {
    this.groupList = groupList;
  }


  public CMGroupList userList(List<CMUser> userList) {
    
    this.userList = userList;
    return this;
  }

  public CMGroupList addUserListItem(CMUser userListItem) {
    if (this.userList == null) {
      this.userList = new ArrayList<>();
    }
    this.userList.add(userListItem);
    return this;
  }

   /**
   * the list of users for all groups
   * @return userList
  **/
  @javax.annotation.Nonnull
  public List<CMUser> getUserList() {
    return userList;
  }


  public void setUserList(List<CMUser> userList) {
    this.userList = userList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMGroupList cmGroupList = (CMGroupList) o;
    return Objects.equals(this.groupList, cmGroupList.groupList) &&
        Objects.equals(this.userList, cmGroupList.userList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupList, userList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMGroupList {\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
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
    openapiFields.add("groupList");
    openapiFields.add("userList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupList");
    openapiRequiredFields.add("userList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMGroupList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMGroupList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMGroupList is not found in the empty JSON string", CMGroupList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMGroupList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMGroupList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMGroupList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("groupList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupList` to be an array in the JSON string but got `%s`", jsonObj.get("groupList").toString()));
      }

      JsonArray jsonArraygroupList = jsonObj.getAsJsonArray("groupList");
      // validate the required field `groupList` (array)
      for (int i = 0; i < jsonArraygroupList.size(); i++) {
        CMGroup.validateJsonElement(jsonArraygroupList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("userList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userList` to be an array in the JSON string but got `%s`", jsonObj.get("userList").toString()));
      }

      JsonArray jsonArrayuserList = jsonObj.getAsJsonArray("userList");
      // validate the required field `userList` (array)
      for (int i = 0; i < jsonArrayuserList.size(); i++) {
        CMUser.validateJsonElement(jsonArrayuserList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMGroupList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMGroupList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMGroupList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMGroupList.class));

       return (TypeAdapter<T>) new TypeAdapter<CMGroupList>() {
           @Override
           public void write(JsonWriter out, CMGroupList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMGroupList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMGroupList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMGroupList
  * @throws IOException if the JSON string is invalid with respect to CMGroupList
  */
  public static CMGroupList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMGroupList.class);
  }

 /**
  * Convert an instance of CMGroupList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

