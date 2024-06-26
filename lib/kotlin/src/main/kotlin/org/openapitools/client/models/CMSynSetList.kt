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
 * A list of SynSets for returning from SimSage for viewing.
 *
 * @param list A list of CMSynSet items
 * @param totalSize the number of total SynSet items in your query
 */


data class CMSynSetList (

    /* A list of CMSynSet items */
    @Json(name = "list")
    val list: kotlin.String,

    /* the number of total SynSet items in your query */
    @Json(name = "totalSize")
    val totalSize: kotlin.Int

)

