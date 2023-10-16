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

import type {
    CMRedaction,
} from './';

/**
 * @export
 * @interface CMRedactionData
 */
export interface CMRedactionData {
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    kbId: string;
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    url: string;
    /**
     * @type {Array<CMRedaction>}
     * @memberof CMRedactionData
     */
    redactions: Array<CMRedaction>;
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    documentStatus: CMRedactionDataDocumentStatusEnum;
    /**
     * @type {string}
     * @memberof CMRedactionData
     */
    documentAction: CMRedactionDataDocumentActionEnum;
    /**
     * @type {boolean}
     * @memberof CMRedactionData
     */
    annotated: boolean;
    /**
     * @type {boolean}
     * @memberof CMRedactionData
     */
    createForExport: boolean;
    /**
     * @type {boolean}
     * @memberof CMRedactionData
     */
    exportNativeFormat: boolean;
}

/**
 * @export
 * @enum {string}
 */
export enum CMRedactionDataDocumentStatusEnum {
    New = 'NEW',
    InProgress = 'IN_PROGRESS',
    Completed = 'COMPLETED'
}
/**
 * @export
 * @enum {string}
 */
export enum CMRedactionDataDocumentActionEnum {
    None = 'NONE',
    Redact = 'REDACT',
    Ignore = 'IGNORE',
    Delete = 'DELETE'
}

