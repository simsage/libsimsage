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
import org.openapitools.client.model.CMCompoundQuery;
import org.openapitools.client.model.CMQueryToken;
import org.openapitools.client.model.CMSimpleQuery;
import org.openapitools.client.model.CMSliceQueryDefinition;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class CMSliceConfigQuery extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CMSliceConfigQuery.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CMSliceConfigQuery.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CMSliceConfigQuery' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CMCompoundQuery> adapterCMCompoundQuery = gson.getDelegateAdapter(this, TypeToken.get(CMCompoundQuery.class));
            final TypeAdapter<CMSimpleQuery> adapterCMSimpleQuery = gson.getDelegateAdapter(this, TypeToken.get(CMSimpleQuery.class));

            return (TypeAdapter<T>) new TypeAdapter<CMSliceConfigQuery>() {
                @Override
                public void write(JsonWriter out, CMSliceConfigQuery value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CMCompoundQuery`
                    if (value.getActualInstance() instanceof CMCompoundQuery) {
                      JsonElement element = adapterCMCompoundQuery.toJsonTree((CMCompoundQuery)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CMSimpleQuery`
                    if (value.getActualInstance() instanceof CMSimpleQuery) {
                      JsonElement element = adapterCMSimpleQuery.toJsonTree((CMSimpleQuery)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CMCompoundQuery, CMSimpleQuery");
                }

                @Override
                public CMSliceConfigQuery read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CMCompoundQuery
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CMCompoundQuery.validateJsonElement(jsonElement);
                      actualAdapter = adapterCMCompoundQuery;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CMCompoundQuery'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CMCompoundQuery failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CMCompoundQuery'", e);
                    }
                    // deserialize CMSimpleQuery
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CMSimpleQuery.validateJsonElement(jsonElement);
                      actualAdapter = adapterCMSimpleQuery;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CMSimpleQuery'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CMSimpleQuery failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CMSimpleQuery'", e);
                    }

                    if (match == 1) {
                        CMSliceConfigQuery ret = new CMSliceConfigQuery();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CMSliceConfigQuery: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CMSliceConfigQuery() {
        super("oneOf", Boolean.FALSE);
    }

    public CMSliceConfigQuery(CMCompoundQuery o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CMSliceConfigQuery(CMSimpleQuery o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CMCompoundQuery", CMCompoundQuery.class);
        schemas.put("CMSimpleQuery", CMSimpleQuery.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CMSliceConfigQuery.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CMCompoundQuery, CMSimpleQuery
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CMCompoundQuery) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CMSimpleQuery) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CMCompoundQuery, CMSimpleQuery");
    }

    /**
     * Get the actual instance, which can be the following:
     * CMCompoundQuery, CMSimpleQuery
     *
     * @return The actual instance (CMCompoundQuery, CMSimpleQuery)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CMCompoundQuery`. If the actual instance is not `CMCompoundQuery`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CMCompoundQuery`
     * @throws ClassCastException if the instance is not `CMCompoundQuery`
     */
    public CMCompoundQuery getCMCompoundQuery() throws ClassCastException {
        return (CMCompoundQuery)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CMSimpleQuery`. If the actual instance is not `CMSimpleQuery`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CMSimpleQuery`
     * @throws ClassCastException if the instance is not `CMSimpleQuery`
     */
    public CMSimpleQuery getCMSimpleQuery() throws ClassCastException {
        return (CMSimpleQuery)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSliceConfigQuery
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CMCompoundQuery
    try {
      CMCompoundQuery.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CMCompoundQuery failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CMSimpleQuery
    try {
      CMSimpleQuery.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CMSimpleQuery failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CMSliceConfigQuery with oneOf schemas: CMCompoundQuery, CMSimpleQuery. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CMSliceConfigQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSliceConfigQuery
  * @throws IOException if the JSON string is invalid with respect to CMSliceConfigQuery
  */
  public static CMSliceConfigQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSliceConfigQuery.class);
  }

 /**
  * Convert an instance of CMSliceConfigQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
