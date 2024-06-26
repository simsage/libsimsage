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
 * an optimize indexes object.
 *
 * @param organisationId the organisation (its guid id).
 * @param kbId the knowledge-base (its guid id).
 * @param optimizeAllIndexes Whether to optimize just the deltas (false) or the full set (true).
 */


data class CMOptimizeIndex (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base (its guid id). */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* Whether to optimize just the deltas (false) or the full set (true). */
    @Json(name = "optimizeAllIndexes")
    val optimizeAllIndexes: kotlin.Boolean

)

