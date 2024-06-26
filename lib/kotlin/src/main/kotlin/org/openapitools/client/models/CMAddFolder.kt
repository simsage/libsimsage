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
 * the folder add object
 *
 * @param organisationId the main organisation (its guid id) for this source/crawler
 * @param kbId the knowledge-base id of this context item, a guid-string
 * @param sourceId the source-id of the owner of the url
 * @param folderId the id of the folder.
 * @param folderName the folder's new name.
 * @param pageSize page-size for a paginated set
 * @param prevUrl pagination, the previous last URL for the page-set (null is first page)
 */


data class CMAddFolder (

    /* the main organisation (its guid id) for this source/crawler */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id of this context item, a guid-string */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the source-id of the owner of the url */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* the id of the folder. */
    @Json(name = "folderId")
    val folderId: kotlin.String,

    /* the folder's new name. */
    @Json(name = "folderName")
    val folderName: kotlin.String,

    /* page-size for a paginated set */
    @Json(name = "pageSize")
    val pageSize: kotlin.Int,

    /* pagination, the previous last URL for the page-set (null is first page) */
    @Json(name = "prevUrl")
    val prevUrl: kotlin.String? = null

)

