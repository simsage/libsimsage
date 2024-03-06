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

import org.openapitools.client.models.Group
import org.openapitools.client.models.OperatorKnowledgeBase
import org.openapitools.client.models.UserRole

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param email 
 * @param firstName 
 * @param surname 
 * @param passwordHash 
 * @param confirmed 
 * @param roles 
 * @param operatorKBList 
 * @param groupList 
 * @param jwtMatchNameValueCSV 
 */


data class User (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "email")
    val email: kotlin.String,

    @Json(name = "firstName")
    val firstName: kotlin.String,

    @Json(name = "surname")
    val surname: kotlin.String,

    @Json(name = "passwordHash")
    val passwordHash: kotlin.String,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean,

    @Json(name = "roles")
    val roles: kotlin.collections.List<UserRole>,

    @Json(name = "operatorKBList")
    val operatorKBList: kotlin.collections.List<OperatorKnowledgeBase>,

    @Json(name = "groupList")
    val groupList: kotlin.collections.List<Group>,

    @Json(name = "jwtMatchNameValueCSV")
    val jwtMatchNameValueCSV: kotlin.String

)

