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
import org.openapitools.client.model.CMDocumentAcl;

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
 * the source-folder add object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMAddSourceFolder {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "sourceName";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_ACLS = "acls";
  @SerializedName(SERIALIZED_NAME_ACLS)
  private List<CMDocumentAcl> acls = new ArrayList<>();

  public CMAddSourceFolder() {
  }

  public CMAddSourceFolder organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the main organisation (its guid id) for this source/crawler
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMAddSourceFolder kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id of this context item, a guid-string
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMAddSourceFolder sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * the source-folder&#39;s new name.
   * @return sourceName
  **/
  @javax.annotation.Nonnull
  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public CMAddSourceFolder acls(List<CMDocumentAcl> acls) {
    
    this.acls = acls;
    return this;
  }

  public CMAddSourceFolder addAclsItem(CMDocumentAcl aclsItem) {
    if (this.acls == null) {
      this.acls = new ArrayList<>();
    }
    this.acls.add(aclsItem);
    return this;
  }

   /**
   * the initial ACLs for this source-folder.
   * @return acls
  **/
  @javax.annotation.Nonnull
  public List<CMDocumentAcl> getAcls() {
    return acls;
  }


  public void setAcls(List<CMDocumentAcl> acls) {
    this.acls = acls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMAddSourceFolder cmAddSourceFolder = (CMAddSourceFolder) o;
    return Objects.equals(this.organisationId, cmAddSourceFolder.organisationId) &&
        Objects.equals(this.kbId, cmAddSourceFolder.kbId) &&
        Objects.equals(this.sourceName, cmAddSourceFolder.sourceName) &&
        Objects.equals(this.acls, cmAddSourceFolder.acls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, sourceName, acls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMAddSourceFolder {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
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
    openapiFields.add("kbId");
    openapiFields.add("sourceName");
    openapiFields.add("acls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sourceName");
    openapiRequiredFields.add("acls");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMAddSourceFolder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMAddSourceFolder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMAddSourceFolder is not found in the empty JSON string", CMAddSourceFolder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMAddSourceFolder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMAddSourceFolder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMAddSourceFolder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("sourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("acls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acls` to be an array in the JSON string but got `%s`", jsonObj.get("acls").toString()));
      }

      JsonArray jsonArrayacls = jsonObj.getAsJsonArray("acls");
      // validate the required field `acls` (array)
      for (int i = 0; i < jsonArrayacls.size(); i++) {
        CMDocumentAcl.validateJsonElement(jsonArrayacls.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMAddSourceFolder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMAddSourceFolder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMAddSourceFolder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMAddSourceFolder.class));

       return (TypeAdapter<T>) new TypeAdapter<CMAddSourceFolder>() {
           @Override
           public void write(JsonWriter out, CMAddSourceFolder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMAddSourceFolder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMAddSourceFolder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMAddSourceFolder
  * @throws IOException if the JSON string is invalid with respect to CMAddSourceFolder
  */
  public static CMAddSourceFolder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMAddSourceFolder.class);
  }

 /**
  * Convert an instance of CMAddSourceFolder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

