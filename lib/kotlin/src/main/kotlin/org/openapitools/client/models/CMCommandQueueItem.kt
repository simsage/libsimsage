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
 * a progress/status item from the async command queue
 *
 * @param jobId the job-id, primary key
 * @param key the name of the lock
 * @param expiry when this lock will expire as a Unix date-time
 */


data class CMCommandQueueItem (

    /* the job-id, primary key */
    @Json(name = "jobId")
    val jobId: kotlin.String,

    /* the name of the lock */
    @Json(name = "key")
    val key: kotlin.String,

    /* when this lock will expire as a Unix date-time */
    @Json(name = "expiry")
    val expiry: kotlin.Long

)

