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
 * Organisation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class Organisation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_AUTO_CREATE_S_S_O_USERS = "autoCreateSSOUsers";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_S_S_O_USERS)
  private Boolean autoCreateSSOUsers;

  public static final String SERIALIZED_NAME_AUTO_CREATE_S_S_O_DOMAIN_LIST = "autoCreateSSODomainList";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_S_S_O_DOMAIN_LIST)
  private List<String> autoCreateSSODomainList = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_CREATE_S_S_O_A_C_L_LIST = "autoCreateSSOACLList";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_S_S_O_A_C_L_LIST)
  private List<String> autoCreateSSOACLList = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTO_CREATE_S_S_O_ROLE_LIST = "autoCreateSSORoleList";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_S_S_O_ROLE_LIST)
  private List<String> autoCreateSSORoleList = new ArrayList<>();

  public Organisation() {
  }

  public Organisation id(String id) {
    
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


  public Organisation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Organisation enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Organisation autoCreateSSOUsers(Boolean autoCreateSSOUsers) {
    
    this.autoCreateSSOUsers = autoCreateSSOUsers;
    return this;
  }

   /**
   * Get autoCreateSSOUsers
   * @return autoCreateSSOUsers
  **/
  @javax.annotation.Nonnull
  public Boolean getAutoCreateSSOUsers() {
    return autoCreateSSOUsers;
  }


  public void setAutoCreateSSOUsers(Boolean autoCreateSSOUsers) {
    this.autoCreateSSOUsers = autoCreateSSOUsers;
  }


  public Organisation autoCreateSSODomainList(List<String> autoCreateSSODomainList) {
    
    this.autoCreateSSODomainList = autoCreateSSODomainList;
    return this;
  }

  public Organisation addAutoCreateSSODomainListItem(String autoCreateSSODomainListItem) {
    if (this.autoCreateSSODomainList == null) {
      this.autoCreateSSODomainList = new ArrayList<>();
    }
    this.autoCreateSSODomainList.add(autoCreateSSODomainListItem);
    return this;
  }

   /**
   * Get autoCreateSSODomainList
   * @return autoCreateSSODomainList
  **/
  @javax.annotation.Nonnull
  public List<String> getAutoCreateSSODomainList() {
    return autoCreateSSODomainList;
  }


  public void setAutoCreateSSODomainList(List<String> autoCreateSSODomainList) {
    this.autoCreateSSODomainList = autoCreateSSODomainList;
  }


  public Organisation autoCreateSSOACLList(List<String> autoCreateSSOACLList) {
    
    this.autoCreateSSOACLList = autoCreateSSOACLList;
    return this;
  }

  public Organisation addAutoCreateSSOACLListItem(String autoCreateSSOACLListItem) {
    if (this.autoCreateSSOACLList == null) {
      this.autoCreateSSOACLList = new ArrayList<>();
    }
    this.autoCreateSSOACLList.add(autoCreateSSOACLListItem);
    return this;
  }

   /**
   * Get autoCreateSSOACLList
   * @return autoCreateSSOACLList
  **/
  @javax.annotation.Nonnull
  public List<String> getAutoCreateSSOACLList() {
    return autoCreateSSOACLList;
  }


  public void setAutoCreateSSOACLList(List<String> autoCreateSSOACLList) {
    this.autoCreateSSOACLList = autoCreateSSOACLList;
  }


  public Organisation autoCreateSSORoleList(List<String> autoCreateSSORoleList) {
    
    this.autoCreateSSORoleList = autoCreateSSORoleList;
    return this;
  }

  public Organisation addAutoCreateSSORoleListItem(String autoCreateSSORoleListItem) {
    if (this.autoCreateSSORoleList == null) {
      this.autoCreateSSORoleList = new ArrayList<>();
    }
    this.autoCreateSSORoleList.add(autoCreateSSORoleListItem);
    return this;
  }

   /**
   * Get autoCreateSSORoleList
   * @return autoCreateSSORoleList
  **/
  @javax.annotation.Nonnull
  public List<String> getAutoCreateSSORoleList() {
    return autoCreateSSORoleList;
  }


  public void setAutoCreateSSORoleList(List<String> autoCreateSSORoleList) {
    this.autoCreateSSORoleList = autoCreateSSORoleList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.id, organisation.id) &&
        Objects.equals(this.name, organisation.name) &&
        Objects.equals(this.enabled, organisation.enabled) &&
        Objects.equals(this.autoCreateSSOUsers, organisation.autoCreateSSOUsers) &&
        Objects.equals(this.autoCreateSSODomainList, organisation.autoCreateSSODomainList) &&
        Objects.equals(this.autoCreateSSOACLList, organisation.autoCreateSSOACLList) &&
        Objects.equals(this.autoCreateSSORoleList, organisation.autoCreateSSORoleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, autoCreateSSOUsers, autoCreateSSODomainList, autoCreateSSOACLList, autoCreateSSORoleList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoCreateSSOUsers: ").append(toIndentedString(autoCreateSSOUsers)).append("\n");
    sb.append("    autoCreateSSODomainList: ").append(toIndentedString(autoCreateSSODomainList)).append("\n");
    sb.append("    autoCreateSSOACLList: ").append(toIndentedString(autoCreateSSOACLList)).append("\n");
    sb.append("    autoCreateSSORoleList: ").append(toIndentedString(autoCreateSSORoleList)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("enabled");
    openapiFields.add("autoCreateSSOUsers");
    openapiFields.add("autoCreateSSODomainList");
    openapiFields.add("autoCreateSSOACLList");
    openapiFields.add("autoCreateSSORoleList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("autoCreateSSOUsers");
    openapiRequiredFields.add("autoCreateSSODomainList");
    openapiRequiredFields.add("autoCreateSSOACLList");
    openapiRequiredFields.add("autoCreateSSORoleList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Organisation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Organisation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Organisation is not found in the empty JSON string", Organisation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Organisation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Organisation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Organisation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("autoCreateSSODomainList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("autoCreateSSODomainList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCreateSSODomainList` to be an array in the JSON string but got `%s`", jsonObj.get("autoCreateSSODomainList").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("autoCreateSSOACLList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("autoCreateSSOACLList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCreateSSOACLList` to be an array in the JSON string but got `%s`", jsonObj.get("autoCreateSSOACLList").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("autoCreateSSORoleList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("autoCreateSSORoleList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `autoCreateSSORoleList` to be an array in the JSON string but got `%s`", jsonObj.get("autoCreateSSORoleList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Organisation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Organisation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Organisation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Organisation.class));

       return (TypeAdapter<T>) new TypeAdapter<Organisation>() {
           @Override
           public void write(JsonWriter out, Organisation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Organisation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Organisation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Organisation
  * @throws IOException if the JSON string is invalid with respect to Organisation
  */
  public static Organisation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Organisation.class);
  }

 /**
  * Convert an instance of Organisation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

