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

import org.openapitools.client.models.CMProjectDefinition
import org.openapitools.client.models.CMTaskInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectDefinition 
 * @param taskInfo 
 */


data class CMProjectReview (

    @Json(name = "projectDefinition")
    val projectDefinition: CMProjectDefinition,

    @Json(name = "taskInfo")
    val taskInfo: CMTaskInfo

)

