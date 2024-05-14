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
import org.openapitools.client.model.CMOperatorKnowledgeBase;
import org.openapitools.client.model.CMUserRole;

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
 * A SimSage user object for editing and reviewing.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMUser {
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

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<CMUserRole> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATOR_K_B_LIST = "operatorKBList";
  @SerializedName(SERIALIZED_NAME_OPERATOR_K_B_LIST)
  private List<CMOperatorKnowledgeBase> operatorKBList = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_LIST = "groupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List<CMGroup> groupList = new ArrayList<>();

  public static final String SERIALIZED_NAME_JWT_MATCH_NAME_VALUE_C_S_V = "jwtMatchNameValueCSV";
  @SerializedName(SERIALIZED_NAME_JWT_MATCH_NAME_VALUE_C_S_V)
  private String jwtMatchNameValueCSV;

  public CMUser() {
  }

  public CMUser id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the user&#39;s id, a guid
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CMUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * email address of this user (their sign-in and primary identity)
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CMUser firstName(String firstName) {
    
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


  public CMUser surname(String surname) {
    
    this.surname = surname;
    return this;
  }

   /**
   * the second-name (surname) of this user
   * @return surname
  **/
  @javax.annotation.Nonnull
  public String getSurname() {
    return surname;
  }


  public void setSurname(String surname) {
    this.surname = surname;
  }


  public CMUser roles(List<CMUserRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public CMUser addRolesItem(CMUserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * a list of SimSage roles associated with this user
   * @return roles
  **/
  @javax.annotation.Nonnull
  public List<CMUserRole> getRoles() {
    return roles;
  }


  public void setRoles(List<CMUserRole> roles) {
    this.roles = roles;
  }


  public CMUser operatorKBList(List<CMOperatorKnowledgeBase> operatorKBList) {
    
    this.operatorKBList = operatorKBList;
    return this;
  }

  public CMUser addOperatorKBListItem(CMOperatorKnowledgeBase operatorKBListItem) {
    if (this.operatorKBList == null) {
      this.operatorKBList = new ArrayList<>();
    }
    this.operatorKBList.add(operatorKBListItem);
    return this;
  }

   /**
   * a list of knowledge-bases this user is an operator for
   * @return operatorKBList
  **/
  @javax.annotation.Nonnull
  public List<CMOperatorKnowledgeBase> getOperatorKBList() {
    return operatorKBList;
  }


  public void setOperatorKBList(List<CMOperatorKnowledgeBase> operatorKBList) {
    this.operatorKBList = operatorKBList;
  }


  public CMUser groupList(List<CMGroup> groupList) {
    
    this.groupList = groupList;
    return this;
  }

  public CMUser addGroupListItem(CMGroup groupListItem) {
    if (this.groupList == null) {
      this.groupList = new ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * a list of security-groups this user is part of (can be empty)
   * @return groupList
  **/
  @javax.annotation.Nonnull
  public List<CMGroup> getGroupList() {
    return groupList;
  }


  public void setGroupList(List<CMGroup> groupList) {
    this.groupList = groupList;
  }


  public CMUser jwtMatchNameValueCSV(String jwtMatchNameValueCSV) {
    
    this.jwtMatchNameValueCSV = jwtMatchNameValueCSV;
    return this;
  }

   /**
   * an optional set of csv separated name1&#x3D;value1,name2&#x3D;value2 for JWT matching
   * @return jwtMatchNameValueCSV
  **/
  @javax.annotation.Nonnull
  public String getJwtMatchNameValueCSV() {
    return jwtMatchNameValueCSV;
  }


  public void setJwtMatchNameValueCSV(String jwtMatchNameValueCSV) {
    this.jwtMatchNameValueCSV = jwtMatchNameValueCSV;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUser cmUser = (CMUser) o;
    return Objects.equals(this.id, cmUser.id) &&
        Objects.equals(this.email, cmUser.email) &&
        Objects.equals(this.firstName, cmUser.firstName) &&
        Objects.equals(this.surname, cmUser.surname) &&
        Objects.equals(this.roles, cmUser.roles) &&
        Objects.equals(this.operatorKBList, cmUser.operatorKBList) &&
        Objects.equals(this.groupList, cmUser.groupList) &&
        Objects.equals(this.jwtMatchNameValueCSV, cmUser.jwtMatchNameValueCSV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, surname, roles, operatorKBList, groupList, jwtMatchNameValueCSV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    operatorKBList: ").append(toIndentedString(operatorKBList)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    jwtMatchNameValueCSV: ").append(toIndentedString(jwtMatchNameValueCSV)).append("\n");
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
    openapiFields.add("roles");
    openapiFields.add("operatorKBList");
    openapiFields.add("groupList");
    openapiFields.add("jwtMatchNameValueCSV");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("surname");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("operatorKBList");
    openapiRequiredFields.add("groupList");
    openapiRequiredFields.add("jwtMatchNameValueCSV");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUser is not found in the empty JSON string", CMUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUser.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (!jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }

      JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
      // validate the required field `roles` (array)
      for (int i = 0; i < jsonArrayroles.size(); i++) {
        CMUserRole.validateJsonElement(jsonArrayroles.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("operatorKBList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatorKBList` to be an array in the JSON string but got `%s`", jsonObj.get("operatorKBList").toString()));
      }

      JsonArray jsonArrayoperatorKBList = jsonObj.getAsJsonArray("operatorKBList");
      // validate the required field `operatorKBList` (array)
      for (int i = 0; i < jsonArrayoperatorKBList.size(); i++) {
        CMOperatorKnowledgeBase.validateJsonElement(jsonArrayoperatorKBList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("groupList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupList` to be an array in the JSON string but got `%s`", jsonObj.get("groupList").toString()));
      }

      JsonArray jsonArraygroupList = jsonObj.getAsJsonArray("groupList");
      // validate the required field `groupList` (array)
      for (int i = 0; i < jsonArraygroupList.size(); i++) {
        CMGroup.validateJsonElement(jsonArraygroupList.get(i));
      };
      if (!jsonObj.get("jwtMatchNameValueCSV").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwtMatchNameValueCSV` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwtMatchNameValueCSV").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUser.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUser>() {
           @Override
           public void write(JsonWriter out, CMUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUser
  * @throws IOException if the JSON string is invalid with respect to CMUser
  */
  public static CMUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUser.class);
  }

 /**
  * Convert an instance of CMUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

