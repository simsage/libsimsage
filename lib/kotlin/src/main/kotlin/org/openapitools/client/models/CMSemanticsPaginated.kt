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
 * A semantic pagination object.
 *
 * @param organisationId the organisation (its guid id).
 * @param kbId the knowledge-base (its guid id).
 * @param prevWord pagination control, the last semantic word we looked for previously
 * @param pageSize the number of semantics to return at a time.
 * @param filter An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.
 */


data class CMSemanticsPaginated (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base (its guid id). */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* pagination control, the last semantic word we looked for previously */
    @Json(name = "prevWord")
    val prevWord: kotlin.String,

    /* the number of semantics to return at a time. */
    @Json(name = "pageSize")
    val pageSize: kotlin.Int,

    /* An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated. */
    @Json(name = "filter")
    val filter: kotlin.String

)

