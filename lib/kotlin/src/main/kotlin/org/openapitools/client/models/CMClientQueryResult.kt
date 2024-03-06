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

import org.openapitools.client.models.CMSavedSearch
import org.openapitools.client.models.CMSearchResult
import org.openapitools.client.models.CMSynSet
import org.openapitools.client.models.CMWordFrequency
import org.openapitools.client.models.SearchCategory

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A SimSage return search-result message for Q&A and semantic-search queries.
 *
 * @param messageType 
 * @param organisationId the organisation (its guid id).
 * @param kbId the knowledge-base id (its guid id)
 * @param text the text sent.
 * @param hasResult is there a result/reply or not?
 * @param urlList a list of reference urls associated with this answer
 * @param metadata metadata associated with the Question/Answer pair, user defined.
 * @param qnaScore how well the Q&A matcher performed a value between 0.0 and 1.0
 * @param imageList A list of image urls associated with the Q&A pair
 * @param totalDocumentCount the total number of documents found (but not included necessarily)
 * @param shardSizeList Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query.
 * @param resultList the actual search results, one for each item found
 * @param spellingCorrection a spelling correction suggestion if appropriate and enabled.
 * @param semanticSet A descriptor of semantic categories and words with frequencies in each category
 * @param knowEmail do we know the email address of this person?  if they've supplied it in the past this will be set to true.
 * @param categoryList updated categories (if applicable) with updated counts
 * @param synSetList A list of syn-sets used in the query
 * @param customRender Does this source require custom render templates or use ordinary search-results?
 * @param sourceIdToCounts a map of sourceId -> number of documents found inside this source
 * @param documentTypeToCounts a map of document-type -> number of documents found of this type
 * @param savedSearchList a list of previous searches if applicable
 * @param querySummarization an optional summarization of the search results
 */


data class CMClientQueryResult (

    @Json(name = "messageType")
    val messageType: kotlin.String,

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (its guid id) */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the text sent. */
    @Json(name = "text")
    val text: kotlin.String,

    /* is there a result/reply or not? */
    @Json(name = "hasResult")
    val hasResult: kotlin.Boolean,

    /* a list of reference urls associated with this answer */
    @Json(name = "urlList")
    val urlList: kotlin.collections.List<kotlin.String>,

    /* metadata associated with the Question/Answer pair, user defined. */
    @Json(name = "metadata")
    val metadata: kotlin.String,

    /* how well the Q&A matcher performed a value between 0.0 and 1.0 */
    @Json(name = "qnaScore")
    val qnaScore: kotlin.Float,

    /* A list of image urls associated with the Q&A pair */
    @Json(name = "imageList")
    val imageList: kotlin.collections.List<kotlin.String>,

    /* the total number of documents found (but not included necessarily) */
    @Json(name = "totalDocumentCount")
    val totalDocumentCount: kotlin.Int,

    /* Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query. */
    @Json(name = "shardSizeList")
    val shardSizeList: kotlin.collections.List<kotlin.Int>,

    /* the actual search results, one for each item found */
    @Json(name = "resultList")
    val resultList: kotlin.collections.List<CMSearchResult>,

    /* a spelling correction suggestion if appropriate and enabled. */
    @Json(name = "spellingCorrection")
    val spellingCorrection: kotlin.String,

    /* A descriptor of semantic categories and words with frequencies in each category */
    @Json(name = "semanticSet")
    val semanticSet: kotlin.collections.Map<kotlin.String, kotlin.collections.List<CMWordFrequency>>,

    /* do we know the email address of this person?  if they've supplied it in the past this will be set to true. */
    @Json(name = "knowEmail")
    val knowEmail: kotlin.Boolean,

    /* updated categories (if applicable) with updated counts */
    @Json(name = "categoryList")
    val categoryList: kotlin.collections.List<SearchCategory>,

    /* A list of syn-sets used in the query */
    @Json(name = "synSetList")
    val synSetList: kotlin.collections.List<CMSynSet>,

    /* Does this source require custom render templates or use ordinary search-results? */
    @Json(name = "customRender")
    val customRender: kotlin.Boolean,

    /* a map of sourceId -> number of documents found inside this source */
    @Json(name = "sourceIdToCounts")
    val sourceIdToCounts: kotlin.collections.Map<kotlin.String, kotlin.Int>,

    /* a map of document-type -> number of documents found of this type */
    @Json(name = "documentTypeToCounts")
    val documentTypeToCounts: kotlin.collections.Map<kotlin.String, kotlin.Int>,

    /* a list of previous searches if applicable */
    @Json(name = "savedSearchList")
    val savedSearchList: kotlin.collections.List<CMSavedSearch>,

    /* an optional summarization of the search results */
    @Json(name = "querySummarization")
    val querySummarization: kotlin.String

)

