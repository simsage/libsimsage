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

import org.openapitools.client.models.MDCategory

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An external document representation object.
 *
 * @param objectType the type of this class, just in case this object is encrypted
 * @param organisationId the organisation (its guid id) this document should go into.
 * @param kbId the knowledge-base (its guid id) this document should go into.
 * @param sid the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
 * @param sourceId the source-id of this crawler (ie. the crawler's id) this document came from.
 * @param url A unique URL for this document.
 * @param mimeType The mime-type of this document, must be a known-datatype to SimSage.
 * @param puid The Pronom Unique ID for this document.
 * @param acls A list of security permission for this document.  Can be empty (ie. no security applied).
 * @param title The title of this document, can be empty.
 * @param author The author of this document, can be empty.
 * @param changeHash A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last.
 * @param contentHash A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection.
 * @param `data` the base64 encoded content of this document.  Must be prefixed with ';base64,', can be empty indicating the content wasn't valid.
 * @param binarySize the binary-size of the document in bytes if data is not set.
 * @param text the text content of the asset (if set).
 * @param created a unix-timestamp of the creation date-time of this document
 * @param lastModified a unix-timestamp of the last-modified date-time of this document
 * @param metadata a series of name values for other metadata values found in the container of this document
 * @param categories A list of special SimSage metadata categories for matching this document with.  Can be empty.
 * @param propertySize The size of this document (the original) in bytes
 * @param template A render template for this document.  This is only appropriate for Database and RESTful type sources.
 * @param encrypted Do we need to add transport encryption
 * @param seed The seed used if encrypted
 * @param runId the id (a guid) of the current 'go through the source once'.  This is a unique per-run identifier.
 */


data class CMUploadDocument (

    /* the type of this class, just in case this object is encrypted */
    @Json(name = "objectType")
    val objectType: kotlin.String,

    /* the organisation (its guid id) this document should go into. */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base (its guid id) this document should go into. */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. */
    @Json(name = "sid")
    val sid: kotlin.String,

    /* the source-id of this crawler (ie. the crawler's id) this document came from. */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* A unique URL for this document. */
    @Json(name = "url")
    val url: kotlin.String,

    /* The mime-type of this document, must be a known-datatype to SimSage. */
    @Json(name = "mimeType")
    val mimeType: kotlin.String,

    /* The Pronom Unique ID for this document. */
    @Json(name = "puid")
    val puid: kotlin.String,

    /* A list of security permission for this document.  Can be empty (ie. no security applied). */
    @Json(name = "acls")
    val acls: kotlin.String,

    /* The title of this document, can be empty. */
    @Json(name = "title")
    val title: kotlin.String,

    /* The author of this document, can be empty. */
    @Json(name = "author")
    val author: kotlin.String,

    /* A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last. */
    @Json(name = "changeHash")
    val changeHash: kotlin.String,

    /* A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection. */
    @Json(name = "contentHash")
    val contentHash: kotlin.String,

    /* the base64 encoded content of this document.  Must be prefixed with ';base64,', can be empty indicating the content wasn't valid. */
    @Json(name = "data")
    val `data`: kotlin.String,

    /* the binary-size of the document in bytes if data is not set. */
    @Json(name = "binarySize")
    val binarySize: kotlin.Int,

    /* the text content of the asset (if set). */
    @Json(name = "text")
    val text: kotlin.String,

    /* a unix-timestamp of the creation date-time of this document */
    @Json(name = "created")
    val created: kotlin.Long,

    /* a unix-timestamp of the last-modified date-time of this document */
    @Json(name = "lastModified")
    val lastModified: kotlin.Long,

    /* a series of name values for other metadata values found in the container of this document */
    @Json(name = "metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* A list of special SimSage metadata categories for matching this document with.  Can be empty. */
    @Json(name = "categories")
    val categories: kotlin.collections.List<MDCategory>,

    /* The size of this document (the original) in bytes */
    @Json(name = "size")
    val propertySize: kotlin.Long,

    /* A render template for this document.  This is only appropriate for Database and RESTful type sources. */
    @Json(name = "template")
    val template: kotlin.String,

    /* Do we need to add transport encryption */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean,

    /* The seed used if encrypted */
    @Json(name = "seed")
    val seed: kotlin.Int,

    /* the id (a guid) of the current 'go through the source once'.  This is a unique per-run identifier. */
    @Json(name = "runId")
    val runId: kotlin.String

)

