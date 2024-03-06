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
 * 
 *
 * @param userId 
 * @param sourceId 
 * @param url 
 * @param urlId 
 * @param isFolder 
 * @param folder 
 */


data class DocumentBookmark (

    @Json(name = "userId")
    val userId: kotlin.String,

    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    @Json(name = "url")
    val url: kotlin.String,

    @Json(name = "urlId")
    val urlId: kotlin.Int,

    @Json(name = "isFolder")
    val isFolder: kotlin.Boolean,

    @Json(name = "folder")
    val folder: kotlin.Boolean? = null

)

