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

import org.openapitools.client.models.Backup
import org.openapitools.client.models.CMRestoreFromText
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

class BackupApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://test.simsage.ai")
        }
    }

    /**
     * create backup
     * Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param regime what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation)
     * @return JsonMessage
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun backup(sessionId: kotlin.String, organisationId: kotlin.String, regime: kotlin.String) : JsonMessage {
        val localVarResponse = backupWithHttpInfo(sessionId = sessionId, organisationId = organisationId, regime = regime)

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
     * create backup
     * Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param regime what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation)
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun backupWithHttpInfo(sessionId: kotlin.String, organisationId: kotlin.String, regime: kotlin.String) : ApiResponse<JsonMessage?> {
        val localVariableConfig = backupRequestConfig(sessionId = sessionId, organisationId = organisationId, regime = regime)

        return request<Unit, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation backup
     *
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param regime what to backup, one of &#39;all&#39; (all organisations, requires admin privileges) or &#39;specific&#39; (only the given organisation)
     * @return RequestConfig
     */
    fun backupRequestConfig(sessionId: kotlin.String, organisationId: kotlin.String, regime: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/backup/backup/{organisationId}/{regime}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"regime"+"}", encodeURIComponent(regime.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * remove backup
     * Delete a backup by ID and return list of all Backups present in this SimSage instance
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param backupId the backup&#39;s id (along)
     * @return kotlin.collections.List<Backup>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteBackup(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : kotlin.collections.List<Backup> {
        val localVarResponse = deleteBackupWithHttpInfo(sessionId = sessionId, organisationId = organisationId, backupId = backupId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Backup>
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
     * remove backup
     * Delete a backup by ID and return list of all Backups present in this SimSage instance
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param backupId the backup&#39;s id (along)
     * @return ApiResponse<kotlin.collections.List<Backup>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteBackupWithHttpInfo(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : ApiResponse<kotlin.collections.List<Backup>?> {
        val localVariableConfig = deleteBackupRequestConfig(sessionId = sessionId, organisationId = organisationId, backupId = backupId)

        return request<Unit, kotlin.collections.List<Backup>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteBackup
     *
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @param backupId the backup&#39;s id (along)
     * @return RequestConfig
     */
    fun deleteBackupRequestConfig(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/backup/backup/{organisationId}/{backupId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"backupId"+"}", encodeURIComponent(backupId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * get backup
     * return the backup data for a given backup-id
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) for access control
     * @param backupId the backup&#39;s id (along)
     * @return Backup
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getBackup(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : Backup {
        val localVarResponse = getBackupWithHttpInfo(sessionId = sessionId, organisationId = organisationId, backupId = backupId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Backup
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
     * get backup
     * return the backup data for a given backup-id
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) for access control
     * @param backupId the backup&#39;s id (along)
     * @return ApiResponse<Backup?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getBackupWithHttpInfo(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : ApiResponse<Backup?> {
        val localVariableConfig = getBackupRequestConfig(sessionId = sessionId, organisationId = organisationId, backupId = backupId)

        return request<Unit, Backup>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getBackup
     *
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) for access control
     * @param backupId the backup&#39;s id (along)
     * @return RequestConfig
     */
    fun getBackupRequestConfig(sessionId: kotlin.String, organisationId: kotlin.String, backupId: kotlin.Long) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/backup/{organisationId}/{backupId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())).replace("{"+"backupId"+"}", encodeURIComponent(backupId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * get backup list
     * Get a list of all Backups present in this SimSage instance
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @return kotlin.collections.List<Backup>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getBackupList(sessionId: kotlin.String, organisationId: kotlin.String) : kotlin.collections.List<Backup> {
        val localVarResponse = getBackupListWithHttpInfo(sessionId = sessionId, organisationId = organisationId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Backup>
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
     * get backup list
     * Get a list of all Backups present in this SimSage instance
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @return ApiResponse<kotlin.collections.List<Backup>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getBackupListWithHttpInfo(sessionId: kotlin.String, organisationId: kotlin.String) : ApiResponse<kotlin.collections.List<Backup>?> {
        val localVariableConfig = getBackupListRequestConfig(sessionId = sessionId, organisationId = organisationId)

        return request<Unit, kotlin.collections.List<Backup>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getBackupList
     *
     * @param sessionId a valid SimSage Session id.
     * @param organisationId the organisation&#39;s id (a guid) to backup
     * @return RequestConfig
     */
    fun getBackupListRequestConfig(sessionId: kotlin.String, organisationId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/backup/backups/{organisationId}".replace("{"+"organisationId"+"}", encodeURIComponent(organisationId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * restore backup
     * Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.
     * @param sessionId a valid SimSage Session id.
     * @param cmRestoreFromText 
     * @return JsonMessage
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun restoreFromText(sessionId: kotlin.String, cmRestoreFromText: CMRestoreFromText) : JsonMessage {
        val localVarResponse = restoreFromTextWithHttpInfo(sessionId = sessionId, cmRestoreFromText = cmRestoreFromText)

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
     * restore backup
     * Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.
     * @param sessionId a valid SimSage Session id.
     * @param cmRestoreFromText 
     * @return ApiResponse<JsonMessage?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun restoreFromTextWithHttpInfo(sessionId: kotlin.String, cmRestoreFromText: CMRestoreFromText) : ApiResponse<JsonMessage?> {
        val localVariableConfig = restoreFromTextRequestConfig(sessionId = sessionId, cmRestoreFromText = cmRestoreFromText)

        return request<CMRestoreFromText, JsonMessage>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation restoreFromText
     *
     * @param sessionId a valid SimSage Session id.
     * @param cmRestoreFromText 
     * @return RequestConfig
     */
    fun restoreFromTextRequestConfig(sessionId: kotlin.String, cmRestoreFromText: CMRestoreFromText) : RequestConfig<CMRestoreFromText> {
        val localVariableBody = cmRestoreFromText
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        sessionId.apply { localVariableHeaders["session-id"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/backup/restore",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
