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
import org.openapitools.client.model.Identifier;

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
 * CMGdprSearchDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMGdprSearchDetails {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DOCUMENT_TITLE = "documentTitle";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TITLE)
  private String documentTitle;

  public static final String SERIALIZED_NAME_OTHER_IDENTIFIERS = "otherIdentifiers";
  @SerializedName(SERIALIZED_NAME_OTHER_IDENTIFIERS)
  private List<Identifier> otherIdentifiers = new ArrayList<>();

  public CMGdprSearchDetails() {
  }

  public CMGdprSearchDetails firstName(String firstName) {
    
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


  public CMGdprSearchDetails lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CMGdprSearchDetails documentTitle(String documentTitle) {
    
    this.documentTitle = documentTitle;
    return this;
  }

   /**
   * Get documentTitle
   * @return documentTitle
  **/
  @javax.annotation.Nonnull
  public String getDocumentTitle() {
    return documentTitle;
  }


  public void setDocumentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
  }


  public CMGdprSearchDetails otherIdentifiers(List<Identifier> otherIdentifiers) {
    
    this.otherIdentifiers = otherIdentifiers;
    return this;
  }

  public CMGdprSearchDetails addOtherIdentifiersItem(Identifier otherIdentifiersItem) {
    if (this.otherIdentifiers == null) {
      this.otherIdentifiers = new ArrayList<>();
    }
    this.otherIdentifiers.add(otherIdentifiersItem);
    return this;
  }

   /**
   * Get otherIdentifiers
   * @return otherIdentifiers
  **/
  @javax.annotation.Nonnull
  public List<Identifier> getOtherIdentifiers() {
    return otherIdentifiers;
  }


  public void setOtherIdentifiers(List<Identifier> otherIdentifiers) {
    this.otherIdentifiers = otherIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMGdprSearchDetails cmGdprSearchDetails = (CMGdprSearchDetails) o;
    return Objects.equals(this.firstName, cmGdprSearchDetails.firstName) &&
        Objects.equals(this.lastName, cmGdprSearchDetails.lastName) &&
        Objects.equals(this.documentTitle, cmGdprSearchDetails.documentTitle) &&
        Objects.equals(this.otherIdentifiers, cmGdprSearchDetails.otherIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, documentTitle, otherIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMGdprSearchDetails {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    documentTitle: ").append(toIndentedString(documentTitle)).append("\n");
    sb.append("    otherIdentifiers: ").append(toIndentedString(otherIdentifiers)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("documentTitle");
    openapiFields.add("otherIdentifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("documentTitle");
    openapiRequiredFields.add("otherIdentifiers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMGdprSearchDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMGdprSearchDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMGdprSearchDetails is not found in the empty JSON string", CMGdprSearchDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMGdprSearchDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMGdprSearchDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMGdprSearchDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("documentTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentTitle").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("otherIdentifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("otherIdentifiers").toString()));
      }

      JsonArray jsonArrayotherIdentifiers = jsonObj.getAsJsonArray("otherIdentifiers");
      // validate the required field `otherIdentifiers` (array)
      for (int i = 0; i < jsonArrayotherIdentifiers.size(); i++) {
        Identifier.validateJsonElement(jsonArrayotherIdentifiers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMGdprSearchDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMGdprSearchDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMGdprSearchDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMGdprSearchDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CMGdprSearchDetails>() {
           @Override
           public void write(JsonWriter out, CMGdprSearchDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMGdprSearchDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMGdprSearchDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMGdprSearchDetails
  * @throws IOException if the JSON string is invalid with respect to CMGdprSearchDetails
  */
  public static CMGdprSearchDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMGdprSearchDetails.class);
  }

 /**
  * Convert an instance of CMGdprSearchDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

