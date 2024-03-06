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
 * An audit record for a document.
 *
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id of this context item, a guid-string
 * @param url The unique URL of a document.
 * @param userId The user's id
 * @param email the email address of the user for this audit record
 * @param description The description of the audit event
 * @param created a unix-timestamp of the creation date-time of this record
 */


data class CMDocumentAudit (

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id of this context item, a guid-string */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* The unique URL of a document. */
    @Json(name = "url")
    val url: kotlin.String,

    /* The user's id */
    @Json(name = "userId")
    val userId: kotlin.String,

    /* the email address of the user for this audit record */
    @Json(name = "email")
    val email: kotlin.String,

    /* The description of the audit event */
    @Json(name = "description")
    val description: kotlin.String,

    /* a unix-timestamp of the creation date-time of this record */
    @Json(name = "created")
    val created: kotlin.Long

)
