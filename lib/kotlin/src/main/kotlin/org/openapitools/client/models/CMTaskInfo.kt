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
 * @param taskId 
 * @param projectId 
 * @param organisationId 
 * @param sourceKbId 
 * @param projectType 
 * @param projectTitle 
 * @param projectNarrative 
 * @param processId 
 * @param processName 
 * @param taskType 
 * @param taskName 
 * @param dateCreated 
 * @param potentialUsers 
 * @param excludedUsers 
 * @param potentialGroups 
 * @param crawlerKbId 
 * @param sliceId 
 * @param dateCompleted 
 * @param assignedUser 
 */


data class CMTaskInfo (

    @Json(name = "taskId")
    val taskId: kotlin.String,

    @Json(name = "projectId")
    val projectId: kotlin.String,

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "sourceKbId")
    val sourceKbId: kotlin.String,

    @Json(name = "projectType")
    val projectType: kotlin.String,

    @Json(name = "projectTitle")
    val projectTitle: kotlin.String,

    @Json(name = "projectNarrative")
    val projectNarrative: kotlin.String,

    @Json(name = "processId")
    val processId: kotlin.String,

    @Json(name = "processName")
    val processName: kotlin.String,

    @Json(name = "taskType")
    val taskType: kotlin.String,

    @Json(name = "taskName")
    val taskName: kotlin.String,

    @Json(name = "dateCreated")
    val dateCreated: java.time.OffsetDateTime,

    @Json(name = "potentialUsers")
    val potentialUsers: kotlin.String,

    @Json(name = "excludedUsers")
    val excludedUsers: kotlin.String,

    @Json(name = "potentialGroups")
    val potentialGroups: kotlin.String,

    @Json(name = "crawlerKbId")
    val crawlerKbId: kotlin.String? = null,

    @Json(name = "sliceId")
    val sliceId: kotlin.String? = null,

    @Json(name = "dateCompleted")
    val dateCompleted: java.time.OffsetDateTime? = null,

    @Json(name = "assignedUser")
    val assignedUser: kotlin.String? = null

)

