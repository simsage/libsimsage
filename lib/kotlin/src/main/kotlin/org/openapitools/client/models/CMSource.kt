/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CMDocumentAcl

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A SimSage source object used for updating and creating SimSage crawlers/connections to external silos like Sharepoint, OneDrive, Exchange, DropBox, Box, iManage, and others.
 *
 * @param sourceId the source-id, primary key of the source
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id (its guid id) for this source/crawler
 * @param nodeId the system's node id of this source (what kubernetes-node to run on, starting with zero, set NODE_ID in env to manipulate this value).  Sources will only run on machines with a matching node-id
 * @param name the display-name (descriptive name) of this source.  The source's name must be unique within a knowledge-base.
 * @param crawlerType the type of this source
 * @param schedule the time-schedule of this crawler, when active and when not repeating in a weekly-per hour cycle in GMT time.  Empty string means not active at all
 * @param deleteFiles Should this crawler remove files that are no longer visible after a crawl completes without errors?  Used for sources that cannot report on file/data removal.
 * @param allowAnonymous Is the content of this crawler accessible anonymously (ie. no permissions/ACLs required).  Some crawlers like the web crawler always have this value as true.  NB.  Setting this flag to \"true\" will bypass any security on the source's own ACLs and make all its content available to everyone.
 * @param processingLevel How much processing should SimSage give each file of this source.  As defined internally in ProcessingLevel.  level 1, CONVERT: convert all document binaries to text (creates metadata text).  level 2, PARSE: NLP process the files (creates sentences and tokens for all text).  level 3, INDEX: create inverted indexes for files (creates indexes).
 * @param enablePreview Generate per-document image-preview information as well as full HTML previews if set to \"true\".
 * @param filesPerSecond Any value greater than 0 will cause the crawler to sleep for as many milliseconds between file uploads.
 * @param specificJson A json string with specific values for this type of source.  Generated by the SimSage administrative system.
 * @param sessionId a valid session-guid id.
 * @param maxItems Set a content limit for the maximum number of items to contain for this source.  A value of zero (0) indicates no limits.
 * @param maxBotItems Set a Question and Answer content limit for the maximum number of deep-learning Q&A items this source can contain.  A value of zero (0) indicates no limits.
 * @param customRender Does this source require custom render templates or use ordinary search-results?
 * @param edgeDeviceId The associated Edge device for this source (or empty string if not associated with one)
 * @param qaMatchStrength the default threshold for matching deep-learning vector matching results (value should be between 0.7 and 0.99)
 * @param numResults the default number of search results to return from the semantic-search system
 * @param numFragments the number of fragments to return per search-result from the semantic-search system.  Affects accuracy, a value of \"1\" will only look at the first match.  Higher values look for more matches inside a single document.  Too high a value will affect performance.  Default value \"3\".
 * @param numErrors the number of errors from the last source-run
 * @param errorThreshold the number of errors allowed before failing the source and not force-removing any files at the end of a run through an external source.
 * @param startTime when the last run of this source started
 * @param endTime when the last run of this source finished
 * @param acls A list for overwriting security permission for a source.  Can be empty.  Use this to override security on external systems.
 * @param isCrawling \"true\" if this source busy/active.
 * @param numCrawledDocuments the number of documents seen by the crawler thus-far.
 * @param numConvertedDocuments the number of documents converted by SimSage thus-far.
 * @param numParsedDocuments the number of documents parsed by SimSage thus-far.
 * @param numIndexedDocuments the number of documents indexed by SimSage thus-far.
 * @param numFinishedDocuments the number of finished (fully processed) by SimSage thus-far.
 * @param numErroredDocuments the number of errored documents by SimSage thus-far.
 * @param numTotalDocuments the total number of documents for this source in SimSage.
 * @param numTotalErroredDocuments the total number of documents for this source marked as errored in SimSage.
 * @param useDefaultRelationships \"true\" if this source is to use the default (built-in) SimSage relationships.  All user-defined relationships and language-entities will be used regardless of the value of this flag.
 * @param isBusy \"true\" if this source is currently being optimized / processed by the index-optimizer.
 * @param autoOptimize Do we run the index-optimizer automatically after this source finishes crawling?
 * @param storeBinary \"true\" if this source is to store all documents locally on the SimSage platform
 * @param versioned \"true\" if this source is to store all versions of documents locally on the SimSage platform
 * @param writeToCassandra \"true\" if this source is to write any changes direct to Cassandra, otherwise this source will collect indexes on disk first (for initial loading)
 * @param processorConfig Json string defining any optional processors configured on the source
 * @param enableDocumentSimilarity enable document similarity calculations.
 * @param documentSimilarityThreshold the document similarity threshold for grouping documents, a value between 0.75 and 1.0
 * @param isExternal is this crawler to be connected as an external source using our external crawler software?
 * @param useOCR enable OCR processing for files in this source?
 * @param useSTT enable Speech-to-text processing for files in this source?
 * @param deltaIndicator A saved value indicating last crawler state
 * @param transmitExternalLogs enabling sending of logs to SimSage for external crawlers
 * @param `external` 
 * @param crawling 
 * @param busy 
 */


data class CMSource (

    /* the source-id, primary key of the source */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (its guid id) for this source/crawler */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the system's node id of this source (what kubernetes-node to run on, starting with zero, set NODE_ID in env to manipulate this value).  Sources will only run on machines with a matching node-id */
    @Json(name = "nodeId")
    val nodeId: kotlin.Int,

    /* the display-name (descriptive name) of this source.  The source's name must be unique within a knowledge-base. */
    @Json(name = "name")
    val name: kotlin.String,

    /* the type of this source */
    @Json(name = "crawlerType")
    val crawlerType: kotlin.String,

    /* the time-schedule of this crawler, when active and when not repeating in a weekly-per hour cycle in GMT time.  Empty string means not active at all */
    @Json(name = "schedule")
    val schedule: kotlin.String,

    /* Should this crawler remove files that are no longer visible after a crawl completes without errors?  Used for sources that cannot report on file/data removal. */
    @Json(name = "deleteFiles")
    val deleteFiles: kotlin.Boolean,

    /* Is the content of this crawler accessible anonymously (ie. no permissions/ACLs required).  Some crawlers like the web crawler always have this value as true.  NB.  Setting this flag to \"true\" will bypass any security on the source's own ACLs and make all its content available to everyone. */
    @Json(name = "allowAnonymous")
    val allowAnonymous: kotlin.Boolean,

    /* How much processing should SimSage give each file of this source.  As defined internally in ProcessingLevel.  level 1, CONVERT: convert all document binaries to text (creates metadata text).  level 2, PARSE: NLP process the files (creates sentences and tokens for all text).  level 3, INDEX: create inverted indexes for files (creates indexes). */
    @Json(name = "processingLevel")
    val processingLevel: kotlin.String,

    /* Generate per-document image-preview information as well as full HTML previews if set to \"true\". */
    @Json(name = "enablePreview")
    val enablePreview: kotlin.Boolean,

    /* Any value greater than 0 will cause the crawler to sleep for as many milliseconds between file uploads. */
    @Json(name = "filesPerSecond")
    val filesPerSecond: kotlin.Float,

    /* A json string with specific values for this type of source.  Generated by the SimSage administrative system. */
    @Json(name = "specificJson")
    val specificJson: kotlin.String,

    /* a valid session-guid id. */
    @Json(name = "sessionId")
    val sessionId: kotlin.String,

    /* Set a content limit for the maximum number of items to contain for this source.  A value of zero (0) indicates no limits. */
    @Json(name = "maxItems")
    val maxItems: kotlin.Long,

    /* Set a Question and Answer content limit for the maximum number of deep-learning Q&A items this source can contain.  A value of zero (0) indicates no limits. */
    @Json(name = "maxBotItems")
    val maxBotItems: kotlin.Long,

    /* Does this source require custom render templates or use ordinary search-results? */
    @Json(name = "customRender")
    val customRender: kotlin.Boolean,

    /* The associated Edge device for this source (or empty string if not associated with one) */
    @Json(name = "edgeDeviceId")
    val edgeDeviceId: kotlin.String,

    /* the default threshold for matching deep-learning vector matching results (value should be between 0.7 and 0.99) */
    @Json(name = "qaMatchStrength")
    val qaMatchStrength: kotlin.Float,

    /* the default number of search results to return from the semantic-search system */
    @Json(name = "numResults")
    val numResults: kotlin.Int,

    /* the number of fragments to return per search-result from the semantic-search system.  Affects accuracy, a value of \"1\" will only look at the first match.  Higher values look for more matches inside a single document.  Too high a value will affect performance.  Default value \"3\". */
    @Json(name = "numFragments")
    val numFragments: kotlin.Int,

    /* the number of errors from the last source-run */
    @Json(name = "numErrors")
    val numErrors: kotlin.Int,

    /* the number of errors allowed before failing the source and not force-removing any files at the end of a run through an external source. */
    @Json(name = "errorThreshold")
    val errorThreshold: kotlin.Int,

    /* when the last run of this source started */
    @Json(name = "startTime")
    val startTime: kotlin.Long,

    /* when the last run of this source finished */
    @Json(name = "endTime")
    val endTime: kotlin.Long,

    /* A list for overwriting security permission for a source.  Can be empty.  Use this to override security on external systems. */
    @Json(name = "acls")
    val acls: kotlin.collections.List<CMDocumentAcl>,

    /* \"true\" if this source busy/active. */
    @Json(name = "isCrawling")
    val isCrawling: kotlin.Boolean,

    /* the number of documents seen by the crawler thus-far. */
    @Json(name = "numCrawledDocuments")
    val numCrawledDocuments: kotlin.Int,

    /* the number of documents converted by SimSage thus-far. */
    @Json(name = "numConvertedDocuments")
    val numConvertedDocuments: kotlin.Int,

    /* the number of documents parsed by SimSage thus-far. */
    @Json(name = "numParsedDocuments")
    val numParsedDocuments: kotlin.Int,

    /* the number of documents indexed by SimSage thus-far. */
    @Json(name = "numIndexedDocuments")
    val numIndexedDocuments: kotlin.Int,

    /* the number of finished (fully processed) by SimSage thus-far. */
    @Json(name = "numFinishedDocuments")
    val numFinishedDocuments: kotlin.Int,

    /* the number of errored documents by SimSage thus-far. */
    @Json(name = "numErroredDocuments")
    val numErroredDocuments: kotlin.Int,

    /* the total number of documents for this source in SimSage. */
    @Json(name = "numTotalDocuments")
    val numTotalDocuments: kotlin.Int,

    /* the total number of documents for this source marked as errored in SimSage. */
    @Json(name = "numTotalErroredDocuments")
    val numTotalErroredDocuments: kotlin.Int,

    /* \"true\" if this source is to use the default (built-in) SimSage relationships.  All user-defined relationships and language-entities will be used regardless of the value of this flag. */
    @Json(name = "useDefaultRelationships")
    val useDefaultRelationships: kotlin.Boolean,

    /* \"true\" if this source is currently being optimized / processed by the index-optimizer. */
    @Json(name = "isBusy")
    val isBusy: kotlin.Boolean,

    /* Do we run the index-optimizer automatically after this source finishes crawling? */
    @Json(name = "autoOptimize")
    val autoOptimize: kotlin.Boolean,

    /* \"true\" if this source is to store all documents locally on the SimSage platform */
    @Json(name = "storeBinary")
    val storeBinary: kotlin.Boolean,

    /* \"true\" if this source is to store all versions of documents locally on the SimSage platform */
    @Json(name = "versioned")
    val versioned: kotlin.Boolean,

    /* \"true\" if this source is to write any changes direct to Cassandra, otherwise this source will collect indexes on disk first (for initial loading) */
    @Json(name = "writeToCassandra")
    val writeToCassandra: kotlin.Boolean,

    /* Json string defining any optional processors configured on the source */
    @Json(name = "processorConfig")
    val processorConfig: kotlin.String,

    /* enable document similarity calculations. */
    @Json(name = "enableDocumentSimilarity")
    val enableDocumentSimilarity: kotlin.Boolean,

    /* the document similarity threshold for grouping documents, a value between 0.75 and 1.0 */
    @Json(name = "documentSimilarityThreshold")
    val documentSimilarityThreshold: kotlin.Float,

    /* is this crawler to be connected as an external source using our external crawler software? */
    @Json(name = "isExternal")
    val isExternal: kotlin.Boolean,

    /* enable OCR processing for files in this source? */
    @Json(name = "useOCR")
    val useOCR: kotlin.Boolean,

    /* enable Speech-to-text processing for files in this source? */
    @Json(name = "useSTT")
    val useSTT: kotlin.Boolean,

    /* A saved value indicating last crawler state */
    @Json(name = "deltaIndicator")
    val deltaIndicator: kotlin.String,

    /* enabling sending of logs to SimSage for external crawlers */
    @Json(name = "transmitExternalLogs")
    val transmitExternalLogs: kotlin.Boolean,

    @Json(name = "external")
    val `external`: kotlin.Boolean? = null,

    @Json(name = "crawling")
    val crawling: kotlin.Boolean? = null,

    @Json(name = "busy")
    val busy: kotlin.Boolean? = null

)

