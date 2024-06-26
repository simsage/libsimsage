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
 * This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.
 *
 * @param message the main message of the log entry
 * @param type the type of log entry (eg. Debug, Info, Warn, Error)
 * @param service the name of the service that generated this log
 * @param stackTrace the stack traces if applicable
 * @param created unit date-time of this log
 */


data class CMLoggerEntry (

    /* the main message of the log entry */
    @Json(name = "message")
    val message: kotlin.String,

    /* the type of log entry (eg. Debug, Info, Warn, Error) */
    @Json(name = "type")
    val type: kotlin.String,

    /* the name of the service that generated this log */
    @Json(name = "service")
    val service: kotlin.String,

    /* the stack traces if applicable */
    @Json(name = "stackTrace")
    val stackTrace: kotlin.String,

    /* unit date-time of this log */
    @Json(name = "created")
    val created: kotlin.Long

)

