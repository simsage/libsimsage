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
    Backup,
    CMRestoreFromText,
    JsonMessage,
} from '../models';

export interface BackupRequest {
    sessionId: string;
    organisationId: string;
    regime: string;
}

export interface DeleteBackupRequest {
    sessionId: string;
    organisationId: string;
    backupId: number;
}

export interface GetBackupRequest {
    sessionId: string;
    organisationId: string;
    backupId: number;
}

export interface GetBackupListRequest {
    sessionId: string;
    organisationId: string;
}

export interface RestoreFromTextRequest {
    sessionId: string;
    cMRestoreFromText: CMRestoreFromText;
}

/**
 * no description
 */
export class BackupApi extends BaseAPI {

    /**
     * Backup all of SimSage (excludes indexes and documents).  Create a SimSage text file with all relevant information for a SimSage Restore on the cloud node.
     * create backup
     */
    backup({ sessionId, organisationId, regime }: BackupRequest): Observable<JsonMessage>
    backup({ sessionId, organisationId, regime }: BackupRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    backup({ sessionId, organisationId, regime }: BackupRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'backup');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'backup');
        throwIfNullOrUndefined(regime, 'regime', 'backup');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/backup/backup/{organisationId}/{regime}'.replace('{organisationId}', encodeURI(organisationId)).replace('{regime}', encodeURI(regime)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Delete a backup by ID and return list of all Backups present in this SimSage instance
     * remove backup
     */
    deleteBackup({ sessionId, organisationId, backupId }: DeleteBackupRequest): Observable<Array<Backup>>
    deleteBackup({ sessionId, organisationId, backupId }: DeleteBackupRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<Backup>>>
    deleteBackup({ sessionId, organisationId, backupId }: DeleteBackupRequest, opts?: OperationOpts): Observable<Array<Backup> | AjaxResponse<Array<Backup>>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'deleteBackup');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'deleteBackup');
        throwIfNullOrUndefined(backupId, 'backupId', 'deleteBackup');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<Backup>>({
            url: '/api/backup/backup/{organisationId}/{backupId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{backupId}', encodeURI(backupId)),
            method: 'DELETE',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * return the backup data for a given backup-id
     * get backup
     */
    getBackup({ sessionId, organisationId, backupId }: GetBackupRequest): Observable<Backup>
    getBackup({ sessionId, organisationId, backupId }: GetBackupRequest, opts?: OperationOpts): Observable<AjaxResponse<Backup>>
    getBackup({ sessionId, organisationId, backupId }: GetBackupRequest, opts?: OperationOpts): Observable<Backup | AjaxResponse<Backup>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getBackup');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getBackup');
        throwIfNullOrUndefined(backupId, 'backupId', 'getBackup');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Backup>({
            url: '/api/backup/{organisationId}/{backupId}'.replace('{organisationId}', encodeURI(organisationId)).replace('{backupId}', encodeURI(backupId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get a list of all Backups present in this SimSage instance
     * get backup list
     */
    getBackupList({ sessionId, organisationId }: GetBackupListRequest): Observable<Array<Backup>>
    getBackupList({ sessionId, organisationId }: GetBackupListRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<Backup>>>
    getBackupList({ sessionId, organisationId }: GetBackupListRequest, opts?: OperationOpts): Observable<Array<Backup> | AjaxResponse<Array<Backup>>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'getBackupList');
        throwIfNullOrUndefined(organisationId, 'organisationId', 'getBackupList');

        const headers: HttpHeaders = {
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<Array<Backup>>({
            url: '/api/backup/backups/{organisationId}'.replace('{organisationId}', encodeURI(organisationId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Restore parts of SimSage (documents, users, organisation/kb, roles) from a text-file.
     * restore backup
     */
    restoreFromText({ sessionId, cMRestoreFromText }: RestoreFromTextRequest): Observable<JsonMessage>
    restoreFromText({ sessionId, cMRestoreFromText }: RestoreFromTextRequest, opts?: OperationOpts): Observable<AjaxResponse<JsonMessage>>
    restoreFromText({ sessionId, cMRestoreFromText }: RestoreFromTextRequest, opts?: OperationOpts): Observable<JsonMessage | AjaxResponse<JsonMessage>> {
        throwIfNullOrUndefined(sessionId, 'sessionId', 'restoreFromText');
        throwIfNullOrUndefined(cMRestoreFromText, 'cMRestoreFromText', 'restoreFromText');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(sessionId != null ? { 'session-id': String(sessionId) } : undefined),
        };

        return this.request<JsonMessage>({
            url: '/api/backup/restore',
            method: 'POST',
            headers,
            body: cMRestoreFromText,
        }, opts?.responseOpts);
    };

}
