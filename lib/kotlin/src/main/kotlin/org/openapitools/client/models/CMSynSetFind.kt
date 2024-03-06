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
 * a SynSet find object.
 *
 * @param organisationId the organisation (its guid id).
 * @param kbId the knowledge-base (its guid id).
 * @param page pagination control, the page to get (starting at zero (0))
 * @param pageSize The number of results to return maximum
 * @param filter the synset(s) to look for
 */


data class CMSynSetFind (

    /* the organisation (its guid id). */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base (its guid id). */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* pagination control, the page to get (starting at zero (0)) */
    @Json(name = "page")
    val page: kotlin.Int,

    /* The number of results to return maximum */
    @Json(name = "pageSize")
    val pageSize: kotlin.Int,

    /* the synset(s) to look for */
    @Json(name = "filter")
    val filter: kotlin.String

)
