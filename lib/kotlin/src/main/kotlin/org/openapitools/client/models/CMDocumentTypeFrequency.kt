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
 * An entity for holding document type and a count for that type.
 *
 * @param documentType The file extension of a document, its type.
 * @param count The count of this type in SimSage.
 */


data class CMDocumentTypeFrequency (

    /* The file extension of a document, its type. */
    @Json(name = "documentType")
    val documentType: kotlin.String,

    /* The count of this type in SimSage. */
    @Json(name = "count")
    val count: kotlin.Long

)
