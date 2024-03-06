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

import org.openapitools.client.models.CMGroup

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An object used for updating a SimSage user.  This object can be used to update the user's password too.
 *
 * @param id the user's id (its guid id).
 * @param email the email of this user
 * @param password a password for this user (or blank if not to be changed)
 * @param firstName the first-name of this user
 * @param surname the last-name (surname) of this user
 * @param roles the roles to be associated with this user
 * @param operatorKBList the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set.
 * @param groupList a list of groups this user is part of (can be empty)
 * @param jwtMatchNameValueCSV an optional set of csv separated name1=value1,name2=value2 for JWT matching
 */


data class CMUserWithExtras (

    /* the user's id (its guid id). */
    @Json(name = "id")
    val id: kotlin.String,

    /* the email of this user */
    @Json(name = "email")
    val email: kotlin.String,

    /* a password for this user (or blank if not to be changed) */
    @Json(name = "password")
    val password: kotlin.String,

    /* the first-name of this user */
    @Json(name = "firstName")
    val firstName: kotlin.String,

    /* the last-name (surname) of this user */
    @Json(name = "surname")
    val surname: kotlin.String,

    /* the roles to be associated with this user */
    @Json(name = "roles")
    val roles: kotlin.String,

    /* the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set. */
    @Json(name = "operatorKBList")
    val operatorKBList: kotlin.String,

    /* a list of groups this user is part of (can be empty) */
    @Json(name = "groupList")
    val groupList: kotlin.collections.List<CMGroup>,

    /* an optional set of csv separated name1=value1,name2=value2 for JWT matching */
    @Json(name = "jwtMatchNameValueCSV")
    val jwtMatchNameValueCSV: kotlin.String

)

