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
import org.openapitools.client.model.CMDocumentRelationship;
import org.openapitools.client.model.CMSimilarDocument;

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
 * A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMSearchResult {
  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_ID = "urlId";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private Integer urlId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_TEXT_LIST = "textList";
  @SerializedName(SERIALIZED_NAME_TEXT_LIST)
  private List<String> textList = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT_INDEX = "textIndex";
  @SerializedName(SERIALIZED_NAME_TEXT_INDEX)
  private Integer textIndex;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  public static final String SERIALIZED_NAME_SORT_DESC = "sortDesc";
  @SerializedName(SERIALIZED_NAME_SORT_DESC)
  private Boolean sortDesc;

  public static final String SERIALIZED_NAME_QNA_RESULT = "qnaResult";
  @SerializedName(SERIALIZED_NAME_QNA_RESULT)
  private Boolean qnaResult;

  public static final String SERIALIZED_NAME_FIRST_SENTENCE = "firstSentence";
  @SerializedName(SERIALIZED_NAME_FIRST_SENTENCE)
  private Integer firstSentence;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_UPLOADED = "uploaded";
  @SerializedName(SERIALIZED_NAME_UPLOADED)
  private Long uploaded;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private Long lastModified;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_NUM_SENTENCES = "numSentences";
  @SerializedName(SERIALIZED_NAME_NUM_SENTENCES)
  private Integer numSentences;

  public static final String SERIALIZED_NAME_NUM_WORDS = "numWords";
  @SerializedName(SERIALIZED_NAME_NUM_WORDS)
  private Integer numWords;

  public static final String SERIALIZED_NAME_NUM_RELATIONSHIPS = "numRelationships";
  @SerializedName(SERIALIZED_NAME_NUM_RELATIONSHIPS)
  private Integer numRelationships;

  public static final String SERIALIZED_NAME_BINARY_SIZE = "binarySize";
  @SerializedName(SERIALIZED_NAME_BINARY_SIZE)
  private Long binarySize;

  public static final String SERIALIZED_NAME_TEXT_SIZE = "textSize";
  @SerializedName(SERIALIZED_NAME_TEXT_SIZE)
  private Integer textSize;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public static final String SERIALIZED_NAME_CRAWLED = "crawled";
  @SerializedName(SERIALIZED_NAME_CRAWLED)
  private Long crawled;

  public static final String SERIALIZED_NAME_CONVERTED = "converted";
  @SerializedName(SERIALIZED_NAME_CONVERTED)
  private Long converted;

  public static final String SERIALIZED_NAME_PARSED = "parsed";
  @SerializedName(SERIALIZED_NAME_PARSED)
  private Long parsed;

  public static final String SERIALIZED_NAME_INDEXED = "indexed";
  @SerializedName(SERIALIZED_NAME_INDEXED)
  private Long indexed;

  public static final String SERIALIZED_NAME_PREVIEWED = "previewed";
  @SerializedName(SERIALIZED_NAME_PREVIEWED)
  private Long previewed;

  public static final String SERIALIZED_NAME_SIMILAR_DOCUMENT_LIST = "similarDocumentList";
  @SerializedName(SERIALIZED_NAME_SIMILAR_DOCUMENT_LIST)
  private List<CMSimilarDocument> similarDocumentList = new ArrayList<>();

  public static final String SERIALIZED_NAME_RELATED_LIST = "relatedList";
  @SerializedName(SERIALIZED_NAME_RELATED_LIST)
  private List<CMDocumentRelationship> relatedList = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_RENDER_TYPE = "renderType";
  @SerializedName(SERIALIZED_NAME_RENDER_TYPE)
  private String renderType;

  public CMSearchResult() {
  }

  public CMSearchResult kbId(String kbId) {
    
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


  public CMSearchResult url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the url of the document that matched
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMSearchResult urlId(Integer urlId) {
    
    this.urlId = urlId;
    return this;
  }

   /**
   * the internal SimSage id for this url (unique only within a knowledge-base)
   * @return urlId
  **/
  @javax.annotation.Nonnull
  public Integer getUrlId() {
    return urlId;
  }


  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }


  public CMSearchResult sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id of this result (ie. the source&#39;s id)
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMSearchResult title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * the title of this document/record (can be empty)
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CMSearchResult author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * the author of this document/record (can be empty)
   * @return author
  **/
  @javax.annotation.Nonnull
  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public CMSearchResult textList(List<String> textList) {
    
    this.textList = textList;
    return this;
  }

  public CMSearchResult addTextListItem(String textListItem) {
    if (this.textList == null) {
      this.textList = new ArrayList<>();
    }
    this.textList.add(textListItem);
    return this;
  }

   /**
   * A list of matching fragments in this document, with highlight markers.
   * @return textList
  **/
  @javax.annotation.Nonnull
  public List<String> getTextList() {
    return textList;
  }


  public void setTextList(List<String> textList) {
    this.textList = textList;
  }


  public CMSearchResult textIndex(Integer textIndex) {
    
    this.textIndex = textIndex;
    return this;
  }

   /**
   * in case of multiple matches in textList, the best match index of these items starting at zero (0)
   * @return textIndex
  **/
  @javax.annotation.Nonnull
  public Integer getTextIndex() {
    return textIndex;
  }


  public void setTextIndex(Integer textIndex) {
    this.textIndex = textIndex;
  }


  public CMSearchResult score(Float score) {
    
    this.score = score;
    return this;
  }

   /**
   * the relative score of this match, the bigger, the better
   * @return score
  **/
  @javax.annotation.Nonnull
  public Float getScore() {
    return score;
  }


  public void setScore(Float score) {
    this.score = score;
  }


  public CMSearchResult sortDesc(Boolean sortDesc) {
    
    this.sortDesc = sortDesc;
    return this;
  }

   /**
   * was this document along with any others sorted ascending or descending?
   * @return sortDesc
  **/
  @javax.annotation.Nonnull
  public Boolean getSortDesc() {
    return sortDesc;
  }


  public void setSortDesc(Boolean sortDesc) {
    this.sortDesc = sortDesc;
  }


  public CMSearchResult qnaResult(Boolean qnaResult) {
    
    this.qnaResult = qnaResult;
    return this;
  }

   /**
   * is this item a Q&amp;A result or a search result?
   * @return qnaResult
  **/
  @javax.annotation.Nonnull
  public Boolean getQnaResult() {
    return qnaResult;
  }


  public void setQnaResult(Boolean qnaResult) {
    this.qnaResult = qnaResult;
  }


  public CMSearchResult firstSentence(Integer firstSentence) {
    
    this.firstSentence = firstSentence;
    return this;
  }

   /**
   * the id of the first sentence in this result
   * @return firstSentence
  **/
  @javax.annotation.Nonnull
  public Integer getFirstSentence() {
    return firstSentence;
  }


  public void setFirstSentence(Integer firstSentence) {
    this.firstSentence = firstSentence;
  }


  public CMSearchResult created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * document creation date-time as a unix date-time
   * @return created
  **/
  @javax.annotation.Nonnull
  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public CMSearchResult uploaded(Long uploaded) {
    
    this.uploaded = uploaded;
    return this;
  }

   /**
   * document uploaded to SimSage date-time as a unix date-time
   * @return uploaded
  **/
  @javax.annotation.Nonnull
  public Long getUploaded() {
    return uploaded;
  }


  public void setUploaded(Long uploaded) {
    this.uploaded = uploaded;
  }


  public CMSearchResult lastModified(Long lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * document last-modified date-time as a unix date-time
   * @return lastModified
  **/
  @javax.annotation.Nonnull
  public Long getLastModified() {
    return lastModified;
  }


  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }


  public CMSearchResult documentType(String documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * the type of this document/record as a three or four letter file extension
   * @return documentType
  **/
  @javax.annotation.Nonnull
  public String getDocumentType() {
    return documentType;
  }


  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public CMSearchResult numSentences(Integer numSentences) {
    
    this.numSentences = numSentences;
    return this;
  }

   /**
   * the total number of sentences in the body of this document
   * @return numSentences
  **/
  @javax.annotation.Nonnull
  public Integer getNumSentences() {
    return numSentences;
  }


  public void setNumSentences(Integer numSentences) {
    this.numSentences = numSentences;
  }


  public CMSearchResult numWords(Integer numWords) {
    
    this.numWords = numWords;
    return this;
  }

   /**
   * the total number of words and tokens (eg. &#39;.&#39;) in the body of this document
   * @return numWords
  **/
  @javax.annotation.Nonnull
  public Integer getNumWords() {
    return numWords;
  }


  public void setNumWords(Integer numWords) {
    this.numWords = numWords;
  }


  public CMSearchResult numRelationships(Integer numRelationships) {
    
    this.numRelationships = numRelationships;
    return this;
  }

   /**
   * the total number of relationships expanded from the words in this document
   * @return numRelationships
  **/
  @javax.annotation.Nonnull
  public Integer getNumRelationships() {
    return numRelationships;
  }


  public void setNumRelationships(Integer numRelationships) {
    this.numRelationships = numRelationships;
  }


  public CMSearchResult binarySize(Long binarySize) {
    
    this.binarySize = binarySize;
    return this;
  }

   /**
   * the binary-size of the original document in bytes
   * @return binarySize
  **/
  @javax.annotation.Nonnull
  public Long getBinarySize() {
    return binarySize;
  }


  public void setBinarySize(Long binarySize) {
    this.binarySize = binarySize;
  }


  public CMSearchResult textSize(Integer textSize) {
    
    this.textSize = textSize;
    return this;
  }

   /**
   * the text-size of the original document in number of characters
   * @return textSize
  **/
  @javax.annotation.Nonnull
  public Integer getTextSize() {
    return textSize;
  }


  public void setTextSize(Integer textSize) {
    this.textSize = textSize;
  }


  public CMSearchResult fileType(String fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * the DROID file-type of this document/record (can be empty)
   * @return fileType
  **/
  @javax.annotation.Nonnull
  public String getFileType() {
    return fileType;
  }


  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  public CMSearchResult crawled(Long crawled) {
    
    this.crawled = crawled;
    return this;
  }

   /**
   * document crawled (ie. picked up by SimSage) date-time as a unix date-time
   * @return crawled
  **/
  @javax.annotation.Nonnull
  public Long getCrawled() {
    return crawled;
  }


  public void setCrawled(Long crawled) {
    this.crawled = crawled;
  }


  public CMSearchResult converted(Long converted) {
    
    this.converted = converted;
    return this;
  }

   /**
   * document conversion (ie. turned into text by SimSage) date-time as a unix date-time
   * @return converted
  **/
  @javax.annotation.Nonnull
  public Long getConverted() {
    return converted;
  }


  public void setConverted(Long converted) {
    this.converted = converted;
  }


  public CMSearchResult parsed(Long parsed) {
    
    this.parsed = parsed;
    return this;
  }

   /**
   * document parsed (ie. language analyzed by SimSage) date-time as a unix date-time
   * @return parsed
  **/
  @javax.annotation.Nonnull
  public Long getParsed() {
    return parsed;
  }


  public void setParsed(Long parsed) {
    this.parsed = parsed;
  }


  public CMSearchResult indexed(Long indexed) {
    
    this.indexed = indexed;
    return this;
  }

   /**
   * document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time
   * @return indexed
  **/
  @javax.annotation.Nonnull
  public Long getIndexed() {
    return indexed;
  }


  public void setIndexed(Long indexed) {
    this.indexed = indexed;
  }


  public CMSearchResult previewed(Long previewed) {
    
    this.previewed = previewed;
    return this;
  }

   /**
   * document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time
   * @return previewed
  **/
  @javax.annotation.Nonnull
  public Long getPreviewed() {
    return previewed;
  }


  public void setPreviewed(Long previewed) {
    this.previewed = previewed;
  }


  public CMSearchResult similarDocumentList(List<CMSimilarDocument> similarDocumentList) {
    
    this.similarDocumentList = similarDocumentList;
    return this;
  }

  public CMSearchResult addSimilarDocumentListItem(CMSimilarDocument similarDocumentListItem) {
    if (this.similarDocumentList == null) {
      this.similarDocumentList = new ArrayList<>();
    }
    this.similarDocumentList.add(similarDocumentListItem);
    return this;
  }

   /**
   * A list of similar documents matched by this query.
   * @return similarDocumentList
  **/
  @javax.annotation.Nonnull
  public List<CMSimilarDocument> getSimilarDocumentList() {
    return similarDocumentList;
  }


  public void setSimilarDocumentList(List<CMSimilarDocument> similarDocumentList) {
    this.similarDocumentList = similarDocumentList;
  }


  public CMSearchResult relatedList(List<CMDocumentRelationship> relatedList) {
    
    this.relatedList = relatedList;
    return this;
  }

  public CMSearchResult addRelatedListItem(CMDocumentRelationship relatedListItem) {
    if (this.relatedList == null) {
      this.relatedList = new ArrayList<>();
    }
    this.relatedList.add(relatedListItem);
    return this;
  }

   /**
   * A list of similar documents matched by this query.
   * @return relatedList
  **/
  @javax.annotation.Nonnull
  public List<CMDocumentRelationship> getRelatedList() {
    return relatedList;
  }


  public void setRelatedList(List<CMDocumentRelationship> relatedList) {
    this.relatedList = relatedList;
  }


  public CMSearchResult metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CMSearchResult putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of name-values of metadata associated with this document
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CMSearchResult filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * the filename of this document in the DMS system
   * @return filename
  **/
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public CMSearchResult folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * the folderId of this item in the DMS system
   * @return folderId
  **/
  @javax.annotation.Nonnull
  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public CMSearchResult renderType(String renderType) {
    
    this.renderType = renderType;
    return this;
  }

   /**
   * how should this item be rendered? (default \&quot;rt search\&quot;)
   * @return renderType
  **/
  @javax.annotation.Nonnull
  public String getRenderType() {
    return renderType;
  }


  public void setRenderType(String renderType) {
    this.renderType = renderType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMSearchResult cmSearchResult = (CMSearchResult) o;
    return Objects.equals(this.kbId, cmSearchResult.kbId) &&
        Objects.equals(this.url, cmSearchResult.url) &&
        Objects.equals(this.urlId, cmSearchResult.urlId) &&
        Objects.equals(this.sourceId, cmSearchResult.sourceId) &&
        Objects.equals(this.title, cmSearchResult.title) &&
        Objects.equals(this.author, cmSearchResult.author) &&
        Objects.equals(this.textList, cmSearchResult.textList) &&
        Objects.equals(this.textIndex, cmSearchResult.textIndex) &&
        Objects.equals(this.score, cmSearchResult.score) &&
        Objects.equals(this.sortDesc, cmSearchResult.sortDesc) &&
        Objects.equals(this.qnaResult, cmSearchResult.qnaResult) &&
        Objects.equals(this.firstSentence, cmSearchResult.firstSentence) &&
        Objects.equals(this.created, cmSearchResult.created) &&
        Objects.equals(this.uploaded, cmSearchResult.uploaded) &&
        Objects.equals(this.lastModified, cmSearchResult.lastModified) &&
        Objects.equals(this.documentType, cmSearchResult.documentType) &&
        Objects.equals(this.numSentences, cmSearchResult.numSentences) &&
        Objects.equals(this.numWords, cmSearchResult.numWords) &&
        Objects.equals(this.numRelationships, cmSearchResult.numRelationships) &&
        Objects.equals(this.binarySize, cmSearchResult.binarySize) &&
        Objects.equals(this.textSize, cmSearchResult.textSize) &&
        Objects.equals(this.fileType, cmSearchResult.fileType) &&
        Objects.equals(this.crawled, cmSearchResult.crawled) &&
        Objects.equals(this.converted, cmSearchResult.converted) &&
        Objects.equals(this.parsed, cmSearchResult.parsed) &&
        Objects.equals(this.indexed, cmSearchResult.indexed) &&
        Objects.equals(this.previewed, cmSearchResult.previewed) &&
        Objects.equals(this.similarDocumentList, cmSearchResult.similarDocumentList) &&
        Objects.equals(this.relatedList, cmSearchResult.relatedList) &&
        Objects.equals(this.metadata, cmSearchResult.metadata) &&
        Objects.equals(this.filename, cmSearchResult.filename) &&
        Objects.equals(this.folderId, cmSearchResult.folderId) &&
        Objects.equals(this.renderType, cmSearchResult.renderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kbId, url, urlId, sourceId, title, author, textList, textIndex, score, sortDesc, qnaResult, firstSentence, created, uploaded, lastModified, documentType, numSentences, numWords, numRelationships, binarySize, textSize, fileType, crawled, converted, parsed, indexed, previewed, similarDocumentList, relatedList, metadata, filename, folderId, renderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMSearchResult {\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
    sb.append("    textIndex: ").append(toIndentedString(textIndex)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    sortDesc: ").append(toIndentedString(sortDesc)).append("\n");
    sb.append("    qnaResult: ").append(toIndentedString(qnaResult)).append("\n");
    sb.append("    firstSentence: ").append(toIndentedString(firstSentence)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    numSentences: ").append(toIndentedString(numSentences)).append("\n");
    sb.append("    numWords: ").append(toIndentedString(numWords)).append("\n");
    sb.append("    numRelationships: ").append(toIndentedString(numRelationships)).append("\n");
    sb.append("    binarySize: ").append(toIndentedString(binarySize)).append("\n");
    sb.append("    textSize: ").append(toIndentedString(textSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    crawled: ").append(toIndentedString(crawled)).append("\n");
    sb.append("    converted: ").append(toIndentedString(converted)).append("\n");
    sb.append("    parsed: ").append(toIndentedString(parsed)).append("\n");
    sb.append("    indexed: ").append(toIndentedString(indexed)).append("\n");
    sb.append("    previewed: ").append(toIndentedString(previewed)).append("\n");
    sb.append("    similarDocumentList: ").append(toIndentedString(similarDocumentList)).append("\n");
    sb.append("    relatedList: ").append(toIndentedString(relatedList)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    renderType: ").append(toIndentedString(renderType)).append("\n");
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
    openapiFields.add("kbId");
    openapiFields.add("url");
    openapiFields.add("urlId");
    openapiFields.add("sourceId");
    openapiFields.add("title");
    openapiFields.add("author");
    openapiFields.add("textList");
    openapiFields.add("textIndex");
    openapiFields.add("score");
    openapiFields.add("sortDesc");
    openapiFields.add("qnaResult");
    openapiFields.add("firstSentence");
    openapiFields.add("created");
    openapiFields.add("uploaded");
    openapiFields.add("lastModified");
    openapiFields.add("documentType");
    openapiFields.add("numSentences");
    openapiFields.add("numWords");
    openapiFields.add("numRelationships");
    openapiFields.add("binarySize");
    openapiFields.add("textSize");
    openapiFields.add("fileType");
    openapiFields.add("crawled");
    openapiFields.add("converted");
    openapiFields.add("parsed");
    openapiFields.add("indexed");
    openapiFields.add("previewed");
    openapiFields.add("similarDocumentList");
    openapiFields.add("relatedList");
    openapiFields.add("metadata");
    openapiFields.add("filename");
    openapiFields.add("folderId");
    openapiFields.add("renderType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("urlId");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("textList");
    openapiRequiredFields.add("textIndex");
    openapiRequiredFields.add("score");
    openapiRequiredFields.add("sortDesc");
    openapiRequiredFields.add("qnaResult");
    openapiRequiredFields.add("firstSentence");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("uploaded");
    openapiRequiredFields.add("lastModified");
    openapiRequiredFields.add("documentType");
    openapiRequiredFields.add("numSentences");
    openapiRequiredFields.add("numWords");
    openapiRequiredFields.add("numRelationships");
    openapiRequiredFields.add("binarySize");
    openapiRequiredFields.add("textSize");
    openapiRequiredFields.add("fileType");
    openapiRequiredFields.add("crawled");
    openapiRequiredFields.add("converted");
    openapiRequiredFields.add("parsed");
    openapiRequiredFields.add("indexed");
    openapiRequiredFields.add("previewed");
    openapiRequiredFields.add("similarDocumentList");
    openapiRequiredFields.add("relatedList");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("folderId");
    openapiRequiredFields.add("renderType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMSearchResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMSearchResult is not found in the empty JSON string", CMSearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMSearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMSearchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMSearchResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("textList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("textList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `textList` to be an array in the JSON string but got `%s`", jsonObj.get("textList").toString()));
      }
      if (!jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if (!jsonObj.get("fileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileType").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("similarDocumentList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `similarDocumentList` to be an array in the JSON string but got `%s`", jsonObj.get("similarDocumentList").toString()));
      }

      JsonArray jsonArraysimilarDocumentList = jsonObj.getAsJsonArray("similarDocumentList");
      // validate the required field `similarDocumentList` (array)
      for (int i = 0; i < jsonArraysimilarDocumentList.size(); i++) {
        CMSimilarDocument.validateJsonElement(jsonArraysimilarDocumentList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("relatedList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `relatedList` to be an array in the JSON string but got `%s`", jsonObj.get("relatedList").toString()));
      }

      JsonArray jsonArrayrelatedList = jsonObj.getAsJsonArray("relatedList");
      // validate the required field `relatedList` (array)
      for (int i = 0; i < jsonArrayrelatedList.size(); i++) {
        CMDocumentRelationship.validateJsonElement(jsonArrayrelatedList.get(i));
      };
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (!jsonObj.get("folderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderId").toString()));
      }
      if (!jsonObj.get("renderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renderType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CMSearchResult>() {
           @Override
           public void write(JsonWriter out, CMSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMSearchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMSearchResult
  * @throws IOException if the JSON string is invalid with respect to CMSearchResult
  */
  public static CMSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMSearchResult.class);
  }

 /**
  * Convert an instance of CMSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

