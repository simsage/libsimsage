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
import org.openapitools.client.model.Session;
import org.openapitools.client.model.User;

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
 * SignInDmsCmd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class SignInDmsCmd {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_RETURN_ADDRESS = "returnAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_ADDRESS)
  private String returnAddress;

  public static final String SERIALIZED_NAME_ERROR_STR = "errorStr";
  @SerializedName(SERIALIZED_NAME_ERROR_STR)
  private String errorStr;

  public static final String SERIALIZED_NAME_TIME_OUT = "timeOut";
  @SerializedName(SERIALIZED_NAME_TIME_OUT)
  private Long timeOut;

  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_IS_RETURN_RESULT = "isReturnResult";
  @SerializedName(SERIALIZED_NAME_IS_RETURN_RESULT)
  private Boolean isReturnResult;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private String remoteAddress;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_RETURN_RESULT = "returnResult";
  @SerializedName(SERIALIZED_NAME_RETURN_RESULT)
  private Boolean returnResult;

  public SignInDmsCmd() {
  }

  public SignInDmsCmd jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nonnull
  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public SignInDmsCmd returnAddress(String returnAddress) {
    
    this.returnAddress = returnAddress;
    return this;
  }

   /**
   * Get returnAddress
   * @return returnAddress
  **/
  @javax.annotation.Nonnull
  public String getReturnAddress() {
    return returnAddress;
  }


  public void setReturnAddress(String returnAddress) {
    this.returnAddress = returnAddress;
  }


  public SignInDmsCmd errorStr(String errorStr) {
    
    this.errorStr = errorStr;
    return this;
  }

   /**
   * Get errorStr
   * @return errorStr
  **/
  @javax.annotation.Nonnull
  public String getErrorStr() {
    return errorStr;
  }


  public void setErrorStr(String errorStr) {
    this.errorStr = errorStr;
  }


  public SignInDmsCmd timeOut(Long timeOut) {
    
    this.timeOut = timeOut;
    return this;
  }

   /**
   * Get timeOut
   * @return timeOut
  **/
  @javax.annotation.Nonnull
  public Long getTimeOut() {
    return timeOut;
  }


  public void setTimeOut(Long timeOut) {
    this.timeOut = timeOut;
  }


  public SignInDmsCmd async(Boolean async) {
    
    this.async = async;
    return this;
  }

   /**
   * Get async
   * @return async
  **/
  @javax.annotation.Nonnull
  public Boolean getAsync() {
    return async;
  }


  public void setAsync(Boolean async) {
    this.async = async;
  }


  public SignInDmsCmd isReturnResult(Boolean isReturnResult) {
    
    this.isReturnResult = isReturnResult;
    return this;
  }

   /**
   * Get isReturnResult
   * @return isReturnResult
  **/
  @javax.annotation.Nonnull
  public Boolean getIsReturnResult() {
    return isReturnResult;
  }


  public void setIsReturnResult(Boolean isReturnResult) {
    this.isReturnResult = isReturnResult;
  }


  public SignInDmsCmd email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public SignInDmsCmd password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SignInDmsCmd roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public SignInDmsCmd addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nonnull
  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public SignInDmsCmd remoteAddress(String remoteAddress) {
    
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @javax.annotation.Nonnull
  public String getRemoteAddress() {
    return remoteAddress;
  }


  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }


  public SignInDmsCmd session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nonnull
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public SignInDmsCmd user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public SignInDmsCmd organisationId(String organisationId) {
    
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


  public SignInDmsCmd returnResult(Boolean returnResult) {
    
    this.returnResult = returnResult;
    return this;
  }

   /**
   * Get returnResult
   * @return returnResult
  **/
  @javax.annotation.Nullable
  public Boolean getReturnResult() {
    return returnResult;
  }


  public void setReturnResult(Boolean returnResult) {
    this.returnResult = returnResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignInDmsCmd signInDmsCmd = (SignInDmsCmd) o;
    return Objects.equals(this.jobId, signInDmsCmd.jobId) &&
        Objects.equals(this.returnAddress, signInDmsCmd.returnAddress) &&
        Objects.equals(this.errorStr, signInDmsCmd.errorStr) &&
        Objects.equals(this.timeOut, signInDmsCmd.timeOut) &&
        Objects.equals(this.async, signInDmsCmd.async) &&
        Objects.equals(this.isReturnResult, signInDmsCmd.isReturnResult) &&
        Objects.equals(this.email, signInDmsCmd.email) &&
        Objects.equals(this.password, signInDmsCmd.password) &&
        Objects.equals(this.roles, signInDmsCmd.roles) &&
        Objects.equals(this.remoteAddress, signInDmsCmd.remoteAddress) &&
        Objects.equals(this.session, signInDmsCmd.session) &&
        Objects.equals(this.user, signInDmsCmd.user) &&
        Objects.equals(this.organisationId, signInDmsCmd.organisationId) &&
        Objects.equals(this.returnResult, signInDmsCmd.returnResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, returnAddress, errorStr, timeOut, async, isReturnResult, email, password, roles, remoteAddress, session, user, organisationId, returnResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignInDmsCmd {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    errorStr: ").append(toIndentedString(errorStr)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    isReturnResult: ").append(toIndentedString(isReturnResult)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    returnResult: ").append(toIndentedString(returnResult)).append("\n");
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
    openapiFields.add("jobId");
    openapiFields.add("returnAddress");
    openapiFields.add("errorStr");
    openapiFields.add("timeOut");
    openapiFields.add("async");
    openapiFields.add("isReturnResult");
    openapiFields.add("email");
    openapiFields.add("password");
    openapiFields.add("roles");
    openapiFields.add("remoteAddress");
    openapiFields.add("session");
    openapiFields.add("user");
    openapiFields.add("organisationId");
    openapiFields.add("returnResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobId");
    openapiRequiredFields.add("returnAddress");
    openapiRequiredFields.add("errorStr");
    openapiRequiredFields.add("timeOut");
    openapiRequiredFields.add("async");
    openapiRequiredFields.add("isReturnResult");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("remoteAddress");
    openapiRequiredFields.add("session");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("organisationId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SignInDmsCmd
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SignInDmsCmd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SignInDmsCmd is not found in the empty JSON string", SignInDmsCmd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SignInDmsCmd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SignInDmsCmd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SignInDmsCmd.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if (!jsonObj.get("returnAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnAddress").toString()));
      }
      if (!jsonObj.get("errorStr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorStr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorStr").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("roles") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      if (!jsonObj.get("remoteAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteAddress").toString()));
      }
      // validate the required field `session`
      Session.validateJsonElement(jsonObj.get("session"));
      // validate the required field `user`
      User.validateJsonElement(jsonObj.get("user"));
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SignInDmsCmd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SignInDmsCmd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SignInDmsCmd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SignInDmsCmd.class));

       return (TypeAdapter<T>) new TypeAdapter<SignInDmsCmd>() {
           @Override
           public void write(JsonWriter out, SignInDmsCmd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SignInDmsCmd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SignInDmsCmd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SignInDmsCmd
  * @throws IOException if the JSON string is invalid with respect to SignInDmsCmd
  */
  public static SignInDmsCmd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SignInDmsCmd.class);
  }

 /**
  * Convert an instance of SignInDmsCmd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

