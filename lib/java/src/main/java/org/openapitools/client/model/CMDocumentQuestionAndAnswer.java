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
 * A basic document question/answer pair for AI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMDocumentQuestionAndAnswer {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public static final String SERIALIZED_NAME_CONVERSATION_LIST = "conversationList";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_LIST)
  private String conversationList;

  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer;

  public CMDocumentQuestionAndAnswer() {
  }

  public CMDocumentQuestionAndAnswer organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id).
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMDocumentQuestionAndAnswer kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id (guid) to use
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMDocumentQuestionAndAnswer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The unique URL of a document.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMDocumentQuestionAndAnswer urlId(Integer urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * The unique URL-ID of a document.
   * @return urlId
  **/
  @javax.annotation.Nonnull
  public Integer getUrlId() {
    return urlId;
  }


  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }


  public CMDocumentQuestionAndAnswer conversationList(String conversationList) {
    
    this.conversationList = conversationList;
    return this;
  }

   /**
   * the context of the conversation thusfar
   * @return conversationList
  **/
  @javax.annotation.Nonnull
  public String getConversationList() {
    return conversationList;
  }


  public void setConversationList(String conversationList) {
    this.conversationList = conversationList;
  }


  public CMDocumentQuestionAndAnswer answer(String answer) {
    
    this.answer = answer;
    return this;
  }

   /**
   * The answer for the given question
   * @return answer
  **/
  @javax.annotation.Nonnull
  public String getAnswer() {
    return answer;
  }


  public void setAnswer(String answer) {
    this.answer = answer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDocumentQuestionAndAnswer cmDocumentQuestionAndAnswer = (CMDocumentQuestionAndAnswer) o;
    return Objects.equals(this.organisationId, cmDocumentQuestionAndAnswer.organisationId) &&
        Objects.equals(this.kbId, cmDocumentQuestionAndAnswer.kbId) &&
        Objects.equals(this.url, cmDocumentQuestionAndAnswer.url) &&
        Objects.equals(this.urlId, cmDocumentQuestionAndAnswer.urlId) &&
        Objects.equals(this.conversationList, cmDocumentQuestionAndAnswer.conversationList) &&
        Objects.equals(this.answer, cmDocumentQuestionAndAnswer.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbId, url, urlId, conversationList, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDocumentQuestionAndAnswer {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    conversationList: ").append(toIndentedString(conversationList)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("urlId");
    openapiFields.add("conversationList");
    openapiFields.add("answer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("conversationList");
    openapiRequiredFields.add("answer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDocumentQuestionAndAnswer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDocumentQuestionAndAnswer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDocumentQuestionAndAnswer is not found in the empty JSON string", CMDocumentQuestionAndAnswer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDocumentQuestionAndAnswer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDocumentQuestionAndAnswer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDocumentQuestionAndAnswer.openapiRequiredFields) {
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
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("conversationList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversationList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversationList").toString()));
      }
      if (!jsonObj.get("answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDocumentQuestionAndAnswer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDocumentQuestionAndAnswer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDocumentQuestionAndAnswer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDocumentQuestionAndAnswer.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDocumentQuestionAndAnswer>() {
           @Override
           public void write(JsonWriter out, CMDocumentQuestionAndAnswer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDocumentQuestionAndAnswer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDocumentQuestionAndAnswer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDocumentQuestionAndAnswer
  * @throws IOException if the JSON string is invalid with respect to CMDocumentQuestionAndAnswer
  */
  public static CMDocumentQuestionAndAnswer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDocumentQuestionAndAnswer.class);
  }

 /**
  * Convert an instance of CMDocumentQuestionAndAnswer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

