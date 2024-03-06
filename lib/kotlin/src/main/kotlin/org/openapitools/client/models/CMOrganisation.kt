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
 * A SimSage organisation object.  Represents a SimSage top-level tenant, aka. an organisation.
 *
 * @param id the organisation (its guid id).
 * @param name the name of the organisation
 * @param enabled true if the organisation is enabled (active/operational)
 * @param autoCreateSSOUsers if enabled, SSO users will auto-create their accounts
 * @param autoCreateSSODomainList a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk)
 * @param autoCreateSSOACLList a list of the ACLs initially assigned to each new user of they need creating
 * @param autoCreateSSORoleList a list of the SimSage Roles initially assigned to each new user of they need creating
 */


data class CMOrganisation (

    /* the organisation (its guid id). */
    @Json(name = "id")
    val id: kotlin.String,

    /* the name of the organisation */
    @Json(name = "name")
    val name: kotlin.String,

    /* true if the organisation is enabled (active/operational) */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    /* if enabled, SSO users will auto-create their accounts */
    @Json(name = "autoCreateSSOUsers")
    val autoCreateSSOUsers: kotlin.Boolean,

    /* a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk) */
    @Json(name = "autoCreateSSODomainList")
    val autoCreateSSODomainList: kotlin.collections.List<kotlin.String>,

    /* a list of the ACLs initially assigned to each new user of they need creating */
    @Json(name = "autoCreateSSOACLList")
    val autoCreateSSOACLList: kotlin.collections.List<kotlin.String>,

    /* a list of the SimSage Roles initially assigned to each new user of they need creating */
    @Json(name = "autoCreateSSORoleList")
    val autoCreateSSORoleList: kotlin.collections.List<kotlin.String>

)

