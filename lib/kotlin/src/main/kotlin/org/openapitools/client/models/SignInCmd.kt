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

import org.openapitools.client.models.Organisation
import org.openapitools.client.models.Session
import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param jobId 
 * @param returnAddress 
 * @param errorStr 
 * @param timeOut 
 * @param async 
 * @param isReturnResult 
 * @param email 
 * @param password 
 * @param roles 
 * @param remoteAddress 
 * @param session 
 * @param user 
 * @param organisationId 
 * @param organisationList 
 * @param returnResult 
 */


data class SignInCmd (

    @Json(name = "jobId")
    val jobId: kotlin.String,

    @Json(name = "returnAddress")
    val returnAddress: kotlin.String,

    @Json(name = "errorStr")
    val errorStr: kotlin.String,

    @Json(name = "timeOut")
    val timeOut: kotlin.Long,

    @Json(name = "async")
    val async: kotlin.Boolean,

    @Json(name = "isReturnResult")
    val isReturnResult: kotlin.Boolean,

    @Json(name = "email")
    val email: kotlin.String,

    @Json(name = "password")
    val password: kotlin.String,

    @Json(name = "roles")
    val roles: kotlin.collections.List<kotlin.String>,

    @Json(name = "remoteAddress")
    val remoteAddress: kotlin.String,

    @Json(name = "session")
    val session: Session,

    @Json(name = "user")
    val user: User,

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "organisationList")
    val organisationList: kotlin.collections.List<Organisation>,

    @Json(name = "returnResult")
    val returnResult: kotlin.Boolean? = null

)

