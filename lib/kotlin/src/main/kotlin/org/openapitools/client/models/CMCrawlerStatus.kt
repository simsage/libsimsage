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
 * @param kbId 
 * @param projectTitle 
 * @param projectType 
 * @param crawlerId 
 * @param crawlerName 
 * @param startTime 
 * @param endTime 
 * @param isRunning 
 * @param specificJson 
 */


data class CMCrawlerStatus (

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "kbId")
    val kbId: kotlin.String,

    @Json(name = "projectTitle")
    val projectTitle: kotlin.String,

    @Json(name = "projectType")
    val projectType: kotlin.String,

    @Json(name = "crawlerId")
    val crawlerId: kotlin.String,

    @Json(name = "crawlerName")
    val crawlerName: kotlin.String,

    @Json(name = "startTime")
    val startTime: kotlin.Long,

    @Json(name = "endTime")
    val endTime: kotlin.Long,

    @Json(name = "isRunning")
    val isRunning: kotlin.Boolean,

    @Json(name = "specificJson")
    val specificJson: kotlin.String

)
