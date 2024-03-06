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

import org.openapitools.client.models.CMClientQuery
import org.openapitools.client.models.CMClientQueryResult
import org.openapitools.client.models.CMDocumentQuestionAndAnswer
import org.openapitools.client.models.CMShortSummary
import org.openapitools.client.models.CMShortSummaryResult
import org.openapitools.client.models.CMTextToSearchConversion
import org.openapitools.client.models.CMTextToSearchConversionReturn
import org.openapitools.client.models.CMTextToSearchEdit
import org.openapitools.client.models.CMTextToSearchPaginated
import org.openapitools.client.models.CMTextToSearchPaginatedReturn
import org.openapitools.client.models.CMVersion
import org.openapitools.client.models.JsonMessage

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

class SemanticApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.simsage.ai")
        }
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionDeleteTextToSearch(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Delete text-to-search
     * Remove an existing text-to-search item.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param word the word of the text-to-search word
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
    fun deleteTextToSearch(organisationId: kotlin.String, kbId: kotlin.String, word: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionDeleteTextToSearch? = null) : JsonMessage {
        val localVarResponse = deleteTextToSearchWithHttpInfo(organisationId = organisationId, kbId = kbId, word = word, sessionId = sessionId, apIVersion = apIVersion)

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
     * Delete text-to-search
     * Remove an existing text-to-search item.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param word the word of the text-to-search word
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteTextToSearchWithHttpInfo(organisationId: kotlin.String, kbId: kotlin.String, word: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionDeleteTextToSearch?) : ApiResponse<JsonMessage?> {
        val localVariableConfig = deleteTextToSearchRequestConfig(organisationId = organisationId, kbId = kbId, word = word, sessionId = sessionId, apIVersion = apIVersion)

        return request<Unit, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteTextToSearch
     *
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param word the word of the text-to-search word
     * @param sessionId a valid SimSage Session id.
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun deleteTextToSearchRequestConfig(organisationId: kotlin.String, kbId: kotlin.String, word: kotlin.String, sessionId: kotlin.String, apIVersion: ApIVersionDeleteTextToSearch?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/semantic/text-to-search/{organisationId}/{kbId}/{word}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"kbId"+"}", encodeURIComponent(kbId.toString())).replace("{"+"word"+"}", encodeURIComponent(word.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Document Q&amp;A
     * Answer a question about a given document
     * @param sessionId a valid SimSage Session id.
     * @param cmDocumentQuestionAndAnswer 
     * @return CMDocumentQuestionAndAnswer
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun documentQuestionAndAnswer(sessionId: kotlin.String, cmDocumentQuestionAndAnswer: CMDocumentQuestionAndAnswer) : CMDocumentQuestionAndAnswer {
        val localVarResponse = documentQuestionAndAnswerWithHttpInfo(sessionId = sessionId, cmDocumentQuestionAndAnswer = cmDocumentQuestionAndAnswer)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMDocumentQuestionAndAnswer
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
     * Document Q&amp;A
     * Answer a question about a given document
     * @param sessionId a valid SimSage Session id.
     * @param cmDocumentQuestionAndAnswer 
     * @return ApiResponse<CMDocumentQuestionAndAnswer?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun documentQuestionAndAnswerWithHttpInfo(sessionId: kotlin.String, cmDocumentQuestionAndAnswer: CMDocumentQuestionAndAnswer) : ApiResponse<CMDocumentQuestionAndAnswer?> {
        val localVariableConfig = documentQuestionAndAnswerRequestConfig(sessionId = sessionId, cmDocumentQuestionAndAnswer = cmDocumentQuestionAndAnswer)

        return request<CMDocumentQuestionAndAnswer, CMDocumentQuestionAndAnswer>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation documentQuestionAndAnswer
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmDocumentQuestionAndAnswer 
     * @return RequestConfig
     */
    fun documentQuestionAndAnswerRequestConfig(sessionId: kotlin.String, cmDocumentQuestionAndAnswer: CMDocumentQuestionAndAnswer) : RequestConfig<CMDocumentQuestionAndAnswer> {
        val localVariableBody = cmDocumentQuestionAndAnswer
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/semantic/document-qa",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionGetTextToSearchPaginated(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Text to Search mappings
     * Return a paginated list of text-to-search mappings with an optional filter.
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchPaginated 
     * @param apIVersion  (optional)
     * @return CMTextToSearchPaginatedReturn
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTextToSearchPaginated(sessionId: kotlin.String, cmTextToSearchPaginated: CMTextToSearchPaginated, apIVersion: ApIVersionGetTextToSearchPaginated? = null) : CMTextToSearchPaginatedReturn {
        val localVarResponse = getTextToSearchPaginatedWithHttpInfo(sessionId = sessionId, cmTextToSearchPaginated = cmTextToSearchPaginated, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMTextToSearchPaginatedReturn
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
     * Text to Search mappings
     * Return a paginated list of text-to-search mappings with an optional filter.
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchPaginated 
     * @param apIVersion  (optional)
     * @return ApiResponse<CMTextToSearchPaginatedReturn?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTextToSearchPaginatedWithHttpInfo(sessionId: kotlin.String, cmTextToSearchPaginated: CMTextToSearchPaginated, apIVersion: ApIVersionGetTextToSearchPaginated?) : ApiResponse<CMTextToSearchPaginatedReturn?> {
        val localVariableConfig = getTextToSearchPaginatedRequestConfig(sessionId = sessionId, cmTextToSearchPaginated = cmTextToSearchPaginated, apIVersion = apIVersion)

        return request<CMTextToSearchPaginated, CMTextToSearchPaginatedReturn>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTextToSearchPaginated
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchPaginated 
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun getTextToSearchPaginatedRequestConfig(sessionId: kotlin.String, cmTextToSearchPaginated: CMTextToSearchPaginated, apIVersion: ApIVersionGetTextToSearchPaginated?) : RequestConfig<CMTextToSearchPaginated> {
        val localVariableBody = cmTextToSearchPaginated
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/semantic/text-to-search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Client Query
     * a SimSage client asks a question or performs a keyword-search.
     * @param cmClientQuery 
     * @return CMClientQueryResult
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun restfulClientQuery(cmClientQuery: CMClientQuery) : CMClientQueryResult {
        val localVarResponse = restfulClientQueryWithHttpInfo(cmClientQuery = cmClientQuery)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMClientQueryResult
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
     * Client Query
     * a SimSage client asks a question or performs a keyword-search.
     * @param cmClientQuery 
     * @return ApiResponse<CMClientQueryResult?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun restfulClientQueryWithHttpInfo(cmClientQuery: CMClientQuery) : ApiResponse<CMClientQueryResult?> {
        val localVariableConfig = restfulClientQueryRequestConfig(cmClientQuery = cmClientQuery)

        return request<CMClientQuery, CMClientQueryResult>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation restfulClientQuery
     *
     * @param cmClientQuery 
     * @return RequestConfig
     */
    fun restfulClientQueryRequestConfig(cmClientQuery: CMClientQuery) : RequestConfig<CMClientQuery> {
        val localVariableBody = cmClientQuery
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/semantic/query",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionSaveTextToSearch(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * Save a text-to-search item
     * Create or update (save) a text-to-search item.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchEdit 
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
    fun saveTextToSearch(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, cmTextToSearchEdit: CMTextToSearchEdit, apIVersion: ApIVersionSaveTextToSearch? = null) : JsonMessage {
        val localVarResponse = saveTextToSearchWithHttpInfo(organisationId = organisationId, kbId = kbId, sessionId = sessionId, cmTextToSearchEdit = cmTextToSearchEdit, apIVersion = apIVersion)

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
     * Save a text-to-search item
     * Create or update (save) a text-to-search item.
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchEdit 
     * @param apIVersion  (optional)
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun saveTextToSearchWithHttpInfo(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, cmTextToSearchEdit: CMTextToSearchEdit, apIVersion: ApIVersionSaveTextToSearch?) : ApiResponse<JsonMessage?> {
        val localVariableConfig = saveTextToSearchRequestConfig(organisationId = organisationId, kbId = kbId, sessionId = sessionId, cmTextToSearchEdit = cmTextToSearchEdit, apIVersion = apIVersion)

        return request<CMTextToSearchEdit, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation saveTextToSearch
     *
     * @param organisationId the organisation (its guid id)
     * @param kbId the knowledge-base (its guid id)
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchEdit 
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun saveTextToSearchRequestConfig(organisationId: kotlin.String, kbId: kotlin.String, sessionId: kotlin.String, cmTextToSearchEdit: CMTextToSearchEdit, apIVersion: ApIVersionSaveTextToSearch?) : RequestConfig<CMTextToSearchEdit> {
        val localVariableBody = cmTextToSearchEdit
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/semantic/text-to-search/{organisationId}/{kbId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"kbId"+"}", encodeURIComponent(kbId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Short summary
     * Create a short summary for a given url / sentence
     * @param cmShortSummary 
     * @return CMShortSummaryResult
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun shortSummary(cmShortSummary: CMShortSummary) : CMShortSummaryResult {
        val localVarResponse = shortSummaryWithHttpInfo(cmShortSummary = cmShortSummary)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMShortSummaryResult
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
     * Short summary
     * Create a short summary for a given url / sentence
     * @param cmShortSummary 
     * @return ApiResponse<CMShortSummaryResult?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun shortSummaryWithHttpInfo(cmShortSummary: CMShortSummary) : ApiResponse<CMShortSummaryResult?> {
        val localVariableConfig = shortSummaryRequestConfig(cmShortSummary = cmShortSummary)

        return request<CMShortSummary, CMShortSummaryResult>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation shortSummary
     *
     * @param cmShortSummary 
     * @return RequestConfig
     */
    fun shortSummaryRequestConfig(cmShortSummary: CMShortSummary) : RequestConfig<CMShortSummary> {
        val localVariableBody = cmShortSummary
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/semantic/short-summary",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter apIVersion
     */
     enum class ApIVersionTryTextToSearchConversion(val value: kotlin.String) {
         @Json(name = "1") _1("1")
     }

    /**
     * try converting text-to-search
     * See the results of a text-to-search conversion
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchConversion 
     * @param apIVersion  (optional)
     * @return CMTextToSearchConversionReturn
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tryTextToSearchConversion(sessionId: kotlin.String, cmTextToSearchConversion: CMTextToSearchConversion, apIVersion: ApIVersionTryTextToSearchConversion? = null) : CMTextToSearchConversionReturn {
        val localVarResponse = tryTextToSearchConversionWithHttpInfo(sessionId = sessionId, cmTextToSearchConversion = cmTextToSearchConversion, apIVersion = apIVersion)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CMTextToSearchConversionReturn
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
     * try converting text-to-search
     * See the results of a text-to-search conversion
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchConversion 
     * @param apIVersion  (optional)
     * @return ApiResponse<CMTextToSearchConversionReturn?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tryTextToSearchConversionWithHttpInfo(sessionId: kotlin.String, cmTextToSearchConversion: CMTextToSearchConversion, apIVersion: ApIVersionTryTextToSearchConversion?) : ApiResponse<CMTextToSearchConversionReturn?> {
        val localVariableConfig = tryTextToSearchConversionRequestConfig(sessionId = sessionId, cmTextToSearchConversion = cmTextToSearchConversion, apIVersion = apIVersion)

        return request<CMTextToSearchConversion, CMTextToSearchConversionReturn>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tryTextToSearchConversion
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmTextToSearchConversion 
     * @param apIVersion  (optional)
     * @return RequestConfig
     */
    fun tryTextToSearchConversionRequestConfig(sessionId: kotlin.String, cmTextToSearchConversion: CMTextToSearchConversion, apIVersion: ApIVersionTryTextToSearchConversion?) : RequestConfig<CMTextToSearchConversion> {
        val localVariableBody = cmTextToSearchConversion
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        apIVersion?.apply { localVariableHeaders["API-Version"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/semantic/text-to-search-try",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Version
     * Get the version of SimSage Search Services.
     * @return CMVersion
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun version1() : CMVersion {
        val localVarResponse = version1WithHttpInfo()

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
     * Get the version of SimSage Search Services.
     * @return ApiResponse<CMVersion?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun version1WithHttpInfo() : ApiResponse<CMVersion?> {
        val localVariableConfig = version1RequestConfig()

        return request<Unit, CMVersion>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation version1
     *
     * @return RequestConfig
     */
    fun version1RequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/semantic/version",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
