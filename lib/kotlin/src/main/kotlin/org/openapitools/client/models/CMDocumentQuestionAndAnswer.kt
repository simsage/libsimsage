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
 * A basic document question/answer pair for AI
 *
 * @param organisationId the organisation (its guid id).
 * @param kbId the knowledge-base id (guid) to use
 * @param url The unique URL of a document.
 * @param urlId The unique URL-ID of a document.
 * @param conversationList the context of the conversation thusfar
 * @param answer The answer for the given question
 */


data class CMDocumentQuestionAndAnswer (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (guid) to use */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* The unique URL of a document. */
    @Json(name = "url")
    val url: kotlin.String,

    /* The unique URL-ID of a document. */
    @Json(name = "urlId")
    val urlId: kotlin.Int,

    /* the context of the conversation thusfar */
    @Json(name = "conversationList")
    val conversationList: kotlin.String,

    /* The answer for the given question */
    @Json(name = "answer")
    val answer: kotlin.String

)

