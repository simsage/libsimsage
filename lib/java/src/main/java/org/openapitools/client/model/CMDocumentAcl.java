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
 * A document Access Control List (ACL) item.  This item represents a user&#39;s/group&#39;s access to a document (hasAccess or not).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMDocumentAcl {
  public static final String SERIALIZED_NAME_ACL = "acl";
  @SerializedName(SERIALIZED_NAME_ACL)
  private String acl;

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private String access;

  public static final String SERIALIZED_NAME_IS_USER = "isUser";
  @SerializedName(SERIALIZED_NAME_IS_USER)
  private Boolean isUser;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Boolean user;

  public CMDocumentAcl() {
  }

  public CMDocumentAcl acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * Some acl value, can represent a user&#39;s email address or the name of a remote security-group.
   * @return acl
  **/
  @javax.annotation.Nonnull
  public String getAcl() {
    return acl;
  }


  public void setAcl(String acl) {
    this.acl = acl;
  }


  public CMDocumentAcl access(String access) {
    
    this.access = access;
    return this;
  }

   /**
   * is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty)
   * @return access
  **/
  @javax.annotation.Nonnull
  public String getAccess() {
    return access;
  }


  public void setAccess(String access) {
    this.access = access;
  }


  public CMDocumentAcl isUser(Boolean isUser) {
    
    this.isUser = isUser;
    return this;
  }

   /**
   * \&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name)
   * @return isUser
  **/
  @javax.annotation.Nonnull
  public Boolean getIsUser() {
    return isUser;
  }


  public void setIsUser(Boolean isUser) {
    this.isUser = isUser;
  }


  public CMDocumentAcl user(Boolean user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  public Boolean getUser() {
    return user;
  }


  public void setUser(Boolean user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDocumentAcl cmDocumentAcl = (CMDocumentAcl) o;
    return Objects.equals(this.acl, cmDocumentAcl.acl) &&
        Objects.equals(this.access, cmDocumentAcl.access) &&
        Objects.equals(this.isUser, cmDocumentAcl.isUser) &&
        Objects.equals(this.user, cmDocumentAcl.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acl, access, isUser, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDocumentAcl {\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    isUser: ").append(toIndentedString(isUser)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("acl");
    openapiFields.add("access");
    openapiFields.add("isUser");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("acl");
    openapiRequiredFields.add("access");
    openapiRequiredFields.add("isUser");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDocumentAcl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDocumentAcl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDocumentAcl is not found in the empty JSON string", CMDocumentAcl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDocumentAcl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDocumentAcl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDocumentAcl.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("acl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acl").toString()));
      }
      if (!jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDocumentAcl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDocumentAcl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDocumentAcl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDocumentAcl.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDocumentAcl>() {
           @Override
           public void write(JsonWriter out, CMDocumentAcl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDocumentAcl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDocumentAcl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDocumentAcl
  * @throws IOException if the JSON string is invalid with respect to CMDocumentAcl
  */
  public static CMDocumentAcl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDocumentAcl.class);
  }

 /**
  * Convert an instance of CMDocumentAcl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

