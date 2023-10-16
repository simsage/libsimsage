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
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    CMInfo,
    CMKnowledgeBase,
    CMKnowledgeBaseExport,
    CMVersion,
    JsonMessage,
    KnowledgeBase,
} from '../models';

export interface ExportKnowledgeBaseRequest {
    sessionId: string;
    cMKnowledgeBaseExport: CMKnowledgeBaseExport;
    aPIVersion?: ExportKnowledgeBaseAPIVersionEnum;
}

export interface GetKnowledgeBaseRequest {
    organisationId: string;
    kbId: string;
    sessionId: string;
    aPIVersion?: GetKnowledgeBaseAPIVersionEnum;
}

export interface GetKnowledgeBasesRequest {
    organisationId: string;
    sessionId: string;
}

export interface GetSearchInfoRequest {
    organisationId: string;
    clientId: string;
    aPIVersion?: GetSearchInfoAPIVersionEnum;
}

export interface GetSearchInfo2Request {
    organisationId: string;
    aPIVersion?: GetSearchInfo2APIVersionEnum;
}

export interface RemoveKnowledgeBaseRequest {
    organisationId: string;
    kbId: string;
    sessionId: string;
    aPIVersion?: RemoveKnowledgeBaseAPIVersionEnum;
}

export interface UpdateKnowledgeBaseRequest {
    sessionId: string;
    cMKnowledgeBase: CMKnowledgeBase;
    aPIVersion?: UpdateKnowledgeBaseAPIVersionEnum;
}

/**
 * no description
 */
export class KnowledgebaseApi extends BaseAPI {

    /**
     * starts the export of a knowledge-base using the passed in exporter config
     * export Knowledge-base
     */
    exportKnowledgeBase({ sessionId, cMKnowledgeBaseExport, aPIVersion }: ExportKnowledgeBaseRequest): Observable<JsonMessage>
    exportKnowledgeBase({ sessionId, cMKnowledgeBaseExport, aPIVersion }: ExportKnowledgeBaseRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    exportKnowledgeBase({ sessionId, cMKnowledgeBaseExport, aPIVersion }: ExportKnowledgeBaseRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'exportKnowledgeBase');
        throwIfNullOrUndefined(cMKnowledgeBaseExport, 'cMKnowledgeBaseExport', 'exportKnowledgeBase');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/knowledgebase/export',
            method: 'POST',
            headers,
            body: cMKnowledgeBaseExport,
        }, opts?.responseOpts);
    };

    /**
     * Return a knowledge base by id.
     * Get Knowledge-base
     */
    getKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: GetKnowledgeBaseRequest): Observable<CMKnowledgeBase>
    getKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: GetKnowledgeBaseRequest, opts?: OperationOpts): Observable<AjaxResponse<CMKnowledgeBase>>
    getKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: GetKnowledgeBaseRequest, opts?: OperationOpts): Observable<CMKnowledgeBase | AjaxResponse<CMKnowledgeBase>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getKnowledgeBase');
        throwIfNullOrUndefined(kbId, 'kbId', 'getKnowledgeBase');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getKnowledgeBase');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMKnowledgeBase>({
            url: '/api/knowledgebase/{organisationId}/{kbId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Return a list of knowledge bases for a given organisation.
     * Get Knowledge-bases
     */
    getKnowledgeBases({ organisationId, sessionId }: GetKnowledgeBasesRequest): Observable<Array<CMKnowledgeBase>>
    getKnowledgeBases({ organisationId, sessionId }: GetKnowledgeBasesRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CMKnowledgeBase>>>
    getKnowledgeBases({ organisationId, sessionId }: GetKnowledgeBasesRequest, opts?: OperationOpts): Observable<Array<CMKnowledgeBase> | AjaxResponse<Array<CMKnowledgeBase>>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getKnowledgeBases');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getKnowledgeBases');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<CMKnowledgeBase>>({
            url: '/api/knowledgebase/{organisationId}'.replace('{organisationId}', encodeURI(organisationId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.
     * Search Info
     */
    getSearchInfo({ organisationId, clientId, aPIVersion }: GetSearchInfoRequest): Observable<CMInfo>
    getSearchInfo({ organisationId, clientId, aPIVersion }: GetSearchInfoRequest, opts?: OperationOpts): Observable<AjaxResponse<CMInfo>>
    getSearchInfo({ organisationId, clientId, aPIVersion }: GetSearchInfoRequest, opts?: OperationOpts): Observable<CMInfo | AjaxResponse<CMInfo>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getSearchInfo');
        throwIfNullOrUndefined(clientId, 'clientId', 'getSearchInfo');

        const headers: HttpHeaders = {
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMInfo>({
            url: '/api/knowledgebase/search/info/{organisationId}/{clientId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{clientId}', encodeURI(clientId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Return Semantic-search and categorical information for a given organisation (by id).  This is used by search UI interfaces to pre-populate and setup knowledge-bases of this organisation, metadata-categories, and security requirements.  This is an older interface.  Please use the /search/info/organisation-id/client-id interface instead.
     * Search Info [deprecated]
     */
    getSearchInfo2({ organisationId, aPIVersion }: GetSearchInfo2Request): Observable<CMInfo>
    getSearchInfo2({ organisationId, aPIVersion }: GetSearchInfo2Request, opts?: OperationOpts): Observable<AjaxResponse<CMInfo>>
    getSearchInfo2({ organisationId, aPIVersion }: GetSearchInfo2Request, opts?: OperationOpts): Observable<CMInfo | AjaxResponse<CMInfo>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getSearchInfo2');

        const headers: HttpHeaders = {
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<CMInfo>({
            url: '/api/knowledgebase/search/info/{organisationId}'.replace('{organisationId}', encodeURI(organisationId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Delete a knowledge-base by Id.
     * Delete Knowledge-base
     */
    removeKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: RemoveKnowledgeBaseRequest): Observable<JsonMessage>
    removeKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: RemoveKnowledgeBaseRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    removeKnowledgeBase({ organisationId, kbId, sessionId, aPIVersion }: RemoveKnowledgeBaseRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'removeKnowledgeBase');
        throwIfNullOrUndefined(kbId, 'kbId', 'removeKnowledgeBase');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'removeKnowledgeBase');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/knowledgebase/{organisationId}/{kbId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)),
            method: 'DELETE',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Save (Create or Update) a SimSage knowledge base item.
     * Save Knowledge-base
     */
    updateKnowledgeBase({ sessionId, cMKnowledgeBase, aPIVersion }: UpdateKnowledgeBaseRequest): Observable<KnowledgeBase>
    updateKnowledgeBase({ sessionId, cMKnowledgeBase, aPIVersion }: UpdateKnowledgeBaseRequest, opts?: OperationOpts): Observable<AjaxResponse<KnowledgeBase>>
    updateKnowledgeBase({ sessionId, cMKnowledgeBase, aPIVersion }: UpdateKnowledgeBaseRequest, opts?: OperationOpts): Observable<KnowledgeBase | AjaxResponse<KnowledgeBase>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'updateKnowledgeBase');
        throwIfNullOrUndefined(cMKnowledgeBase, 'cMKnowledgeBase', 'updateKnowledgeBase');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
            ...(aPIVersion != null ? { 'API-Version': String(aPIVersion) } : undefined),
        };

        return this.request<KnowledgeBase>({
            url: '/api/knowledgebase/save',
            method: 'PUT',
            headers,
            body: cMKnowledgeBase,
        }, opts?.responseOpts);
    };

    /**
     * Return the version of SimSage knowledge-base Services.
     * Version
     */
    version3(): Observable<CMVersion>
    version3(opts?: OperationOpts): Observable<AjaxResponse<CMVersion>>
    version3(opts?: OperationOpts): Observable<CMVersion | AjaxResponse<CMVersion>> {
        return this.request<CMVersion>({
            url: '/api/knowledgebase/version',
            method: 'GET',
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum ExportKnowledgeBaseAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum GetKnowledgeBaseAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum GetSearchInfoAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum GetSearchInfo2APIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum RemoveKnowledgeBaseAPIVersionEnum {
    _1 = '1'
}
/**
 * @export
 * @enum {string}
 */
export enum UpdateKnowledgeBaseAPIVersionEnum {
    _1 = '1'
}
