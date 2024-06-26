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
 * a list of text-to-search items
 *
 * @param type 
 * @param searchPart 
 * @param matchWords 
 */


data class TextToSearch (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "searchPart")
    val searchPart: kotlin.String,

    @Json(name = "matchWords")
    val matchWords: kotlin.collections.List<kotlin.collections.List<kotlin.String>>

)

