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
import org.openapitools.client.model.Group;
import org.openapitools.client.model.OperatorKnowledgeBase;
import org.openapitools.client.model.UserRole;

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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_PASSWORD_HASH = "passwordHash";
  @SerializedName(SERIALIZED_NAME_PASSWORD_HASH)
  private String passwordHash;

  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  private Boolean confirmed;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<UserRole> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATOR_K_B_LIST = "operatorKBList";
  @SerializedName(SERIALIZED_NAME_OPERATOR_K_B_LIST)
  private List<OperatorKnowledgeBase> operatorKBList = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_LIST = "groupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List<Group> groupList = new ArrayList<>();

  public User() {
  }

  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User surname(String surname) {
    
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @javax.annotation.Nonnull
  public String getSurname() {
    return surname;
  }


  public void setSurname(String surname) {
    this.surname = surname;
  }


  public User passwordHash(String passwordHash) {
    
    this.passwordHash = passwordHash;
    return this;
  }

   /**
   * Get passwordHash
   * @return passwordHash
  **/
  @javax.annotation.Nonnull
  public String getPasswordHash() {
    return passwordHash;
  }


  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }


  public User confirmed(Boolean confirmed) {
    
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @javax.annotation.Nonnull
  public Boolean getConfirmed() {
    return confirmed;
  }


  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }


  public User roles(List<UserRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public User addRolesItem(UserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nonnull
  public List<UserRole> getRoles() {
    return roles;
  }


  public void setRoles(List<UserRole> roles) {
    this.roles = roles;
  }


  public User operatorKBList(List<OperatorKnowledgeBase> operatorKBList) {
    
    this.operatorKBList = operatorKBList;
    return this;
  }

  public User addOperatorKBListItem(OperatorKnowledgeBase operatorKBListItem) {
    if (this.operatorKBList == null) {
      this.operatorKBList = new ArrayList<>();
    }
    this.operatorKBList.add(operatorKBListItem);
    return this;
  }

   /**
   * Get operatorKBList
   * @return operatorKBList
  **/
  @javax.annotation.Nonnull
  public List<OperatorKnowledgeBase> getOperatorKBList() {
    return operatorKBList;
  }


  public void setOperatorKBList(List<OperatorKnowledgeBase> operatorKBList) {
    this.operatorKBList = operatorKBList;
  }


  public User groupList(List<Group> groupList) {
    
    this.groupList = groupList;
    return this;
  }

  public User addGroupListItem(Group groupListItem) {
    if (this.groupList == null) {
      this.groupList = new ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * Get groupList
   * @return groupList
  **/
  @javax.annotation.Nonnull
  public List<Group> getGroupList() {
    return groupList;
  }


  public void setGroupList(List<Group> groupList) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.passwordHash, user.passwordHash) &&
        Objects.equals(this.confirmed, user.confirmed) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.operatorKBList, user.operatorKBList) &&
        Objects.equals(this.groupList, user.groupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, surname, passwordHash, confirmed, roles, operatorKBList, groupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("surname");
    openapiFields.add("passwordHash");
    openapiFields.add("confirmed");
    openapiFields.add("roles");
    openapiFields.add("operatorKBList");
    openapiFields.add("groupList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("surname");
    openapiRequiredFields.add("passwordHash");
    openapiRequiredFields.add("confirmed");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("operatorKBList");
    openapiRequiredFields.add("groupList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to User
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
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
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("surname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname").toString()));
      }
      if (!jsonObj.get("passwordHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordHash").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }

      JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
      // validate the required field `roles` (array)
      for (int i = 0; i < jsonArrayroles.size(); i++) {
        UserRole.validateJsonElement(jsonArrayroles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("operatorKBList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatorKBList` to be an array in the JSON string but got `%s`", jsonObj.get("operatorKBList").toString()));
      }

      JsonArray jsonArrayoperatorKBList = jsonObj.getAsJsonArray("operatorKBList");
      // validate the required field `operatorKBList` (array)
      for (int i = 0; i < jsonArrayoperatorKBList.size(); i++) {
        OperatorKnowledgeBase.validateJsonElement(jsonArrayoperatorKBList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("groupList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupList` to be an array in the JSON string but got `%s`", jsonObj.get("groupList").toString()));
      }

      JsonArray jsonArraygroupList = jsonObj.getAsJsonArray("groupList");
      // validate the required field `groupList` (array)
      for (int i = 0; i < jsonArraygroupList.size(); i++) {
        Group.validateJsonElement(jsonArraygroupList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
