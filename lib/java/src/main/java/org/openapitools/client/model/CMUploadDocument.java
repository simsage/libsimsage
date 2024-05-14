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
import org.openapitools.client.model.MDMetadataMapping;

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
 * An external document representation object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T16:13:48.547313222+01:00[Europe/London]")
public class CMUploadDocument {
  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "organisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private String organisationId;

  public static final String SERIALIZED_NAME_KB_ID = "kbId";
  @SerializedName(SERIALIZED_NAME_KB_ID)
  private String kbId;

  public static final String SERIALIZED_NAME_SID = "sid";
  @SerializedName(SERIALIZED_NAME_SID)
  private String sid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private Integer sourceId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_PUID = "puid";
  @SerializedName(SERIALIZED_NAME_PUID)
  private String puid;

  public static final String SERIALIZED_NAME_ACLS = "acls";
  @SerializedName(SERIALIZED_NAME_ACLS)
  private String acls;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_CHANGE_HASH = "changeHash";
  @SerializedName(SERIALIZED_NAME_CHANGE_HASH)
  private String changeHash;

  public static final String SERIALIZED_NAME_CONTENT_HASH = "contentHash";
  @SerializedName(SERIALIZED_NAME_CONTENT_HASH)
  private String contentHash;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_BINARY_SIZE = "binarySize";
  @SerializedName(SERIALIZED_NAME_BINARY_SIZE)
  private Integer binarySize;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private Long lastModified;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<MDMetadataMapping> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_ENCRYPTED = "encrypted";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED)
  private Boolean encrypted;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private Integer seed;

  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private Long runId;

  public CMUploadDocument() {
  }

  public CMUploadDocument objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * the type of this class, just in case this object is encrypted
   * @return objectType
  **/
  @javax.annotation.Nonnull
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public CMUploadDocument organisationId(String organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * the organisation (its guid id) this document should go into.
   * @return organisationId
  **/
  @javax.annotation.Nonnull
  public String getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(String organisationId) {
    this.organisationId = organisationId;
  }


  public CMUploadDocument kbId(String kbId) {
    
    this.kbId = kbId;
    return this;
  }

   /**
   * the knowledge-base (its guid id) this document should go into.
   * @return kbId
  **/
  @javax.annotation.Nonnull
  public String getKbId() {
    return kbId;
  }


  public void setKbId(String kbId) {
    this.kbId = kbId;
  }


  public CMUploadDocument sid(String sid) {
    
    this.sid = sid;
    return this;
  }

   /**
   * the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
   * @return sid
  **/
  @javax.annotation.Nonnull
  public String getSid() {
    return sid;
  }


  public void setSid(String sid) {
    this.sid = sid;
  }


  public CMUploadDocument sourceId(Integer sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source-id of this crawler (ie. the crawler&#39;s id) this document came from.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public Integer getSourceId() {
    return sourceId;
  }


  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public CMUploadDocument url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * A unique URL for this document.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CMUploadDocument mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The mime-type of this document, must be a known-datatype to SimSage.
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public CMUploadDocument puid(String puid) {
    
    this.puid = puid;
    return this;
  }

   /**
   * The Pronom Unique ID for this document.
   * @return puid
  **/
  @javax.annotation.Nonnull
  public String getPuid() {
    return puid;
  }


  public void setPuid(String puid) {
    this.puid = puid;
  }


  public CMUploadDocument acls(String acls) {
    
    this.acls = acls;
    return this;
  }

   /**
   * A list of security permission for this document.  Can be empty (ie. no security applied).
   * @return acls
  **/
  @javax.annotation.Nonnull
  public String getAcls() {
    return acls;
  }


  public void setAcls(String acls) {
    this.acls = acls;
  }


  public CMUploadDocument title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of this document, can be empty.
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CMUploadDocument author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * The author of this document, can be empty.
   * @return author
  **/
  @javax.annotation.Nonnull
  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public CMUploadDocument changeHash(String changeHash) {
    
    this.changeHash = changeHash;
    return this;
  }

   /**
   * A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last.
   * @return changeHash
  **/
  @javax.annotation.Nonnull
  public String getChangeHash() {
    return changeHash;
  }


  public void setChangeHash(String changeHash) {
    this.changeHash = changeHash;
  }


  public CMUploadDocument contentHash(String contentHash) {
    
    this.contentHash = contentHash;
    return this;
  }

   /**
   * A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection.
   * @return contentHash
  **/
  @javax.annotation.Nonnull
  public String getContentHash() {
    return contentHash;
  }


  public void setContentHash(String contentHash) {
    this.contentHash = contentHash;
  }


  public CMUploadDocument data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * the base64 encoded content of this document.  Must be prefixed with &#39;;base64,&#39;, can be empty indicating the content wasn&#39;t valid.
   * @return data
  **/
  @javax.annotation.Nonnull
  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public CMUploadDocument binarySize(Integer binarySize) {
    
    this.binarySize = binarySize;
    return this;
  }

   /**
   * the binary-size of the document in bytes if data is not set.
   * @return binarySize
  **/
  @javax.annotation.Nonnull
  public Integer getBinarySize() {
    return binarySize;
  }


  public void setBinarySize(Integer binarySize) {
    this.binarySize = binarySize;
  }


  public CMUploadDocument text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * the text content of the asset (if set).
   * @return text
  **/
  @javax.annotation.Nonnull
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CMUploadDocument created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * a unix-timestamp of the creation date-time of this document
   * @return created
  **/
  @javax.annotation.Nonnull
  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public CMUploadDocument lastModified(Long lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * a unix-timestamp of the last-modified date-time of this document
   * @return lastModified
  **/
  @javax.annotation.Nonnull
  public Long getLastModified() {
    return lastModified;
  }


  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }


  public CMUploadDocument metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CMUploadDocument putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * a series of name values for other metadata values found in the container of this document
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CMUploadDocument categories(List<MDMetadataMapping> categories) {
    
    this.categories = categories;
    return this;
  }

  public CMUploadDocument addCategoriesItem(MDMetadataMapping categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * A list of special SimSage metadata categories for matching this document with.  Can be empty.
   * @return categories
  **/
  @javax.annotation.Nonnull
  public List<MDMetadataMapping> getCategories() {
    return categories;
  }


  public void setCategories(List<MDMetadataMapping> categories) {
    this.categories = categories;
  }


  public CMUploadDocument size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of this document (the original) in bytes
   * @return size
  **/
  @javax.annotation.Nonnull
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public CMUploadDocument template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * A render template for this document.  This is only appropriate for Database and RESTful type sources.
   * @return template
  **/
  @javax.annotation.Nonnull
  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public CMUploadDocument encrypted(Boolean encrypted) {
    
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Do we need to add transport encryption
   * @return encrypted
  **/
  @javax.annotation.Nonnull
  public Boolean getEncrypted() {
    return encrypted;
  }


  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }


  public CMUploadDocument seed(Integer seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * The seed used if encrypted
   * @return seed
  **/
  @javax.annotation.Nonnull
  public Integer getSeed() {
    return seed;
  }


  public void setSeed(Integer seed) {
    this.seed = seed;
  }


  public CMUploadDocument runId(Long runId) {
    
    this.runId = runId;
    return this;
  }

   /**
   * the id (a unix timestamp) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier.
   * @return runId
  **/
  @javax.annotation.Nonnull
  public Long getRunId() {
    return runId;
  }


  public void setRunId(Long runId) {
    this.runId = runId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMUploadDocument cmUploadDocument = (CMUploadDocument) o;
    return Objects.equals(this.objectType, cmUploadDocument.objectType) &&
        Objects.equals(this.organisationId, cmUploadDocument.organisationId) &&
        Objects.equals(this.kbId, cmUploadDocument.kbId) &&
        Objects.equals(this.sid, cmUploadDocument.sid) &&
        Objects.equals(this.sourceId, cmUploadDocument.sourceId) &&
        Objects.equals(this.url, cmUploadDocument.url) &&
        Objects.equals(this.mimeType, cmUploadDocument.mimeType) &&
        Objects.equals(this.puid, cmUploadDocument.puid) &&
        Objects.equals(this.acls, cmUploadDocument.acls) &&
        Objects.equals(this.title, cmUploadDocument.title) &&
        Objects.equals(this.author, cmUploadDocument.author) &&
        Objects.equals(this.changeHash, cmUploadDocument.changeHash) &&
        Objects.equals(this.contentHash, cmUploadDocument.contentHash) &&
        Objects.equals(this.data, cmUploadDocument.data) &&
        Objects.equals(this.binarySize, cmUploadDocument.binarySize) &&
        Objects.equals(this.text, cmUploadDocument.text) &&
        Objects.equals(this.created, cmUploadDocument.created) &&
        Objects.equals(this.lastModified, cmUploadDocument.lastModified) &&
        Objects.equals(this.metadata, cmUploadDocument.metadata) &&
        Objects.equals(this.categories, cmUploadDocument.categories) &&
        Objects.equals(this.size, cmUploadDocument.size) &&
        Objects.equals(this.template, cmUploadDocument.template) &&
        Objects.equals(this.encrypted, cmUploadDocument.encrypted) &&
        Objects.equals(this.seed, cmUploadDocument.seed) &&
        Objects.equals(this.runId, cmUploadDocument.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, organisationId, kbId, sid, sourceId, url, mimeType, puid, acls, title, author, changeHash, contentHash, data, binarySize, text, created, lastModified, metadata, categories, size, template, encrypted, seed, runId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMUploadDocument {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    kbId: ").append(toIndentedString(kbId)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    puid: ").append(toIndentedString(puid)).append("\n");
    sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changeHash: ").append(toIndentedString(changeHash)).append("\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    binarySize: ").append(toIndentedString(binarySize)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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
    openapiFields.add("objectType");
    openapiFields.add("organisationId");
    openapiFields.add("kbId");
    openapiFields.add("sid");
    openapiFields.add("sourceId");
    openapiFields.add("url");
    openapiFields.add("mimeType");
    openapiFields.add("puid");
    openapiFields.add("acls");
    openapiFields.add("title");
    openapiFields.add("author");
    openapiFields.add("changeHash");
    openapiFields.add("contentHash");
    openapiFields.add("data");
    openapiFields.add("binarySize");
    openapiFields.add("text");
    openapiFields.add("created");
    openapiFields.add("lastModified");
    openapiFields.add("metadata");
    openapiFields.add("categories");
    openapiFields.add("size");
    openapiFields.add("template");
    openapiFields.add("encrypted");
    openapiFields.add("seed");
    openapiFields.add("runId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("objectType");
    openapiRequiredFields.add("organisationId");
    openapiRequiredFields.add("kbId");
    openapiRequiredFields.add("sid");
    openapiRequiredFields.add("sourceId");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("mimeType");
    openapiRequiredFields.add("puid");
    openapiRequiredFields.add("acls");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("changeHash");
    openapiRequiredFields.add("contentHash");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("binarySize");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("lastModified");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("categories");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("encrypted");
    openapiRequiredFields.add("seed");
    openapiRequiredFields.add("runId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMUploadDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMUploadDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMUploadDocument is not found in the empty JSON string", CMUploadDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMUploadDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMUploadDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMUploadDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if (!jsonObj.get("organisationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationId").toString()));
      }
      if (!jsonObj.get("kbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kbId").toString()));
      }
      if (!jsonObj.get("sid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sid").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if (!jsonObj.get("puid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `puid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("puid").toString()));
      }
      if (!jsonObj.get("acls").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acls` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acls").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if (!jsonObj.get("changeHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `changeHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("changeHash").toString()));
      }
      if (!jsonObj.get("contentHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentHash").toString()));
      }
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }

      JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
      // validate the required field `categories` (array)
      for (int i = 0; i < jsonArraycategories.size(); i++) {
        MDMetadataMapping.validateJsonElement(jsonArraycategories.get(i));
      };
      if (!jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMUploadDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMUploadDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMUploadDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMUploadDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<CMUploadDocument>() {
           @Override
           public void write(JsonWriter out, CMUploadDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMUploadDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMUploadDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMUploadDocument
  * @throws IOException if the JSON string is invalid with respect to CMUploadDocument
  */
  public static CMUploadDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMUploadDocument.class);
  }

 /**
  * Convert an instance of CMUploadDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

