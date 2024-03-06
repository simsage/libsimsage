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

import org.openapitools.client.models.CMSliceQueryDefinition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param components 
 */


data class CMCompoundQuery (

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "components")
    val components: kotlin.collections.List<CMSliceQueryDefinition>

) : CMSliceQueryDefinition
