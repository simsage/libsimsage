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

import org.openapitools.client.models.CMProjectDocument

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param total 
 * @param results 
 */


data class CMPagedProjectDocuments (

    @Json(name = "total")
    val total: kotlin.Long,

    @Json(name = "results")
    val results: kotlin.collections.List<CMProjectDocument>

)

