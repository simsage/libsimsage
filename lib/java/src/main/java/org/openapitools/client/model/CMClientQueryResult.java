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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CMSavedSearch;
import org.openapitools.client.model.CMSearchResult;
import org.openapitools.client.model.CMSynSet;
import org.openapitools.client.model.CMWordFrequency;
import org.openapitools.client.model.SearchCategory;

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
 * A SimSage return search-result message for Q&amp;A and semantic-search queries.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMClientQueryResult {
  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_HAS_RESULT = "hasResult";
  @SerializedName(SERIALIZED_NAME_HAS_RESULT)
  private Boolean hasResult;

  public static final String SERIALIZED_NAME_URL_LIST = "urlList";
  @SerializedName(SERIALIZED_NAME_URL_LIST)
  private List<String> urlList = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_QNA_SCORE = "qnaScore";
  @SerializedName(SERIALIZED_NAME_QNA_SCORE)
  private Float qnaScore;

  public static final String SERIALIZED_NAME_IMAGE_LIST = "imageList";
  @SerializedName(SERIALIZED_NAME_IMAGE_LIST)
  private List<String> imageList = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_DOCUMENT_COUNT = "totalDocumentCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DOCUMENT_COUNT)
  private Integer totalDocumentCount;

  public static final String SERIALIZED_NAME_SHARD_SIZE_LIST = "shardSizeList";
  @SerializedName(SERIALIZED_NAME_SHARD_SIZE_LIST)
  private List<Integer> shardSizeList = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULT_LIST = "resultList";
  @SerializedName(SERIALIZED_NAME_RESULT_LIST)
  private List<CMSearchResult> resultList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPELLING_CORRECTION = "spellingCorrection";
  @SerializedName(SERIALIZED_NAME_SPELLING_CORRECTION)
  private String spellingCorrection;

  public static final String SERIALIZED_NAME_SEMANTIC_SET = "semanticSet";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_SET)
  private Map<String, List<CMWordFrequency>> semanticSet = new HashMap<>();

  public static final String SERIALIZED_NAME_KNOW_EMAIL = "knowEmail";
  @SerializedName(SERIALIZED_NAME_KNOW_EMAIL)
  private Boolean knowEmail;

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "categoryList";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<SearchCategory> categoryList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYN_SET_LIST = "synSetList";
  @SerializedName(SERIALIZED_NAME_SYN_SET_LIST)
  private List<CMSynSet> synSetList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOM_RENDER = "customRender";
  @SerializedName(SERIALIZED_NAME_CUSTOM_RENDER)
  private Boolean customRender;

  public static final String SERIALIZED_NAME_SOURCE_ID_TO_COUNTS = "sourceIdToCounts";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID_TO_COUNTS)
  private Map<String, Integer> sourceIdToCounts = new HashMap<>();

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_TO_COUNTS = "documentTypeToCounts";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_TO_COUNTS)
  private Map<String, Integer> documentTypeToCounts = new HashMap<>();

  public static final String SERIALIZED_NAME_SAVED_SEARCH_LIST = "savedSearchList";
  @SerializedName(SERIALIZED_NAME_SAVED_SEARCH_LIST)
  private List<CMSavedSearch> savedSearchList = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUERY_SUMMARIZATION = "querySummarization";
  @SerializedName(SERIALIZED_NAME_QUERY_SUMMARIZATION)
  private String querySummarization;

  public CMClientQueryResult() {
  }

  public CMClientQueryResult messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nonnull
  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public CMClientQueryResult organisationId(String organisationId) {
    
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


  public CMClientQueryResult kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base id (its guid id)
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMClientQueryResult text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * the text sent.
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CMClientQueryResult hasResult(Boolean hasResult) {
    
    this.hasResult = hasResult;
    return this;
  }

   /**
   * is there a result/reply or not?
   * @return hasResult
  **/
  @javax.annotation.Nonnull
  public Boolean getHasResult() {
    return hasResult;
  }


  public void setHasResult(Boolean hasResult) {
    this.hasResult = hasResult;
  }


  public CMClientQueryResult urlList(List<String> urlList) {
    
    this.urlList = urlList;
    return this;
  }

  public CMClientQueryResult addUrlListItem(String urlListItem) {
    if (this.urlList == null) {
      this.urlList = new ArrayList<>();
    }
    this.urlList.add(urlListItem);
    return this;
  }

   /**
   * a list of reference urls associated with this answer
   * @return urlList
  **/
  @javax.annotation.Nonnull
  public List<String> getUrlList() {
    return urlList;
  }


  public void setUrlList(List<String> urlList) {
    this.urlList = urlList;
  }


  public CMClientQueryResult metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * metadata associated with the Question/Answer pair, user defined.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CMClientQueryResult qnaScore(Float qnaScore) {
    
    this.qnaScore = qnaScore;
    return this;
  }

   /**
   * how well the Q&amp;A matcher performed a value between 0.0 and 1.0
   * @return qnaScore
  **/
  @javax.annotation.Nonnull
  public Float getQnaScore() {
    return qnaScore;
  }


  public void setQnaScore(Float qnaScore) {
    this.qnaScore = qnaScore;
  }


  public CMClientQueryResult imageList(List<String> imageList) {
    
    this.imageList = imageList;
    return this;
  }

  public CMClientQueryResult addImageListItem(String imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

   /**
   * A list of image urls associated with the Q&amp;A pair
   * @return imageList
  **/
  @javax.annotation.Nonnull
  public List<String> getImageList() {
    return imageList;
  }


  public void setImageList(List<String> imageList) {
    this.imageList = imageList;
  }


  public CMClientQueryResult totalDocumentCount(Integer totalDocumentCount) {
    
    this.totalDocumentCount = totalDocumentCount;
    return this;
  }

   /**
   * the total number of documents found (but not included necessarily)
   * @return totalDocumentCount
  **/
  @javax.annotation.Nonnull
  public Integer getTotalDocumentCount() {
    return totalDocumentCount;
  }


  public void setTotalDocumentCount(Integer totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
  }


  public CMClientQueryResult shardSizeList(List<Integer> shardSizeList) {
    
    this.shardSizeList = shardSizeList;
    return this;
  }

  public CMClientQueryResult addShardSizeListItem(Integer shardSizeListItem) {
    if (this.shardSizeList == null) {
      this.shardSizeList = new ArrayList<>();
    }
    this.shardSizeList.add(shardSizeListItem);
    return this;
  }

   /**
   * Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you&#39;re paginating the same query.
   * @return shardSizeList
  **/
  @javax.annotation.Nonnull
  public List<Integer> getShardSizeList() {
    return shardSizeList;
  }


  public void setShardSizeList(List<Integer> shardSizeList) {
    this.shardSizeList = shardSizeList;
  }


  public CMClientQueryResult resultList(List<CMSearchResult> resultList) {
    
    this.resultList = resultList;
    return this;
  }

  public CMClientQueryResult addResultListItem(CMSearchResult resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * the actual search results, one for each item found
   * @return resultList
  **/
  @javax.annotation.Nonnull
  public List<CMSearchResult> getResultList() {
    return resultList;
  }


  public void setResultList(List<CMSearchResult> resultList) {
    this.resultList = resultList;
  }


  public CMClientQueryResult spellingCorrection(String spellingCorrection) {
    
    this.spellingCorrection = spellingCorrection;
    return this;
  }

   /**
   * a spelling correction suggestion if appropriate and enabled.
   * @return spellingCorrection
  **/
  @javax.annotation.Nonnull
  public String getSpellingCorrection() {
    return spellingCorrection;
  }


  public void setSpellingCorrection(String spellingCorrection) {
    this.spellingCorrection = spellingCorrection;
  }


  public CMClientQueryResult semanticSet(Map<String, List<CMWordFrequency>> semanticSet) {
    
    this.semanticSet = semanticSet;
    return this;
  }

  public CMClientQueryResult putSemanticSetItem(String key, List<CMWordFrequency> semanticSetItem) {
    if (this.semanticSet == null) {
      this.semanticSet = new HashMap<>();
    }
    this.semanticSet.put(key, semanticSetItem);
    return this;
  }

   /**
   * A descriptor of semantic categories and words with frequencies in each category
   * @return semanticSet
  **/
  @javax.annotation.Nonnull
  public Map<String, List<CMWordFrequency>> getSemanticSet() {
    return semanticSet;
  }


  public void setSemanticSet(Map<String, List<CMWordFrequency>> semanticSet) {
    this.semanticSet = semanticSet;
  }


  public CMClientQueryResult knowEmail(Boolean knowEmail) {
    
    this.knowEmail = knowEmail;
    return this;
  }

   /**
   * do we know the email address of this person?  if they&#39;ve supplied it in the past this will be set to true.
   * @return knowEmail
  **/
  @javax.annotation.Nonnull
  public Boolean getKnowEmail() {
    return knowEmail;
  }


  public void setKnowEmail(Boolean knowEmail) {
    this.knowEmail = knowEmail;
  }


  public CMClientQueryResult categoryList(List<SearchCategory> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public CMClientQueryResult addCategoryListItem(SearchCategory categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * updated categories (if applicable) with updated counts
   * @return categoryList
  **/
  @javax.annotation.Nonnull
  public List<SearchCategory> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<SearchCategory> categoryList) {
    this.categoryList = categoryList;
  }


  public CMClientQueryResult synSetList(List<CMSynSet> synSetList) {
    
    this.synSetList = synSetList;
    return this;
  }

  public CMClientQueryResult addSynSetListItem(CMSynSet synSetListItem) {
    if (this.synSetList == null) {
      this.synSetList = new ArrayList<>();
    }
    this.synSetList.add(synSetListItem);
    return this;
  }

   /**
   * A list of syn-sets used in the query
   * @return synSetList
  **/
  @javax.annotation.Nonnull
  public List<CMSynSet> getSynSetList() {
    return synSetList;
  }


  public void setSynSetList(List<CMSynSet> synSetList) {
    this.synSetList = synSetList;
  }


  public CMClientQueryResult customRender(Boolean customRender) {
    
    this.customRender = customRender;
    return this;
  }

   /**
   * Does this source require custom render templates or use ordinary search-results?
   * @return customRender
  **/
  @javax.annotation.Nonnull
  public Boolean getCustomRender() {
    return customRender;
  }


  public void setCustomRender(Boolean customRender) {
    this.customRender = customRender;
  }


  public CMClientQueryResult sourceIdToCounts(Map<String, Integer> sourceIdToCounts) {
    
    this.sourceIdToCounts = sourceIdToCounts;
    return this;
  }

  public CMClientQueryResult putSourceIdToCountsItem(String key, Integer sourceIdToCountsItem) {
    if (this.sourceIdToCounts == null) {
      this.sourceIdToCounts = new HashMap<>();
    }
    this.sourceIdToCounts.put(key, sourceIdToCountsItem);
    return this;
  }

   /**
   * a map of sourceId -&gt; number of documents found inside this source
   * @return sourceIdToCounts
  **/
  @javax.annotation.Nonnull
  public Map<String, Integer> getSourceIdToCounts() {
    return sourceIdToCounts;
  }


  public void setSourceIdToCounts(Map<String, Integer> sourceIdToCounts) {
    this.sourceIdToCounts = sourceIdToCounts;
  }


  public CMClientQueryResult documentTypeToCounts(Map<String, Integer> documentTypeToCounts) {
    
    this.documentTypeToCounts = documentTypeToCounts;
    return this;
  }

  public CMClientQueryResult putDocumentTypeToCountsItem(String key, Integer documentTypeToCountsItem) {
    if (this.documentTypeToCounts == null) {
      this.documentTypeToCounts = new HashMap<>();
    }
    this.documentTypeToCounts.put(key, documentTypeToCountsItem);
    return this;
  }

   /**
   * a map of document-type -&gt; number of documents found of this type
   * @return documentTypeToCounts
  **/
  @javax.annotation.Nonnull
  public Map<String, Integer> getDocumentTypeToCounts() {
    return documentTypeToCounts;
  }


  public void setDocumentTypeToCounts(Map<String, Integer> documentTypeToCounts) {
    this.documentTypeToCounts = documentTypeToCounts;
  }


  public CMClientQueryResult savedSearchList(List<CMSavedSearch> savedSearchList) {
    
    this.savedSearchList = savedSearchList;
    return this;
  }

  public CMClientQueryResult addSavedSearchListItem(CMSavedSearch savedSearchListItem) {
    if (this.savedSearchList == null) {
      this.savedSearchList = new ArrayList<>();
    }
    this.savedSearchList.add(savedSearchListItem);
    return this;
  }

   /**
   * a list of previous searches if applicable
   * @return savedSearchList
  **/
  @javax.annotation.Nonnull
  public List<CMSavedSearch> getSavedSearchList() {
    return savedSearchList;
  }


  public void setSavedSearchList(List<CMSavedSearch> savedSearchList) {
    this.savedSearchList = savedSearchList;
  }


  public CMClientQueryResult querySummarization(String querySummarization) {
    
    this.querySummarization = querySummarization;
    return this;
  }

   /**
   * an optional summarization of the search results
   * @return querySummarization
  **/
  @javax.annotation.Nonnull
  public String getQuerySummarization() {
    return querySummarization;
  }


  public void setQuerySummarization(String querySummarization) {
    this.querySummarization = querySummarization;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMClientQueryResult cmClientQueryResult = (CMClientQueryResult) o;
    return Objects.equals(this.messageType, cmClientQueryResult.messageType) &&
        Objects.equals(this.organisationId, cmClientQueryResult.organisationId) &&
        Objects.equals(this.kbId, cmClientQueryResult.kbId) &&
        Objects.equals(this.text, cmClientQueryResult.text) &&
        Objects.equals(this.hasResult, cmClientQueryResult.hasResult) &&
        Objects.equals(this.urlList, cmClientQueryResult.urlList) &&
        Objects.equals(this.metadata, cmClientQueryResult.metadata) &&
        Objects.equals(this.qnaScore, cmClientQueryResult.qnaScore) &&
        Objects.equals(this.imageList, cmClientQueryResult.imageList) &&
        Objects.equals(this.totalDocumentCount, cmClientQueryResult.totalDocumentCount) &&
        Objects.equals(this.shardSizeList, cmClientQueryResult.shardSizeList) &&
        Objects.equals(this.resultList, cmClientQueryResult.resultList) &&
        Objects.equals(this.spellingCorrection, cmClientQueryResult.spellingCorrection) &&
        Objects.equals(this.semanticSet, cmClientQueryResult.semanticSet) &&
        Objects.equals(this.knowEmail, cmClientQueryResult.knowEmail) &&
        Objects.equals(this.categoryList, cmClientQueryResult.categoryList) &&
        Objects.equals(this.synSetList, cmClientQueryResult.synSetList) &&
        Objects.equals(this.customRender, cmClientQueryResult.customRender) &&
        Objects.equals(this.sourceIdToCounts, cmClientQueryResult.sourceIdToCounts) &&
        Objects.equals(this.documentTypeToCounts, cmClientQueryResult.documentTypeToCounts) &&
        Objects.equals(this.savedSearchList, cmClientQueryResult.savedSearchList) &&
        Objects.equals(this.querySummarization, cmClientQueryResult.querySummarization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, organisationId, kbId, text, hasResult, urlList, metadata, qnaScore, imageList, totalDocumentCount, shardSizeList, resultList, spellingCorrection, semanticSet, knowEmail, categoryList, synSetList, customRender, sourceIdToCounts, documentTypeToCounts, savedSearchList, querySummarization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMClientQueryResult {\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    hasResult: ").append(toIndentedString(hasResult)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    qnaScore: ").append(toIndentedString(qnaScore)).append("\n");
    sb.append("    imageList: ").append(toIndentedString(imageList)).append("\n");
    sb.append("    totalDocumentCount: ").append(toIndentedString(totalDocumentCount)).append("\n");
    sb.append("    shardSizeList: ").append(toIndentedString(shardSizeList)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
    sb.append("    spellingCorrection: ").append(toIndentedString(spellingCorrection)).append("\n");
    sb.append("    semanticSet: ").append(toIndentedString(semanticSet)).append("\n");
    sb.append("    knowEmail: ").append(toIndentedString(knowEmail)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    synSetList: ").append(toIndentedString(synSetList)).append("\n");
    sb.append("    customRender: ").append(toIndentedString(customRender)).append("\n");
    sb.append("    sourceIdToCounts: ").append(toIndentedString(sourceIdToCounts)).append("\n");
    sb.append("    documentTypeToCounts: ").append(toIndentedString(documentTypeToCounts)).append("\n");
    sb.append("    savedSearchList: ").append(toIndentedString(savedSearchList)).append("\n");
    sb.append("    querySummarization: ").append(toIndentedString(querySummarization)).append("\n");
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
    openapiFields.add("messageType");
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("text");
    openapiFields.add("hasResult");
    openapiFields.add("urlList");
    openapiFields.add("metadata");
    openapiFields.add("qnaScore");
    openapiFields.add("imageList");
    openapiFields.add("totalDocumentCount");
    openapiFields.add("shardSizeList");
    openapiFields.add("resultList");
    openapiFields.add("spellingCorrection");
    openapiFields.add("semanticSet");
    openapiFields.add("knowEmail");
    openapiFields.add("categoryList");
    openapiFields.add("synSetList");
    openapiFields.add("customRender");
    openapiFields.add("sourceIdToCounts");
    openapiFields.add("documentTypeToCounts");
    openapiFields.add("savedSearchList");
    openapiFields.add("querySummarization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageType");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("hasResult");
    openapiRequiredFields.add("urlList");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("qnaScore");
    openapiRequiredFields.add("imageList");
    openapiRequiredFields.add("totalDocumentCount");
    openapiRequiredFields.add("shardSizeList");
    openapiRequiredFields.add("resultList");
    openapiRequiredFields.add("spellingCorrection");
    openapiRequiredFields.add("semanticSet");
    openapiRequiredFields.add("knowEmail");
    openapiRequiredFields.add("categoryList");
    openapiRequiredFields.add("synSetList");
    openapiRequiredFields.add("customRender");
    openapiRequiredFields.add("sourceIdToCounts");
    openapiRequiredFields.add("documentTypeToCounts");
    openapiRequiredFields.add("savedSearchList");
    openapiRequiredFields.add("querySummarization");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMClientQueryResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMClientQueryResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMClientQueryResult is not found in the empty JSON string", CMClientQueryResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMClientQueryResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMClientQueryResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMClientQueryResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("messageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageType").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("urlList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("urlList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlList` to be an array in the JSON string but got `%s`", jsonObj.get("urlList").toString()));
      }
      if (!jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("imageList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("imageList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageList` to be an array in the JSON string but got `%s`", jsonObj.get("imageList").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("shardSizeList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("shardSizeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shardSizeList` to be an array in the JSON string but got `%s`", jsonObj.get("shardSizeList").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("resultList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultList` to be an array in the JSON string but got `%s`", jsonObj.get("resultList").toString()));
      }

      JsonArray jsonArrayresultList = jsonObj.getAsJsonArray("resultList");
      // validate the required field `resultList` (array)
      for (int i = 0; i < jsonArrayresultList.size(); i++) {
        CMSearchResult.validateJsonElement(jsonArrayresultList.get(i));
      };
      if (!jsonObj.get("spellingCorrection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spellingCorrection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spellingCorrection").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("categoryList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryList` to be an array in the JSON string but got `%s`", jsonObj.get("categoryList").toString()));
      }

      JsonArray jsonArraycategoryList = jsonObj.getAsJsonArray("categoryList");
      // validate the required field `categoryList` (array)
      for (int i = 0; i < jsonArraycategoryList.size(); i++) {
        SearchCategory.validateJsonElement(jsonArraycategoryList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("synSetList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `synSetList` to be an array in the JSON string but got `%s`", jsonObj.get("synSetList").toString()));
      }

      JsonArray jsonArraysynSetList = jsonObj.getAsJsonArray("synSetList");
      // validate the required field `synSetList` (array)
      for (int i = 0; i < jsonArraysynSetList.size(); i++) {
        CMSynSet.validateJsonElement(jsonArraysynSetList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("savedSearchList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `savedSearchList` to be an array in the JSON string but got `%s`", jsonObj.get("savedSearchList").toString()));
      }

      JsonArray jsonArraysavedSearchList = jsonObj.getAsJsonArray("savedSearchList");
      // validate the required field `savedSearchList` (array)
      for (int i = 0; i < jsonArraysavedSearchList.size(); i++) {
        CMSavedSearch.validateJsonElement(jsonArraysavedSearchList.get(i));
      };
      if (!jsonObj.get("querySummarization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `querySummarization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("querySummarization").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMClientQueryResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMClientQueryResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMClientQueryResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMClientQueryResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CMClientQueryResult>() {
           @Override
           public void write(JsonWriter out, CMClientQueryResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMClientQueryResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMClientQueryResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMClientQueryResult
  * @throws IOException if the JSON string is invalid with respect to CMClientQueryResult
  */
  public static CMClientQueryResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMClientQueryResult.class);
  }

 /**
  * Convert an instance of CMClientQueryResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

