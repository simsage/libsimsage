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
 * the password request object
 *
 * @param email email address of the user wishing to reset their password.
 * @param resetUrl the callback url for the password.
 */


data class CMPasswordResetRequest (

    /* email address of the user wishing to reset their password. */
    @Json(name = "email")
    val email: kotlin.String,

    /* the callback url for the password. */
    @Json(name = "resetUrl")
    val resetUrl: kotlin.String

)
