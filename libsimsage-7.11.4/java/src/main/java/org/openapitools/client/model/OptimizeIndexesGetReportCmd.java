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
 * OptimizeIndexesGetReportCmd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T13:18:33.437170740+01:00[Europe/London]")
public class OptimizeIndexesGetReportCmd {
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

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NUMBER_OF_SHARDS = "numberOfShards";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SHARDS)
  private Integer numberOfShards;

  public static final String SERIALIZED_NAME_NUM_URLS = "numUrls";
  @SerializedName(SERIALIZED_NAME_NUM_URLS)
  private Integer numUrls;

  public static final String SERIALIZED_NAME_INDEX_SET = "indexSet";
  @SerializedName(SERIALIZED_NAME_INDEX_SET)
  private Integer indexSet;

  public static final String SERIALIZED_NAME_NUM_URLS_REMOVED = "numUrlsRemoved";
  @SerializedName(SERIALIZED_NAME_NUM_URLS_REMOVED)
  private Integer numUrlsRemoved;

  public static final String SERIALIZED_NAME_TOTAL_OFFSETS = "totalOffsets";
  @SerializedName(SERIALIZED_NAME_TOTAL_OFFSETS)
  private Long totalOffsets;

  public static final String SERIALIZED_NAME_METADATA_ITEM_COUNT = "metadataItemCount";
  @SerializedName(SERIALIZED_NAME_METADATA_ITEM_COUNT)
  private Integer metadataItemCount;

  public static final String SERIALIZED_NAME_NUMBER_OF_TOTAL_INDEXES = "numberOfTotalIndexes";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_TOTAL_INDEXES)
  private Integer numberOfTotalIndexes;

  public static final String SERIALIZED_NAME_NUM_OPTIMIZED_INDEXES = "numOptimizedIndexes";
  @SerializedName(SERIALIZED_NAME_NUM_OPTIMIZED_INDEXES)
  private Integer numOptimizedIndexes;

  public static final String SERIALIZED_NAME_NUM_INDEXES_REMOVED = "numIndexesRemoved";
  @SerializedName(SERIALIZED_NAME_NUM_INDEXES_REMOVED)
  private Integer numIndexesRemoved;

  public static final String SERIALIZED_NAME_NUM_OPTIMIZED_REMOVED = "numOptimizedRemoved";
  @SerializedName(SERIALIZED_NAME_NUM_OPTIMIZED_REMOVED)
  private Integer numOptimizedRemoved;

  public static final String SERIALIZED_NAME_NUM_INDEXES_UP_TO_DATE = "numIndexesUpToDate";
  @SerializedName(SERIALIZED_NAME_NUM_INDEXES_UP_TO_DATE)
  private Integer numIndexesUpToDate;

  public static final String SERIALIZED_NAME_BYTE_SIZE = "byteSize";
  @SerializedName(SERIALIZED_NAME_BYTE_SIZE)
  private Long byteSize;

  public static final String SERIALIZED_NAME_RETURN_RESULT = "returnResult";
  @SerializedName(SERIALIZED_NAME_RETURN_RESULT)
  private Boolean returnResult;

  public OptimizeIndexesGetReportCmd() {
  }

  public OptimizeIndexesGetReportCmd jobId(String jobId) {
    
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


  public OptimizeIndexesGetReportCmd returnAddress(String returnAddress) {
    
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


  public OptimizeIndexesGetReportCmd errorStr(String errorStr) {
    
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


  public OptimizeIndexesGetReportCmd timeOut(Long timeOut) {
    
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


  public OptimizeIndexesGetReportCmd async(Boolean async) {
    
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


  public OptimizeIndexesGetReportCmd isReturnResult(Boolean isReturnResult) {
    
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


  public OptimizeIndexesGetReportCmd organisationId(String organisationId) {
    
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


  public OptimizeIndexesGetReportCmd kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * Get kbId
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public OptimizeIndexesGetReportCmd id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public OptimizeIndexesGetReportCmd numberOfShards(Integer numberOfShards) {
    
    this.numberOfShards = numberOfShards;
    return this;
  }

   /**
   * Get numberOfShards
   * @return numberOfShards
  **/
  @javax.annotation.Nonnull
  public Integer getNumberOfShards() {
    return numberOfShards;
  }


  public void setNumberOfShards(Integer numberOfShards) {
    this.numberOfShards = numberOfShards;
  }


  public OptimizeIndexesGetReportCmd numUrls(Integer numUrls) {
    
    this.numUrls = numUrls;
    return this;
  }

   /**
   * Get numUrls
   * @return numUrls
  **/
  @javax.annotation.Nonnull
  public Integer getNumUrls() {
    return numUrls;
  }


  public void setNumUrls(Integer numUrls) {
    this.numUrls = numUrls;
  }


  public OptimizeIndexesGetReportCmd indexSet(Integer indexSet) {
    
    this.indexSet = indexSet;
    return this;
  }

   /**
   * Get indexSet
   * @return indexSet
  **/
  @javax.annotation.Nonnull
  public Integer getIndexSet() {
    return indexSet;
  }


  public void setIndexSet(Integer indexSet) {
    this.indexSet = indexSet;
  }


  public OptimizeIndexesGetReportCmd numUrlsRemoved(Integer numUrlsRemoved) {
    
    this.numUrlsRemoved = numUrlsRemoved;
    return this;
  }

   /**
   * Get numUrlsRemoved
   * @return numUrlsRemoved
  **/
  @javax.annotation.Nonnull
  public Integer getNumUrlsRemoved() {
    return numUrlsRemoved;
  }


  public void setNumUrlsRemoved(Integer numUrlsRemoved) {
    this.numUrlsRemoved = numUrlsRemoved;
  }


  public OptimizeIndexesGetReportCmd totalOffsets(Long totalOffsets) {
    
    this.totalOffsets = totalOffsets;
    return this;
  }

   /**
   * Get totalOffsets
   * @return totalOffsets
  **/
  @javax.annotation.Nonnull
  public Long getTotalOffsets() {
    return totalOffsets;
  }


  public void setTotalOffsets(Long totalOffsets) {
    this.totalOffsets = totalOffsets;
  }


  public OptimizeIndexesGetReportCmd metadataItemCount(Integer metadataItemCount) {
    
    this.metadataItemCount = metadataItemCount;
    return this;
  }

   /**
   * Get metadataItemCount
   * @return metadataItemCount
  **/
  @javax.annotation.Nonnull
  public Integer getMetadataItemCount() {
    return metadataItemCount;
  }


  public void setMetadataItemCount(Integer metadataItemCount) {
    this.metadataItemCount = metadataItemCount;
  }


  public OptimizeIndexesGetReportCmd numberOfTotalIndexes(Integer numberOfTotalIndexes) {
    
    this.numberOfTotalIndexes = numberOfTotalIndexes;
    return this;
  }

   /**
   * Get numberOfTotalIndexes
   * @return numberOfTotalIndexes
  **/
  @javax.annotation.Nonnull
  public Integer getNumberOfTotalIndexes() {
    return numberOfTotalIndexes;
  }


  public void setNumberOfTotalIndexes(Integer numberOfTotalIndexes) {
    this.numberOfTotalIndexes = numberOfTotalIndexes;
  }


  public OptimizeIndexesGetReportCmd numOptimizedIndexes(Integer numOptimizedIndexes) {
    
    this.numOptimizedIndexes = numOptimizedIndexes;
    return this;
  }

   /**
   * Get numOptimizedIndexes
   * @return numOptimizedIndexes
  **/
  @javax.annotation.Nonnull
  public Integer getNumOptimizedIndexes() {
    return numOptimizedIndexes;
  }


  public void setNumOptimizedIndexes(Integer numOptimizedIndexes) {
    this.numOptimizedIndexes = numOptimizedIndexes;
  }


  public OptimizeIndexesGetReportCmd numIndexesRemoved(Integer numIndexesRemoved) {
    
    this.numIndexesRemoved = numIndexesRemoved;
    return this;
  }

   /**
   * Get numIndexesRemoved
   * @return numIndexesRemoved
  **/
  @javax.annotation.Nonnull
  public Integer getNumIndexesRemoved() {
    return numIndexesRemoved;
  }


  public void setNumIndexesRemoved(Integer numIndexesRemoved) {
    this.numIndexesRemoved = numIndexesRemoved;
  }


  public OptimizeIndexesGetReportCmd numOptimizedRemoved(Integer numOptimizedRemoved) {
    
    this.numOptimizedRemoved = numOptimizedRemoved;
    return this;
  }

   /**
   * Get numOptimizedRemoved
   * @return numOptimizedRemoved
  **/
  @javax.annotation.Nonnull
  public Integer getNumOptimizedRemoved() {
    return numOptimizedRemoved;
  }


  public void setNumOptimizedRemoved(Integer numOptimizedRemoved) {
    this.numOptimizedRemoved = numOptimizedRemoved;
  }


  public OptimizeIndexesGetReportCmd numIndexesUpToDate(Integer numIndexesUpToDate) {
    
    this.numIndexesUpToDate = numIndexesUpToDate;
    return this;
  }

   /**
   * Get numIndexesUpToDate
   * @return numIndexesUpToDate
  **/
  @javax.annotation.Nonnull
  public Integer getNumIndexesUpToDate() {
    return numIndexesUpToDate;
  }


  public void setNumIndexesUpToDate(Integer numIndexesUpToDate) {
    this.numIndexesUpToDate = numIndexesUpToDate;
  }


  public OptimizeIndexesGetReportCmd byteSize(Long byteSize) {
    
    this.byteSize = byteSize;
    return this;
  }

   /**
   * Get byteSize
   * @return byteSize
  **/
  @javax.annotation.Nonnull
  public Long getByteSize() {
    return byteSize;
  }


  public void setByteSize(Long byteSize) {
    this.byteSize = byteSize;
  }


  public OptimizeIndexesGetReportCmd returnResult(Boolean returnResult) {
    
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
    OptimizeIndexesGetReportCmd optimizeIndexesGetReportCmd = (OptimizeIndexesGetReportCmd) o;
    return Objects.equals(this.jobId, optimizeIndexesGetReportCmd.jobId) &&
        Objects.equals(this.returnAddress, optimizeIndexesGetReportCmd.returnAddress) &&
        Objects.equals(this.errorStr, optimizeIndexesGetReportCmd.errorStr) &&
        Objects.equals(this.timeOut, optimizeIndexesGetReportCmd.timeOut) &&
        Objects.equals(this.async, optimizeIndexesGetReportCmd.async) &&
        Objects.equals(this.isReturnResult, optimizeIndexesGetReportCmd.isReturnResult) &&
        Objects.equals(this.organisationId, optimizeIndexesGetReportCmd.organisationId) &&
        Objects.equals(this.kbId, optimizeIndexesGetReportCmd.kbId) &&
        Objects.equals(this.id, optimizeIndexesGetReportCmd.id) &&
        Objects.equals(this.numberOfShards, optimizeIndexesGetReportCmd.numberOfShards) &&
        Objects.equals(this.numUrls, optimizeIndexesGetReportCmd.numUrls) &&
        Objects.equals(this.indexSet, optimizeIndexesGetReportCmd.indexSet) &&
        Objects.equals(this.numUrlsRemoved, optimizeIndexesGetReportCmd.numUrlsRemoved) &&
        Objects.equals(this.totalOffsets, optimizeIndexesGetReportCmd.totalOffsets) &&
        Objects.equals(this.metadataItemCount, optimizeIndexesGetReportCmd.metadataItemCount) &&
        Objects.equals(this.numberOfTotalIndexes, optimizeIndexesGetReportCmd.numberOfTotalIndexes) &&
        Objects.equals(this.numOptimizedIndexes, optimizeIndexesGetReportCmd.numOptimizedIndexes) &&
        Objects.equals(this.numIndexesRemoved, optimizeIndexesGetReportCmd.numIndexesRemoved) &&
        Objects.equals(this.numOptimizedRemoved, optimizeIndexesGetReportCmd.numOptimizedRemoved) &&
        Objects.equals(this.numIndexesUpToDate, optimizeIndexesGetReportCmd.numIndexesUpToDate) &&
        Objects.equals(this.byteSize, optimizeIndexesGetReportCmd.byteSize) &&
        Objects.equals(this.returnResult, optimizeIndexesGetReportCmd.returnResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, returnAddress, errorStr, timeOut, async, isReturnResult, organisationId, kbId, id, numberOfShards, numUrls, indexSet, numUrlsRemoved, totalOffsets, metadataItemCount, numberOfTotalIndexes, numOptimizedIndexes, numIndexesRemoved, numOptimizedRemoved, numIndexesUpToDate, byteSize, returnResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizeIndexesGetReportCmd {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    errorStr: ").append(toIndentedString(errorStr)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    isReturnResult: ").append(toIndentedString(isReturnResult)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfShards: ").append(toIndentedString(numberOfShards)).append("\n");
    sb.append("    numUrls: ").append(toIndentedString(numUrls)).append("\n");
    sb.append("    indexSet: ").append(toIndentedString(indexSet)).append("\n");
    sb.append("    numUrlsRemoved: ").append(toIndentedString(numUrlsRemoved)).append("\n");
    sb.append("    totalOffsets: ").append(toIndentedString(totalOffsets)).append("\n");
    sb.append("    metadataItemCount: ").append(toIndentedString(metadataItemCount)).append("\n");
    sb.append("    numberOfTotalIndexes: ").append(toIndentedString(numberOfTotalIndexes)).append("\n");
    sb.append("    numOptimizedIndexes: ").append(toIndentedString(numOptimizedIndexes)).append("\n");
    sb.append("    numIndexesRemoved: ").append(toIndentedString(numIndexesRemoved)).append("\n");
    sb.append("    numOptimizedRemoved: ").append(toIndentedString(numOptimizedRemoved)).append("\n");
    sb.append("    numIndexesUpToDate: ").append(toIndentedString(numIndexesUpToDate)).append("\n");
    sb.append("    byteSize: ").append(toIndentedString(byteSize)).append("\n");
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
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("id");
    openapiFields.add("numberOfShards");
    openapiFields.add("numUrls");
    openapiFields.add("indexSet");
    openapiFields.add("numUrlsRemoved");
    openapiFields.add("totalOffsets");
    openapiFields.add("metadataItemCount");
    openapiFields.add("numberOfTotalIndexes");
    openapiFields.add("numOptimizedIndexes");
    openapiFields.add("numIndexesRemoved");
    openapiFields.add("numOptimizedRemoved");
    openapiFields.add("numIndexesUpToDate");
    openapiFields.add("byteSize");
    openapiFields.add("returnResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobId");
    openapiRequiredFields.add("returnAddress");
    openapiRequiredFields.add("errorStr");
    openapiRequiredFields.add("timeOut");
    openapiRequiredFields.add("async");
    openapiRequiredFields.add("isReturnResult");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("numberOfShards");
    openapiRequiredFields.add("numUrls");
    openapiRequiredFields.add("indexSet");
    openapiRequiredFields.add("numUrlsRemoved");
    openapiRequiredFields.add("totalOffsets");
    openapiRequiredFields.add("metadataItemCount");
    openapiRequiredFields.add("numberOfTotalIndexes");
    openapiRequiredFields.add("numOptimizedIndexes");
    openapiRequiredFields.add("numIndexesRemoved");
    openapiRequiredFields.add("numOptimizedRemoved");
    openapiRequiredFields.add("numIndexesUpToDate");
    openapiRequiredFields.add("byteSize");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OptimizeIndexesGetReportCmd
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OptimizeIndexesGetReportCmd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptimizeIndexesGetReportCmd is not found in the empty JSON string", OptimizeIndexesGetReportCmd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OptimizeIndexesGetReportCmd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OptimizeIndexesGetReportCmd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OptimizeIndexesGetReportCmd.openapiRequiredFields) {
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
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptimizeIndexesGetReportCmd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptimizeIndexesGetReportCmd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptimizeIndexesGetReportCmd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptimizeIndexesGetReportCmd.class));

       return (TypeAdapter<T>) new TypeAdapter<OptimizeIndexesGetReportCmd>() {
           @Override
           public void write(JsonWriter out, OptimizeIndexesGetReportCmd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptimizeIndexesGetReportCmd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptimizeIndexesGetReportCmd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptimizeIndexesGetReportCmd
  * @throws IOException if the JSON string is invalid with respect to OptimizeIndexesGetReportCmd
  */
  public static OptimizeIndexesGetReportCmd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptimizeIndexesGetReportCmd.class);
  }

 /**
  * Convert an instance of OptimizeIndexesGetReportCmd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

