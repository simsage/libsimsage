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
 * @param kbId the knowledge-base id (guid) to use
 * @param clientId the client's id (a unique guid for keeping state against clients)
 * @param url The unique URL of a document.
 * @param sentenceId The sentence id to start from in the document.
 * @param span The surrounding span / offset size for around the sentence
 */


data class CMShortSummary (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (guid) to use */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the client's id (a unique guid for keeping state against clients) */
    @Json(name = "clientId")
    val clientId: kotlin.String,

    /* The unique URL of a document. */
    @Json(name = "url")
    val url: kotlin.String,

    /* The sentence id to start from in the document. */
    @Json(name = "sentenceId")
    val sentenceId: kotlin.Int,

    /* The surrounding span / offset size for around the sentence */
    @Json(name = "span")
    val span: kotlin.Int

)
