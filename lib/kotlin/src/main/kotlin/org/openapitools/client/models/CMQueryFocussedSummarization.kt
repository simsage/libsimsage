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

import org.openapitools.client.models.CMDParagraphSummary

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A document summarization result (Multi Document Summarization)
 *
 * @param summary the list of summary items
 * @param message a possible return message if not empty
 */


data class CMQueryFocussedSummarization (

    /* the list of summary items */
    @Json(name = "summary")
    val summary: kotlin.collections.List<CMDParagraphSummary>,

    /* a possible return message if not empty */
    @Json(name = "message")
    val message: kotlin.String

)

