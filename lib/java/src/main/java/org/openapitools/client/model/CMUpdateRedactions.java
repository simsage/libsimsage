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
import org.openapitools.client.model.CMLocatedRedaction;

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
 * CMUpdateRedactions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMUpdateRedactions {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_SLICE_ID = "sliceId";
  @SerializedName(SERIALIZED_NAME_SLICE_ID)
  private String sliceId;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_NEXT_STATUS = "nextStatus";
  @SerializedName(SERIALIZED_NAME_NEXT_STATUS)
  private String nextStatus;

  public static final String SERIALIZED_NAME_REDACTIONS = "redactions";
  @SerializedName(SERIALIZED_NAME_REDACTIONS)
  private List<CMLocatedRedaction> redactions = new ArrayList<>();

  public CMUpdateRedactions() {
  }

  public CMUpdateRedactions organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMUpdateRedactions projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public CMUpdateRedactions sliceId(String sliceId) {
    
    this.sliceId = sliceId;
    return this;
  }

   /**
   * Get sliceId
   * @return sliceId
  **/
  @javax.annotation.Nonnull
  public String getSliceId() {
    return sliceId;
  }


  public void setSliceId(String sliceId) {
    this.sliceId = sliceId;
  }


  public CMUpdateRedactions documentKey(String documentKey) {
    
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @javax.annotation.Nonnull
  public String getDocumentKey() {
    return documentKey;
  }


  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }


  public CMUpdateRedactions nextStatus(String nextStatus) {
    
    this.nextStatus = nextStatus;
    return this;
  }

   /**
   * Get nextStatus
   * @return nextStatus
  **/
  @javax.annotation.Nonnull
  public String getNextStatus() {
    return nextStatus;
  }


  public void setNextStatus(String nextStatus) {
    this.nextStatus = nextStatus;
  }


  public CMUpdateRedactions redactions(List<CMLocatedRedaction> redactions) {
    
    this.redactions = redactions;
    return this;
  }

  public CMUpdateRedactions addRedactionsItem(CMLocatedRedaction redactionsItem) {
    if (this.redactions == null) {
      this.redactions = new ArrayList<>();
    }
    this.redactions.add(redactionsItem);
    return this;
  }

   /**
   * Get redactions
   * @return redactions
  **/
  @javax.annotation.Nonnull
  public List<CMLocatedRedaction> getRedactions() {
    return redactions;
  }


  public void setRedactions(List<CMLocatedRedaction> redactions) {
    this.redactions = redactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUpdateRedactions cmUpdateRedactions = (CMUpdateRedactions) o;
    return Objects.equals(this.organisationId, cmUpdateRedactions.organisationId) &&
        Objects.equals(this.projectId, cmUpdateRedactions.projectId) &&
        Objects.equals(this.sliceId, cmUpdateRedactions.sliceId) &&
        Objects.equals(this.documentKey, cmUpdateRedactions.documentKey) &&
        Objects.equals(this.nextStatus, cmUpdateRedactions.nextStatus) &&
        Objects.equals(this.redactions, cmUpdateRedactions.redactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, projectId, sliceId, documentKey, nextStatus, redactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUpdateRedactions {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    nextStatus: ").append(toIndentedString(nextStatus)).append("\n");
    sb.append("    redactions: ").append(toIndentedString(redactions)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("sliceId");
    openapiFields.add("documentKey");
    openapiFields.add("nextStatus");
    openapiFields.add("redactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("nextStatus");
    openapiRequiredFields.add("redactions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUpdateRedactions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUpdateRedactions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUpdateRedactions is not found in the empty JSON string", CMUpdateRedactions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUpdateRedactions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUpdateRedactions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUpdateRedactions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("sliceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sliceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sliceId").toString()));
      }
      if (!jsonObj.get("documentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentKey").toString()));
      }
      if (!jsonObj.get("nextStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextStatus").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("redactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redactions` to be an array in the JSON string but got `%s`", jsonObj.get("redactions").toString()));
      }

      JsonArray jsonArrayredactions = jsonObj.getAsJsonArray("redactions");
      // validate the required field `redactions` (array)
      for (int i = 0; i < jsonArrayredactions.size(); i++) {
        CMLocatedRedaction.validateJsonElement(jsonArrayredactions.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMUpdateRedactions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUpdateRedactions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUpdateRedactions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUpdateRedactions.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUpdateRedactions>() {
           @Override
           public void write(JsonWriter out, CMUpdateRedactions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUpdateRedactions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUpdateRedactions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUpdateRedactions
  * @throws IOException if the JSON string is invalid with respect to CMUpdateRedactions
  */
  public static CMUpdateRedactions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUpdateRedactions.class);
  }

 /**
  * Convert an instance of CMUpdateRedactions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

