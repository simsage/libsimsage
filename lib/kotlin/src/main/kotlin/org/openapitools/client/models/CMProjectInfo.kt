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

import org.openapitools.client.models.CMSearchDefinition
import org.openapitools.client.models.CMStepConfig

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param key 
 * @param caption 
 * @param description 
 * @param search 
 * @param steps 
 * @param sliceActions 
 * @param screenConfigs 
 */


data class CMProjectInfo (

    @Json(name = "key")
    val key: kotlin.String,

    @Json(name = "caption")
    val caption: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String,

    @Json(name = "search")
    val search: CMSearchDefinition,

    @Json(name = "steps")
    val steps: kotlin.collections.List<CMStepConfig>,

    @Json(name = "sliceActions")
    val sliceActions: kotlin.collections.Map<kotlin.String, kotlin.String>,

    @Json(name = "screenConfigs")
    val screenConfigs: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any>>

)
