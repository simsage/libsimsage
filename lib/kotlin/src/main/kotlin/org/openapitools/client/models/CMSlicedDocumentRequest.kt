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

import org.openapitools.client.models.CMSlicedDocumentFilter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param organisationId 
 * @param taskId 
 * @param sliceId 
 * @param filter 
 */


data class CMSlicedDocumentRequest (

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "taskId")
    val taskId: kotlin.String,

    @Json(name = "sliceId")
    val sliceId: kotlin.String,

    @Json(name = "filter")
    val filter: CMSlicedDocumentFilter

)

