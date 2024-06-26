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
 * @param taskId 
 * @param newPhase 
 * @param result 
 */


data class CMChangeTaskPhase (

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "taskId")
    val taskId: kotlin.String,

    @Json(name = "newPhase")
    val newPhase: kotlin.String,

    @Json(name = "result")
    val result: kotlin.collections.Map<kotlin.String, kotlin.Any>

)

