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
import org.openapitools.client.model.CMGroup;

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
 * An object used for updating a SimSage user.  This object can be used to update the user&#39;s password too.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMUserWithExtras {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private String roles;

  public static final String SERIALIZED_NAME_OPERATOR_K_B_LIST = "operatorKBList";
  @SerializedName(SERIALIZED_NAME_OPERATOR_K_B_LIST)
  private String operatorKBList;

  public static final String SERIALIZED_NAME_GROUP_LIST = "groupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List<CMGroup> groupList = new ArrayList<>();

  public CMUserWithExtras() {
  }

  public CMUserWithExtras id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the user&#39;s id (its guid id).
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CMUserWithExtras email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * the email of this user
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CMUserWithExtras password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * a password for this user (or blank if not to be changed)
   * @return password
  **/
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public CMUserWithExtras firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * the first-name of this user
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CMUserWithExtras surname(String surname) {
    
    this.surname = surname;
    return this;
  }

   /**
   * the last-name (surname) of this user
   * @return surname
  **/
  @javax.annotation.Nonnull
  public String getSurname() {
    return surname;
  }


  public void setSurname(String surname) {
    this.surname = surname;
  }


  public CMUserWithExtras roles(String roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * the roles to be associated with this user
   * @return roles
  **/
  @javax.annotation.Nonnull
  public String getRoles() {
    return roles;
  }


  public void setRoles(String roles) {
    this.roles = roles;
  }


  public CMUserWithExtras operatorKBList(String operatorKBList) {
    
    this.operatorKBList = operatorKBList;
    return this;
  }

   /**
   * the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set.
   * @return operatorKBList
  **/
  @javax.annotation.Nonnull
  public String getOperatorKBList() {
    return operatorKBList;
  }


  public void setOperatorKBList(String operatorKBList) {
    this.operatorKBList = operatorKBList;
  }


  public CMUserWithExtras groupList(List<CMGroup> groupList) {
    
    this.groupList = groupList;
    return this;
  }

  public CMUserWithExtras addGroupListItem(CMGroup groupListItem) {
    if (this.groupList == null) {
      this.groupList = new ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * a list of groups this user is part of (can be empty)
   * @return groupList
  **/
  @javax.annotation.Nonnull
  public List<CMGroup> getGroupList() {
    return groupList;
  }


  public void setGroupList(List<CMGroup> groupList) {
    this.groupList = groupList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUserWithExtras cmUserWithExtras = (CMUserWithExtras) o;
    return Objects.equals(this.id, cmUserWithExtras.id) &&
        Objects.equals(this.email, cmUserWithExtras.email) &&
        Objects.equals(this.password, cmUserWithExtras.password) &&
        Objects.equals(this.firstName, cmUserWithExtras.firstName) &&
        Objects.equals(this.surname, cmUserWithExtras.surname) &&
        Objects.equals(this.roles, cmUserWithExtras.roles) &&
        Objects.equals(this.operatorKBList, cmUserWithExtras.operatorKBList) &&
        Objects.equals(this.groupList, cmUserWithExtras.groupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, firstName, surname, roles, operatorKBList, groupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUserWithExtras {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    operatorKBList: ").append(toIndentedString(operatorKBList)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("email");
    openapiFields.add("password");
    openapiFields.add("firstName");
    openapiFields.add("surname");
    openapiFields.add("roles");
    openapiFields.add("operatorKBList");
    openapiFields.add("groupList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("surname");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("operatorKBList");
    openapiRequiredFields.add("groupList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUserWithExtras
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUserWithExtras.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUserWithExtras is not found in the empty JSON string", CMUserWithExtras.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUserWithExtras.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUserWithExtras` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUserWithExtras.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if (!jsonObj.get("roles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if (!jsonObj.get("operatorKBList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatorKBList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatorKBList").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("groupList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupList` to be an array in the JSON string but got `%s`", jsonObj.get("groupList").toString()));
      }

      JsonArray jsonArraygroupList = jsonObj.getAsJsonArray("groupList");
      // validate the required field `groupList` (array)
      for (int i = 0; i < jsonArraygroupList.size(); i++) {
        CMGroup.validateJsonElement(jsonArraygroupList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMUserWithExtras.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUserWithExtras' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUserWithExtras> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUserWithExtras.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUserWithExtras>() {
           @Override
           public void write(JsonWriter out, CMUserWithExtras value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUserWithExtras read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUserWithExtras given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUserWithExtras
  * @throws IOException if the JSON string is invalid with respect to CMUserWithExtras
  */
  public static CMUserWithExtras fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUserWithExtras.class);
  }

 /**
  * Convert an instance of CMUserWithExtras to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

