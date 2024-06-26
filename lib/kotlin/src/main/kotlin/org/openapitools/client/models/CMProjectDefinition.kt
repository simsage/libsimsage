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

import org.openapitools.client.models.CMFilter
import org.openapitools.client.models.CMKeyedSearchTerm
import org.openapitools.client.models.CMProjectFrame
import org.openapitools.client.models.CMSemanticTerm

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param organisationId 
 * @param projectFrame 
 * @param filters 
 * @param projectId 
 * @param taskId 
 * @param keyedSearchTerms 
 * @param semanticTerms 
 * @param validationResult 
 */


data class CMProjectDefinition (

    @Json(name = "organisationId")
    val organisationId: kotlin.String,

    @Json(name = "projectFrame")
    val projectFrame: CMProjectFrame,

    @Json(name = "filters")
    val filters: CMFilter,

    @Json(name = "projectId")
    val projectId: kotlin.String? = null,

    @Json(name = "taskId")
    val taskId: kotlin.String? = null,

    @Json(name = "keyedSearchTerms")
    val keyedSearchTerms: kotlin.collections.List<CMKeyedSearchTerm>? = null,

    @Json(name = "semanticTerms")
    val semanticTerms: kotlin.collections.List<CMSemanticTerm>? = null,

    @Json(name = "validationResult")
    val validationResult: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null

)

