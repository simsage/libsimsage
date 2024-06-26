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
 * @param organisationId 
 * @param projectId 
 * @param sliceId 
 * @param documentKey 
 * @param commentLevel 
 */


data class CMCommentFilter (

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "projectId")
    val projectId: kotlin.String,

    @Json(name = "sliceId")
    val sliceId: kotlin.String,

    @Json(name = "documentKey")
    val documentKey: kotlin.String,

    @Json(name = "commentLevel")
    val commentLevel: kotlin.String

)

