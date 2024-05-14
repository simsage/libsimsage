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
 * LocatedRedaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class LocatedRedaction {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_SLICE_ID = "sliceId";
  @SerializedName(SERIALIZED_NAME_SLICE_ID)
  private String sliceId;

  public static final String SERIALIZED_NAME_DOCUMENT_KEY = "documentKey";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_KEY)
  private String documentKey;

  public static final String SERIALIZED_NAME_REDACTION_TYPE = "redactionType";
  @SerializedName(SERIALIZED_NAME_REDACTION_TYPE)
  private String redactionType;

  public static final String SERIALIZED_NAME_QUERY_ID = "queryId";
  @SerializedName(SERIALIZED_NAME_QUERY_ID)
  private Integer queryId;

  public static final String SERIALIZED_NAME_REDACTION_KEY = "redactionKey";
  @SerializedName(SERIALIZED_NAME_REDACTION_KEY)
  private String redactionKey;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word;

  public static final String SERIALIZED_NAME_IS_REDACTED = "isRedacted";
  @SerializedName(SERIALIZED_NAME_IS_REDACTED)
  private Boolean isRedacted;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private Float left;

  public static final String SERIALIZED_NAME_BOTTOM = "bottom";
  @SerializedName(SERIALIZED_NAME_BOTTOM)
  private Float bottom;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Float width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Float height;

  public LocatedRedaction() {
  }

  public LocatedRedaction projectId(String projectId) {
    
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


  public LocatedRedaction sliceId(String sliceId) {
    
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


  public LocatedRedaction documentKey(String documentKey) {
    
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


  public LocatedRedaction redactionType(String redactionType) {
    
    this.redactionType = redactionType;
    return this;
  }

   /**
   * Get redactionType
   * @return redactionType
  **/
  @javax.annotation.Nonnull
  public String getRedactionType() {
    return redactionType;
  }


  public void setRedactionType(String redactionType) {
    this.redactionType = redactionType;
  }


  public LocatedRedaction queryId(Integer queryId) {
    
    this.queryId = queryId;
    return this;
  }

   /**
   * Get queryId
   * @return queryId
  **/
  @javax.annotation.Nullable
  public Integer getQueryId() {
    return queryId;
  }


  public void setQueryId(Integer queryId) {
    this.queryId = queryId;
  }


  public LocatedRedaction redactionKey(String redactionKey) {
    
    this.redactionKey = redactionKey;
    return this;
  }

   /**
   * Get redactionKey
   * @return redactionKey
  **/
  @javax.annotation.Nullable
  public String getRedactionKey() {
    return redactionKey;
  }


  public void setRedactionKey(String redactionKey) {
    this.redactionKey = redactionKey;
  }


  public LocatedRedaction word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * Get word
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public LocatedRedaction isRedacted(Boolean isRedacted) {
    
    this.isRedacted = isRedacted;
    return this;
  }

   /**
   * Get isRedacted
   * @return isRedacted
  **/
  @javax.annotation.Nonnull
  public Boolean getIsRedacted() {
    return isRedacted;
  }


  public void setIsRedacted(Boolean isRedacted) {
    this.isRedacted = isRedacted;
  }


  public LocatedRedaction page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public LocatedRedaction left(Float left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @javax.annotation.Nonnull
  public Float getLeft() {
    return left;
  }


  public void setLeft(Float left) {
    this.left = left;
  }


  public LocatedRedaction bottom(Float bottom) {
    
    this.bottom = bottom;
    return this;
  }

   /**
   * Get bottom
   * @return bottom
  **/
  @javax.annotation.Nonnull
  public Float getBottom() {
    return bottom;
  }


  public void setBottom(Float bottom) {
    this.bottom = bottom;
  }


  public LocatedRedaction width(Float width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nonnull
  public Float getWidth() {
    return width;
  }


  public void setWidth(Float width) {
    this.width = width;
  }


  public LocatedRedaction height(Float height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  public Float getHeight() {
    return height;
  }


  public void setHeight(Float height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatedRedaction locatedRedaction = (LocatedRedaction) o;
    return Objects.equals(this.projectId, locatedRedaction.projectId) &&
        Objects.equals(this.sliceId, locatedRedaction.sliceId) &&
        Objects.equals(this.documentKey, locatedRedaction.documentKey) &&
        Objects.equals(this.redactionType, locatedRedaction.redactionType) &&
        Objects.equals(this.queryId, locatedRedaction.queryId) &&
        Objects.equals(this.redactionKey, locatedRedaction.redactionKey) &&
        Objects.equals(this.word, locatedRedaction.word) &&
        Objects.equals(this.isRedacted, locatedRedaction.isRedacted) &&
        Objects.equals(this.page, locatedRedaction.page) &&
        Objects.equals(this.left, locatedRedaction.left) &&
        Objects.equals(this.bottom, locatedRedaction.bottom) &&
        Objects.equals(this.width, locatedRedaction.width) &&
        Objects.equals(this.height, locatedRedaction.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, sliceId, documentKey, redactionType, queryId, redactionKey, word, isRedacted, page, left, bottom, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatedRedaction {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sliceId: ").append(toIndentedString(sliceId)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    redactionType: ").append(toIndentedString(redactionType)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    redactionKey: ").append(toIndentedString(redactionKey)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    isRedacted: ").append(toIndentedString(isRedacted)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("sliceId");
    openapiFields.add("documentKey");
    openapiFields.add("redactionType");
    openapiFields.add("queryId");
    openapiFields.add("redactionKey");
    openapiFields.add("word");
    openapiFields.add("isRedacted");
    openapiFields.add("page");
    openapiFields.add("left");
    openapiFields.add("bottom");
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("sliceId");
    openapiRequiredFields.add("documentKey");
    openapiRequiredFields.add("redactionType");
    openapiRequiredFields.add("isRedacted");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("left");
    openapiRequiredFields.add("bottom");
    openapiRequiredFields.add("width");
    openapiRequiredFields.add("height");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LocatedRedaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocatedRedaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocatedRedaction is not found in the empty JSON string", LocatedRedaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocatedRedaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocatedRedaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LocatedRedaction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if (!jsonObj.get("sliceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sliceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sliceId").toString()));
      }
      if (!jsonObj.get("documentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentKey").toString()));
      }
      if (!jsonObj.get("redactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redactionType").toString()));
      }
      if ((jsonObj.get("redactionKey") != null && !jsonObj.get("redactionKey").isJsonNull()) && !jsonObj.get("redactionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redactionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redactionKey").toString()));
      }
      if ((jsonObj.get("word") != null && !jsonObj.get("word").isJsonNull()) && !jsonObj.get("word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("word").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocatedRedaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocatedRedaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocatedRedaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocatedRedaction.class));

       return (TypeAdapter<T>) new TypeAdapter<LocatedRedaction>() {
           @Override
           public void write(JsonWriter out, LocatedRedaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocatedRedaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocatedRedaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocatedRedaction
  * @throws IOException if the JSON string is invalid with respect to LocatedRedaction
  */
  public static LocatedRedaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocatedRedaction.class);
  }

 /**
  * Convert an instance of LocatedRedaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

