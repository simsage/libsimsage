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
 * A paginated/filtered list of users with a total user count.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMUserList {
  public static final String SERIALIZED_NAME_USER_LIST = "userList";
  @SerializedName(SERIALIZED_NAME_USER_LIST)
  private List<CMUser> userList = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_COUNT = "userCount";
  @SerializedName(SERIALIZED_NAME_USER_COUNT)
  private Integer userCount;

  public CMUserList() {
  }

  public CMUserList userList(List<CMUser> userList) {
    
    this.userList = userList;
    return this;
  }

  public CMUserList addUserListItem(CMUser userListItem) {
    if (this.userList == null) {
      this.userList = new ArrayList<>();
    }
    this.userList.add(userListItem);
    return this;
  }

   /**
   * the list of user objects.
   * @return userList
  **/
  @javax.annotation.Nonnull
  public List<CMUser> getUserList() {
    return userList;
  }


  public void setUserList(List<CMUser> userList) {
    this.userList = userList;
  }


  public CMUserList userCount(Integer userCount) {
    
    this.userCount = userCount;
    return this;
  }

   /**
   * the total user count.
   * @return userCount
  **/
  @javax.annotation.Nonnull
  public Integer getUserCount() {
    return userCount;
  }


  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUserList cmUserList = (CMUserList) o;
    return Objects.equals(this.userList, cmUserList.userList) &&
        Objects.equals(this.userCount, cmUserList.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userList, userCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUserList {\n");
    sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
    openapiFields.add("userList");
    openapiFields.add("userCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userList");
    openapiRequiredFields.add("userCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUserList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUserList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUserList is not found in the empty JSON string", CMUserList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUserList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUserList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUserList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!CMUserList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUserList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUserList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUserList.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUserList>() {
           @Override
           public void write(JsonWriter out, CMUserList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUserList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUserList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUserList
  * @throws IOException if the JSON string is invalid with respect to CMUserList
  */
  public static CMUserList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUserList.class);
  }

 /**
  * Convert an instance of CMUserList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

