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
 * Description of an external document upload failure.
 *
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id (its guid id) for this source/crawler
 * @param sourceId the source-id, primary key of the source
 * @param sourceSystemId the unique id of the document in the source system, mostly same as web url
 * @param webUrl the web url to access the document, can be different from url
 * @param runId the timestamp of the crawler run adding the exception
 * @param errorMessage the error message added by the system
 * @param encrypted Do we need to add transport encryption
 * @param seed The seed used if encrypted
 * @param sid the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
 */


data class CMFailedSourceDocument (

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (its guid id) for this source/crawler */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the source-id, primary key of the source */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* the unique id of the document in the source system, mostly same as web url */
    @Json(name = "sourceSystemId")
    val sourceSystemId: kotlin.String,

    /* the web url to access the document, can be different from url */
    @Json(name = "webUrl")
    val webUrl: kotlin.String,

    /* the timestamp of the crawler run adding the exception */
    @Json(name = "runId")
    val runId: kotlin.Long,

    /* the error message added by the system */
    @Json(name = "errorMessage")
    val errorMessage: kotlin.String,

    /* Do we need to add transport encryption */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean,

    /* The seed used if encrypted */
    @Json(name = "seed")
    val seed: kotlin.Int,

    /* the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. */
    @Json(name = "sid")
    val sid: kotlin.String

)

