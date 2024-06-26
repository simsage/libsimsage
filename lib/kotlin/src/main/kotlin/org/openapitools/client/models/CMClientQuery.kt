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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * a client query object
 *
 * @param organisationId the organisation (its guid id).
 * @param kbList a list of knowledge-base id's (guids) to use
 * @param clientId the client's id (a unique guid for keeping state against clients)
 * @param semanticSearch should we perform a semantic-search?
 * @param qnaQuery should we perform a Q&A search?
 * @param query the user's search query
 * @param filter a filter expression generated by the UX
 * @param numResults the number of results to return for the Q&A system (recommend 1, which returns the 'best match' only)
 * @param scoreThreshold A threshold for answer rejection, recommend a value of around 81.25% (0.8125).  This value is between 0.0 and 1.0.  If this value is too low, you'll get bad answers, and if this value is too high you will only get exact matches.
 * @param page search engine pagination, the offset page starting at 0
 * @param pageSize search engine pagination, the number of results per page
 * @param fragmentCount search engine pagination, the number of sentences matching per document (aka. document-sentence fragments)
 * @param maxWordDistance how far apart words are allowed to be before they stop matching.  A value of zero (0) allows any distance within the document and is akin to a document level keyword search.
 * @param sourceId The id of source (an integer) to filter results for.  You can only filter on one source per knowledge-base.  Leaving this value zero (0) indicates all sources should be searched.
 * @param shardSizeList Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query.
 * @param spellingSuggest should the search-engine return spelling-suggestions for items not understood?
 * @param groupSimilarDocuments should the search-engine group similar documents together
 * @param sortByAge should the search-engine sort results by age
 * @param useQuestionAnsweringAi use ChatGPT or equivalent to answer queries
 * @param wordSynSet selected syn-sets for words
 */


data class CMClientQuery (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* a list of knowledge-base id's (guids) to use */
    @Json(name = "kbList")
    val kbList: kotlin.collections.List<kotlin.String>,

    /* the client's id (a unique guid for keeping state against clients) */
    @Json(name = "clientId")
    val clientId: kotlin.String,

    /* should we perform a semantic-search? */
    @Json(name = "semanticSearch")
    val semanticSearch: kotlin.Boolean,

    /* should we perform a Q&A search? */
    @Json(name = "qnaQuery")
    val qnaQuery: kotlin.Boolean,

    /* the user's search query */
    @Json(name = "query")
    val query: kotlin.String,

    /* a filter expression generated by the UX */
    @Json(name = "filter")
    val filter: kotlin.String,

    /* the number of results to return for the Q&A system (recommend 1, which returns the 'best match' only) */
    @Json(name = "numResults")
    val numResults: kotlin.Int,

    /* A threshold for answer rejection, recommend a value of around 81.25% (0.8125).  This value is between 0.0 and 1.0.  If this value is too low, you'll get bad answers, and if this value is too high you will only get exact matches. */
    @Json(name = "scoreThreshold")
    val scoreThreshold: kotlin.Float,

    /* search engine pagination, the offset page starting at 0 */
    @Json(name = "page")
    val page: kotlin.Int,

    /* search engine pagination, the number of results per page */
    @Json(name = "pageSize")
    val pageSize: kotlin.Int,

    /* search engine pagination, the number of sentences matching per document (aka. document-sentence fragments) */
    @Json(name = "fragmentCount")
    val fragmentCount: kotlin.Int,

    /* how far apart words are allowed to be before they stop matching.  A value of zero (0) allows any distance within the document and is akin to a document level keyword search. */
    @Json(name = "maxWordDistance")
    val maxWordDistance: kotlin.Int,

    /* The id of source (an integer) to filter results for.  You can only filter on one source per knowledge-base.  Leaving this value zero (0) indicates all sources should be searched. */
    @Json(name = "sourceId")
    val sourceId: kotlin.String,

    /* Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query. */
    @Json(name = "shardSizeList")
    val shardSizeList: kotlin.collections.List<kotlin.Int>,

    /* should the search-engine return spelling-suggestions for items not understood? */
    @Json(name = "spellingSuggest")
    val spellingSuggest: kotlin.Boolean,

    /* should the search-engine group similar documents together */
    @Json(name = "groupSimilarDocuments")
    val groupSimilarDocuments: kotlin.Boolean,

    /* should the search-engine sort results by age */
    @Json(name = "sortByAge")
    val sortByAge: kotlin.Boolean,

    /* use ChatGPT or equivalent to answer queries */
    @Json(name = "useQuestionAnsweringAi")
    val useQuestionAnsweringAi: kotlin.Boolean,

    /* selected syn-sets for words */
    @Json(name = "wordSynSet")
    val wordSynSet: kotlin.collections.Map<kotlin.String, kotlin.Int>

)

