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
 * A session object, A session&#39;s id is the \&quot;session-id\&quot; used throughout the SimSage API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMSession {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_LAST_ACCESS = "lastAccess";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESS)
  private Long lastAccess;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SESSION_TYPE = "sessionType";
  @SerializedName(SERIALIZED_NAME_SESSION_TYPE)
  private String sessionType;

  public CMSession() {
  }

  public CMSession id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the session-id, a guid
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CMSession userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * the user associated with this session, their id, a guid
   * @return userId
  **/
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CMSession organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMSession email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * email address of this user
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CMSession ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * the ip-address of the user logging in if captured
   * @return ipAddress
  **/
  @javax.annotation.Nonnull
  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public CMSession lastAccess(Long lastAccess) {
    
    this.lastAccess = lastAccess;
    return this;
  }

   /**
   * a unix-timestamp of the last time this session was accessed/refreshed
   * @return lastAccess
  **/
  @javax.annotation.Nonnull
  public Long getLastAccess() {
    return lastAccess;
  }


  public void setLastAccess(Long lastAccess) {
    this.lastAccess = lastAccess;
  }


  public CMSession role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * the main/highest role of the user signed-in
   * @return role
  **/
  @javax.annotation.Nonnull
  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public CMSession sessionType(String sessionType) {
    
    this.sessionType = sessionType;
    return this;
  }

   /**
   * the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)
   * @return sessionType
  **/
  @javax.annotation.Nonnull
  public String getSessionType() {
    return sessionType;
  }


  public void setSessionType(String sessionType) {
    this.sessionType = sessionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSession cmSession = (CMSession) o;
    return Objects.equals(this.id, cmSession.id) &&
        Objects.equals(this.userId, cmSession.userId) &&
        Objects.equals(this.organisationId, cmSession.organisationId) &&
        Objects.equals(this.email, cmSession.email) &&
        Objects.equals(this.ipAddress, cmSession.ipAddress) &&
        Objects.equals(this.lastAccess, cmSession.lastAccess) &&
        Objects.equals(this.role, cmSession.role) &&
        Objects.equals(this.sessionType, cmSession.sessionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, organisationId, email, ipAddress, lastAccess, role, sessionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSession {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("organisationId");
    openapiFields.add("email");
    openapiFields.add("ipAddress");
    openapiFields.add("lastAccess");
    openapiFields.add("role");
    openapiFields.add("sessionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("ipAddress");
    openapiRequiredFields.add("lastAccess");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("sessionType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSession
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSession is not found in the empty JSON string", CMSession.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSession` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSession.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("sessionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSession.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSession>() {
           @Override
           public void write(JsonWriter out, CMSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSession read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSession
  * @throws IOException if the JSON string is invalid with respect to CMSession
  */
  public static CMSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSession.class);
  }

 /**
  * Convert an instance of CMSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

