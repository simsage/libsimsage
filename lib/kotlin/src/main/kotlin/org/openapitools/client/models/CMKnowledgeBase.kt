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
 * A knowledge-base is SimSage's representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)
 *
 * @param organisationId the main organisation (its guid id)
 * @param kbId the knowledge-base id (its guid id)
 * @param name the name of this knowledge-base (must be unique within an organisation)
 * @param email the support email of the person to email with any UI generated questions
 * @param securityId the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems.
 * @param created when this knowledge-base was created, a unix date-time long
 * @param maxQueriesPerDay limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits.
 * @param analyticsWindowInMonths How long to keep analytics for in months.  A value of zero (0) indicates forever
 * @param enabled a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried.
 * @param operatorEnabled a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base's operator from interacting with end-users.
 * @param capacityWarnings All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation.
 * @param indexSchedule the time-schedule for index-optimization, when active.
 * @param lastIndexOptimizationTime the last time this triggered and ran as a unix date-time (read only)
 */


data class CMKnowledgeBase (

    /* the main organisation (its guid id) */
    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    /* the knowledge-base id (its guid id) */
    @Json(name = "kbId")
    val kbId: kotlin.String,

    /* the name of this knowledge-base (must be unique within an organisation) */
    @Json(name = "name")
    val name: kotlin.String,

    /* the support email of the person to email with any UI generated questions */
    @Json(name = "email")
    val email: kotlin.String,

    /* the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems. */
    @Json(name = "securityId")
    val securityId: kotlin.String,

    /* when this knowledge-base was created, a unix date-time long */
    @Json(name = "created")
    val created: kotlin.Long,

    /* limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits. */
    @Json(name = "maxQueriesPerDay")
    val maxQueriesPerDay: kotlin.Long,

    /* How long to keep analytics for in months.  A value of zero (0) indicates forever */
    @Json(name = "analyticsWindowInMonths")
    val analyticsWindowInMonths: kotlin.Int,

    /* a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean,

    /* a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base's operator from interacting with end-users. */
    @Json(name = "operatorEnabled")
    val operatorEnabled: kotlin.Boolean,

    /* All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation. */
    @Json(name = "capacityWarnings")
    val capacityWarnings: kotlin.Boolean,

    /* the time-schedule for index-optimization, when active. */
    @Json(name = "indexSchedule")
    val indexSchedule: kotlin.String,

    /* the last time this triggered and ran as a unix date-time (read only) */
    @Json(name = "lastIndexOptimizationTime")
    val lastIndexOptimizationTime: kotlin.Long

)

