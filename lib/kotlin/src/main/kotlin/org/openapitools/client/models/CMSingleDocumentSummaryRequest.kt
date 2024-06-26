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
 * a document summarization object.
 *
 * @param organisationId the organisation (its guid id)
 * @param kbId the knowledge-base id (its guid id)
 * @param url the url of the document to summarize
 * @param top the top-n sentences to return for the summary of the documents
 */


data class CMSingleDocumentSummaryRequest (

    /* the organisation (its guid id) */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (its guid id) */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the url of the document to summarize */
    @Json(name = "url")
    val url: kotlin.String,

    /* the top-n sentences to return for the summary of the documents */
    @Json(name = "top")
    val top: kotlin.Int

)

