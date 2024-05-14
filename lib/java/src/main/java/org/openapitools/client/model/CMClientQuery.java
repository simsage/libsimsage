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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * a client query object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMClientQuery {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_LIST = "kbList";
  @SerializedName(SERIALIZED_NAME_KB_LIST)
  private List<String> kbList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SEMANTIC_SEARCH = "semanticSearch";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_SEARCH)
  private Boolean semanticSearch;

  public static final String SERIALIZED_NAME_QNA_QUERY = "qnaQuery";
  @SerializedName(SERIALIZED_NAME_QNA_QUERY)
  private Boolean qnaQuery;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_NUM_RESULTS = "numResults";
  @SerializedName(SERIALIZED_NAME_NUM_RESULTS)
  private Integer numResults;

  public static final String SERIALIZED_NAME_SCORE_THRESHOLD = "scoreThreshold";
  @SerializedName(SERIALIZED_NAME_SCORE_THRESHOLD)
  private Float scoreThreshold;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_FRAGMENT_COUNT = "fragmentCount";
  @SerializedName(SERIALIZED_NAME_FRAGMENT_COUNT)
  private Integer fragmentCount;

  public static final String SERIALIZED_NAME_MAX_WORD_DISTANCE = "maxWordDistance";
  @SerializedName(SERIALIZED_NAME_MAX_WORD_DISTANCE)
  private Integer maxWordDistance;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SHARD_SIZE_LIST = "shardSizeList";
  @SerializedName(SERIALIZED_NAME_SHARD_SIZE_LIST)
  private List<Integer> shardSizeList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPELLING_SUGGEST = "spellingSuggest";
  @SerializedName(SERIALIZED_NAME_SPELLING_SUGGEST)
  private Boolean spellingSuggest;

  public static final String SERIALIZED_NAME_GROUP_SIMILAR_DOCUMENTS = "groupSimilarDocuments";
  @SerializedName(SERIALIZED_NAME_GROUP_SIMILAR_DOCUMENTS)
  private Boolean groupSimilarDocuments;

  public static final String SERIALIZED_NAME_SORT_BY_AGE = "sortByAge";
  @SerializedName(SERIALIZED_NAME_SORT_BY_AGE)
  private Boolean sortByAge;

  public static final String SERIALIZED_NAME_USE_QUESTION_ANSWERING_AI = "useQuestionAnsweringAi";
  @SerializedName(SERIALIZED_NAME_USE_QUESTION_ANSWERING_AI)
  private Boolean useQuestionAnsweringAi;

  public static final String SERIALIZED_NAME_WORD_SYN_SET = "wordSynSet";
  @SerializedName(SERIALIZED_NAME_WORD_SYN_SET)
  private Map<String, Integer> wordSynSet = new HashMap<>();

  public CMClientQuery() {
  }

  public CMClientQuery organisationId(String organisationId) {
    
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


  public CMClientQuery kbList(List<String> kbList) {
    
    this.kbList = kbList;
    return this;
  }

  public CMClientQuery addKbListItem(String kbListItem) {
    if (this.kbList == null) {
      this.kbList = new ArrayList<>();
    }
    this.kbList.add(kbListItem);
    return this;
  }

   /**
   * a list of knowledge-base id&#39;s (guids) to use
   * @return kbList
  **/
  @javax.annotation.Nonnull
  public List<String> getKbList() {
    return kbList;
  }


  public void setKbList(List<String> kbList) {
    this.kbList = kbList;
  }


  public CMClientQuery clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * the client&#39;s id (a unique guid for keeping state against clients)
   * @return clientId
  **/
  @javax.annotation.Nonnull
  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public CMClientQuery semanticSearch(Boolean semanticSearch) {
    
    this.semanticSearch = semanticSearch;
    return this;
  }

   /**
   * should we perform a semantic-search?
   * @return semanticSearch
  **/
  @javax.annotation.Nonnull
  public Boolean getSemanticSearch() {
    return semanticSearch;
  }


  public void setSemanticSearch(Boolean semanticSearch) {
    this.semanticSearch = semanticSearch;
  }


  public CMClientQuery qnaQuery(Boolean qnaQuery) {
    
    this.qnaQuery = qnaQuery;
    return this;
  }

   /**
   * should we perform a Q&amp;A search?
   * @return qnaQuery
  **/
  @javax.annotation.Nonnull
  public Boolean getQnaQuery() {
    return qnaQuery;
  }


  public void setQnaQuery(Boolean qnaQuery) {
    this.qnaQuery = qnaQuery;
  }


  public CMClientQuery query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * the user&#39;s search query
   * @return query
  **/
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public CMClientQuery filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * a filter expression generated by the UX
   * @return filter
  **/
  @javax.annotation.Nonnull
  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public CMClientQuery numResults(Integer numResults) {
    
    this.numResults = numResults;
    return this;
  }

   /**
   * the number of results to return for the Q&amp;A system (recommend 1, which returns the &#39;best match&#39; only)
   * @return numResults
  **/
  @javax.annotation.Nonnull
  public Integer getNumResults() {
    return numResults;
  }


  public void setNumResults(Integer numResults) {
    this.numResults = numResults;
  }


  public CMClientQuery scoreThreshold(Float scoreThreshold) {
    
    this.scoreThreshold = scoreThreshold;
    return this;
  }

   /**
   * A threshold for answer rejection, recommend a value of around 81.25% (0.8125).  This value is between 0.0 and 1.0.  If this value is too low, you&#39;ll get bad answers, and if this value is too high you will only get exact matches.
   * @return scoreThreshold
  **/
  @javax.annotation.Nonnull
  public Float getScoreThreshold() {
    return scoreThreshold;
  }


  public void setScoreThreshold(Float scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }


  public CMClientQuery page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * search engine pagination, the offset page starting at 0
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public CMClientQuery pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * search engine pagination, the number of results per page
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public CMClientQuery fragmentCount(Integer fragmentCount) {
    
    this.fragmentCount = fragmentCount;
    return this;
  }

   /**
   * search engine pagination, the number of sentences matching per document (aka. document-sentence fragments)
   * @return fragmentCount
  **/
  @javax.annotation.Nonnull
  public Integer getFragmentCount() {
    return fragmentCount;
  }


  public void setFragmentCount(Integer fragmentCount) {
    this.fragmentCount = fragmentCount;
  }


  public CMClientQuery maxWordDistance(Integer maxWordDistance) {
    
    this.maxWordDistance = maxWordDistance;
    return this;
  }

   /**
   * how far apart words are allowed to be before they stop matching.  A value of zero (0) allows any distance within the document and is akin to a document level keyword search.
   * @return maxWordDistance
  **/
  @javax.annotation.Nonnull
  public Integer getMaxWordDistance() {
    return maxWordDistance;
  }


  public void setMaxWordDistance(Integer maxWordDistance) {
    this.maxWordDistance = maxWordDistance;
  }


  public CMClientQuery sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of source (an integer) to filter results for.  You can only filter on one source per knowledge-base.  Leaving this value zero (0) indicates all sources should be searched.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public CMClientQuery shardSizeList(List<Integer> shardSizeList) {
    
    this.shardSizeList = shardSizeList;
    return this;
  }

  public CMClientQuery addShardSizeListItem(Integer shardSizeListItem) {
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


  public CMClientQuery spellingSuggest(Boolean spellingSuggest) {
    
    this.spellingSuggest = spellingSuggest;
    return this;
  }

   /**
   * should the search-engine return spelling-suggestions for items not understood?
   * @return spellingSuggest
  **/
  @javax.annotation.Nonnull
  public Boolean getSpellingSuggest() {
    return spellingSuggest;
  }


  public void setSpellingSuggest(Boolean spellingSuggest) {
    this.spellingSuggest = spellingSuggest;
  }


  public CMClientQuery groupSimilarDocuments(Boolean groupSimilarDocuments) {
    
    this.groupSimilarDocuments = groupSimilarDocuments;
    return this;
  }

   /**
   * should the search-engine group similar documents together
   * @return groupSimilarDocuments
  **/
  @javax.annotation.Nonnull
  public Boolean getGroupSimilarDocuments() {
    return groupSimilarDocuments;
  }


  public void setGroupSimilarDocuments(Boolean groupSimilarDocuments) {
    this.groupSimilarDocuments = groupSimilarDocuments;
  }


  public CMClientQuery sortByAge(Boolean sortByAge) {
    
    this.sortByAge = sortByAge;
    return this;
  }

   /**
   * should the search-engine sort results by age
   * @return sortByAge
  **/
  @javax.annotation.Nonnull
  public Boolean getSortByAge() {
    return sortByAge;
  }


  public void setSortByAge(Boolean sortByAge) {
    this.sortByAge = sortByAge;
  }


  public CMClientQuery useQuestionAnsweringAi(Boolean useQuestionAnsweringAi) {
    
    this.useQuestionAnsweringAi = useQuestionAnsweringAi;
    return this;
  }

   /**
   * use ChatGPT or equivalent to answer queries
   * @return useQuestionAnsweringAi
  **/
  @javax.annotation.Nonnull
  public Boolean getUseQuestionAnsweringAi() {
    return useQuestionAnsweringAi;
  }


  public void setUseQuestionAnsweringAi(Boolean useQuestionAnsweringAi) {
    this.useQuestionAnsweringAi = useQuestionAnsweringAi;
  }


  public CMClientQuery wordSynSet(Map<String, Integer> wordSynSet) {
    
    this.wordSynSet = wordSynSet;
    return this;
  }

  public CMClientQuery putWordSynSetItem(String key, Integer wordSynSetItem) {
    if (this.wordSynSet == null) {
      this.wordSynSet = new HashMap<>();
    }
    this.wordSynSet.put(key, wordSynSetItem);
    return this;
  }

   /**
   * selected syn-sets for words
   * @return wordSynSet
  **/
  @javax.annotation.Nonnull
  public Map<String, Integer> getWordSynSet() {
    return wordSynSet;
  }


  public void setWordSynSet(Map<String, Integer> wordSynSet) {
    this.wordSynSet = wordSynSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMClientQuery cmClientQuery = (CMClientQuery) o;
    return Objects.equals(this.organisationId, cmClientQuery.organisationId) &&
        Objects.equals(this.kbList, cmClientQuery.kbList) &&
        Objects.equals(this.clientId, cmClientQuery.clientId) &&
        Objects.equals(this.semanticSearch, cmClientQuery.semanticSearch) &&
        Objects.equals(this.qnaQuery, cmClientQuery.qnaQuery) &&
        Objects.equals(this.query, cmClientQuery.query) &&
        Objects.equals(this.filter, cmClientQuery.filter) &&
        Objects.equals(this.numResults, cmClientQuery.numResults) &&
        Objects.equals(this.scoreThreshold, cmClientQuery.scoreThreshold) &&
        Objects.equals(this.page, cmClientQuery.page) &&
        Objects.equals(this.pageSize, cmClientQuery.pageSize) &&
        Objects.equals(this.fragmentCount, cmClientQuery.fragmentCount) &&
        Objects.equals(this.maxWordDistance, cmClientQuery.maxWordDistance) &&
        Objects.equals(this.sourceId, cmClientQuery.sourceId) &&
        Objects.equals(this.shardSizeList, cmClientQuery.shardSizeList) &&
        Objects.equals(this.spellingSuggest, cmClientQuery.spellingSuggest) &&
        Objects.equals(this.groupSimilarDocuments, cmClientQuery.groupSimilarDocuments) &&
        Objects.equals(this.sortByAge, cmClientQuery.sortByAge) &&
        Objects.equals(this.useQuestionAnsweringAi, cmClientQuery.useQuestionAnsweringAi) &&
        Objects.equals(this.wordSynSet, cmClientQuery.wordSynSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, kbList, clientId, semanticSearch, qnaQuery, query, filter, numResults, scoreThreshold, page, pageSize, fragmentCount, maxWordDistance, sourceId, shardSizeList, spellingSuggest, groupSimilarDocuments, sortByAge, useQuestionAnsweringAi, wordSynSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMClientQuery {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbList: ").append(toIndentedString(kbList)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    semanticSearch: ").append(toIndentedString(semanticSearch)).append("\n");
    sb.append("    qnaQuery: ").append(toIndentedString(qnaQuery)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    fragmentCount: ").append(toIndentedString(fragmentCount)).append("\n");
    sb.append("    maxWordDistance: ").append(toIndentedString(maxWordDistance)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    shardSizeList: ").append(toIndentedString(shardSizeList)).append("\n");
    sb.append("    spellingSuggest: ").append(toIndentedString(spellingSuggest)).append("\n");
    sb.append("    groupSimilarDocuments: ").append(toIndentedString(groupSimilarDocuments)).append("\n");
    sb.append("    sortByAge: ").append(toIndentedString(sortByAge)).append("\n");
    sb.append("    useQuestionAnsweringAi: ").append(toIndentedString(useQuestionAnsweringAi)).append("\n");
    sb.append("    wordSynSet: ").append(toIndentedString(wordSynSet)).append("\n");
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
    openapiFields.add("kbList");
    openapiFields.add("clientId");
    openapiFields.add("semanticSearch");
    openapiFields.add("qnaQuery");
    openapiFields.add("query");
    openapiFields.add("filter");
    openapiFields.add("numResults");
    openapiFields.add("scoreThreshold");
    openapiFields.add("page");
    openapiFields.add("pageSize");
    openapiFields.add("fragmentCount");
    openapiFields.add("maxWordDistance");
    openapiFields.add("sourceId");
    openapiFields.add("shardSizeList");
    openapiFields.add("spellingSuggest");
    openapiFields.add("groupSimilarDocuments");
    openapiFields.add("sortByAge");
    openapiFields.add("useQuestionAnsweringAi");
    openapiFields.add("wordSynSet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbList");
    openapiRequiredFields.add("clientId");
    openapiRequiredFields.add("semanticSearch");
    openapiRequiredFields.add("qnaQuery");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("filter");
    openapiRequiredFields.add("numResults");
    openapiRequiredFields.add("scoreThreshold");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("pageSize");
    openapiRequiredFields.add("fragmentCount");
    openapiRequiredFields.add("maxWordDistance");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("shardSizeList");
    openapiRequiredFields.add("spellingSuggest");
    openapiRequiredFields.add("groupSimilarDocuments");
    openapiRequiredFields.add("sortByAge");
    openapiRequiredFields.add("useQuestionAnsweringAi");
    openapiRequiredFields.add("wordSynSet");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMClientQuery
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMClientQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMClientQuery is not found in the empty JSON string", CMClientQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMClientQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMClientQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMClientQuery.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("kbList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("kbList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbList` to be an array in the JSON string but got `%s`", jsonObj.get("kbList").toString()));
      }
      if (!jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if (!jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if (!jsonObj.get("sourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("shardSizeList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("shardSizeList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shardSizeList` to be an array in the JSON string but got `%s`", jsonObj.get("shardSizeList").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMClientQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMClientQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMClientQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMClientQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<CMClientQuery>() {
           @Override
           public void write(JsonWriter out, CMClientQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMClientQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMClientQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMClientQuery
  * @throws IOException if the JSON string is invalid with respect to CMClientQuery
  */
  public static CMClientQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMClientQuery.class);
  }

 /**
  * Convert an instance of CMClientQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

