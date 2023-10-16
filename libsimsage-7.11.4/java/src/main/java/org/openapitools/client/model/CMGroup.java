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
 * A security-group object.  Groups can contain security users and are used to group/clump users.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMGroup {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_ID_LIST = "userIdList";
  @SerializedName(SERIALIZED_NAME_USER_ID_LIST)
  private List<String> userIdList = new ArrayList<>();

  public CMGroup() {
  }

  public CMGroup organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id) this group is associated with
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of this group
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CMGroup userIdList(List<String> userIdList) {
    
    this.userIdList = userIdList;
    return this;
  }

  public CMGroup addUserIdListItem(String userIdListItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMGroup cmGroup = (CMGroup) o;
    return Objects.equals(this.organisationId, cmGroup.organisationId) &&
        Objects.equals(this.name, cmGroup.name) &&
        Objects.equals(this.userIdList, cmGroup.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, name, userIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMGroup {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userIdList: ").append(toIndentedString(userIdList)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("userIdList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("userIdList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMGroup is not found in the empty JSON string", CMGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("userIdList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("userIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIdList` to be an array in the JSON string but got `%s`", jsonObj.get("userIdList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<CMGroup>() {
           @Override
           public void write(JsonWriter out, CMGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMGroup
  * @throws IOException if the JSON string is invalid with respect to CMGroup
  */
  public static CMGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMGroup.class);
  }

 /**
  * Convert an instance of CMGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

