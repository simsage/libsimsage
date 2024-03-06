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
 * An external image representation object.
 *
 * @param objectType the type of this class, just in case this object is encrypted
 * @param organisationId the organisation (its guid id) this image should go into.
 * @param kbId the knowledge-base (its guid id) this image should go into.
 * @param sid the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
 * @param sourceId the source-id of this crawler (ie. the crawler's id) this image came from.
 * @param url A unique URL for this image, this should be the same as the document's URL this image belongs to.
 * @param mimeType The mime-type of this image, must be either image/jpeg or image/png.
 * @param puid The Pronom Unique ID for this image.
 * @param `data` the base64 encoded content of this image.  Must be prefixed with ';base64,'.
 * @param encrypted Do we need to add transport encryption
 * @param seed The seed used if encrypted
 */


data class CMUploadImage (

    /* the type of this class, just in case this object is encrypted */
    @Json(name = "objectType")
    val objectType: kotlin.String,

    /* the organisation (its guid id) this image should go into. */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base (its guid id) this image should go into. */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. */
    @Json(name = "sid")
    val sid: kotlin.String,

    /* the source-id of this crawler (ie. the crawler's id) this image came from. */
    @Json(name = "sourceId")
    val sourceId: kotlin.Int,

    /* A unique URL for this image, this should be the same as the document's URL this image belongs to. */
    @Json(name = "url")
    val url: kotlin.String,

    /* The mime-type of this image, must be either image/jpeg or image/png. */
    @Json(name = "mimeType")
    val mimeType: kotlin.String,

    /* The Pronom Unique ID for this image. */
    @Json(name = "puid")
    val puid: kotlin.String,

    /* the base64 encoded content of this image.  Must be prefixed with ';base64,'. */
    @Json(name = "data")
    val `data`: kotlin.String,

    /* Do we need to add transport encryption */
    @Json(name = "encrypted")
    val encrypted: kotlin.Boolean,

    /* The seed used if encrypted */
    @Json(name = "seed")
    val seed: kotlin.Int

)
