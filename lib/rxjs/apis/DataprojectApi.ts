// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
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
    CMChangeTaskPhase,
    CMClaimDocument,
    CMCommentFilter,
    CMCrawlerStatusTask,
    CMCreatedProject,
    CMDocumentsByToken,
    CMNewComment,
    CMNextDocument,
    CMPagedProjectDocuments,
    CMPagedQueueItems,
    CMProjectDefinition,
    CMProjectDefinitionTask,
    CMProjectInfo,
    CMProjectReview,
    CMProjectSliceTask,
    CMQueueFilter,
    CMReassignSliceDocument,
    CMRecordedComment,
    CMRedactionDetails,
    CMRemoveSliceDocument,
    CMSearchResultSummary,
    CMSearchResultSummaryTask,
    CMSetSliceDefinitions,
    CMSlicedDocumentListAndTotals,
    CMSlicedDocumentRequest,
    CMStartProject,
    CMUpdateDocumentStatus,
    CMUpdateRedactions,
    JsonMessage,
    LocatedRedaction,
    ReturnedDocument,
} from '../models';

export interface AddCommentRequest {
    sessionId: string;
    cMNewComment: CMNewComment;
}

export interface AllTasksRequest {
    sessionId: string;
    cMQueueFilter: CMQueueFilter;
}

export interface ChangeTaskPhaseRequest {
    sessionId: string;
    cMChangeTaskPhase: CMChangeTaskPhase;
}

export interface ClaimDocumentRequest {
    sessionId: string;
    cMClaimDocument: CMClaimDocument;
}

export interface CrawlerStatusRequest {
    organisationId: string;
    taskId: string;
    sessionId: string;
}

export interface DocumentsByTokensRequest {
    sessionId: string;
    cMDocumentsByToken: CMDocumentsByToken;
}

export interface FilteredCommentsRequest {
    sessionId: string;
    cMCommentFilter: CMCommentFilter;
}

export interface GetDocumentRedactionInfoRequest {
    organisationId: string;
    sliceId: string;
    documentKey: string;
    sessionId: string;
}

export interface GetProjectDefinitionRequest {
    organisationId: string;
    taskId: string;
    sessionId: string;
}

export interface GetProjectReviewRequest {
    organisationId: string;
    projectId: string;
    sessionId: string;
}

export interface GetProjectSliceRequest {
    organisationId: string;
    taskId: string;
    sessionId: string;
}

export interface GetSearchResultSummaryRequest {
    organisationId: string;
    taskId: string;
    sessionId: string;
}

export interface GetSearchResultSummaryForReviewRequest {
    organisationId: string;
    projectId: string;
    sessionId: string;
}

export interface NextDocumentRequest {
    sessionId: string;
    cMNextDocument: CMNextDocument;
}

export interface PdfBinaryRequest {
    organisationId: string;
    kbId: string;
    url: string;
    sessionId?: string;
}

export interface ProjectTypesRequest {
    organisationId: string;
    sessionId: string;
}

export interface ReassignSliceDocumentRequest {
    sessionId: string;
    cMReassignSliceDocument: CMReassignSliceDocument;
}

export interface RedactedDocumentRequest {
    sessionId: string;
    cMRedactionDetails: CMRedactionDetails;
}

export interface RemoveSliceDocumentRequest {
    sessionId: string;
    cMRemoveSliceDocument: CMRemoveSliceDocument;
}

export interface ResetEvolveRequest {
    organisationId: string;
    sessionId: string;
}

export interface SaveProjectDefinitionRequest {
    sessionId: string;
    cMProjectDefinition: CMProjectDefinition;
}

export interface SetSliceConfigRequest {
    sessionId: string;
    cMSetSliceDefinitions: CMSetSliceDefinitions;
}

export interface SlicedDocumentsRequest {
    sessionId: string;
    cMSlicedDocumentRequest: CMSlicedDocumentRequest;
}

export interface StartProjectRequest {
    sessionId: string;
    cMStartProject: CMStartProject;
}

export interface UpdateDocumentStatusRequest {
    sessionId: string;
    cMUpdateDocumentStatus: CMUpdateDocumentStatus;
}

export interface UpdateRedactionsRequest {
    sessionId: string;
    cMUpdateRedactions: CMUpdateRedactions;
}

/**
 * no description
 */
export class DataprojectApi extends BaseAPI {

    /**
     * Adds a comment with the given level and ids
     * Create Comment
     */
    addComment({ sessionId, cMNewComment }: AddCommentRequest): Observable<string>
    addComment({ sessionId, cMNewComment }: AddCommentRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    addComment({ sessionId, cMNewComment }: AddCommentRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'addComment');
        throwIfNullOrUndefined(cMNewComment, 'cMNewComment', 'addComment');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/comment',
            method: 'POST',
            headers,
            body: cMNewComment,
        }, opts?.responseOpts);
    };

    /**
     * Get the list of running projects
     * get Running Projects
     */
    allTasks({ sessionId, cMQueueFilter }: AllTasksRequest): Observable<CMPagedQueueItems>
    allTasks({ sessionId, cMQueueFilter }: AllTasksRequest, opts?: OperationOpts): Observable<AjaxResponse<CMPagedQueueItems>>
    allTasks({ sessionId, cMQueueFilter }: AllTasksRequest, opts?: OperationOpts): Observable<CMPagedQueueItems | AjaxResponse<CMPagedQueueItems>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'allTasks');
        throwIfNullOrUndefined(cMQueueFilter, 'cMQueueFilter', 'allTasks');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMPagedQueueItems>({
            url: '/api/dataproject/runningprojects',
            method: 'POST',
            headers,
            body: cMQueueFilter,
        }, opts?.responseOpts);
    };

    /**
     * Notifies Workflow engine that a task changed it\'s status and passes results in
     * Change Task Phase
     */
    changeTaskPhase({ sessionId, cMChangeTaskPhase }: ChangeTaskPhaseRequest): Observable<string>
    changeTaskPhase({ sessionId, cMChangeTaskPhase }: ChangeTaskPhaseRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    changeTaskPhase({ sessionId, cMChangeTaskPhase }: ChangeTaskPhaseRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'changeTaskPhase');
        throwIfNullOrUndefined(cMChangeTaskPhase, 'cMChangeTaskPhase', 'changeTaskPhase');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/changetaskphase',
            method: 'POST',
            headers,
            body: cMChangeTaskPhase,
        }, opts?.responseOpts);
    };

    /**
     * Claim sliced document for signed in user
     * Claim sliced document
     */
    claimDocument({ sessionId, cMClaimDocument }: ClaimDocumentRequest): Observable<ReturnedDocument>
    claimDocument({ sessionId, cMClaimDocument }: ClaimDocumentRequest, opts?: OperationOpts): Observable<AjaxResponse<ReturnedDocument>>
    claimDocument({ sessionId, cMClaimDocument }: ClaimDocumentRequest, opts?: OperationOpts): Observable<ReturnedDocument | AjaxResponse<ReturnedDocument>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'claimDocument');
        throwIfNullOrUndefined(cMClaimDocument, 'cMClaimDocument', 'claimDocument');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<ReturnedDocument>({
            url: '/api/dataproject/claimdocument',
            method: 'POST',
            headers,
            body: cMClaimDocument,
        }, opts?.responseOpts);
    };

    /**
     * Get the crawler status for the given task id
     * get Crawler Status
     */
    crawlerStatus({ organisationId, taskId, sessionId }: CrawlerStatusRequest): Observable<CMCrawlerStatusTask>
    crawlerStatus({ organisationId, taskId, sessionId }: CrawlerStatusRequest, opts?: OperationOpts): Observable<AjaxResponse<CMCrawlerStatusTask>>
    crawlerStatus({ organisationId, taskId, sessionId }: CrawlerStatusRequest, opts?: OperationOpts): Observable<CMCrawlerStatusTask | AjaxResponse<CMCrawlerStatusTask>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'crawlerStatus');
        throwIfNullOrUndefined(taskId, 'taskId', 'crawlerStatus');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'crawlerStatus');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMCrawlerStatusTask>({
            url: '/api/dataproject/crawlerstatus/{organisationId}/{taskId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{taskId}', encodeURI(taskId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Returns paged list of documents for the given set of query tokens
     * Returns document list for tokens
     */
    documentsByTokens({ sessionId, cMDocumentsByToken }: DocumentsByTokensRequest): Observable<CMPagedProjectDocuments>
    documentsByTokens({ sessionId, cMDocumentsByToken }: DocumentsByTokensRequest, opts?: OperationOpts): Observable<AjaxResponse<CMPagedProjectDocuments>>
    documentsByTokens({ sessionId, cMDocumentsByToken }: DocumentsByTokensRequest, opts?: OperationOpts): Observable<CMPagedProjectDocuments | AjaxResponse<CMPagedProjectDocuments>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'documentsByTokens');
        throwIfNullOrUndefined(cMDocumentsByToken, 'cMDocumentsByToken', 'documentsByTokens');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMPagedProjectDocuments>({
            url: '/api/dataproject/documentsbytokens',
            method: 'POST',
            headers,
            body: cMDocumentsByToken,
        }, opts?.responseOpts);
    };

    /**
     * Retrieves the list of comments for the passed in Filter
     * Retrieve Comments
     */
    filteredComments({ sessionId, cMCommentFilter }: FilteredCommentsRequest): Observable<Array<CMRecordedComment>>
    filteredComments({ sessionId, cMCommentFilter }: FilteredCommentsRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CMRecordedComment>>>
    filteredComments({ sessionId, cMCommentFilter }: FilteredCommentsRequest, opts?: OperationOpts): Observable<Array<CMRecordedComment> | AjaxResponse<Array<CMRecordedComment>>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'filteredComments');
        throwIfNullOrUndefined(cMCommentFilter, 'cMCommentFilter', 'filteredComments');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<CMRecordedComment>>({
            url: '/api/dataproject/filteredcomments',
            method: 'POST',
            headers,
            body: cMCommentFilter,
        }, opts?.responseOpts);
    };

    /**
     * Get list of all identified potential Redaction locations for the document
     * Get Document Redaction info
     */
    getDocumentRedactionInfo({ organisationId, sliceId, documentKey, sessionId }: GetDocumentRedactionInfoRequest): Observable<Array<LocatedRedaction>>
    getDocumentRedactionInfo({ organisationId, sliceId, documentKey, sessionId }: GetDocumentRedactionInfoRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<LocatedRedaction>>>
    getDocumentRedactionInfo({ organisationId, sliceId, documentKey, sessionId }: GetDocumentRedactionInfoRequest, opts?: OperationOpts): Observable<Array<LocatedRedaction> | AjaxResponse<Array<LocatedRedaction>>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getDocumentRedactionInfo');
        throwIfNullOrUndefined(sliceId, 'sliceId', 'getDocumentRedactionInfo');
        throwIfNullOrUndefined(documentKey, 'documentKey', 'getDocumentRedactionInfo');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getDocumentRedactionInfo');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<LocatedRedaction>>({
            url: '/api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey}'.replace('{organisationId}', encodeURI(organisationId)).replace('{sliceId}', encodeURI(sliceId)).replace('{documentKey}', encodeURI(documentKey)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the project definition of the project for the given task id
     * get Project Definition
     */
    getProjectDefinition({ organisationId, taskId, sessionId }: GetProjectDefinitionRequest): Observable<CMProjectDefinitionTask>
    getProjectDefinition({ organisationId, taskId, sessionId }: GetProjectDefinitionRequest, opts?: OperationOpts): Observable<AjaxResponse<CMProjectDefinitionTask>>
    getProjectDefinition({ organisationId, taskId, sessionId }: GetProjectDefinitionRequest, opts?: OperationOpts): Observable<CMProjectDefinitionTask | AjaxResponse<CMProjectDefinitionTask>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getProjectDefinition');
        throwIfNullOrUndefined(taskId, 'taskId', 'getProjectDefinition');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getProjectDefinition');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMProjectDefinitionTask>({
            url: '/api/dataproject/projectdefinition/{organisationId}/{taskId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{taskId}', encodeURI(taskId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the project review data of the project for the given project id
     * get Project Definition
     */
    getProjectReview({ organisationId, projectId, sessionId }: GetProjectReviewRequest): Observable<CMProjectReview>
    getProjectReview({ organisationId, projectId, sessionId }: GetProjectReviewRequest, opts?: OperationOpts): Observable<AjaxResponse<CMProjectReview>>
    getProjectReview({ organisationId, projectId, sessionId }: GetProjectReviewRequest, opts?: OperationOpts): Observable<CMProjectReview | AjaxResponse<CMProjectReview>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getProjectReview');
        throwIfNullOrUndefined(projectId, 'projectId', 'getProjectReview');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getProjectReview');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMProjectReview>({
            url: '/api/dataproject/projectreview/{organisationId}/{projectId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{projectId}', encodeURI(projectId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the project project slice for the given task id
     * get project slice
     */
    getProjectSlice({ organisationId, taskId, sessionId }: GetProjectSliceRequest): Observable<Array<CMProjectSliceTask>>
    getProjectSlice({ organisationId, taskId, sessionId }: GetProjectSliceRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CMProjectSliceTask>>>
    getProjectSlice({ organisationId, taskId, sessionId }: GetProjectSliceRequest, opts?: OperationOpts): Observable<Array<CMProjectSliceTask> | AjaxResponse<Array<CMProjectSliceTask>>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getProjectSlice');
        throwIfNullOrUndefined(taskId, 'taskId', 'getProjectSlice');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getProjectSlice');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<CMProjectSliceTask>>({
            url: '/api/dataproject/projectslice/{organisationId}/{taskId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{taskId}', encodeURI(taskId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the summary information for the search results of a given project by task id
     * get Search Result Summary
     */
    getSearchResultSummary({ organisationId, taskId, sessionId }: GetSearchResultSummaryRequest): Observable<CMSearchResultSummaryTask>
    getSearchResultSummary({ organisationId, taskId, sessionId }: GetSearchResultSummaryRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSearchResultSummaryTask>>
    getSearchResultSummary({ organisationId, taskId, sessionId }: GetSearchResultSummaryRequest, opts?: OperationOpts): Observable<CMSearchResultSummaryTask | AjaxResponse<CMSearchResultSummaryTask>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getSearchResultSummary');
        throwIfNullOrUndefined(taskId, 'taskId', 'getSearchResultSummary');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getSearchResultSummary');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMSearchResultSummaryTask>({
            url: '/api/dataproject/searchresult/{organisationId}/{taskId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{taskId}', encodeURI(taskId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the summary information for the search results of a given project by task id
     * get Search Result Summary
     */
    getSearchResultSummaryForReview({ organisationId, projectId, sessionId }: GetSearchResultSummaryForReviewRequest): Observable<CMSearchResultSummary>
    getSearchResultSummaryForReview({ organisationId, projectId, sessionId }: GetSearchResultSummaryForReviewRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSearchResultSummary>>
    getSearchResultSummaryForReview({ organisationId, projectId, sessionId }: GetSearchResultSummaryForReviewRequest, opts?: OperationOpts): Observable<CMSearchResultSummary | AjaxResponse<CMSearchResultSummary>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getSearchResultSummaryForReview');
        throwIfNullOrUndefined(projectId, 'projectId', 'getSearchResultSummaryForReview');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getSearchResultSummaryForReview');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMSearchResultSummary>({
            url: '/api/dataproject/searchresultreview/{organisationId}/{projectId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{projectId}', encodeURI(projectId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Returns paged list of documents for the passed in slice and filters as well as totals
     * Document list for given slice and filters
     */
    nextDocument({ sessionId, cMNextDocument }: NextDocumentRequest): Observable<CMSlicedDocumentListAndTotals>
    nextDocument({ sessionId, cMNextDocument }: NextDocumentRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSlicedDocumentListAndTotals>>
    nextDocument({ sessionId, cMNextDocument }: NextDocumentRequest, opts?: OperationOpts): Observable<CMSlicedDocumentListAndTotals | AjaxResponse<CMSlicedDocumentListAndTotals>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'nextDocument');
        throwIfNullOrUndefined(cMNextDocument, 'cMNextDocument', 'nextDocument');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMSlicedDocumentListAndTotals>({
            url: '/api/dataproject/nextdocument',
            method: 'POST',
            headers,
            body: cMNextDocument,
        }, opts?.responseOpts);
    };

    /**
     * Get the original for a document if available by url (latest version)
     * Binary
     */
    pdfBinary({ organisationId, kbId, url, sessionId }: PdfBinaryRequest): Observable<object>
    pdfBinary({ organisationId, kbId, url, sessionId }: PdfBinaryRequest, opts?: OperationOpts): Observable<AjaxResponse<object>>
    pdfBinary({ organisationId, kbId, url, sessionId }: PdfBinaryRequest, opts?: OperationOpts): Observable<object | AjaxResponse<object>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'pdfBinary');
        throwIfNullOrUndefined(kbId, 'kbId', 'pdfBinary');
        throwIfNullOrUndefined(url, 'url', 'pdfBinary');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<object>({
            url: '/api/dataproject/pdf/latest/{organisationId}/{kbId}/{url}'.replace('{organisationId}', encodeURI(organisationId)).replace('{kbId}', encodeURI(kbId)).replace('{url}', encodeURI(url)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get the list of available project types
     * get Project Types
     */
    projectTypes({ organisationId, sessionId }: ProjectTypesRequest): Observable<Array<CMProjectInfo>>
    projectTypes({ organisationId, sessionId }: ProjectTypesRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CMProjectInfo>>>
    projectTypes({ organisationId, sessionId }: ProjectTypesRequest, opts?: OperationOpts): Observable<Array<CMProjectInfo> | AjaxResponse<Array<CMProjectInfo>>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'projectTypes');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'projectTypes');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<CMProjectInfo>>({
            url: '/api/dataproject/projects/{organisationId}'.replace('{organisationId}', encodeURI(organisationId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     */
    reassignSliceDocument({ sessionId, cMReassignSliceDocument }: ReassignSliceDocumentRequest): Observable<object>
    reassignSliceDocument({ sessionId, cMReassignSliceDocument }: ReassignSliceDocumentRequest, opts?: OperationOpts): Observable<AjaxResponse<object>>
    reassignSliceDocument({ sessionId, cMReassignSliceDocument }: ReassignSliceDocumentRequest, opts?: OperationOpts): Observable<object | AjaxResponse<object>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'reassignSliceDocument');
        throwIfNullOrUndefined(cMReassignSliceDocument, 'cMReassignSliceDocument', 'reassignSliceDocument');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<object>({
            url: '/api/dataproject/reassignslicedoc',
            method: 'POST',
            headers,
            body: cMReassignSliceDocument,
        }, opts?.responseOpts);
    };

    /**
     * Retrieves the redacted document binary
     * Get Redacted Document
     */
    redactedDocument({ sessionId, cMRedactionDetails }: RedactedDocumentRequest): Observable<ReturnedDocument>
    redactedDocument({ sessionId, cMRedactionDetails }: RedactedDocumentRequest, opts?: OperationOpts): Observable<AjaxResponse<ReturnedDocument>>
    redactedDocument({ sessionId, cMRedactionDetails }: RedactedDocumentRequest, opts?: OperationOpts): Observable<ReturnedDocument | AjaxResponse<ReturnedDocument>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'redactedDocument');
        throwIfNullOrUndefined(cMRedactionDetails, 'cMRedactionDetails', 'redactedDocument');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<ReturnedDocument>({
            url: '/api/dataproject/redacteddocument',
            method: 'POST',
            headers,
            body: cMRedactionDetails,
        }, opts?.responseOpts);
    };

    /**
     */
    removeSliceDocument({ sessionId, cMRemoveSliceDocument }: RemoveSliceDocumentRequest): Observable<object>
    removeSliceDocument({ sessionId, cMRemoveSliceDocument }: RemoveSliceDocumentRequest, opts?: OperationOpts): Observable<AjaxResponse<object>>
    removeSliceDocument({ sessionId, cMRemoveSliceDocument }: RemoveSliceDocumentRequest, opts?: OperationOpts): Observable<object | AjaxResponse<object>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'removeSliceDocument');
        throwIfNullOrUndefined(cMRemoveSliceDocument, 'cMRemoveSliceDocument', 'removeSliceDocument');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<object>({
            url: '/api/dataproject/removeslicedoc',
            method: 'POST',
            headers,
            body: cMRemoveSliceDocument,
        }, opts?.responseOpts);
    };

    /**
     * Fully resets Evolve to an empty system
     * Reset Evolve Application
     */
    resetEvolve({ organisationId, sessionId }: ResetEvolveRequest): Observable<string>
    resetEvolve({ organisationId, sessionId }: ResetEvolveRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    resetEvolve({ organisationId, sessionId }: ResetEvolveRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(organisationId, 'organisationId', 'resetEvolve');
        throwIfNullOrUndefined(sessionId, 'sessionId', 'resetEvolve');

        const headers: HttpHeaders = {
            ...(organisationId != null ? { 'organisation-id': String(organisationId) } : undefined),
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/reset/{organisationId}',
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Inserts/Updates the details for a project definition
     * Inserts/Updates a project definition
     */
    saveProjectDefinition({ sessionId, cMProjectDefinition }: SaveProjectDefinitionRequest): Observable<CMCreatedProject>
    saveProjectDefinition({ sessionId, cMProjectDefinition }: SaveProjectDefinitionRequest, opts?: OperationOpts): Observable<AjaxResponse<CMCreatedProject>>
    saveProjectDefinition({ sessionId, cMProjectDefinition }: SaveProjectDefinitionRequest, opts?: OperationOpts): Observable<CMCreatedProject | AjaxResponse<CMCreatedProject>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'saveProjectDefinition');
        throwIfNullOrUndefined(cMProjectDefinition, 'cMProjectDefinition', 'saveProjectDefinition');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMCreatedProject>({
            url: '/api/dataproject/saveprojectdefinition',
            method: 'POST',
            headers,
            body: cMProjectDefinition,
        }, opts?.responseOpts);
    };

    /**
     * Saves/updates the slices configured for a running project
     * Set Slice configuration
     */
    setSliceConfig({ sessionId, cMSetSliceDefinitions }: SetSliceConfigRequest): Observable<string>
    setSliceConfig({ sessionId, cMSetSliceDefinitions }: SetSliceConfigRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    setSliceConfig({ sessionId, cMSetSliceDefinitions }: SetSliceConfigRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'setSliceConfig');
        throwIfNullOrUndefined(cMSetSliceDefinitions, 'cMSetSliceDefinitions', 'setSliceConfig');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/setsliceconfig',
            method: 'POST',
            headers,
            body: cMSetSliceDefinitions,
        }, opts?.responseOpts);
    };

    /**
     * Returns paged list of documents for the passed in slice and filters as well as totals
     * Document list for given slice and filters
     */
    slicedDocuments({ sessionId, cMSlicedDocumentRequest }: SlicedDocumentsRequest): Observable<CMSlicedDocumentListAndTotals>
    slicedDocuments({ sessionId, cMSlicedDocumentRequest }: SlicedDocumentsRequest, opts?: OperationOpts): Observable<AjaxResponse<CMSlicedDocumentListAndTotals>>
    slicedDocuments({ sessionId, cMSlicedDocumentRequest }: SlicedDocumentsRequest, opts?: OperationOpts): Observable<CMSlicedDocumentListAndTotals | AjaxResponse<CMSlicedDocumentListAndTotals>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'slicedDocuments');
        throwIfNullOrUndefined(cMSlicedDocumentRequest, 'cMSlicedDocumentRequest', 'slicedDocuments');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<CMSlicedDocumentListAndTotals>({
            url: '/api/dataproject/sliceddocuments',
            method: 'POST',
            headers,
            body: cMSlicedDocumentRequest,
        }, opts?.responseOpts);
    };

    /**
     */
    startProject({ sessionId, cMStartProject }: StartProjectRequest): Observable<object>
    startProject({ sessionId, cMStartProject }: StartProjectRequest, opts?: OperationOpts): Observable<AjaxResponse<object>>
    startProject({ sessionId, cMStartProject }: StartProjectRequest, opts?: OperationOpts): Observable<object | AjaxResponse<object>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'startProject');
        throwIfNullOrUndefined(cMStartProject, 'cMStartProject', 'startProject');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<object>({
            url: '/api/dataproject/startproject',
            method: 'POST',
            headers,
            body: cMStartProject,
        }, opts?.responseOpts);
    };

    /**
     * Updates the status applied to a slice document
     * Update document status
     */
    updateDocumentStatus({ sessionId, cMUpdateDocumentStatus }: UpdateDocumentStatusRequest): Observable<string>
    updateDocumentStatus({ sessionId, cMUpdateDocumentStatus }: UpdateDocumentStatusRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    updateDocumentStatus({ sessionId, cMUpdateDocumentStatus }: UpdateDocumentStatusRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'updateDocumentStatus');
        throwIfNullOrUndefined(cMUpdateDocumentStatus, 'cMUpdateDocumentStatus', 'updateDocumentStatus');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/updatedocstatus',
            method: 'POST',
            headers,
            body: cMUpdateDocumentStatus,
        }, opts?.responseOpts);
    };

    /**
     * Updates the redactions applied to a document
     * Update document redactions
     */
    updateRedactions({ sessionId, cMUpdateRedactions }: UpdateRedactionsRequest): Observable<string>
    updateRedactions({ sessionId, cMUpdateRedactions }: UpdateRedactionsRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    updateRedactions({ sessionId, cMUpdateRedactions }: UpdateRedactionsRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'updateRedactions');
        throwIfNullOrUndefined(cMUpdateRedactions, 'cMUpdateRedactions', 'updateRedactions');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<string>({
            url: '/api/dataproject/updateredactions',
            method: 'POST',
            headers,
            body: cMUpdateRedactions,
        }, opts?.responseOpts);
    };

}
