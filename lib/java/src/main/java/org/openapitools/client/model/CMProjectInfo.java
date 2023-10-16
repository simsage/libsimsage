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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CMSearchDefinition;
import org.openapitools.client.model.CMStepConfig;

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
 * CMProjectInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMProjectInfo {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private CMSearchDefinition search;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<CMStepConfig> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_SLICE_ACTIONS = "sliceActions";
  @SerializedName(SERIALIZED_NAME_SLICE_ACTIONS)
  private Map<String, String> sliceActions = new HashMap<>();

  public static final String SERIALIZED_NAME_SCREEN_CONFIGS = "screenConfigs";
  @SerializedName(SERIALIZED_NAME_SCREEN_CONFIGS)
  private Map<String, Map<String, Object>> screenConfigs = new HashMap<>();

  public CMProjectInfo() {
  }

  public CMProjectInfo key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CMProjectInfo caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @javax.annotation.Nonnull
  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }


  public CMProjectInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CMProjectInfo search(CMSearchDefinition search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nonnull
  public CMSearchDefinition getSearch() {
    return search;
  }


  public void setSearch(CMSearchDefinition search) {
    this.search = search;
  }


  public CMProjectInfo steps(List<CMStepConfig> steps) {
    
    this.steps = steps;
    return this;
  }

  public CMProjectInfo addStepsItem(CMStepConfig stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nonnull
  public List<CMStepConfig> getSteps() {
    return steps;
  }


  public void setSteps(List<CMStepConfig> steps) {
    this.steps = steps;
  }


  public CMProjectInfo sliceActions(Map<String, String> sliceActions) {
    
    this.sliceActions = sliceActions;
    return this;
  }

  public CMProjectInfo putSliceActionsItem(String key, String sliceActionsItem) {
    if (this.sliceActions == null) {
      this.sliceActions = new HashMap<>();
    }
    this.sliceActions.put(key, sliceActionsItem);
    return this;
  }

   /**
   * Get sliceActions
   * @return sliceActions
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getSliceActions() {
    return sliceActions;
  }


  public void setSliceActions(Map<String, String> sliceActions) {
    this.sliceActions = sliceActions;
  }


  public CMProjectInfo screenConfigs(Map<String, Map<String, Object>> screenConfigs) {
    
    this.screenConfigs = screenConfigs;
    return this;
  }

  public CMProjectInfo putScreenConfigsItem(String key, Map<String, Object> screenConfigsItem) {
    if (this.screenConfigs == null) {
      this.screenConfigs = new HashMap<>();
    }
    this.screenConfigs.put(key, screenConfigsItem);
    return this;
  }

   /**
   * Get screenConfigs
   * @return screenConfigs
  **/
  @javax.annotation.Nonnull
  public Map<String, Map<String, Object>> getScreenConfigs() {
    return screenConfigs;
  }


  public void setScreenConfigs(Map<String, Map<String, Object>> screenConfigs) {
    this.screenConfigs = screenConfigs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMProjectInfo cmProjectInfo = (CMProjectInfo) o;
    return Objects.equals(this.key, cmProjectInfo.key) &&
        Objects.equals(this.caption, cmProjectInfo.caption) &&
        Objects.equals(this.description, cmProjectInfo.description) &&
        Objects.equals(this.search, cmProjectInfo.search) &&
        Objects.equals(this.steps, cmProjectInfo.steps) &&
        Objects.equals(this.sliceActions, cmProjectInfo.sliceActions) &&
        Objects.equals(this.screenConfigs, cmProjectInfo.screenConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, caption, description, search, steps, sliceActions, screenConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMProjectInfo {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    sliceActions: ").append(toIndentedString(sliceActions)).append("\n");
    sb.append("    screenConfigs: ").append(toIndentedString(screenConfigs)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("caption");
    openapiFields.add("description");
    openapiFields.add("search");
    openapiFields.add("steps");
    openapiFields.add("sliceActions");
    openapiFields.add("screenConfigs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("caption");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("search");
    openapiRequiredFields.add("steps");
    openapiRequiredFields.add("sliceActions");
    openapiRequiredFields.add("screenConfigs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMProjectInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMProjectInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMProjectInfo is not found in the empty JSON string", CMProjectInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMProjectInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMProjectInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMProjectInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `search`
      CMSearchDefinition.validateJsonElement(jsonObj.get("search"));
      // ensure the json data is an array
      if (!jsonObj.get("steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
      }

      JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
      // validate the required field `steps` (array)
      for (int i = 0; i < jsonArraysteps.size(); i++) {
        CMStepConfig.validateJsonElement(jsonArraysteps.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMProjectInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMProjectInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMProjectInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMProjectInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CMProjectInfo>() {
           @Override
           public void write(JsonWriter out, CMProjectInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMProjectInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMProjectInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMProjectInfo
  * @throws IOException if the JSON string is invalid with respect to CMProjectInfo
  */
  public static CMProjectInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMProjectInfo.class);
  }

 /**
  * Convert an instance of CMProjectInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
