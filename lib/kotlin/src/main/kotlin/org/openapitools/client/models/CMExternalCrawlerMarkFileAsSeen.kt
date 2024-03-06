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

import org.openapitools.client.models.Asset

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An mark-file-as-seen object.
 *
 * @param objectType the type of this class, just in case this object is encrypted
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id of this context item, a guid-string
 * @param sid the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
 * @param sourceId the source-id of this crawler (ie. the crawler's id)
 * @param asset 
 * @param encrypted Do we need to add transport encryption
 * @param seed The seed used if encrypted
 */


data class CMExternalCrawlerMarkFileAsSeen (

    /* the type of this class, just in case this object is encrypted */
    @Json(name = "objectType")
    val objectType: kotlin.String,

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id of this context item, a guid-string */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. */
    @Json(name = "sid")
    val sid: kotlin.String,

    /* the source-id of this crawler (ie. the crawler's id) */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    @Json(name = "asset")
    val asset: Asset,

    /* Do we need to add transport encryption */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean,

    /* The seed used if encrypted */
    @Json(name = "seed")
    val seed: kotlin.Int

)

