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
 * CMRedaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMRedaction {
  /**
   * Gets or Sets redactionType
   */
  @JsonAdapter(RedactionTypeEnum.Adapter.class)
  public enum RedactionTypeEnum {
    SEARCH("SEARCH"),
    
    SEMANTIC("SEMANTIC"),
    
    MANUAL("MANUAL");

    private String value;

    RedactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RedactionTypeEnum fromValue(String value) {
      for (RedactionTypeEnum b : RedactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RedactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RedactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RedactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RedactionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REDACTION_TYPE = "redactionType";
  @SerializedName(SERIALIZED_NAME_REDACTION_TYPE)
  private RedactionTypeEnum redactionType;

  public static final String SERIALIZED_NAME_TYPE_KEY = "typeKey";
  @SerializedName(SERIALIZED_NAME_TYPE_KEY)
  private String typeKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height;

  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private Double left;

  public static final String SERIALIZED_NAME_TOP = "top";
  @SerializedName(SERIALIZED_NAME_TOP)
  private Double top;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Double width;

  public CMRedaction() {
  }

  public CMRedaction redactionType(RedactionTypeEnum redactionType) {
    
    this.redactionType = redactionType;
    return this;
  }

   /**
   * Get redactionType
   * @return redactionType
  **/
  @javax.annotation.Nonnull
  public RedactionTypeEnum getRedactionType() {
    return redactionType;
  }


  public void setRedactionType(RedactionTypeEnum redactionType) {
    this.redactionType = redactionType;
  }


  public CMRedaction typeKey(String typeKey) {
    
    this.typeKey = typeKey;
    return this;
  }

   /**
   * Get typeKey
   * @return typeKey
  **/
  @javax.annotation.Nonnull
  public String getTypeKey() {
    return typeKey;
  }


  public void setTypeKey(String typeKey) {
    this.typeKey = typeKey;
  }


  public CMRedaction value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CMRedaction page(Integer page) {
    
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


  public CMRedaction height(Double height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {
    this.height = height;
  }


  public CMRedaction left(Double left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @javax.annotation.Nonnull
  public Double getLeft() {
    return left;
  }


  public void setLeft(Double left) {
    this.left = left;
  }


  public CMRedaction top(Double top) {
    
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @javax.annotation.Nonnull
  public Double getTop() {
    return top;
  }


  public void setTop(Double top) {
    this.top = top;
  }


  public CMRedaction width(Double width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nonnull
  public Double getWidth() {
    return width;
  }


  public void setWidth(Double width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMRedaction cmRedaction = (CMRedaction) o;
    return Objects.equals(this.redactionType, cmRedaction.redactionType) &&
        Objects.equals(this.typeKey, cmRedaction.typeKey) &&
        Objects.equals(this.value, cmRedaction.value) &&
        Objects.equals(this.page, cmRedaction.page) &&
        Objects.equals(this.height, cmRedaction.height) &&
        Objects.equals(this.left, cmRedaction.left) &&
        Objects.equals(this.top, cmRedaction.top) &&
        Objects.equals(this.width, cmRedaction.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redactionType, typeKey, value, page, height, left, top, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMRedaction {\n");
    sb.append("    redactionType: ").append(toIndentedString(redactionType)).append("\n");
    sb.append("    typeKey: ").append(toIndentedString(typeKey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("redactionType");
    openapiFields.add("typeKey");
    openapiFields.add("value");
    openapiFields.add("page");
    openapiFields.add("height");
    openapiFields.add("left");
    openapiFields.add("top");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redactionType");
    openapiRequiredFields.add("typeKey");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("left");
    openapiRequiredFields.add("top");
    openapiRequiredFields.add("width");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMRedaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMRedaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMRedaction is not found in the empty JSON string", CMRedaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMRedaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMRedaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMRedaction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("redactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redactionType").toString()));
      }
      if (!jsonObj.get("typeKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeKey").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMRedaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMRedaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMRedaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMRedaction.class));

       return (TypeAdapter<T>) new TypeAdapter<CMRedaction>() {
           @Override
           public void write(JsonWriter out, CMRedaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMRedaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMRedaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMRedaction
  * @throws IOException if the JSON string is invalid with respect to CMRedaction
  */
  public static CMRedaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMRedaction.class);
  }

 /**
  * Convert an instance of CMRedaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

