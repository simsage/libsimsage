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
 * A bookmark to a document or folder.
 *
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id of this context item, a guid-string
 * @param userId the user's id, a guid
 * @param sourceId the source-id of the owner of the url
 * @param url The unique URL of a document.
 * @param urlId the internal SimSage id for this url
 * @param isFolder is this a bookmark to a folder or a file?
 * @param folder 
 */


data class CMDocumentBookmark (

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id of this context item, a guid-string */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the user's id, a guid */
    @Json(name = "userId")
    val userId: kotlin.String,

    /* the source-id of the owner of the url */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* The unique URL of a document. */
    @Json(name = "url")
    val url: kotlin.String,

    /* the internal SimSage id for this url */
    @Json(name = "urlId")
    val urlId: kotlin.Int,

    /* is this a bookmark to a folder or a file? */
    @Json(name = "isFolder")
    val isFolder: kotlin.Boolean,

    @Json(name = "folder")
    val folder: kotlin.Boolean? = null

)

