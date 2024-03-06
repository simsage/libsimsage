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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.CMInfo
import org.openapitools.client.models.CMKnowledgeBase
import org.openapitools.client.models.CMKnowledgeBaseExport
import org.openapitools.client.models.CMVersion
import org.openapitools.client.models.JsonMessage
import org.openapitools.client.models.KnowledgeBase

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class KnowledgebaseApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://test.simsage.ai")
        }
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionExportKnowledgeBase(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * export Knowledge-base
     * starts the export of a knowledge-base using the passed in exporter config
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBaseExport 
     * @param apIVersion  (optional)
     * @return JsonMessage
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun exportKnowledgeBase(sessionId: kotlin.String, cmKnowledgeBaseExport: CMKnowledgeBaseExport, apIVersion: ApIVersionExportKnowledgeBase? = null) : JsonMessage {
        val localVarResponse = exportKnowledgeBaseWithHttpInfo(sessionId = sessionId, cmKnowledgeBaseExport = cmKnowledgeBaseExport, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as JsonMessage
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * export Knowledge-base
     * starts the export of a knowledge-base using the passed in exporter config
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBaseExport 
     * @param apIVersion  (optional)
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun exportKnowledgeBaseWithHttpInfo(sessionId: kotlin.String, cmKnowledgeBaseExport: CMKnowledgeBaseExport, apIVersion: ApIVersionExportKnowledgeBase?) : ApiResponse<JsonMessage?> {
        val localVariableConfig = exportKnowledgeBaseRequestConfig(sessionId = sessionId, cmKnowledgeBaseExport = cmKnowledgeBaseExport, apIVersion = apIVersion)

        return request<CMKnowledgeBaseExport, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation exportKnowledgeBase
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBaseExport 
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun exportKnowledgeBaseRequestConfig(sessionId: kotlin.String, cmKnowledgeBaseExport: CMKnowledgeBaseExport, apIVersion: ApIVersionExportKnowledgeBase?) : RequestConfig<CMKnowledgeBaseExport> {
        val localVariableBody = cmKnowledgeBaseExport
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/knowledgebase/export",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionGetKnowledgeBase(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Get Knowledge-base
     * Return a knowledge base by id.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to get (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return CMKnowledgeBase
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getKnowledgeBase(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionGetKnowledgeBase? = null) : CMKnowledgeBase {
        val localVarResponse = getKnowledgeBaseWithHttpInfo(organisationId = organisationId, kbId = kbId, sessionId = sessionId, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMKnowledgeBase
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Knowledge-base
     * Return a knowledge base by id.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to get (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return ApiResponse<CMKnowledgeBase?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getKnowledgeBaseWithHttpInfo(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionGetKnowledgeBase?) : ApiResponse<CMKnowledgeBase?> {
        val localVariableConfig = getKnowledgeBaseRequestConfig(organisationId = organisationId, kbId = kbId, sessionId = sessionId, apIVersion = apIVersion)

        return request<Unit, CMKnowledgeBase>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getKnowledgeBase
     *
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to get (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun getKnowledgeBaseRequestConfig(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionGetKnowledgeBase?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/knowledgebase/{organisationId}/{kbId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"kbId"+"}", encodeURIComponent(kbId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Get Knowledge-bases
     * Return a list of knowledge bases for a given organisation.
     * @param organisationId the organisation (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @return kotlin.collections.List<CMKnowledgeBase>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getKnowledgeBases(organisationId: kotlin.String, sessionId: kotlin.String) : kotlin.collections.List<CMKnowledgeBase> {
        val localVarResponse = getKnowledgeBasesWithHttpInfo(organisationId = organisationId, sessionId = sessionId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<CMKnowledgeBase>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Knowledge-bases
     * Return a list of knowledge bases for a given organisation.
     * @param organisationId the organisation (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @return ApiResponse<kotlin.collections.List<CMKnowledgeBase>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getKnowledgeBasesWithHttpInfo(organisationId: kotlin.String, sessionId: kotlin.String) : ApiResponse<kotlin.collections.List<CMKnowledgeBase>?> {
        val localVariableConfig = getKnowledgeBasesRequestConfig(organisationId = organisationId, sessionId = sessionId)

        return request<Unit, kotlin.collections.List<CMKnowledgeBase>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getKnowledgeBases
     *
     * @param organisationId the organisation (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @return RequestConfig
     */
    fun getKnowledgeBasesRequestConfig(organisationId: kotlin.String, sessionId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/knowledgebase/{organisationId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionGetSearchInfo(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Search Info
     * return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.
     * @param organisationId the organisation (its guid id)
     * @param clientId the client&#39;s id (its guid id), pre-register this client as a known client.
     * @param apIVersion  (optional)
     * @return CMInfo
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSearchInfo(organisationId: kotlin.String, clientId: kotlin.String, apIVersion: ApIVersionGetSearchInfo? = null) : CMInfo {
        val localVarResponse = getSearchInfoWithHttpInfo(organisationId = organisationId, clientId = clientId, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMInfo
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Search Info
     * return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.
     * @param organisationId the organisation (its guid id)
     * @param clientId the client&#39;s id (its guid id), pre-register this client as a known client.
     * @param apIVersion  (optional)
     * @return ApiResponse<CMInfo?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getSearchInfoWithHttpInfo(organisationId: kotlin.String, clientId: kotlin.String, apIVersion: ApIVersionGetSearchInfo?) : ApiResponse<CMInfo?> {
        val localVariableConfig = getSearchInfoRequestConfig(organisationId = organisationId, clientId = clientId, apIVersion = apIVersion)

        return request<Unit, CMInfo>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getSearchInfo
     *
     * @param organisationId the organisation (its guid id)
     * @param clientId the client&#39;s id (its guid id), pre-register this client as a known client.
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun getSearchInfoRequestConfig(organisationId: kotlin.String, clientId: kotlin.String, apIVersion: ApIVersionGetSearchInfo?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/knowledgebase/search/info/{organisationId}/{clientId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"clientId"+"}", encodeURIComponent(clientId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionGetSearchInfo2(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Search Info [deprecated]
     * Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.
     * @param organisationId the organisation (its guid id)
     * @param apIVersion  (optional)
     * @return CMInfo
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSearchInfo2(organisationId: kotlin.String, apIVersion: ApIVersionGetSearchInfo2? = null) : CMInfo {
        val localVarResponse = getSearchInfo2WithHttpInfo(organisationId = organisationId, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMInfo
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Search Info [deprecated]
     * Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.
     * @param organisationId the organisation (its guid id)
     * @param apIVersion  (optional)
     * @return ApiResponse<CMInfo?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getSearchInfo2WithHttpInfo(organisationId: kotlin.String, apIVersion: ApIVersionGetSearchInfo2?) : ApiResponse<CMInfo?> {
        val localVariableConfig = getSearchInfo2RequestConfig(organisationId = organisationId, apIVersion = apIVersion)

        return request<Unit, CMInfo>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getSearchInfo2
     *
     * @param organisationId the organisation (its guid id)
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun getSearchInfo2RequestConfig(organisationId: kotlin.String, apIVersion: ApIVersionGetSearchInfo2?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/knowledgebase/search/info/{organisationId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionRemoveKnowledgeBase(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Delete Knowledge-base
     * Delete a knowledge-base by Id.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to delete/remove (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return JsonMessage
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun removeKnowledgeBase(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionRemoveKnowledgeBase? = null) : JsonMessage {
        val localVarResponse = removeKnowledgeBaseWithHttpInfo(organisationId = organisationId, kbId = kbId, sessionId = sessionId, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as JsonMessage
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Delete Knowledge-base
     * Delete a knowledge-base by Id.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to delete/remove (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun removeKnowledgeBaseWithHttpInfo(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionRemoveKnowledgeBase?) : ApiResponse<JsonMessage?> {
        val localVariableConfig = removeKnowledgeBaseRequestConfig(organisationId = organisationId, kbId = kbId, sessionId = sessionId, apIVersion = apIVersion)

        return request<Unit, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation removeKnowledgeBase
     *
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base to delete/remove (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun removeKnowledgeBaseRequestConfig(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionRemoveKnowledgeBase?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/knowledgebase/{organisationId}/{kbId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"kbId"+"}", encodeURIComponent(kbId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionUpdateKnowledgeBase(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Save Knowledge-base
     * Save (Create or Update) a SimSage knowledge base item.
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBase 
     * @param apIVersion  (optional)
     * @return KnowledgeBase
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateKnowledgeBase(sessionId: kotlin.String, cmKnowledgeBase: CMKnowledgeBase, apIVersion: ApIVersionUpdateKnowledgeBase? = null) : KnowledgeBase {
        val localVarResponse = updateKnowledgeBaseWithHttpInfo(sessionId = sessionId, cmKnowledgeBase = cmKnowledgeBase, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as KnowledgeBase
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Save Knowledge-base
     * Save (Create or Update) a SimSage knowledge base item.
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBase 
     * @param apIVersion  (optional)
     * @return ApiResponse<KnowledgeBase?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateKnowledgeBaseWithHttpInfo(sessionId: kotlin.String, cmKnowledgeBase: CMKnowledgeBase, apIVersion: ApIVersionUpdateKnowledgeBase?) : ApiResponse<KnowledgeBase?> {
        val localVariableConfig = updateKnowledgeBaseRequestConfig(sessionId = sessionId, cmKnowledgeBase = cmKnowledgeBase, apIVersion = apIVersion)

        return request<CMKnowledgeBase, KnowledgeBase>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateKnowledgeBase
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmKnowledgeBase 
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun updateKnowledgeBaseRequestConfig(sessionId: kotlin.String, cmKnowledgeBase: CMKnowledgeBase, apIVersion: ApIVersionUpdateKnowledgeBase?) : RequestConfig<CMKnowledgeBase> {
        val localVariableBody = cmKnowledgeBase
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/knowledgebase/save",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Version
     * Return the version of SimSage knowledge-base Services.
     * @return CMVersion
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun version3() : CMVersion {
        val localVarResponse = version3WithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMVersion
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Version
     * Return the version of SimSage knowledge-base Services.
     * @return ApiResponse<CMVersion?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun version3WithHttpInfo() : ApiResponse<CMVersion?> {
        val localVariableConfig = version3RequestConfig()

        return request<Unit, CMVersion>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation version3
     *
     * @return RequestConfig
     */
    fun version3RequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/knowledgebase/version",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}