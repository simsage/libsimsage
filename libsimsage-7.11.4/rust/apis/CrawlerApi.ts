// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    CMDeleteDocument,
    CMDocumentUnChanged,
    CMExternalCrawler,
    CMExternalCrawlerStart,
    CMExternalCrawlerStop,
    CMSource,
    CMStartCrawler,
    CMUploadDocument,
    CMUploadImage,
    CMVersion,
    JsonMessage,
} from '../models';

export interface DeleteRequest {
    organisationId: string;
    kbId: string;
    sessionId: string;
    sourceId: number;
    aPIVersion?: DeleteAPIVersionEnum;
}

export interface CrawlerExternalDocumentDeleteRequest {
    cMDeleteDocument: CMDeleteDocument;
    aPIVersion?: CrawlerExternalDocumentDeleteAPIVersionEnum;
}

export interface CrawlerExternalDocumentUnChangedRequest {
    cMDocumentUnChanged: CMDocumentUnChanged;
    aPIVersion?: CrawlerExternalDocumentUnChangedAPIVersionEnum;
}

export interface CrawlerExternalDocumentUploadRequest {
    cMUploadDocument: CMUploadDocument;
    aPIVersion?: CrawlerExternalDocumentUploadAPIVersionEnum;
}

export interface CrawlerExternalImageUploadRequest {
    cMUploadImage: CMUploadImage;
    aPIVersion?: CrawlerExternalImageUploadAPIVersionEnum;
}

export interface DeleteDocumentsRequest {
    organisationId: string;
    kbId: string;
    sessionId: string;
    sourceId: number;
    aPIVersion?: DeleteDocumentsAPIVersionEnum;
}

export interface EncryptedCommunicationsRequest {
    seed: number;
    body: string;
    aPIVersion?: EncryptedCommunicationsAPIVersionEnum;
}

export interface ExternalCrawlerRequest {
    cMExternalCrawler: CMExternalCrawler;
    aPIVersion?: ExternalCrawlerAPIVersionEnum;
}

export interface ExternalCrawlerFinishedRequest {
    cMExternalCrawlerStop: CMExternalCrawlerStop;
    aPIVersion?: ExternalCrawlerFinishedAPIVersionEnum;
}

export interface ExternalCrawlerStartRequest {
    cMExternalCrawlerStart: CMExternalCrawlerStart;
    aPIVersion?: ExternalCrawlerStartAPIVersionEnum;
}

export interface GetCrawlerRequest {
    organisationId: string;
    kbId: string;
    sourceId: number;
    sessionId: string;
    aPIVersion?: GetCrawlerAPIVersionEnum;
}

export interface GetSourceListRequest {
    sessionId: string;
    organisationId: string;
    kbId: string;
    aPIVersion?: GetSourceListAPIVersionEnum;
}

export interface OidcCodeRequest {
    oidcKey: string;
    allRequestParams: { [key: string]: string; };
}

export interface ProcessAllFilesRequest {
    sessionId: string;
    cMStartCrawler: CMStartCrawler;
    aPIVersion?: ProcessAllFilesAPIVersionEnum;
}

export interface ResetSourceDeltaRequest {
    sessionId: string;
    organisationId: string;
    kbId: string;
    sourceId: number;
    aPIVersion?: ResetSourceDeltaAPIVersionEnum;
}

export interface StartCrawlerRequest {
    sessionId: string;
    cMStartCrawler: CMStartCrawler;
    aPIVersion?: StartCrawlerAPIVersionEnum;
}

export interface TestCrawlerRequest {
    sessionId: string;
    organisationId: string;
    kbId: string;
    sourceId: number;
    aPIVersion?: TestCrawlerAPIVersionEnum;
}

export interface UpdateCrawlerRequest {
    sessionId: string;
    cMSource: CMSource;
    aPIVersion?: UpdateCrawlerAPIVersionEnum;
}

/**
 * no description
 */
export class CrawlerApi extends BaseAPI {

    /**
     * Remove a source and all its content by its source-id.
     * Delete source
     */
    _delete({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteRequest): Observable<JsonMessage>
    _delete({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    _delete({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', '_delete');
        throwIfNullOrUndefined(kbId, 'kbId', '_delete');
        throwIfNullOrUndefined(sessionId, 'sessionId', '_delete');
        throwIfNullOrUndefined(sourceId, 'sourceId', '_delete');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/crawler/{organisationId}/{kbId}/{sourceId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{sourceId}', encodeURI(sourceId)),
            method: 'DELETE',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Remove an external crawler document from SimSage.
     * Remove an External Document
     */
    crawlerExternalDocumentDelete({ cMDeleteDocument, aPIVersion }: CrawlerExternalDocumentDeleteRequest): Observable<JsonMessage>
    crawlerExternalDocumentDelete({ cMDeleteDocument, aPIVersion }: CrawlerExternalDocumentDeleteRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    crawlerExternalDocumentDelete({ cMDeleteDocument, aPIVersion }: CrawlerExternalDocumentDeleteRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMDeleteDocument, 'cMDeleteDocument', 'crawlerExternalDocumentDelete');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/document/delete',
            method: 'PUT',
            headers,
            body: cMDeleteDocument,
        }, opts?.responseOpts);
    };

    /**
     * An external crawler document marks a document as not having changed.
     * Mark External Document Unchanged
     */
    crawlerExternalDocumentUnChanged({ cMDocumentUnChanged, aPIVersion }: CrawlerExternalDocumentUnChangedRequest): Observable<JsonMessage>
    crawlerExternalDocumentUnChanged({ cMDocumentUnChanged, aPIVersion }: CrawlerExternalDocumentUnChangedRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    crawlerExternalDocumentUnChanged({ cMDocumentUnChanged, aPIVersion }: CrawlerExternalDocumentUnChangedRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMDocumentUnChanged, 'cMDocumentUnChanged', 'crawlerExternalDocumentUnChanged');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/document/un-changed',
            method: 'POST',
            headers,
            body: cMDocumentUnChanged,
        }, opts?.responseOpts);
    };

    /**
     * An external crawler document wants to upload a document to SimSage.
     * Upload External Document
     */
    crawlerExternalDocumentUpload({ cMUploadDocument, aPIVersion }: CrawlerExternalDocumentUploadRequest): Observable<JsonMessage>
    crawlerExternalDocumentUpload({ cMUploadDocument, aPIVersion }: CrawlerExternalDocumentUploadRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    crawlerExternalDocumentUpload({ cMUploadDocument, aPIVersion }: CrawlerExternalDocumentUploadRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMUploadDocument, 'cMUploadDocument', 'crawlerExternalDocumentUpload');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/document/upload',
            method: 'POST',
            headers,
            body: cMUploadDocument,
        }, opts?.responseOpts);
    };

    /**
     * An external crawler uploads an image for a document.
     * Upload External Image
     */
    crawlerExternalImageUpload({ cMUploadImage, aPIVersion }: CrawlerExternalImageUploadRequest): Observable<JsonMessage>
    crawlerExternalImageUpload({ cMUploadImage, aPIVersion }: CrawlerExternalImageUploadRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    crawlerExternalImageUpload({ cMUploadImage, aPIVersion }: CrawlerExternalImageUploadRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMUploadImage, 'cMUploadImage', 'crawlerExternalImageUpload');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/document/upload/image',
            method: 'POST',
            headers,
            body: cMUploadImage,
        }, opts?.responseOpts);
    };

    /**
     * Remove a source\'s documents and stop the crawler if it\'s running.  Return an updated sources.
     * Delete source\'s documents
     */
    deleteDocuments({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteDocumentsRequest): Observable<CMSource>
    deleteDocuments({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteDocumentsRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSource>>
    deleteDocuments({ organisationId, kbId, sessionId, sourceId, aPIVersion }: DeleteDocumentsRequest, opts?: OperationOpts): Observable<CMSource | AjaxResponse<CMSource>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'deleteDocuments');
        throwIfNullOrUndefined(kbId, 'kbId', 'deleteDocuments');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'deleteDocuments');
        throwIfNullOrUndefined(sourceId, 'sourceId', 'deleteDocuments');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMSource>({
            url: '/api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{sourceId}', encodeURI(sourceId)),
            method: 'DELETE',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.
     * Secure Communication
     */
    encryptedCommunications({ seed, body, aPIVersion }: EncryptedCommunicationsRequest): Observable<JsonMessage>
    encryptedCommunications({ seed, body, aPIVersion }: EncryptedCommunicationsRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    encryptedCommunications({ seed, body, aPIVersion }: EncryptedCommunicationsRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(seed, 'seed', 'encryptedCommunications');
        throwIfNullOrUndefined(body, 'body', 'encryptedCommunications');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/secure/{seed}'.replace('{seed}', encodeURI(seed)),
            method: 'POST',
            headers,
            body: body as any,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.
     * External Crawler
     */
    externalCrawler({ cMExternalCrawler, aPIVersion }: ExternalCrawlerRequest): Observable<CMSource>
    externalCrawler({ cMExternalCrawler, aPIVersion }: ExternalCrawlerRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSource>>
    externalCrawler({ cMExternalCrawler, aPIVersion }: ExternalCrawlerRequest, opts?: OperationOpts): Observable<CMSource | AjaxResponse<CMSource>> {
        throwIfNullOrUndefined(cMExternalCrawler, 'cMExternalCrawler', 'externalCrawler');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMSource>({
            url: '/api/crawler/external/crawler',
            method: 'POST',
            headers,
            body: cMExternalCrawler,
        }, opts?.responseOpts);
    };

    /**
     * An external crawler notifies SimSage it has finished its job, its run through the data once.
     * Stop External Crawler
     */
    externalCrawlerFinished({ cMExternalCrawlerStop, aPIVersion }: ExternalCrawlerFinishedRequest): Observable<JsonMessage>
    externalCrawlerFinished({ cMExternalCrawlerStop, aPIVersion }: ExternalCrawlerFinishedRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    externalCrawlerFinished({ cMExternalCrawlerStop, aPIVersion }: ExternalCrawlerFinishedRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMExternalCrawlerStop, 'cMExternalCrawlerStop', 'externalCrawlerFinished');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/crawler/finish',
            method: 'POST',
            headers,
            body: cMExternalCrawlerStop,
        }, opts?.responseOpts);
    };

    /**
     * An external crawler notifies SimSage is it starting a new run.
     * Start External Crawler
     */
    externalCrawlerStart({ cMExternalCrawlerStart, aPIVersion }: ExternalCrawlerStartRequest): Observable<JsonMessage>
    externalCrawlerStart({ cMExternalCrawlerStart, aPIVersion }: ExternalCrawlerStartRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    externalCrawlerStart({ cMExternalCrawlerStart, aPIVersion }: ExternalCrawlerStartRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(cMExternalCrawlerStart, 'cMExternalCrawlerStart', 'externalCrawlerStart');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/external/crawler/start',
            method: 'POST',
            headers,
            body: cMExternalCrawlerStart,
        }, opts?.responseOpts);
    };

    /**
     * Return the data-structure for a source by id.
     * Get source
     */
    getCrawler({ organisationId, kbId, sourceId, sessionId, aPIVersion }: GetCrawlerRequest): Observable<CMSource>
    getCrawler({ organisationId, kbId, sourceId, sessionId, aPIVersion }: GetCrawlerRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSource>>
    getCrawler({ organisationId, kbId, sourceId, sessionId, aPIVersion }: GetCrawlerRequest, opts?: OperationOpts): Observable<CMSource | AjaxResponse<CMSource>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getCrawler');
        throwIfNullOrUndefined(kbId, 'kbId', 'getCrawler');
        throwIfNullOrUndefined(sourceId, 'sourceId', 'getCrawler');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getCrawler');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMSource>({
            url: '/api/crawler/crawler/{organisationId}/{kbId}/{sourceId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{sourceId}', encodeURI(sourceId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get a list of sources for a given organisation / knowledge base.
     * Get source List
     */
    getSourceList({ sessionId, organisationId, kbId, aPIVersion }: GetSourceListRequest): Observable<Array<CMSource>>
    getSourceList({ sessionId, organisationId, kbId, aPIVersion }: GetSourceListRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CMSource>>>
    getSourceList({ sessionId, organisationId, kbId, aPIVersion }: GetSourceListRequest, opts?: OperationOpts): Observable<Array<CMSource> | AjaxResponse<Array<CMSource>>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getSourceList');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getSourceList');
        throwIfNullOrUndefined(kbId, 'kbId', 'getSourceList');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<Array<CMSource>>({
            url: '/api/crawler/crawlers/{organisationId}/{kbId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * used for OIDC systems to receive codes
     * OIDC code receiver
     */
    oidcCode({ oidcKey, allRequestParams }: OidcCodeRequest): Observable<void>
    oidcCode({ oidcKey, allRequestParams }: OidcCodeRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    oidcCode({ oidcKey, allRequestParams }: OidcCodeRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(oidcKey, 'oidcKey', 'oidcCode');
        throwIfNullOrUndefined(allRequestParams, 'allRequestParams', 'oidcCode');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'allRequestParams': allRequestParams,
        };

        return this.request<void>({
            url: '/api/crawler/dropbox-oidc-code/{oidcKey}'.replace('{oidcKey}', encodeURI(oidcKey)),
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Start and force processing all files for a crawler/source
     * Process all files of crawler/source
     */
    processAllFiles({ sessionId, cMStartCrawler, aPIVersion }: ProcessAllFilesRequest): Observable<JsonMessage>
    processAllFiles({ sessionId, cMStartCrawler, aPIVersion }: ProcessAllFilesRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    processAllFiles({ sessionId, cMStartCrawler, aPIVersion }: ProcessAllFilesRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'processAllFiles');
        throwIfNullOrUndefined(cMStartCrawler, 'cMStartCrawler', 'processAllFiles');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/process-all-files',
            method: 'POST',
            headers,
            body: cMStartCrawler,
        }, opts?.responseOpts);
    };

    /**
     * reset a SimSage source\'s delta token.
     * Reset Source delta-token
     */
    resetSourceDelta({ sessionId, organisationId, kbId, sourceId, aPIVersion }: ResetSourceDeltaRequest): Observable<CMSource>
    resetSourceDelta({ sessionId, organisationId, kbId, sourceId, aPIVersion }: ResetSourceDeltaRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSource>>
    resetSourceDelta({ sessionId, organisationId, kbId, sourceId, aPIVersion }: ResetSourceDeltaRequest, opts?: OperationOpts): Observable<CMSource | AjaxResponse<CMSource>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'resetSourceDelta');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'resetSourceDelta');
        throwIfNullOrUndefined(kbId, 'kbId', 'resetSourceDelta');
        throwIfNullOrUndefined(sourceId, 'sourceId', 'resetSourceDelta');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMSource>({
            url: '/api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{sourceId}', encodeURI(sourceId)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Start a crawler by source-id if after it has stopped.
     * Start crawler
     */
    startCrawler({ sessionId, cMStartCrawler, aPIVersion }: StartCrawlerRequest): Observable<JsonMessage>
    startCrawler({ sessionId, cMStartCrawler, aPIVersion }: StartCrawlerRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    startCrawler({ sessionId, cMStartCrawler, aPIVersion }: StartCrawlerRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'startCrawler');
        throwIfNullOrUndefined(cMStartCrawler, 'cMStartCrawler', 'startCrawler');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/start',
            method: 'POST',
            headers,
            body: cMStartCrawler,
        }, opts?.responseOpts);
    };

    /**
     * Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.
     * Test Crawler
     */
    testCrawler({ sessionId, organisationId, kbId, sourceId, aPIVersion }: TestCrawlerRequest): Observable<JsonMessage>
    testCrawler({ sessionId, organisationId, kbId, sourceId, aPIVersion }: TestCrawlerRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    testCrawler({ sessionId, organisationId, kbId, sourceId, aPIVersion }: TestCrawlerRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'testCrawler');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'testCrawler');
        throwIfNullOrUndefined(kbId, 'kbId', 'testCrawler');
        throwIfNullOrUndefined(sourceId, 'sourceId', 'testCrawler');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{sourceId}', encodeURI(sourceId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Save (create or update) a SimSage source.
     * Update Source
     */
    updateCrawler({ sessionId, cMSource, aPIVersion }: UpdateCrawlerRequest): Observable<CMSource>
    updateCrawler({ sessionId, cMSource, aPIVersion }: UpdateCrawlerRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSource>>
    updateCrawler({ sessionId, cMSource, aPIVersion }: UpdateCrawlerRequest, opts?: OperationOpts): Observable<CMSource | AjaxResponse<CMSource>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'updateCrawler');
        throwIfNullOrUndefined(cMSource, 'cMSource', 'updateCrawler');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMSource>({
            url: '/api/crawler/crawler',
            method: 'POST',
            headers,
            body: cMSource,
        }, opts?.responseOpts);
    };

    /**
     * Get the version of SimSage crawler-services.
     * Version
     */
    version6(): Observable<CMVersion>
    version6(opts?: OperationOpts): Observable<AjaxResponse<CMVersion>>
    version6(opts?: OperationOpts): Observable<CMVersion | AjaxResponse<CMVersion>> {
        return this.request<CMVersion>({
            url: '/api/crawler/version',
            method: 'GET',
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum DeleteAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum CrawlerExternalDocumentDeleteAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum CrawlerExternalDocumentUnChangedAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum CrawlerExternalDocumentUploadAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum CrawlerExternalImageUploadAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum DeleteDocumentsAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum EncryptedCommunicationsAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum ExternalCrawlerAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum ExternalCrawlerFinishedAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum ExternalCrawlerStartAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum GetCrawlerAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum GetSourceListAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum ProcessAllFilesAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum ResetSourceDeltaAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum StartCrawlerAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum TestCrawlerAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum UpdateCrawlerAPIVersionEnum {
    _1 = '1'
}
