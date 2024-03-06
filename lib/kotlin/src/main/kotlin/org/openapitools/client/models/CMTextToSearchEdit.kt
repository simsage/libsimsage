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
 * a semantic update/create object
 *
 * @param searchType the type, either \"and\" or \"sub\"
 * @param searchPart the search-part
 * @param matchWordCsv A list of query matches
 */


data class CMTextToSearchEdit (

    /* the type, either \"and\" or \"sub\" */
    @Json(name = "searchType")
    val searchType: kotlin.String,

    /* the search-part */
    @Json(name = "searchPart")
    val searchPart: kotlin.String,

    /* A list of query matches */
    @Json(name = "matchWordCsv")
    val matchWordCsv: kotlin.String

)

